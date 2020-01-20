package com.kiendo.vietnamnews.tintuc;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.kiendo.vietnamnews.Customeadapter;
import com.kiendo.vietnamnews.NewsActivity;
import com.kiendo.vietnamnews.NewsItem;
import com.kiendo.vietnamnews.R;
import com.kiendo.vietnamnews.XMLDOMParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TintucFragment extends Fragment {
    private String category;
    ListView listView;
    ArrayAdapter adapter;

    Customeadapter customeadapter;
    ArrayList<NewsItem> newsItemArrayList;
    public TintucFragment(String category){this.category=category;}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_layout, container, false);
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                switch (category) {
                    case "tinmoi": new ReadRSS().execute("https://baotintuc.vn/tin-moi-nhat.rss");
                    break;
                    case "thoisu": new ReadRSS().execute("https://baotintuc.vn/thoi-su.rss");
                    break;
                    case "thegioi": new ReadRSS().execute("https://baotintuc.vn/the-gioi.rss");
                    break;
                    case "kinhte": new ReadRSS().execute("https://baotintuc.vn/kinh-te.rss");
                    break;
                    case "xahoi": new ReadRSS().execute("https://baotintuc.vn/xa-hoi.rss");
                    break;
                    case "phapluat": new ReadRSS().execute("https://baotintuc.vn/phap-luat.rss");
                    break;
                }

            }
        });
        listView = (ListView) root.findViewById(R.id.listView);
        newsItemArrayList = new ArrayList<NewsItem>();
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), NewsActivity.class);
                intent.putExtra("linkTinTuc",newsItemArrayList.get(position).getLink());
                startActivity(intent);
            }
        });
        return root;
    }
    private class ReadRSS extends AsyncTask<String, Void, String>{
        @Override
        protected String doInBackground(String... strings) {
            return docNoiDung_Tu_URL(strings[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            XMLDOMParser xmldomParser = new XMLDOMParser();

            Document document = xmldomParser.getDocument(s);

            NodeList nodeList = document.getElementsByTagName("item");
            NodeList nodeListDescription = document.getElementsByTagName("description");
            NodeList nodeListTitle = document.getElementsByTagName("title");
            NodeList nodeListLink = document.getElementsByTagName("link");
            String title = "";
            String image = "";
            String link = "";
            String publishDate = "";
            for (int i =0; i<nodeList.getLength(); i++){
                String cdata = nodeListDescription.item(i+1).getTextContent();
                Pattern p;
                    p = Pattern.compile("<img[^>]+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>");

                Matcher m = p.matcher(cdata);
                if (m.find()){
                    image = m.group(1);

                }
                Element titleElement = (Element) nodeListTitle.item(i+2);
                Element linkElement = (Element) nodeListLink.item(i+2);
                Element element = (Element) nodeList.item(i);
                title = titleElement.getTextContent();
                link = linkElement.getTextContent();
                publishDate = xmldomParser.getValue(element, "pubDate");
                newsItemArrayList.add(new NewsItem(title,link,image,publishDate));

            }
            customeadapter= new Customeadapter(getActivity(),android.R.layout.simple_list_item_1,newsItemArrayList);
            listView.setAdapter(customeadapter);
            super.onPostExecute(s);
        }
    }
    private String docNoiDung_Tu_URL(String theUrl){
        StringBuilder content = new StringBuilder();
        try    {
            // create a url object
            URL url = new URL(theUrl);

            // create a urlconnection object
            URLConnection urlConnection = url.openConnection();

            // wrap the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            // read from the urlconnection via the bufferedreader
            while ((line = bufferedReader.readLine()) != null){
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)    {
            e.printStackTrace();
        }
        return content.toString();
    }
}

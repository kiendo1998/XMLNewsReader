package com.kiendo.vietnamnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Customeadapter extends ArrayAdapter<NewsItem> {

    public Customeadapter(Context context, int resource, List<NewsItem> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.dong_layout_listview, null);
        }
        NewsItem p = getItem(position);
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView textViewTitle = (TextView) view.findViewById(R.id.textviewTitle);
            textViewTitle.setText(p.getTitle());
            TextView textViewDate = (TextView) view.findViewById(R.id.textviewPublishDate);
            textViewDate.setText(p.getPublishDate());
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            Picasso.with(getContext()).load(p.getImage()).into(imageView);
        }
        return view;
    }

}
package com.kiendo.vietnamnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kiendo.vietnamnews.bao24h.*;
import com.kiendo.vietnamnews.nguoilaodong.NguoilaodongControlActivity;
import com.kiendo.vietnamnews.congannhandan.CandControlActivity;
import com.kiendo.vietnamnews.dautu.DautuControlActivity;
import com.kiendo.vietnamnews.giaoducthoidai.GdtdControlActivity;
import com.kiendo.vietnamnews.ngoisao.NgoisaoControlActivity;
import com.kiendo.vietnamnews.tintuc.TintucControlActivity;
import com.kiendo.vietnamnews.tienphong.TienphongControlActivity;
import com.kiendo.vietnamnews.trithuc.TrithucControlActivity;
import com.kiendo.vietnamnews.vietnamnet.VietnamnetControlActivity;
import com.kiendo.vietnamnews.vneconomy.VneconomyControlActivity;
import com.kiendo.vietnamnews.vnexpress.*;
import com.kiendo.vietnamnews.thanhnien.ThanhnienControlActivity;
import com.kiendo.vietnamnews.tuoitre.TuoitreControlActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnVnexpress,btnThanhnien, btnTuoitre, btnBao24h, btnNld, btnTintuc, btnVietnamnet,
            btnNgoisao, btnDautu, btnCand, btnGdtd, btnTienphong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnVnexpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VnexpressControlActivity.class));
            }
        });
        btnBao24h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bao24hControlActivity.class));
            }
        });
        btnThanhnien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ThanhnienControlActivity.class));
            }
        });
        btnTuoitre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TuoitreControlActivity.class));
            }
        });
        btnNld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NguoilaodongControlActivity.class));
            }
        });
        btnVietnamnet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VietnamnetControlActivity.class));
            }
        });
        btnNgoisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NgoisaoControlActivity.class));
            }
        });
        btnDautu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DautuControlActivity.class));
            }
        });
        btnCand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CandControlActivity.class));
            }
        });
        btnGdtd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GdtdControlActivity.class));
            }
        });
        btnTienphong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TienphongControlActivity.class));
            }
        });
        btnTintuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TintucControlActivity.class));
            }
        });
    }

    private void init() {
        btnVnexpress = (Button) findViewById(R.id.btnVnexpress);
        btnThanhnien = (Button) findViewById(R.id.btnThanhnien);
        btnTuoitre = (Button) findViewById(R.id.btnTuoitre);
        btnBao24h = (Button) findViewById(R.id.btnBao24h);
        btnNld = (Button) findViewById(R.id.btnNld);
        btnTintuc = (Button) findViewById(R.id.btnTintuc);
        btnVietnamnet = (Button) findViewById(R.id.btnVietnamnet);
        btnNgoisao = (Button) findViewById(R.id.btnNgoisao);

        btnDautu = (Button) findViewById(R.id.btnDautu);
        btnCand = (Button) findViewById(R.id.btnCand);

        btnGdtd = (Button) findViewById(R.id.btnGdtd);

        btnTienphong = (Button) findViewById(R.id.btnTienphong);
    }
}

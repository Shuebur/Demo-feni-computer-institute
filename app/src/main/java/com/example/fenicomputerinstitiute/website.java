package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class website extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Office Website");

        webView=findViewById(R.id.webview_id);

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sxsrf=ACYBGNTgkCGhgAv_WbPI6ORBVD7T1BRggA%3A1579372811442&ei=C1EjXtrSGtmv9QPsuIBY&q=www.fci.gov.bd.com&oq=www.&gs_l=psy-ab.1.1.35i39l3j0i131i273l2j0j0i131l3j0.10410.15087..17920...1.2..4.224.3120.0j22j1......0....1..gws-wiz.....10..0i71j35i362i39j0i273j0i20i263j0i67.4Nx3gq6b4os"));
        startActivity(intent);


    }
}

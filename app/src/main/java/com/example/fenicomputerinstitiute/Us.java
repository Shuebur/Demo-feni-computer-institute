package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Us extends AppCompatActivity {

    private ImageView imageView;
    private Button callNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("About Me");

        imageView=findViewById(R.id.Fb_id);
        callNow=findViewById(R.id.callnow_id);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/empireshuyeb.empire"));
                startActivity(intent);
            }
        });
        callNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num=Uri.parse("tel:01789630755");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);
            }
        });
    }
}

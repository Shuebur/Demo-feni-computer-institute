package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RS extends AppCompatActivity {
private Button dev,sun,mojj,dull,rajib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("RS Teacher's");
        dev=findViewById(R.id.devvv_id);
        sun=findViewById(R.id.sun_id);
        mojj=findViewById(R.id.mojj_id);
        dull=findViewById(R.id.dul_id);
        rajib=findViewById(R.id.rajib_id);

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01553375004");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01737463844");

                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);

            }
        });
        mojj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01843492677");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        dull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01724363463");

               Intent intent=new Intent(Intent.ACTION_DIAL,number)     ;
               startActivity(intent);


            }
        });
        rajib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01767911281");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
    }
}

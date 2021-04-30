package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DT extends AppCompatActivity {
    private Button mamun,helal,nira,nahida,tasnuba,israk,munni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dt);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("DTNT Teacher's");
        mamun=findViewById(R.id.mamun_id);
        helal=findViewById(R.id.helal_id);
        nira=findViewById(R.id.nira_id);
        nahida=findViewById(R.id.nahida_id);
        tasnuba=findViewById(R.id.tasnuba_id);
        israk=findViewById(R.id.ishrak_id);
        munni=findViewById(R.id.munni_id);
        munni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num=Uri.parse("tel:01616614292");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);
            }
        });
        mamun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01818591793");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        helal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01815645223");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        nira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01828067490");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        nahida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01615645224");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        tasnuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01838599437");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        israk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01814722970");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
    }
}

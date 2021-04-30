package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Aboutfci,Department,principal,teachers,Result,activiteis,hostel,officialwebsite,officestaff,aboutus,alb,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Aboutfci=findViewById(R.id.Ab_id);
        Department=findViewById(R.id.Department_id);
        teachers=findViewById(R.id.Tech_id);
        Result=findViewById(R.id.Result_id);
        activiteis=findViewById(R.id.Act_id);
        hostel=findViewById(R.id.Ho_id);
        officialwebsite=findViewById(R.id.WEB_id);
        officestaff=findViewById(R.id.Offst_id);
        principal=findViewById(R.id.Pricipals_id);
        aboutus=findViewById(R.id.Us_id);
        alb=findViewById(R.id.alb_id);
          contact=findViewById(R.id.Contact_id);


        Department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Department.class);
                startActivity(intent);

            }
        });

        Aboutfci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Text.class);
                startActivity(intent);
            }
        });

        officialwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,website.class);
                startActivity(intent);
            }
        });
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Hostel.class);
                startActivity(intent);
            }
        });
        activiteis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,List.class);
                startActivity(intent);
            }
        });
        principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Princip.class);
                startActivity(intent);
            }
        });
        teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Teachers.class);
                startActivity(intent);
            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Us.class);
                startActivity(intent);
            }
        });

        alb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Image.class);
                startActivity(intent);
            }
        });
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Re.class);
                startActivity(intent);

            }
        });
        officestaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,notice.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Emergecy.class);
                startActivity(intent);
            }
        });

    }
}

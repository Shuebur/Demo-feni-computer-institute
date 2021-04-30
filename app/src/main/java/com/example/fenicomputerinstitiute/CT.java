package com.example.fenicomputerinstitiute;

import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;



public class CT extends AppCompatActivity {
private Button call,dall,mall,sall,pall,rall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("CST Teacher's");
        call=findViewById(R.id.calll_id);
        dall=findViewById(R.id.call_id);
        mall=findViewById(R.id.callll_id);
        sall=findViewById(R.id.calllb_id);
        pall=findViewById(R.id.calltlb_id);
        rall=findViewById(R.id.calllttb_id);
        pall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num=Uri.parse("tel:01776290973");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);
            }
        });
        rall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num=Uri.parse("tel:017629927719");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);
            }
        });
       call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri number=Uri.parse("tel:01625225586");
                //Uri number=Uri.parse("tel:01812977112");
                Intent callIntent=new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);

            }
        });
       dall.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Uri number=Uri.parse("tel:01711132353");
               Intent callIntent=new Intent(Intent.ACTION_DIAL,number);
               startActivity(callIntent);
           }
       });
       mall.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Uri number=Uri.parse("tel:01813243436");
               Intent intent=new Intent(Intent.ACTION_DIAL,number);
               startActivity(intent);
           }
       });
       sall.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Uri number=Uri.parse("tel:01710020761");
               Intent intent=new Intent(Intent.ACTION_DIAL,number);
               startActivity(intent);
           }
       });
    }
}

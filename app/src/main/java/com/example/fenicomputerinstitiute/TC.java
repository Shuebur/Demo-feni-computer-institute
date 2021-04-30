package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TC extends AppCompatActivity {
    private Button mahbub,sajjad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tc);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("TCT Teacher's");

        mahbub = findViewById(R.id.mahbub_id);
        sajjad = findViewById(R.id.sazzad_id);
        mahbub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Uri number=   Uri.parse("tel:01711583992");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });
        sajjad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number=Uri.parse("tel:01833455252");
                Intent intent=new Intent(Intent.ACTION_DIAL,number);
                startActivity(intent);
            }
        });

    }
}

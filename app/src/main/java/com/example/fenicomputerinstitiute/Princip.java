package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Princip extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princip);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("About Principal");
        button=findViewById(R.id.pricipal_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num= Uri.parse("tel:01912384469");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);
            }
        });

    }
}

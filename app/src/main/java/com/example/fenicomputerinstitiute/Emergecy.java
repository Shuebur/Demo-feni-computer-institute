package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Emergecy extends AppCompatActivity {
    private Button apple,information,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergecy);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Emergency Contact");
        apple=findViewById(R.id.Apple_id);
        information=findViewById(R.id.information_id);
        register=findViewById(R.id.register);
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num= Uri.parse("tel:01711583992");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);



            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num=Uri.parse("tel:01833455252");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri num= Uri.parse("tel:01814713208");
                Intent intent=new Intent(Intent.ACTION_DIAL,num);
                startActivity(intent);

            }
        });

    }
}

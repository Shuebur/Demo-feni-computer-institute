package com.example.fenicomputerinstitiute;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teachers extends AppCompatActivity {
    private Button cs,dt,tc,rs;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Teacher's");
        cs=findViewById(R.id.CS_id);
        dt=findViewById(R.id.DT_id);
        tc=findViewById(R.id.TC_id);
        rs=findViewById(R.id.RS_id);

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,CT.class);
                startActivity(intent);
            }
        });
        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,DT.class);
                startActivity(intent);
            }
        });
        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,TC.class);
                startActivity(intent);
            }
        });
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teachers.this,RS.class);
                startActivity(intent);
            }
        });

    }
}

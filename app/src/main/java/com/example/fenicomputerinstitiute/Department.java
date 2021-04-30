package com.example.fenicomputerinstitiute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Department extends AppCompatActivity implements View.OnClickListener {
    private Button Cst,Dtnt,Tct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department2);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("All Departments");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Cst=findViewById(R.id.cst_id);
        Dtnt=findViewById(R.id.Dtnt_id);
        Tct=findViewById(R.id.tct_id);
        Cst.setOnClickListener(this);
        Dtnt.setOnClickListener(this);
        Tct.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){

           this.finish();



        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cst_id) {

            Intent intent = new Intent(Department.this, CSt.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.Dtnt_id) {


            Intent intent = new Intent(Department.this, Dtnt.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.tct_id) {

            Intent intent = new Intent(Department.this, Tct.class);
            startActivity(intent);
        }

}
    }


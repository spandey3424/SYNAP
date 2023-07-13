package com.disability.synap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Jobs extends AppCompatActivity {

    TextView j1,j2,j3,j4,j5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

        j5 = (TextView) findViewById(R.id.job5);

        j5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Jobs.this,job5.class);
                startActivity(i5);
            }
        });

        j4 = (TextView) findViewById(R.id.job4);

        j4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Jobs.this,job4.class);
                startActivity(i4);
            }
        });

        j3 = (TextView) findViewById(R.id.job3);

        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Jobs.this,job3.class);
                startActivity(i3);
            }
        });

        j2 = (TextView) findViewById(R.id.job2);

        j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Jobs.this,job2.class);
                startActivity(i2);
            }
        });

        j1 = (TextView) findViewById(R.id.job1);

        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Jobs.this,job1.class);
                startActivity(i1);
            }
        });
    }
}

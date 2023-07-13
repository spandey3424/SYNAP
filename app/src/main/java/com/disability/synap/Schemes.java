package com.disability.synap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Schemes extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);

        t1 = (TextView) findViewById(R.id.textv1);
        t2 = (TextView) findViewById(R.id.textv2);
        t3 = (TextView) findViewById(R.id.textv3);
        t4 = (TextView) findViewById(R.id.textv4);
        t5 = (TextView) findViewById(R.id.textv5);
        t6 = (TextView) findViewById(R.id.textv6);
        t7 = (TextView) findViewById(R.id.textv7);
        t8 = (TextView) findViewById(R.id.textv8);
        t9 = (TextView) findViewById(R.id.textv9);
        t10 = (TextView) findViewById(R.id.textv10);
        t11 = (TextView) findViewById(R.id.textv11);
        t12 = (TextView) findViewById(R.id.textv12);
        t13 = (TextView) findViewById(R.id.textv13);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });

        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Schemes.this,ApplySchemes.class);
                startActivity(i);
            }
        });





    }
}

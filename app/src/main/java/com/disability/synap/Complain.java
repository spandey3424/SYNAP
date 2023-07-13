package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Complain extends AppCompatActivity {

    Button sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        sub = (Button) findViewById(R.id.submitcomplain);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Complain.this,"Complain submitted",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}

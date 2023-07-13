package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Records extends AppCompatActivity {

    Button updaterec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        updaterec = (Button) findViewById(R.id.Updaterecord);

        updaterec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Records.this,"Records Added Successfully",Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}

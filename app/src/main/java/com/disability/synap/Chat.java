package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Chat extends AppCompatActivity {

    EditText editText1,editText2;
    Button snd,ext;
    String comp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        editText1 = (EditText) findViewById(R.id.send);
        editText2 = (EditText) findViewById(R.id.recieve);
        snd = (Button) findViewById(R.id.sndmssg);
        ext = (Button) findViewById(R.id.exitchat);

        comp = editText1.getText().toString();

        if(comp.equals("I have a question")) {

            snd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    editText2.setText(" Yes I am Happy to answer");


                }
            });
        }

        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}

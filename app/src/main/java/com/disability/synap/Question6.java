package com.disability.synap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Question6 extends AppCompatActivity {

    private Button endtst,next;
    private  Integer count=0,getCount=0;
    private TextView q,m;
    private RadioButton ys,un,noo;
    private float flag=0,score=0;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);



        endtst = (Button) findViewById(R.id.endtest6);
        next = (Button) findViewById(R.id.nxt6);
        q = (TextView) findViewById(R.id.ques6);
        q.setText("Click START to Start Test..!");
        m = (TextView) findViewById(R.id.msg);
        rg = (RadioGroup) findViewById(R.id.radiogrp1);


        ys = (RadioButton) findViewById(R.id.yes);
        un  = (RadioButton) findViewById(R.id.unsure);
        noo = (RadioButton) findViewById(R.id.no);

        endtst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                endtst.setText(" End  Test ");

                getCount=getCount+1;
                rg.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);

                switch (getCount) {
                    case 1:
                        q.setText("1.Does the child have any observable abnormality?");
                        if (ys.isChecked()) {
                            flag = flag + 2;
                            score = flag + score;
                        } else if (un.isChecked()) {
                            flag = flag + 1;
                            score = flag + score;
                        } else if (noo.isChecked()) {
                            score = flag + score;
                        }
                        break;

                    case 2:

                        Intent intent = new Intent(Question6.this, Resultpie.class);
                        startActivity(intent);
                        finish();
                        break;
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ys.isChecked()==true || un.isChecked()==true || noo.isChecked()== true)
                {
                    count=count+1;
                }
                else {
                    Toast.makeText(Question6.this,"Please select an option",Toast.LENGTH_SHORT).show();
                }

                switch (count)
                {
                    case 1:
                        q.setText("2.Does the child keep book too far or too close to his/her eyes while reading?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);

                        break;
                    case 2:
                        q.setText("3.Is the child unable to write in the prescribed space/line due to low vision?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);
                        break;
                    case 3:
                        q.setText("4.Does the child finds difficult to identify objects/people at a distance(4-5 meter or further)?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);

                        break;
                    case 4:
                        q.setText("5.Does the child have any problem in following moving objects?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);
                        break;
                    case 5:
                        q.setText("6.Is the child unable to identify/match colors?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);
                        break;
                    case 6:
                        q.setText("7.Is the following child unable to follow 2-D representation of any object?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);

                        break;
                    case 7:
                        q.setText("8.Do the child have difficulty in focusing beacuse of unstable movement of the eye ball?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);
                        break;
                    case  8:
                        q.setText("9.Does the child get confused between the shadows and the level chnages?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);

                        break;
                    case  9:
                        q.setText("10.Does the child have any problem iin recognizing actions and facial expression?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);
                        break;
                    case 10:
                        q.setText("11.Is the child mobility badly affected in semi-dark area?");
                        if (ys.isChecked()) {
                            flag=flag+2;
                            score = flag+score;
                        }
                        else if (un.isChecked()) {
                            flag=flag+1;
                            score = flag+score;
                        }
                        else if (noo.isChecked()) {
                            score=flag+score;
                        }
                        ys.setChecked(false);
                        un.setChecked(false);
                        noo.setChecked(false);
                        m.setText("Please Click End Test");
                        break;
                }
            }
        });

    }
}

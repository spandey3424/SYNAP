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

public class Question3 extends AppCompatActivity {
    private Button endtst,next;
    private  Integer count=0,getCount=0;
    private TextView q,m;
    private RadioButton ys,un,noo;
    private float flag=0,score=0;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);



        endtst = (Button) findViewById(R.id.endtest3);
        next = (Button) findViewById(R.id.nxt3);
        q = (TextView) findViewById(R.id.ques3);
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
                    q.setText("1.Does your child have an issues with communication?");
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

                Intent intent = new Intent(Question3.this, Resultpie.class);
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
                    Toast.makeText(Question3.this,"Please select an option",Toast.LENGTH_SHORT).show();
                }
                switch (count)
                {
                    case 1:
                        q.setText("2.Does your child face difficulties in sharing emotions, sharing interests?");
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
                        q.setText("3.Does your child have an issues with nonverbal communication, such as trouble maintaining eye contact or reading body language?");
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
                        q.setText("4.Does your child have an difficulties in developing and maintaining relationships?");
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
                        q.setText("5.Does your child face difficulties in maintaining a back-and-forth conversation?");
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
                        q.setText("6.Does your child does an repetitive unwanted movements or motions?");
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
                        q.setText("7.Does your child does rigid adherence to specific routines or behaviors?");
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
                        q.setText("8.Does your child gives an negative reaction to a specific sound fixated interests or preoccupations?");
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

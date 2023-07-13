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

public class Questions extends AppCompatActivity {

    Button endtst,next;
    Integer count=0,getCount=0;
    TextView q,m;
    RadioButton ys,un,noo;
    float flag=0,score=0;
    RadioGroup rg;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_questions);

        endtst = (Button) findViewById(R.id.endtest);
        next = (Button) findViewById(R.id.nxt);
        q = (TextView) findViewById(R.id.ques);
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
                        q.setText("  1.Does the child has difficulty in reading from black board even if she/he is sitting in the first row?  ");
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
                        Intent intent = new Intent(Questions.this, Resultpie.class);
                        startActivity(intent);
                        finish();
                        break;
                }

            }
        });


        next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {

                    if (ys.isChecked()==true || un.isChecked()==true || noo.isChecked()== true)
                    {
                        count=count+1;
                    }
                    else {
                        Toast.makeText(Questions.this,"Please select an option",Toast.LENGTH_SHORT).show();
                    }

                        switch (count)
                        {
                            case 1:
                                q.setText("  2.Does the child keep book to close to his/her eye while reading?  ");
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
                                q.setText("  3.Does the child is uable to identify/match the color?  ");
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
                                q.setText("  4.Does the child have difficulty in identifying numbers,symbols and patterns?  ");
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
                                q.setText("  5.Does the child get confused between the shadows and the level changes?  ");if (ys.isChecked()) {
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
                                q.setText("  6.Does your child is unable to see 20 feet away from his/her vision?  ");
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
                            case  6:
                                q.setText("  7.Does your child have a cloudy vision?  ");
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
                                q.setText("  8.Does your child does constant eye rubbing?");
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
                            case 8:
                                q.setText("  9.Does your child give an extreme reaction to sensitivity of light?  ");
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
                                q.setText(" 10.Does your child have poor focusing?   ");
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
                                q.setText("  11.Does your child have a chronic eye redness?  ");
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
                            case 11:
                                q.setText("  12.Does your child have achronic tearing from their eyes?  ");
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
                            case 12:
                                q.setText("  13.Does your child have a white instead of a black pupil? ");
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
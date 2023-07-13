package com.disability.synap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    private Button endtst,next;
    private  Integer count=0;
    private TextView q;
    private RadioButton ys,un,noo;
    private float flag=0,score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);



        endtst = (Button) findViewById(R.id.endtest2);
        next = (Button) findViewById(R.id.nxt2);
        q = (TextView) findViewById(R.id.ques2);
        q.setText("Click START to Start Test..!");

        ys = (RadioButton) findViewById(R.id.yes);
        un  = (RadioButton) findViewById(R.id.unsure);
        noo = (RadioButton) findViewById(R.id.no);

        endtst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question2.this,Resultpie.class);
                startActivity(intent);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next.setText("  Next  ");
                count=count+1;

                switch (count)
                {
                    case 1:
                        q.setText("   1.Does your child faces a delay in speech and language development?  ");
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
                        q.setText("  2.Does your child does not startle when loud sound is present?  ");                        if (ys.isChecked()) {
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
                        q.setText(" 3.Does your child cannot localize sound (tell where sound is coming from)?  ");
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
                        q.setText("  4.Does your child listen to television or radio at a high volume?  ");
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
                        q.setText("  5.Does your child faces trouble in understanding speech, especially in noisy environments?  ");
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
                        q.setText("  6.Does your child losses his perception that others are mumbling?  ");
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
                        q.setText("  7.Does your child faces difficulty in hearing people on the phone?  ");
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
                        q.setText("  8.Does your child often asking people to repeat themselves?  ");
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
                        q.setText("  9.Does your child faces tinnitus, or ringing in the ears?  ");
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
                    default:
                        Toast.makeText(Question2.this,"Test Is Complete Click End Test",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

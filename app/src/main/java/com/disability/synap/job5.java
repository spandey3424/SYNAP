package com.disability.synap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class job5 extends AppCompatActivity {

    TextView five;
    Button ap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job5);

        five = (TextView) findViewById(R.id.jb5);
        five.setText("Invites online applications from Ex-ITI Candidates for selection EX-ITI Trade Apprentices For Training Under the Apprentices Act 1961. CVRDE Avadi, Chennai Apprentice jobs 2018-19 online registration was already open.\n" +
                "\n" +
                "    Carpenter – 2 Posts\n" +
                "    COPA (Computer Operator and Programming Assistant) – 25 Posts\n" +
                "    Draughtsman (Mechanical) – 8 Posts\n" +
                "    Electrician – 22 Posts\n" +
                "    Electronics – 3 Posts\n" +
                "    Fitter – 35 Posts\n" +
                "    Machinist – 12 Posts\n" +
                "    Mechanic (Motor Vehicle) – 8 Posts\n" +
                "    Turner – 6 Posts\n" +
                "    Welder – 6 Posts \n" +
                "\n" +
                "Stipend: For Carpenter, COPA and Welder ₹ 10739/- per month, For other Trades ₹11552/- per month.\n" +
                "\n" +
                "Registration Fee: ₹ 30/- through online payment mode. Candidates belonging to SC / ST, OBC Non-creamy layer & Physically Handicapped (PH)/ Physically Challenged (P.C) are exempted from the payment.\n" +
                "\n" +
                "Selection Process: Personal Interview.\n" +
                "\n" +
                "How to Apply: Eligible candidates apply online through DRDO RAC official website. The online registration should be close on 31/12/2018 up to 5:00 PM IST.  ");

        ap5 = (Button) findViewById(R.id.applyjob5);

        ap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

}

package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class job2 extends AppCompatActivity {

    TextView two;
    Button ap2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job2);

        two = (TextView) findViewById(R.id.jb2);
        two.setText("Fresher Recruitment For \"AIRPORT GROUND STAFF and AIR TICKETING\"\n" +
                "Totally For SURVIVE INDUSTRY.........\n" +
                "JOB PROFILE\n" +
                "1. CSA and GRE\n" +
                "2. ATA\n" +
                "3. SUPERVISOR\n" +
                "4. OUTLET CSA\n" +
                "5. RAMP EXECUTIVE\n" +
                "\n" +
                "SALARY SCALE\n" +
                "12500 to 15000 per month\n" +
                "Duty Hours - Eight (Sifting)\n" +
                "\n" +
                "JOB LOCATION\n" +
                "Kolkata / Delhi / Patna / BBSR Airport\n" +
                "\n" +
                "REQUIRED\n" +
                "Qualification - 10th (minimum)\n" +
                "12th(minimum only for female)\n" +
                "Age Criteria - 18 years to 29 years\n" +
                "Passport Mandatory ,if you don't have apply for this\n" +
                "**Physically Handicapped not Allowed\n" +
                "\n" +
                "Hiring for Direct Company Payroll........\n" +
                "PF/ ESI/ FOODING/ LODGING AVAILABLE\n" +
                "**visible tattoos are not allowed for the interview\n" +
                "Interview Details\n" +
                "MR. AYAN SEN\n" +
                "(983011-3395) ");

        ap2 = (Button) findViewById(R.id.applyjob2);

        ap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}

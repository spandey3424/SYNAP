package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class job4  extends AppCompatActivity {

    TextView four;
    Button ap4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job4);

        four = (TextView) findViewById(R.id.jb4);
        four.setText(" Fresher Job Location : Bhavnagar Walk-In Date : 28/01/2019Other Qualification Details: 1. Qualifications: M. Pharmacy (Natural Products / Pharmacognosy / Phytochemistry /Medicinal Chemistry / Pharmaceutical Analysis/Pharmaceutics) Or M. S.\n" +
                "\n" +
                "(Natural Products / Pharmacognosy / Phytochemistry /Medicinal Chemistry / Pharmaceutical Analysis/Pharmaceutics) Or M. Sc. (Medicinal Chemistry / Analytical Chemistry / Natural Products Chemistry) with at least 55% marks2. Fellowship: Consolidated Rs.\n" +
                "\n" +
                "25,000 per month3. Job requirements: The selected candidate will work on the DST-SERB funded project entitled “Studies on macrolide antibiotics: Application of genetic approaches for drug discovery” and has an opportunity to be registered for Ph. D. program upon fulfiling required criterion.\n" +
                "\n" +
                "Selected candidate is expected to prepare microbial / algal extracts and carry out bioassay-guided fractionation to isolate pure compounds employing chromatographic methods & determine their structures using advanced NMR and MS techniques. Age: The upper age limit is 30 years as on 28/01/2019 which is relaxable in case of candidates belonging to Scheduled Castes/Scheduled Tribes, OBC, woman and physically handicapped applicants as per CSIR rules.Document. 1. Original Certificates(s), Mark sheet(s) (Degree.) of the educational qualifications, certificate in support of the date of birth etc. ");

        ap4 = (Button) findViewById(R.id.applyjob4);

        ap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
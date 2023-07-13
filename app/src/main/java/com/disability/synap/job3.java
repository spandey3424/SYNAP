package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class job3 extends AppCompatActivity {

    TextView three;
    Button ap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job3);

        three = (TextView) findViewById(R.id.jb3);
        three.setText("Off: {2782511, 2534645}\n" +
                "EPABX: 4645, 4647\n" +
                "\n" +
                "\n" +
                "DEPARTMENT OF EVENING STUDIES-MULTI DISCIPLINARY RESEARCH CENTRE\n" +
                "\n" +
                "PANJAB UNIVERSITY, CHANDIGARH-160014\n" +
                "\n" +
                "Dated : 04.01.2019\n" +
                "Employment Notice\n" +
                "\n" +
                "Applications are invited for 01 (one) vacancy of Guest Faculty in the subject of\n" +
                "\n" +
                "History for the academic session 2018-2019 (Semester-wise) in the Department of\n" +
                "\n" +
                "Evening Studies –MDRC, Panjab University, Chandigarh:-\n" +
                "\n" +
                "\n" +
                "\n" +
                "Qualifications:-\n" +
                "\n" +
                "i) Good academic record as defined by the concerned University with at least 55%\n" +
                "marks (50% for SC/ST/Physically & Visually Handicapped) or an equivalent\n" +
                "grade in a point scale wherever grading system is followed at the Master’s degree\n" +
                "level in a relevant subject from an Indian University, or an equivalent degree\n" +
                "from an accredited foreign University.\n" +
                "\n" +
                "ii) Besides fulfilling the above qualifications, the candidate should have either\n" +
                "cleared the National Eligibility Test (NET) conducted by the UGC, or similar test\n" +
                "accredited by the UGC like SLET/SET. ");

        ap3 = (Button) findViewById(R.id.applyjob3);

        ap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}

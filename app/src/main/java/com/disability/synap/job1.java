package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class job1 extends AppCompatActivity {

    TextView one;
    Button ap1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job1);

        one = (TextView) findViewById(R.id.jb1);
        one.setText("Invites online applications from Graduates and Post Graduates for recruitment of Assistant Architects, Medical Officer, Engineers, Scientists, Agriculture / Horticulture vacancy posts.\n" +
                "\n" +
                "    Assistant Architects (Group B) – 7 Posts,Dep: Architecture Department Haryana\n" +
                "    Medical Officer, HCMS-I (Class-1) – 41 Posts,Dep: Labour Department Haryana\n" +
                "    Assistant Environmental Engineer (Group B) – 14 Posts,Dep: Haryana State Pollution Control Board\n" +
                "    Scientist-B (Group B) – 4 Posts,Dep: Haryana State Pollution Control Board\n" +
                "    Scientist Grade I (Group A) – 2 Posts,Dep: Environment Department\n" +
                "    District Horticulture Officer or equivalent (Class II) – 41 Posts,Dep: Horticulture Department Haryana\n" +
                "    Assistant Geologist and equivalent (Class-II) – 2 Posts,Dep: Agriculture & Farmers Welfare Department Haryana\n" +
                "    Assistant Statistician / Statistical Officer / Agriculture Statistical Officer / Field Officer / Statistics) / Assistant Statistical Officer / Research Officer (Statistics) (Class-II) – 2 Posts,Dep: Agriculture & Farmers Welfare Department Haryana\n" +
                "    Divisional Soil Conservation Officer / Senior Analyst and equivalent (Class-I) – 3 Posts,Dep: Agriculture & Farmers Welfare Department Haryana\n" +
                "    Economist (Class-I) – 1 Post,Dep: Agriculture & Farmers Welfare Department Haryana\n" +
                "    Deputy Director of Agriculture and equivalent (Class-I) – 4 Posts,Dep: Agriculture & Farmers Welfare Department Haryana\n" +
                "    Assistant Agriculture Engineer (Class-II) – 6 Posts,Dep: Agriculture & Farmers Welfare Department Haryana\n" +
                "    Horticulture Development Officer (Class-II) – 96 Posts,Dep: Horticulture Department Haryana \n" +
                "\n" +
                "Application Fee: ₹ 500/- for Male candidates of General category and all reserved categories of other states. ₹ 125/- for all female candidates of all states and male candidates of SC / BC / ESM categories of Haryana only. No fee for all physically handicapped candidates.\n" +
                "\n" +
                "How to Apply: Eligible candidates apply online through HPSC Official website from 7th January 2019. The online application can be filled up to 05/02/2019 up to 5:00 PM");

        ap1 = (Button) findViewById(R.id.applyjob1);

        ap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
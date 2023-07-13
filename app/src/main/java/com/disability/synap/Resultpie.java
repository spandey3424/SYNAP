package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Resultpie extends AppCompatActivity {

    float percent[] =  {70,30};
    String probablity[] = {"Yes", "No"};
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultpie);

        setupPieChart();

        exit = (Button) findViewById(R.id.ext);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void setupPieChart() {
        List<PieEntry> pieEntries = new ArrayList<>();
        for (int i=0;i<percent.length;i++) {
            pieEntries.add(new PieEntry(percent[i],probablity[i]));
        }

        PieDataSet dataSet = new PieDataSet(pieEntries, "Percentage Probablity for Disability");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data = new PieData(dataSet);

        PieChart chart= (PieChart) findViewById(R.id.chart);
        chart.setData(data);
        chart.animateY(1000);
        chart.invalidate();
    }
}

package com.example.omr.operation_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView Points;
    TextView AvgTime;
    TextView Acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Points=(TextView) findViewById(R.id.points);
        AvgTime=(TextView) findViewById(R.id.Avg);
        Acc=(TextView) findViewById(R.id.accuracy);
        Intent intent = getIntent();
        Points.setText("Points : "+intent.getStringExtra("Points"));
        AvgTime.setText("Average Time : "+intent.getStringExtra("AvgTime"));
        Acc.setText("Accuracy : "+intent.getStringExtra("Acc"));
    }
}

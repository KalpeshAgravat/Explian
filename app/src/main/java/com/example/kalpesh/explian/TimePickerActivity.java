package com.example.kalpesh.explian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class TimePickerActivity extends AppCompatActivity {
    TimePicker timePicker;
    Button time;
    TextView timetextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        timePicker = (TimePicker)findViewById(R.id.timeditText);
        timetextview = (TextView)findViewById(R.id.textViewtime);
        time = (Button)findViewById(R.id.buttonchangetime);
        timePicker.setIs24HourView(true);
        timetextview.setText(getCurrentTime());

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timetextview.setText(getCurrentTime());
            }
        });

    }

    private String getCurrentTime() {
        String currenttime="Current Time "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currenttime;
    }
}

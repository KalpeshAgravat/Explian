package com.example.kalpesh.explian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {
    DatePicker picker;
    Button btn_display;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        picker = (DatePicker)findViewById(R.id.dateeditText);
        btn_display = (Button)findViewById(R.id.buttonchangedate);
        textView = (TextView)findViewById(R.id.textView);
        textView.setText("Current Date "+getCurrentDate());

        btn_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("change "+getCurrentDate());
            }
        });
    }

    private String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        builder.append(picker.getMonth() + 1 +"/");
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear()+"/");
        return  builder.toString();
    }
}

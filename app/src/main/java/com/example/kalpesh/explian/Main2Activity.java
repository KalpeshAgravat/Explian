package com.example.kalpesh.explian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity {
    ToggleButton toggleButton1,toggleButton2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addLisnerOnBoutton();
    }

    private void addLisnerOnBoutton() {
        toggleButton1 = findViewById(R.id.togglebutton3);
        toggleButton2 = findViewById(R.id.togglebutton4);
        btn1 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Togglebutton1").append(toggleButton1.getText());
                result.append("Togglebutton2").append(toggleButton2.getText());

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}

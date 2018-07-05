package com.example.kalpesh.explian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Chek_Radio_boxActivity extends AppCompatActivity {
    CheckBox ch_burger,ch_pizza,ch_sandwich,ch_burger1,ch_pizza1;
    Button btn_total,btn_total1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chek__radio_box);
        addLisnerOnButton();
    }

    private void addLisnerOnButton() {

        ch_burger = (CheckBox)findViewById(R.id.checkBoxBurger);
        ch_pizza = (CheckBox)findViewById(R.id.checkBox2Pizza);
        ch_sandwich = (CheckBox)findViewById(R.id.chekboxsandwich);
        ch_burger1 = (CheckBox)findViewById(R.id.checkBoxBurger1);
        ch_pizza1 = (CheckBox)findViewById(R.id.checkBox2Pizza1);
        btn_total = (Button)findViewById(R.id.button);
        btn_total1 = (Button)findViewById(R.id.button1);


        btn_total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totol=0;
                StringBuilder result = new StringBuilder();
                result.append("selected item ");
                if(ch_burger.isChecked())
                {
                    result.append("\nburger 100Rs");
                      totol+=120;
                }
                if(ch_pizza.isChecked())
                {
                    result.append("\nPizza 120Rs");
                    totol+=120;
                }
                if(ch_sandwich.isChecked())
                {
                    result.append("\nSandwich 80");
                    totol+=80;
                }

                result.append("\nTotal: "+totol+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
        btn_total1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totol1=0;
                StringBuilder result1 = new StringBuilder();
                result1.append("selected item ");
                if(ch_burger1.isChecked())
                {
                    result1.append("\nburger 100Rs");
                    totol1+=120;
                }
                if(ch_pizza1.isChecked())
                {
                    result1.append("\nPizza 120Rs");
                    totol1+=120;
                }
                result1.append("\nTotal: "+totol1+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result1.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }

}

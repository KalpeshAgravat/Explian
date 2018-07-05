package com.example.kalpesh.explian;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentsActivity extends AppCompatActivity {
    Button btn_frgment1,btn_frgment2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        btn_frgment1 = (Button)findViewById(R.id.buttonfrgment1);
        btn_frgment2 = (Button)findViewById(R.id.buttonfrgment2);

        btn_frgment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FrgmentOne f1 = new FrgmentOne();
                fragmentTransaction.add(R.id.fr_1,f1);
                fragmentTransaction.commit();

            }
        });
        btn_frgment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FrgmentTwo f2 =new FrgmentTwo();
                fragmentTransaction.add(R.id.fr_2,f2);
                fragmentTransaction.commit();

            }
        });
    }
}

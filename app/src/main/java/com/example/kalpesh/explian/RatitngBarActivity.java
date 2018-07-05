package com.example.kalpesh.explian;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatitngBarActivity extends AppCompatActivity {
    RatingBar ratingbar;
    Button btn_rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratitng_bar);
        ratingbar = (RatingBar)findViewById(R.id.ratingBar);
        btn_rating = (Button)findViewById(R.id.buttonratting);

        btn_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(ratingbar.getRating());
                Toast.makeText(getApplicationContext(),rating,Toast.LENGTH_LONG).show();
            }
        });
    }
}

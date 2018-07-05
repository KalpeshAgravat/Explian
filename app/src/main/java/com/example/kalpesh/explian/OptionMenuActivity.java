package com.example.kalpesh.explian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == (R.id.about)) {
            Toast.makeText(getApplicationContext(), "Created by Kalpesh", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == (R.id.help)) {
            Toast.makeText(getApplicationContext(), "Need help ?", Toast.LENGTH_LONG).show();
            return true;
        }
        return true;
    }
}

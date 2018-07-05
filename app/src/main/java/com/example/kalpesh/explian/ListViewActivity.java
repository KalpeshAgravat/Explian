package com.example.kalpesh.explian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    ListView listview;
    TextView textView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listview = (ListView)findViewById(R.id.list_item);
        textView = (TextView)findViewById(R.id.Tvlistview);
        listItem = getResources().getStringArray(R.array.array_teconology);
         final ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,listItem);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String vlaue = adapter.getItem(position);
                Toast.makeText(getApplicationContext(),vlaue,Toast.LENGTH_LONG).show();
            }
        });
    }
}

package com.example.kalpesh.explian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        Button btn_popup = (Button) findViewById(R.id.popup);
        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(PopupMenuActivity.this, v);
                popupMenu.setOnMenuItemClickListener(PopupMenuActivity.this);
                popupMenu.inflate(R.menu.menu_exmaple);
                popupMenu.show();
            }
        });
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Toast.makeText(getApplicationContext(), "selected Item" + item.getTitle(),Toast.LENGTH_SHORT).show();


        switch (item.getItemId()){
            case R.id.search_item:
                return true;
            case R.id.upload_item:
                // do your code
                return true;
            case R.id.copy_item:
                // do your code
                return true;
            case R.id.print_item:
                // do your code
                return true;
            case R.id.share_item:
                // do your code
                return true;
            case R.id.bookmark_item:
                // do your code
                return true;
            default:
                return false;
        }

    }
}

package com.example.kalpesh.explian;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn_toggle,btn_checkbox,btn_seekbar,btn_spinner,btn_autocomplete,btn_listview,btn_rating,btn_webview,btn_datepicker
            ,btn_timepicker,btn_imgswitcher,btn_framents,btn_option,btn_context_menu,btn_popup;
    ImageView imageView_close;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toggle = (Button)findViewById(R.id.buttontoggle);
        btn_checkbox = (Button) findViewById(R.id.buttoncheck);
        btn_seekbar = (Button)findViewById(R.id.buttonseekbar);
        imageView_close = (ImageView)findViewById(R.id.imageclose);
        btn_spinner = (Button)findViewById(R.id.buttonspinner);
        btn_autocomplete = (Button)findViewById(R.id.buttonautocomplete);
        btn_listview = (Button)findViewById(R.id.buttonlistview);
        btn_rating = (Button)findViewById(R.id.buttonrating);
        btn_webview = (Button) findViewById(R.id.buttonwebview);
        btn_datepicker =(Button)findViewById(R.id.buttondatepicker);
        btn_timepicker = (Button)findViewById(R.id.buttontimepicker);
        btn_imgswitcher = (Button)findViewById(R.id.buttonimageswicher);
        btn_framents = (Button)findViewById(R.id.buttonfragment);
        btn_option = (Button)findViewById(R.id.buttonoptionmenu);
        btn_context_menu = (Button)findViewById(R.id.buttoncontextmenu);
        btn_popup = (Button)findViewById(R.id.buttonpopuptmenu);

        btn_autocomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AutoCompleteActivity.class);
                startActivity(intent);
            }
        });
        btn_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
        btn_checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Chek_Radio_boxActivity.class);
                startActivity(intent);
            }
        });
        btn_seekbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SeekbarActivity.class);
                startActivity(intent);
            }
        });
        builder = new AlertDialog.Builder(this);
        imageView_close.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                builder.setMessage("Do you Want to close this appliation ?").setCancelable(false).setPositiveButton("yes", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                Toast.makeText(getApplicationContext(),"You choose yes action go for  it",Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("AlertDialogExample");
                alert.show();
            }
        });
        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SpinnerActivity.class);
                startActivity(intent);
            }
        });
        btn_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListViewActivity.class);
                startActivity(intent);
            }
        });
        btn_rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RatitngBarActivity.class);
                startActivity(intent);
            }
        });
        btn_webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WebviewActivity.class);
                startActivity(intent);
            }
        });
        btn_datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DatePickerActivity.class);
                startActivity(intent);
            }
        });
        btn_timepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TimePickerActivity.class);
                startActivity(intent);
            }
        });
        btn_imgswitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ImageSwitchere.class);
                startActivity(intent);
            }
        });
        btn_framents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FragmentsActivity.class);
                startActivity(intent);
            }
        });
        btn_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OptionMenuActivity.class);
                startActivity(intent);
            }
        });
        btn_context_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ContextMenuActivity.class);
                startActivity(intent);
            }
        });
        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PopupMenuActivity.class);
                startActivity(intent);
            }
        });


    }

}


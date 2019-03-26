package com.example.admin.worshop;
import android.app.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private Button passDataButton;
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passDataButton=findViewById( R.id.pass_data_button);
        View.OnClickListener listener= new View.OnClickListener(){
            @Override
            public void onClick(View v){
                passData();
            }
        };
        passDataButton.setOnClickListener(listener);

    }
    private void passData(){
        Intent intent=new Intent(getApplicationContext(), student.class);
        intent.putExtra("college","TKM");
        startActivity(intent);
    }
}


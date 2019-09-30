package com.example.dia11tr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.dia11tr.Models.Device;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.HashMap;

public class second_step extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_step);

        Intent xthsIntent = getIntent();

        String xtag = xthsIntent.getStringExtra("Tag");

    Device xdev = MainActivity.DICCIONARIO.get(xtag);
        TextView xtxt = findViewById(R.id.textView);
        xtxt.setText(xdev.getID().toString());
        TextView xtxtCode = findViewById(R.id.textView2);
        xtxtCode.setText(xdev.getCode());


        FloatingActionButton borrar = findViewById(R.id.floatingActionButton);
        borrar.setOnClickListener(btnOnclickListener);
        borrar.setTag(xtag);


    }

    Button.OnClickListener  btnOnclickListener =  new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
           MainActivity.DICCIONARIO.remove(v.getTag().toString());
           finish();
        }
    };


}


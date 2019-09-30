package com.example.dia11tr;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.dia11tr.Models.Device;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static HashMap <String,Device> DICCIONARIO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         DICCIONARIO= iniData();

         ArrayList<String> listaDispositivos = new ArrayList<String>();
         listaDispositivos.add("x1");
        listaDispositivos.add("x2");
        listaDispositivos.add("x3");
        listaDispositivos.add("x4");

        TableLayout layout = findViewById(R.id.tbLay);




        for (String dispositivo: listaDispositivos )
        {
            TableRow xTR = new TableRow((this.getApplicationContext()));
            LinearLayout XLL = new LinearLayout((this.getApplicationContext()));
            TextView xtv = new TextView((this.getApplicationContext()));
            Button btn = new Button(this.getApplicationContext());

            TextView textview = new TextView(this.getApplicationContext());
            textview.setText(dispositivo);

            XLL.addView(textview);


            btn.setTag(dispositivo);
            btn.setText("Details");
            btn.setOnClickListener(btnOnclickListener);

            XLL.addView(btn);

            xTR.addView(XLL);
            layout.addView(xTR);
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        TableLayout layout = findViewById(R.id.tbLay);

/*        for (String dispositivo: listaDispositivos )
        {
            TableRow xTR = new TableRow((this.getApplicationContext()));
            LinearLayout XLL = new LinearLayout((this.getApplicationContext()));
            TextView xtv = new TextView((this.getApplicationContext()));
            Button btn = new Button(this.getApplicationContext());

            TextView textview = new TextView(this.getApplicationContext());
            textview.setText(dispositivo);

            XLL.addView(textview);


            btn.setTag(dispositivo);
            btn.setText("Details");
            btn.setOnClickListener(btnOnclickListener);

            XLL.addView(btn);

            xTR.addView(XLL);
            layout.addView(xTR);
        }*/
    }

    Button.OnClickListener  btnOnclickListener =  new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent xint = new Intent(v.getContext(),second_step.class );
            xint.putExtra("Tag",v.getTag().toString());
            startActivity(xint);
        }
    };

    public HashMap<String,Device> iniData(){

        HashMap<String, Device> hashMap = new HashMap<String,Device>();

        hashMap.put("x1", new Device(1, "Code","desc1"));
        hashMap.put("x2", new Device(2, "Code2","desc2"));
        hashMap.put("x3", new Device(3, "Code3","desc3"));

        return hashMap;
    }




}

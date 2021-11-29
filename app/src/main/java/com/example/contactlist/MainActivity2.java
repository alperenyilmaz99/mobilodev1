package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText ad;
    EditText numara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     ad=(EditText)findViewById(R.id.editTextTextPersonName);
     numara=(EditText) findViewById(R.id.editTextNumber);
    }

    public void gonder(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("isim",ad.getText().toString());
        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        startActivity(intent) ;
    }
}
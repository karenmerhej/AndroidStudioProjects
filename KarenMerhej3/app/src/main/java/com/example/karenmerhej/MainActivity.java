package com.example.karenmerhej;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.page1);
        img= (ImageView) findViewById(R.id.unicorn3);
    }

    public void goToPage2(View view) {

        img.animate().rotationBy(-1000).setDuration(2000);
//        Intent page2=new Intent(this,MainActivity2.class);
//        String name= input.getText().toString();
//        page2.putExtra("username",name);
//        startActivity(page2);
    }
}
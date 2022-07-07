package com.example.karenmerhej;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent x= getIntent();
        String name= x.getStringExtra("username");
        title= (TextView) findViewById(R.id.title1);
        title.setText(name);
    }

    public void backToPageOne(View view) {
        Intent page1 = new Intent(this, MainActivity.class);
        startActivity(page1);
    }
}
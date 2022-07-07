package com.example.administrator.karenmerhej;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=0;
    }

    public void clicked(View view){
        counter++;
        Toast.makeText(context this, text: "You clicked"+ counter + "times", LENGHT_LONG).show();

    }
}

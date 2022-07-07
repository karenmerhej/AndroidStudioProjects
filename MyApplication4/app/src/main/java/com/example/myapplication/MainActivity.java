package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> courses;
    ListView courses_list_view;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courses_list_view= (ListView) findViewById(R.id.listview);

        courses = new ArrayList<String>();
        courses.add("Mobile Development");
        courses.add("Object Oriented Programming");
        courses.add("Operating Systems");
        courses.add("Hadi Hoteit");

        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,courses);
        courses_list_view.setAdapter(adapter);

        courses_list_view.setOnItemClick (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),courses.get(i) , Toast.LENGTH_SHORT).show();

    }
}
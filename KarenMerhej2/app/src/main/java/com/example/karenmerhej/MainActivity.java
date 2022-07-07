package com.example.karenmerhej;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    TextView result;

    Button add_button;
    Button subtract_button;
    Button multiply_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.end_result);

        add_button= (Button) findViewById(R.id.add);
        subtract_button= (Button) findViewById(R.id.add);
        multiply_button= (Button) findViewById(R.id.multiply);
    }
    //int num1= Integer.parseIn(String);

    public void operation(View view) {
        int num1= Integer.parseInt(number1.getText().toString());
        int num2= Integer.parseInt(number2.getText().toString());
        int result_int;
        if (view.getId()==R.id.add) {
            result_int=num1+num2;
            result.setText(num1 + " + " + num2 + " = " + result_int);
        }
        else if (view.getId()==multiply_button.getId()) {
            result_int=num1*num2;
            result.setText(num1 + " * " + num2 + " = " + result_int);
        }
        else
        {
            result_int=num1-num2;
            result.setText(num1 + " - " + num2 + " = " + result_int);
        }

    }


    public void add(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int result_int = num1 + num2;

        result.setText(num1 + " + " + num2 + " = " + result_int);

    }

    public void subtract(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int result_int = num1 - num2;

        result.setText(num1 + " - " + num2 + " = " + result_int);

    }

    public void multiply(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int result_int = num1 * num2;

        result.setText(num1 + " * " + num2 + " = " + result_int);

    }
}


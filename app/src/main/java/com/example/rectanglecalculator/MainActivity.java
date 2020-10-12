package com.example.rectanglecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView Object Creation
        final TextView tvPerimeter = findViewById(R.id.txtPerimeterResult);
        final TextView tvArea = findViewById(R.id.txtAreaResult);

        //EditText Object Creation
        final EditText etLength = findViewById(R.id.etxtLength);
        final EditText etHeight = findViewById(R.id.etxtHeight);

        //Button object creation
        Button calculate = findViewById(R.id.btnCalculate);

        //Button Event
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Calculation
                double area = Double.parseDouble(etHeight.getText().toString()) * Double.parseDouble(etLength.getText().toString());
                double perimeter = 2 * Double.parseDouble(etLength.getText().toString()) + 2 * Double.parseDouble(etHeight.getText().toString());

                //Shows results
                tvArea.setText(String.format("%.2f", area));
                tvPerimeter.setText(String.format("%.2f", perimeter));
            }
        });
    }
}
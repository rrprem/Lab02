package com.premanandrhea.lab2;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton; // use Alt+Enter to auto-import Button
    Button mee;
    EditText responseText;
    TextView displayText;
    TextView displayText2;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        final String[] planet = res.getStringArray(R.array.planets_array);
        submitButton=findViewById(R.id.clickButton);
        mee=findViewById(R.id.clickButton2);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);
        displayText2=findViewById(R.id.textBox2);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText(responseText.getText().toString());
            }
        });

        count = 0;
        mee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText2.setText(planet[count]);
                count=count%7 + 1;
            }
        });
    }
}

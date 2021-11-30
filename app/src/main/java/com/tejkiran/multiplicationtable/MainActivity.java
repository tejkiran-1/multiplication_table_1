package com.tejkiran.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputVal;
    private TextView result;
    private Button okButton;
    private int ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputVal = findViewById(R.id.inputValue);
        result = findViewById(R.id.displayM);
        okButton = findViewById(R.id.okBut);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.okBut:
                        StringBuffer buffer = new StringBuffer();
                        int res;
                        String fs = inputVal.getText().toString();

                        int n = Integer.parseInt(fs);

                        for (int i = 1; i <= 10; i++) {
                            ans = (i * n);
                            buffer.append(n + " X " + i
                                    + " = " + ans + "\n\n");
                        }
                        result.setText(buffer);
                        break;
                }
            }
        });
    }
}
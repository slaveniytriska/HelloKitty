package com.example.hellokitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = findViewById(R.id.textView);
        mNameEditText = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Мур, няв!");
        } else {
            mHelloTextView.setText("Привіт, " + mNameEditText.getText());
        }

    }
}

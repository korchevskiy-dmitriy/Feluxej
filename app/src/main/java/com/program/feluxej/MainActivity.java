package com.program.feluxej;

import android.content.Intent;
import android.graphics.Typeface;
import androidx.core.content.ContextCompat;
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

        EditText email = findViewById(R.id.editTextEmailAddress);
        EditText password = findViewById(R.id.editTextNumberPassword);
        Button btnLogin = findViewById(R.id.buttonLogin);
        Button enLanguage = findViewById(R.id.buttonEn);
        Button deLanguage = findViewById(R.id.buttonDe);
        TextView tenant = findViewById(R.id.textViewTenant);
        TextView owner = findViewById(R.id.textViewOwner);
        View grayLine = findViewById(R.id.gray_line);
        View greenLine = findViewById(R.id.green_line);

        String correctEmail = "ads@gmail.com";
        String correctPassword = "111";

        Intent intent = new Intent(this, HomeActivity.class);
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals(correctEmail) && password.getText().toString().equals(correctPassword)) {
                    startActivity(intent);
                }
            }
        });

        enLanguage.setTextColor(0xFFFFFFFF);
        enLanguage.setBackgroundColor(0xFF393939);
        enLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                enLanguage.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.btn_lang));
                //enLanguage.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.btn_lang));

                enLanguage.setBackgroundColor(0xFF393939);
                enLanguage.setTextColor(0xFFFFFFFF);
                deLanguage.setBackgroundColor(0xFFE7E7E7);
                deLanguage.setTextColor(0xFF000000);
            }
        });


        deLanguage.setTextColor(0xFF000000);
        deLanguage.setBackgroundColor(0xFFE7E7E7);
        deLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                deLanguage.setBackgroundColor(0xFF393939);
                deLanguage.setTextColor(0xFFFFFFFF);
                enLanguage.setBackgroundColor(0xFFE7E7E7);
                enLanguage.setTextColor(0xFF000000);
            }
        });

        tenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grayLine.setBackgroundColor(0xFFBFBFBF);
                greenLine.setBackgroundColor(0xFF5C7B4F);

                owner.setTypeface(null, Typeface.NORMAL);
                tenant.setTypeface(null, Typeface.BOLD);
                owner.setTextColor(0xFF6B6B6B);
                tenant.setTextColor(0xFF000000);
            }
        });

        owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grayLine.setBackgroundColor(0xFF5C7B4F);
                greenLine.setBackgroundColor(0xFFBFBFBF);

                owner.setTypeface(null, Typeface.BOLD);
                tenant.setTypeface(null, Typeface.NORMAL);
                owner.setTextColor(0xFF000000);
                tenant.setTextColor(0xFF6B6B6B);
            }
        });

    }

}
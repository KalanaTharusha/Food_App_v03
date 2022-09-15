package com.example.food_app_v03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private Button signUpBtn;
    private Button cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        DBModel dbModel = new DBModel();
        dbModel.load(getApplicationContext());

        name = findViewById(R.id.eTextUName);
        email = findViewById(R.id.eTextUEmail);
        password = findViewById(R.id.eTextUPass);
        signUpBtn = findViewById(R.id.signupBtn);
        cancelBtn = findViewById(R.id.cancelBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uName = name.getText().toString();
                String uEmail = email.getText().toString();
                String uPassword = password.getText().toString();
                User newUser = new User(uName, uEmail, uPassword);
                dbModel.addUser(newUser);
                Toast.makeText(RegisterActivity.this, "You have registered successfully", Toast.LENGTH_SHORT).show();
//                Intent i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
                finish();
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
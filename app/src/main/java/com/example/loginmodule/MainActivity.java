package com.example.loginmodule;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    // creating variables for our edit text and buttons.
    private EditText emailEdt, passwordEdt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our edit text and buttons.
        emailEdt = findViewById(R.id.editTextTextEmailAddress);
        passwordEdt = findViewById(R.id.editTextTextPassword);
        loginBtn = findViewById(R.id.button);

        String id1, pass;
        id1 = "Anushka";
        pass = "Anushka@123";
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1, s2;
                s1 = emailEdt.getText().toString();
                s2 = passwordEdt.getText().toString();
                boolean b1, b2;
                b1 = id1.equals(s1);
                b2 = pass.equals(s2);
                if ((b1) && (b2))
                    Toast.makeText(MainActivity.this, "lOGIN iS VALID", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "LOGIN IS INVALID", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
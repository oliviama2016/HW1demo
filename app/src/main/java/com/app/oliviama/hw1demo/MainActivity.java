package com.app.oliviama.hw1demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    // Create objectd
    private Button buttonLogin;
    private EditText editTextLogin;
    private EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Link Java Objects to widgets in the UI
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        editTextLogin = (EditText)findViewById(R.id.editTextLogin);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);

        buttonLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Event Handler:
        if (editTextLogin.getText().toString().equals("User") &
                editTextPassword.getText().toString().equals("1234")){

            //Do it true
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        } else {
            //Do it false
            Toast.makeText(this, "Access Denied", Toast.LENGTH_SHORT).show();
        }

    }
}

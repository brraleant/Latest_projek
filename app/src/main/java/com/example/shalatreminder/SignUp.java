package com.example.shalatreminder;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity implements {
    EditText username, email, password;
    Button signupp;
    SignUp signUp;
    String st_user, st_pass, st_email;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sign_up);
            username = (EditText) findViewById(R.id.et_username);
            email = (EditText) findViewById(R.id.et_email);
            password = (EditText) findViewById(R.id.et_password);
            signupp = (Button) findViewById(R.id.btn_signup);

            signupp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    st_email = email.getText().toString();
                    st_pass = password.getText().toString();
                    st_user = username.getText().toString();

                }
            });
    }
}

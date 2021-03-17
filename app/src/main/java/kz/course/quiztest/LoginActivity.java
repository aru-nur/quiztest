package kz.course.quiztest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btn_input, btn_reg;
    EditText et_email, et_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_input = findViewById(R.id.btn_input);
        btn_reg = findViewById(R.id.btn_reg);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrationIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(registrationIntent);
            }
        });

        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(et_email.getText())){
                    et_email.setError("Толық толтырыңыз!");
                    return;
                }
                if(TextUtils.isEmpty(et_password.getText())){
                    et_password.setError("Толық толтырыңыз!");
                    return;
                }

                if(et_email.getText().toString().equals("user@gmail.com") &&
                        et_password.getText().toString().equals("123123")){
                Intent registrationIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(registrationIntent);
            }else{
                    int text;
                    Toast.makeText(LoginActivity.this, text: "Pochta nemese parol' qate zhazildy", Toast.LENGTH_LONG)
                }
        });

    }
}
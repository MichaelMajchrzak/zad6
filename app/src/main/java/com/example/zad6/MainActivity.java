package com.example.zad6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput, repeatPasswordInput;
    private TextView messageArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        repeatPasswordInput = findViewById(R.id.repeatPasswordInput);
        messageArea = findViewById(R.id.messageArea);
        Button submitButton = findViewById(R.id.submitButton);

        
        submitButton.setOnClickListener(view -> validateInput());
    }

    private void validateInput() {
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();
        String repeatPassword = repeatPasswordInput.getText().toString();

        if (!email.contains("@")) {
            messageArea.setText("Nieprawidłowy adres e-mail");
        } else if (!password.equals(repeatPassword)) {
            messageArea.setText("Hasła się różnią");
        } else {
            messageArea.setText("Witaj " + email);
        }
    }
}

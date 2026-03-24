package com.example.matule_klimov;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uicomponents.button.BthBig;
import com.example.uicomponents.button.BthCustom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BthBig btnPrimary = findViewById(R.id.btnPrimary);
        BthBig btnEnable = findViewById(R.id.btnEnable);
        BthBig btnTertiary = findViewById(R.id.btnTertiary);
        BthBig btnSecondary = findViewById(R.id.btnSecondary);

        btnPrimary.init("Отправить", BthCustom.TypeButton.PRIMARY);
        btnEnable.setEnabled(false);
        btnTertiary.init("Авторизоваться", BthCustom.TypeButton.TERTIARY);
        btnSecondary.init("Забыли пароль?", BthCustom.TypeButton.SECONDARY);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
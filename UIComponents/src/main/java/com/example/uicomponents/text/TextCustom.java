package com.example.uicomponents.text;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.uicomponents.R;

public class TextCustom extends ConstraintLayout {

    public EditText Text;

    public enum TypeText {
        DEFAULT, HOVER, ERROR;
    }

    public TextCustom(@NonNull Context context) {
        super(context);
        init(null);
    }

    public TextCustom(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(null);
    }

    public TextCustom(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(null);
    }

    public void init(Integer idLayout) {
        if (idLayout == null) return;

        LayoutInflater.from(this.getContext()).inflate(idLayout, this, true);

        Text = findViewById(R.id.text);
    }

    public void init(String value, TypeText type) {
        Text.setText(value);

        if (type == TypeText.DEFAULT) {
            Text.setBackgroundResource(R.drawable.text_default);
            Text.setTextColor(Color.parseColor("#000"));
        } else if (type == TypeText.HOVER) {
            Text.setBackgroundResource(R.drawable.text_hover);
            Text.setTextColor(Color.parseColor("#000"));
        } else if (type == TypeText.ERROR) {
            Text.setBackgroundResource(R.drawable.text_error);
            Text.setTextColor(Color.parseColor("#000"));
        }
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Text.setEnabled(enabled);
    }
}

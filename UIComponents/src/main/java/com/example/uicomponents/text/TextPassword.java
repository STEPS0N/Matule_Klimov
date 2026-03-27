package com.example.uicomponents.text;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.uicomponents.R;

public class TextPassword extends TextCustom{
    public TextPassword(@NonNull Context context) {
        super(context);
    }

    public TextPassword(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextPassword(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public void init(Integer idLayout) {
        super.init(R.layout.text_passord);
    }
}

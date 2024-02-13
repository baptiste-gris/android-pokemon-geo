package com.example.tp1;

import android.content.Context;
import android.view.View;

public class ButtonClickHandler implements View.OnClickListener {
    private final Context context;

    public ButtonClickHandler(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        System.out.println("mdrr");
    }
}

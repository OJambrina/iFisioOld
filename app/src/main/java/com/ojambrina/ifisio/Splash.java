package com.ojambrina.ifisio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    //TODO hacer comprobación de si has hecho Login que cargue directamente la ventana principal y sino lleve al login

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}

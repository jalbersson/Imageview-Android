package com.example.jalberssonplazas.imageview;

import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class inicioActivity extends AppCompatActivity
{

    ImageView imgPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        imgPrincipal=(ImageView) findViewById(R.id.imgPrincipal);
        imgPrincipal.setRotation(imgPrincipal.getRotation()+90);
    }
}

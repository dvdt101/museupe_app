package com.example.museupe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void localMuseuGoogleMaps (View v){

        Uri uriGeografico = Uri.parse("geo:0, 0?q=Museu+do+estado,Recife");
        Intent open = new Intent(Intent.ACTION_VIEW, uriGeografico);
        startActivity(open);
    }

    public void openWebSite (View v){

        Uri siteUrl =  Uri.parse("http://www.museudoestadope.com.br");
        Intent open = new Intent(Intent.ACTION_VIEW, siteUrl);
        startActivity(open);
    }

    public void openAgendar(View v){
        Intent open = new Intent(this, agendarActivity.class);
        startActivity(open);
    }

    public void openDonate(View v){
        Intent open = new Intent(this, DonateActivity.class);
        startActivity(open);
    }

}
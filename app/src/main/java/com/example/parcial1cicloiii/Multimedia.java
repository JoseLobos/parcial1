package com.example.parcial1cicloiii;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Multimedia extends AppCompatActivity {

    TabLayout Menu;

    TabItem tab1,tab2,tab3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);

        Menu=findViewById(R.id.Menu);
        tab1=findViewById(R.id.inicio);
        tab2=findViewById(R.id.audio);
        tab3=findViewById(R.id.video);

        Menu.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getPosition()==0){
                    Intent siga = new Intent(Multimedia.this, Multimedia.class);
                    startActivity(siga);
                }
                if(tab.getPosition()==1){
                    Intent siga = new Intent(Multimedia.this, com.example.parcial1cicloiii.ReproductorDeAudio.class);
                    startActivity(siga);
                }
                if(tab.getPosition()==2){
                    Intent siga = new Intent(Multimedia.this, com.example.parcial1cicloiii.ReproductorDeVideo.class);
                    startActivity(siga);
                }


            }



            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}

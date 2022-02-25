package com.example.parcial1cicloiii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MenuPrincipal extends AppCompatActivity {

    TabLayout tabLayout;

    TabItem tab1,tab2,tab3,tab4,tab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        tabLayout = findViewById(R.id.menu);
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        tab4 = findViewById(R.id.tab4);
        tab5 = findViewById(R.id.tab5);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Obtenemos la posición del tab a mostra
                // Determinar cual fragment se presenta
                if(tab.getPosition()==0){

                    Intent siguiente = new Intent(MenuPrincipal.this, MenuPrincipal.class);
                    startActivity(siguiente);
                }
                if(tab.getPosition()==1){
                    Intent siguiente = new Intent(MenuPrincipal.this, ControlesBasicos.class);
                    startActivity(siguiente);
                }
                if(tab.getPosition()==2){
                    Intent siguiente = new Intent(MenuPrincipal.this, Tabs.class);
                    startActivity(siguiente);
                }
                if(tab.getPosition()==3){
                    Intent siguiente = new Intent(MenuPrincipal.this, Sensores.class);
                    startActivity(siguiente);
                }
                if(tab.getPosition()==4){
                    Intent siguiente = new Intent(MenuPrincipal.this, Multimedia.class);
                    startActivity(siguiente);
                }

            }
//Gracias MIlena :v
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
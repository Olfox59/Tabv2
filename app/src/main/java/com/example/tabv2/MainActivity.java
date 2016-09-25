package com.example.tabv2;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;        //on cree une instance de toolbar
    TabLayout tabLayout;    //on cree une instance de tablelayout
    ViewPager viewPager;    //on cree une instance de view pager
    ViewPagerAdapter viewPagerAdapter;  //on cree une instance de viewPager adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init toolbar
        toolbar = (Toolbar)findViewById(R.id.toolBar);  //on link notre objet toolbar a la vue toolbar xml
        setSupportActionBar(toolbar);                   //apres ca la toolbar est ready( je sais pas c'est quoi)

        //Init du tableLayout
        tabLayout = (TabLayout)findViewById(R.id.tabLayout); //on link notre objet tabLayout au xml

        //Init du viewPager
        viewPager = (ViewPager)findViewById(R.id.viewPager);    //on link notre onjet au xml

        //Init du viewpageradapter
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Ici on ajouter les different fragments
        viewPagerAdapter.addFragments(new DashFragment(),"DashBoard" );
        viewPagerAdapter.addFragments(new SensorsFragments(),"Sensors" );
        viewPagerAdapter.addFragments(new ChronoFragment(),"Chrono" );

        //on link le viewPager a l'adapteur
        viewPager.setAdapter(viewPagerAdapter);

        //on link le tabLayout au viewpager
        tabLayout.setupWithViewPager(viewPager);
    }
}

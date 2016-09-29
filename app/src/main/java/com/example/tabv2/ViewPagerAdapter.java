package com.example.tabv2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by fle on 24/09/2016.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {   //changement de FragmentPagerAdapter vers FragmentStatePagerAdapter
                                                                    // FragmentPagerAdapter never destroys a fragment after it's been displayed the first time, donc probleme pour la rafraichissement periodique

    ArrayList<Fragment> fragments = new ArrayList<>();  //on cree un premier tableau contenant les objets fragments
    ArrayList<String> tabTitles = new ArrayList<>();    //on cree un second tableau qui contient le nom des onglets

    public void addFragments(Fragment myfragments, String mytitles ){

        this.fragments.add(myfragments);
        this.tabTitles.add(mytitles);
    }

    //on creer le constructeur de la classe
    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);

    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemPosition(Object item) {
        return POSITION_NONE;           //getItemPosition retourne POSITION_NONE a viewPagerAdapter.notifyDataSetChanged(); pour refresh les vues quand on le souhaite.
    }

    @Override
    public int getCount() {
        return fragments.size();        //retourn le nombre de fragment creer( =nombre onglet car 1fragment par onglet)
    }

    @Override
    public CharSequence getPageTitle(int position) {    //retourne le nom de l'onglet en cours
        return tabTitles.get(position);
    }
}

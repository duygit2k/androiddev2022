package com.edu.usth.weather;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class WeatherAndForecastFragment extends FragmentPagerAdapter {

    public WeatherAndForecastFragment(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WeatherFragment();
            case 1:
                return new ForecastFragment();
        }
        return new ForecastFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
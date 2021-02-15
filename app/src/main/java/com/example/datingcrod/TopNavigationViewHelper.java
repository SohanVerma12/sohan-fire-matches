package com.example.datingcrod;

import android.content.Context;
import android.content.Intent;

import com.example.datingcrod.Matches.MatchesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class TopNavigationViewHelper {

    private static final String TAG = "TopNavigationViewHelper";

    public static void setupTopNavigationView(BottomNavigationViewEx tv) {
        Log.d(TAG, "setupTopNavigationView: setting up navigationview");


    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_profile:
                        Intent intent2 = new Intent(context, SettingsActivity.class);
                        Toast.makeText(context, "Tap on profile to change", Toast.LENGTH_SHORT).show();
                       // AdsIntersitital();
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_matched:
                        Intent intent3 = new Intent(context, MatchesActivity.class);
                        context.startActivity(intent3);

                        break;
                }

                return false;
            }
        });
    }

}

package com.example.librarybook;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.example.librarybook.fragment.HomeFragment;
import com.example.librarybook.fragment.LibraryFragment;
import com.example.librarybook.fragment.ProfileFragment;
import com.example.librarybook.fragment.ShoppingFragment;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Tab selected error";
    private AnimatedBottomBar animatedBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animatedBottomBar = findViewById(R.id.bottom_bar);

        replace(new HomeFragment());
        animatedBottomBar.setOnTabSelectListener(new AnimatedBottomBar.OnTabSelectListener() {
            @Override
            public void onTabSelected(int i, @Nullable AnimatedBottomBar.Tab tab, int i1, @NonNull AnimatedBottomBar.Tab tab1) {

            }

            @Override
            public void onTabReselected(int i, @NonNull AnimatedBottomBar.Tab tab) {

                switch (tab.getId()){

                    case R.id.tab_home:
                        replace(new HomeFragment());
                        break;
                    case R.id.tab_library:
                        replace(new LibraryFragment());
                        break;
                    case R.id.tab_shopping:
                        replace(new ShoppingFragment());
                        break;
                    case R.id.tab_users:
                        replace(new ProfileFragment());
                        break;
                    default:
                        Log.e(TAG, "onTabReselected: ");
                        break;
                }
            }
        });

        animatedBottomBar.selectTabById(R.id.tab_home, true);

    }

    private void replace(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.commit();
    }

}
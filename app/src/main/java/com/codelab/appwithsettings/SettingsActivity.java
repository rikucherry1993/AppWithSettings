package com.codelab.appwithsettings;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    public static final String KEY_PREF_EXAMPLE_SWITCH = "example_switch";
    public static final String KEY_PREF_EXAMPLE_CHECKBOX = "example_check";
    public static final String KEY_PREF_EXAMPLE_TEXT = "example_text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // to display SettingsFragment as the main content
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
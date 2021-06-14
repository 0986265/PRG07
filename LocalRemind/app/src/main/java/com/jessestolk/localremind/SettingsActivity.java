package com.jessestolk.localremind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class SettingsActivity extends PreferenceActivity {

    private final static String LOG_TAG = "LocalRemind";

    public final static String OPT_LANG = "switch_dutch";
    public final static Boolean OPT_LANG_DEFAULT = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Opens Settings XML
        addPreferencesFromResource(R.xml.settings);
    }

    public static boolean dutchLanguage (Context context) {

        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_LANG, OPT_LANG_DEFAULT);
    }
}
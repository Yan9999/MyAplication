package com.example.myaplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.google.android.material.radiobutton.MaterialRadioButton;


public class   SettingsActivity extends AppCompatActivity {

    private Button button_language, button_themes;
    private Button button_orientation;
    private FrameLayout frameLayout;
    private final BlankFragmentLanguage blankFragmentLanguage = new BlankFragmentLanguage();
    private final BlankFragmentThemes blankFragmentThemes = new BlankFragmentThemes();
    private final BlankFragmentOrentation blankFragmentOrentation = new BlankFragmentOrentation();
    private ActivityThemes activityThemes = new ActivityThemes();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.acrivity_setting);


       /* button_language = findViewById(R.id.button);
        button_themes = findViewById(R.id.button2);
        button_orientation = findViewById(R.id.button3);
        frameLayout = findViewById(R.id.frameLa);*/


        button_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewFragment(blankFragmentLanguage);

            }
        });

      /*  button_themes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewFragment(blankFragmentThemes);

            }
        });

        button_themes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewFragment(blankFragmentThemes);

            }
        });
*/
    }

    private void setNewFragment(Fragment fragment) {


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLa, fragment);
        ft.commit();

    }

public void exemp (View view){
    startActivity(new Intent(this, SettingsActivity.class));
}



}









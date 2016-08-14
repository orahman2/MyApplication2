package com.example.android.sodaadviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class FindSodaActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_soda);
    }
    public void onClickFindSoda(View view){
        TextView brands = (TextView) findViewById(R.id.brands);

        Spinner color = (Spinner) findViewById(R.id.color);
        SodaExpert sodaExpert = new SodaExpert();
        brands.setText(sodaExpert.getBrands((String) color.getSelectedItem()));
//        brands.setText(color.getSelectedItem().toString());
//        brands.setText(((Button) view).getText());
    }
}
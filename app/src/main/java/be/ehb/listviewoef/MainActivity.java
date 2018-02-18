package be.ehb.listviewoef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

import be.ehb.listviewoef.model.Country;
import be.ehb.listviewoef.util.CountryListAdapter;


public class MainActivity extends AppCompatActivity {

    private ListView lvCountries;
    private CountryListAdapter mCountryListAdapter;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCountries = findViewById(R.id.lv_countries);
        Country denmark = new Country("Denmark","Danish");
        Country belgium = new Country("Belgium","Dutch");
        Country germany = new Country("Germany","German");
        Country france = new Country("France","French");


        ArrayList<Country>countriesList = new ArrayList<>();

        countriesList.add(denmark);
        countriesList.add(belgium);
        countriesList.add(germany);
        countriesList.add(france);

        Collections.sort(countriesList);

        mCountryListAdapter = new CountryListAdapter(countriesList,this);
        lvCountries.setAdapter(mCountryListAdapter);







    }
}

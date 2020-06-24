package com.example.listviewinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewinterface.Adapter.CountryAdapter;
import com.example.listviewinterface.Model.Country;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lvCountries = findViewById(R.id.lvCountries);

        final ArrayList<Country> data = new ArrayList<>();

        data.add(new Country(1, R.drawable.ic_pakistan, "Pakistan",
                "Population: 203,382,058", "Area: 796,095 km2"));
        data.add(new Country(2, R.drawable.ic_afghanistan, "Afghanistan",
                "Population: 25,500,100", "Area: 652,090 km2"));
        data.add(new Country(3, R.drawable.ic_india, "India",
                "Population: 1,241,610,000", "Area: 3,387,260 km2"));
        data.add(new Country(4, R.drawable.ic_iran, "Iran",
                "Population: 77,288,000", "Area: 1,648,200 km2"));
        data.add(new Country(5, R.drawable.ic_china, "China",
                "Population: 1,363,350,000", "Area: 9,640,820 km2"));
        data.add(new Country(6, R.drawable.ic_america, "United State",
                "Population: 317,706,00", "Area: 9,629,090 km2"));


        CountryAdapter countryAdapter = new CountryAdapter(this, data);


        lvCountries.setAdapter(countryAdapter);
        lvCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, data.get(i).getTvName(), Toast.LENGTH_LONG).show();

                //view is the selected row
                view.setBackgroundColor(getColor(R.color.selectedRowColor));

                Log.e("name = ", data.get(i).getTvName());


            }
        });


    }
}
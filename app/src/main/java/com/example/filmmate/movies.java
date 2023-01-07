package com.example.filmmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class movies extends AppCompatActivity {
    private ListView lv;
    private ArrayAdapter adapter;
    private ArrayList<String> list1;
    private SearchView sv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        lv = (ListView) findViewById(R.id.list);
        sv = (SearchView) findViewById(R.id.search);
        list1 = new ArrayList<String>();
        list1.add("Some Like it Hot (1959)");
        list1.add("Casablanca (1942)");
        list1.add("Citizen Kane (1941)");
        list1.add("Bicycle Thieves (1948)");
        list1.add("The Godfather (1972)");
        list1.add("The Apartment (1960)");
        list1.add("Psycho (1960)");
        list1.add("Lawrence of Arabia (1962)");
        list1.add("Gone With The Wind (1939)");
        list1.add("Seven Samurai (1954)");  //todo add more movies manually or automatically
        list1.add("Pather Panchali (1955)");
        //todo add sorting by name
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list1);
        lv.setAdapter(adapter);
        sv.setIconified(false);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                openMoreInfo();
            }

        });
    }
    public void openMoreInfo(){
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }


    //todo add onclick listener to listView (when 3 movies clicked) "next" button appears and you can go to next screen. you can also "unclick" movies.
    }


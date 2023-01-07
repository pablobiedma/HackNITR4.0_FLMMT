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
public class actors extends AppCompatActivity {
    private ListView lv;
    private ArrayAdapter adapter;
    private ArrayList<String> list1;
    private SearchView sv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actors);
        lv = (ListView)findViewById(R.id.list);
        sv = (SearchView)findViewById(R.id.search);
        list1 = new ArrayList<String>();
        list1.add("James Stewart");
        list1.add("Cary Grant");
        list1.add("Henry Fonda");
        list1.add("Gary Cooper");
        list1.add("Kirk Douglas");
        list1.add("Spencer Tracy");
        list1.add("John Wayne");
        list1.add("Laurence Oliver");
        list1.add("Paul Newman");
        list1.add("Al Pacino");  //todo add more actors manually or automatically
        list1.add("Clark Gable");
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
                openMovies();
            }

        });
    }
    public void openMovies(){
        Intent intent = new Intent(this, movies.class);
        startActivity(intent);
    }

        //todo add onclick listener to listView (when 3 actors clicked) "next" button appears and you can go to next screen. you can also "unclick" actors.
    }


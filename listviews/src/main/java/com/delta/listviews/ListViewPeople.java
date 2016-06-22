package com.delta.listviews;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


/**
 * Created by brandyjames on 6/22/16.
 */
public class ListViewPeople extends People {

    People[] myPeopleArray = new People[]{
            new People("Robert", 7045769067 , "art" ,"male"),
            new People("Rebecca", 9801234567, "bike","female"),
            new People("Tim", , "polaroids","male"),
            new People("Nikki", 7069876543, "radio", "female"),

    };

    String[] myStringArray = new String[]{
            "Robert",
            "Rebecca",
            "Tim",
            "Nikki",

    };


    private ListView mListView;
    private PeopleAdapter mPeopleAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        mListView = (ListView) findViewById(R.id.myListView);
        mPeopleAdapter = new PeopleAdapter(getApplicationContext(),R.layout.row,myPeoplArray);

        if(mListView != null) {
            mListView.setAdapter(mPeopleAdapter);


            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Log.v("People", myPeopleArray[i].mName);

                }
            });

        }



        mArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,myStringArray);

        if(mListView != null){
            mListView.setAdapter(mArrayAdapter);
        }

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("People", myStringArray[i])
            }
        }
    });

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}

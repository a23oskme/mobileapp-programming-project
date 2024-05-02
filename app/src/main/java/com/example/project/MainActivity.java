package com.example.project;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a23oskme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //new JsonFile(this, this).execute(JSON_FILE);
        new JsonTask((JsonTask.JsonTaskListener) this).execute(JSON_URL);

    }


    @Override
    public void onPostExecute(String json) {

        try {
            JSONArray jsonArr = new JSONArray(json);
            RecyclerView recyclerView =findViewById(R.id.myRecyclerView);


            ArrayList<Birds> birdList = new ArrayList<>();

            Log.d("MainActivity", json);
            for (int i = 0; i < jsonArr.length(); i++) {
                JSONObject jsonObj = jsonArr.getJSONObject(i);

                String name = jsonObj.getString("name");
                String location = jsonObj.getString("location");
                int weight = jsonObj.getInt("size");
                String latin = jsonObj.getString("company");
                Log.d(latin, "onPostExecute: hejsan");

                birdList.add(new Birds(name, location, weight, latin));

            }

            RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, birdList);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            // datan har ändrats
            adapter.notifyDataSetChanged();

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

}

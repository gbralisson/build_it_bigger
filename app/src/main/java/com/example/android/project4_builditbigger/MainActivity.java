package com.example.android.project4_builditbigger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android.jokesjavalibrary.Jokes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickButton(View view){
        Jokes jokes = new Jokes();
        Toast.makeText(this, jokes.getJoke(), Toast.LENGTH_SHORT).show();
    }
}

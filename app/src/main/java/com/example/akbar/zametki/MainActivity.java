package com.example.akbar.zametki;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        ImageView iv = (ImageView) findViewById(R.id.imageView);


        if (id == R.id.fitStart) {
            iv.setImageResource(R.drawable.fewfwwf4);
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);


        }
        if (id == R.id.fitCenter) {
            iv.setImageResource(R.drawable.fewfwwf4);
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);


        }
        if (id == R.id.fitEnd) {
            iv.setImageResource(R.drawable.fewfwwf4);
            iv.setScaleType(ImageView.ScaleType.FIT_END);


        }
        if (id == R.id.center) {
            iv.setImageResource(R.drawable.dqwd8);
            iv.setScaleType(ImageView.ScaleType.CENTER);


        }
        if (id == R.id.centerCrop) {
            iv.setImageResource(R.drawable.dqwd8);
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);


        }
        if (id == R.id.centerInside) {
            iv.setImageResource(R.drawable.dqwd8);
            iv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

        }


        return super.onOptionsItemSelected(item);
    }
}



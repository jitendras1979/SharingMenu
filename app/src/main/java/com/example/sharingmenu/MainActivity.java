package com.example.sharingmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.shareit:
                Intent shareingIntent=new Intent(Intent.ACTION_SEND);
                shareingIntent.setType("text/plain");
                String shareBody="My body text";
                String shareSubect="My title";
                shareingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                shareingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubect);
                startActivity(Intent.createChooser(shareingIntent,"Share Using"));

                break;


        }

        return super.onOptionsItemSelected(item);
    }
}

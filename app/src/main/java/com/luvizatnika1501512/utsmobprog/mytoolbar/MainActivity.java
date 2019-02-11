package com.luvizatnika1501512.utsmobprog.mytoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Elearning> alElearning;
    //Toolbar myToolbar;
    RecyclerView rvElearning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        alElearning = new ArrayList<>();
        alElearning.add(new Elearning("130283","Luvi"));
        alElearning.add(new Elearning("130245","Luva"));

        rvElearning = (RecyclerView) findViewById(R.id.rvElearning);
        rvElearning.setHasFixedSize(true);

        AdapterElearning adapter = new AdapterElearning(alElearning);
        rvElearning.setAdapter(adapter);

        RecyclerView.LayoutManager le = new LinearLayoutManager(this);
        rvElearning.setLayoutManager(le);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.mKelas:
                Toast.makeText(getApplicationContext(), "Kelas", Toast.LENGTH_LONG).show();
                return true;
            case R.id.mProfil:
                Toast.makeText(getApplicationContext(), "Profil", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

package com.example.denis.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    TextView LabWork;
    final int AboutTheAuthor = 1;
    final int Reset = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LabWork = (TextView) findViewById(R.id.LabWorkID);
        registerForContextMenu(LabWork);

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        switch (v.getId()){
            case R.id.LabWorkID:
                menu.add(0, AboutTheAuthor, 0, R.string.aboutTheAuthor );
                menu.add(0, Reset, 0, R.string.reset );
                break;
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        TextView SurnameID = (TextView) findViewById(R.id.SurnameID);
        TextView NameID = (TextView) findViewById(R.id.NameID);
        TextView PatronymicID = (TextView) findViewById(R.id.PatronymicID);
        TextView GroupID = (TextView) findViewById(R.id.GroupID);
        switch (item.getItemId()){
            case AboutTheAuthor:

                SurnameID.setVisibility(View.VISIBLE);
                NameID.setVisibility(View.VISIBLE);
                PatronymicID.setVisibility(View.VISIBLE);
                GroupID.setVisibility(View.VISIBLE);
                break;
            case Reset:
                SurnameID.setVisibility(View.INVISIBLE);
                NameID.setVisibility(View.INVISIBLE);
                PatronymicID.setVisibility(View.INVISIBLE);
                GroupID.setVisibility(View.INVISIBLE);

                break;

        }
        return super.onContextItemSelected(item);
    }
    public void onClickAuthorID(View view) {
        TextView SurnameID = (TextView) findViewById(R.id.SurnameID);
        SurnameID.setVisibility(View.VISIBLE);
        TextView NameID = (TextView) findViewById(R.id.NameID);
        NameID.setVisibility(View.VISIBLE);
        TextView PatronymicID = (TextView) findViewById(R.id.PatronymicID);
        PatronymicID.setVisibility(View.VISIBLE);
        TextView GroupID = (TextView) findViewById(R.id.GroupID);
        GroupID.setVisibility(View.VISIBLE);
    }
}
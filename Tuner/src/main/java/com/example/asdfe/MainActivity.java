package com.example.asdfe;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.zip.Inflater;


public class MainActivity extends AppCompatActivity{
    Button cord_E,cord_A,cord_G,cord_D,cord_B,cord_HE;
    MediaPlayer Media_d,Media_e,Media_g,Media_a,Media_b,Media_he,Media_fs,Media_cs,Media_gs,Media_ds
            ,Media_as;
        //test
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"코드배우기→")
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==1) {
            Intent intent = new Intent(getApplicationContext(), cord.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    void MediaStart(){
        switch (cord_D.getText().toString()){
            case "E":
                Media_e = MediaPlayer.create(MainActivity.this, R.raw.e);
                Media_e.start();
                break;
            case "A":
                Media_a = MediaPlayer.create(MainActivity.this, R.raw.a);
                Media_a.start();
                break;
            case "D":
                Media_d = MediaPlayer.create(MainActivity.this, R.raw.d);
                Media_d.start();
                break;
            case "G":
                Media_g = MediaPlayer.create(MainActivity.this, R.raw.g);
                Media_g.start();
                break;
            case "B":
                Media_b = MediaPlayer.create(MainActivity.this, R.raw.b);
                Media_b.start();
                break;
            case "HE":
                Media_he = MediaPlayer.create(MainActivity.this, R.raw.he);
                Media_he.start();
                break;
            case "F#":
                Media_fs = MediaPlayer.create(MainActivity.this, R.raw.fs);

                Media_fs.start();
                break;
            case "C#":
                Media_cs = MediaPlayer.create(MainActivity.this, R.raw.cs);
                Media_cs.start();
                break;
            case "A#":
                Media_as = MediaPlayer.create(MainActivity.this, R.raw.as);
                Media_as.start();
                break;
            case "D#":
                Media_ds = MediaPlayer.create(MainActivity.this, R.raw.ds);
                Media_ds.start();
                break;
            case "G#":
                Media_gs = MediaPlayer.create(MainActivity.this, R.raw.gs);
                Media_gs.start();
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setIcon(R.drawable.yth_round);
        cord_D=(Button)findViewById(R.id.cord_D);
        cord_A=(Button)findViewById(R.id.cord_A);
        cord_E=(Button)findViewById(R.id.cord_E);
        cord_G=(Button)findViewById(R.id.cord_G);
        cord_B=(Button)findViewById(R.id.cord_B);
        cord_HE=(Button)findViewById(R.id.cord_HE);
        Media_d=MediaPlayer.create(this,R.raw.d);
        Media_e=MediaPlayer.create(this,R.raw.e);
        Media_a=MediaPlayer.create(this,R.raw.a);
        Media_g=MediaPlayer.create(this,R.raw.g);
        Media_b=MediaPlayer.create(this,R.raw.b);
        Media_he=MediaPlayer.create(this,R.raw.he);

        final String tumode[]= {"♬ Standard" , "♬ Drop C" , "♬ Drop D", "♬ Drop B ", "♬ Half-step down","♬ 1 and 1/2 step down","♬ Open D","♬ Open D minor","♬ Modal D","♬ Modal C","♬ Open G","♬ Open G minor","♬ Modal C6"};

        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter;
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,tumode);
        spinner.setAdapter(adapter);

        cord_D.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   MediaStart();
                }
            });
        cord_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaStart();
            }
        });
        cord_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaStart();
            }
        });
        cord_HE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaStart();
            }
        });
        cord_G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaStart();
            }
        });
        cord_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaStart();
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                switch (position){
                    case 0:
                        cord_D.setText("D");
                        cord_A.setText("A");
                        cord_E.setText("E");
                        cord_HE.setText("E");
                        cord_B.setText("B");
                        cord_G.setText("G");
                        break;
                    case 1:

                    case 2:
                        cord_D.setText("D");
                        cord_A.setText("A");
                        cord_E.setText("D");
                        cord_HE.setText("E");
                        cord_B.setText("B");
                        cord_G.setText("G");
                        break;
                    case 3:
                        cord_D.setText("D");
                        cord_A.setText("A");
                        cord_E.setText("D");
                        cord_HE.setText("E");
                        cord_B.setText("B");
                        cord_G.setText("F");
                        break;
                    case 4:
                        cord_D.setText("B");
                        cord_A.setText("F#");
                        cord_E.setText("B");
                        cord_HE.setText("C#");
                        cord_B.setText("G#");
                        cord_G.setText("E");
                        break;
                    case 5:
                        cord_D.setText("C#");
                        cord_A.setText("G");
                        cord_E.setText("D#");
                        cord_HE.setText("D#");
                        cord_B.setText("A#");
                        cord_G.setText("F#");
                        break;
                    case 6:
                        cord_D.setText("B");
                        cord_A.setText("F#");
                        cord_E.setText("C#");
                        cord_HE.setText("C#");
                        cord_B.setText("G#");
                        cord_G.setText("E");
                        break;
                    case 7:
                        cord_D.setText("D");
                        cord_A.setText("A");
                        cord_E.setText("D");
                        cord_HE.setText("D");
                        cord_B.setText("A");
                        cord_G.setText("F#");
                        break;
                    case 8:
                        cord_D.setText("D");
                        cord_A.setText("A");
                        cord_E.setText("D");
                        cord_HE.setText("D");
                        cord_B.setText("A");
                        cord_G.setText("F");
                        break;
                    case 9:
                        cord_D.setText("D");
                        cord_A.setText("A");
                        cord_E.setText("D");
                        cord_HE.setText("D");
                        cord_B.setText("A");
                        cord_G.setText("G");
                        break;
                    case 10:
                        cord_D.setText("C");
                        cord_A.setText("G");
                        cord_E.setText("C");
                        cord_HE.setText("D");
                        cord_B.setText("C");
                        cord_G.setText("G");
                        break;
                    case 11:
                        cord_D.setText("D");
                        cord_A.setText("G");
                        cord_E.setText("D");
                        cord_HE.setText("D");
                        cord_B.setText("B");
                        cord_G.setText("G");
                        break;
                    case 12:
                        cord_D.setText("C");
                        cord_A.setText("A");
                        cord_E.setText("C");
                        cord_HE.setText("E");
                        cord_B.setText("C");
                        cord_G.setText("G");
                        break;
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

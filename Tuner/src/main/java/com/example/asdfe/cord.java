package com.example.asdfe;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class cord extends AppCompatActivity {
    ListView listView1;
    MyAdapter adapter;
    Integer posterID[] = {R.drawable.img_c1, R.drawable.img_d1, R.drawable.img_e1, R.drawable.img_f1, R.drawable.img_g1, R.drawable.img_a1, R.drawable.img_b1};
    Integer ccodeID[] = {R.drawable.img_c2, R.drawable.img_c3, R.drawable.img_c4, R.drawable.img_c5};
    Integer dcodeID[] = {R.drawable.img_d2, R.drawable.img_d3, R.drawable.img_d4, R.drawable.img_d5};
    Integer ecodeID[] = {R.drawable.img_e2, R.drawable.img_e3, R.drawable.img_e4, R.drawable.img_e5};
    Integer fcodeID[] = {R.drawable.img_f2, R.drawable.img_f3, R.drawable.img_f4, R.drawable.img_f5};
    Integer gcodeID[] = {R.drawable.img_g2, R.drawable.img_g3, R.drawable.img_g4, R.drawable.img_g5};
    Integer acodeID[] = {R.drawable.img_a2, R.drawable.img_a3, R.drawable.img_a4, R.drawable.img_a5};
    Integer bcodeID[] = {R.drawable.img_b2, R.drawable.img_b3, R.drawable.img_b4, R.drawable.img_b5};
    String ccodename[]={"Cm","C7","CM7","Cm7"};
    String dcodename[]={"Dm","D7","DM7","Dm7"};
    String ecodename[]={"Em","E7","EM7","Em7"};
    String fcodename[]={"Fm","F7","FM7","Fm7"};
    String gcodename[]={"Gm","G7","GM7","Gm7"};
    String acodename[]={"Am","A7","AM7","Am7"};
    String bcodename[]={"Bm","B7","BM7","Bm7"};
    String title[] = {"C", "D", "E", "F", "G", "A",
            "B", "C"};
    GridView gridView;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cord);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("코드배우기");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        gridView = (GridView) findViewById(R.id.gridView);
        listView1 = (ListView) findViewById(R.id.listView1);
        final List<ItemData> data = new ArrayList<>();
        for (int i = 0; i < posterID.length; i++) {
            data.add(new ItemData(posterID[i], title[i]));
        }
        adapter = new MyAdapter(this, data);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                List<ItemData> itemList = new ArrayList<>();
                MyGridAdapter gAdapter;
                switch (position) {
                    case 0:
                        for(int i = 0; i<ccodeID.length; i++){
                            ItemData item = new ItemData(ccodeID[i],ccodename[i]);

                        itemList.add(item);
                        }
                        gAdapter = new MyGridAdapter(cord.this, itemList);
                        gridView.setAdapter(gAdapter);

                        break;
                    case 1:
                        for(int i = 0; i<ccodeID.length; i++){
                            ItemData item = new ItemData(dcodeID[i],dcodename[i]);

                            itemList.add(item);
                        }
                       gAdapter = new MyGridAdapter(cord.this, itemList);
                        gridView.setAdapter(gAdapter);

                        break;
                    case 2:
                        for(int i = 0; i<ccodeID.length; i++){
                            ItemData item = new ItemData(ecodeID[i],ecodename[i]);

                            itemList.add(item);
                        }
                        gAdapter = new MyGridAdapter(cord.this, itemList);
                        gridView.setAdapter(gAdapter);

                        break;
                    case 3:
                        for(int i = 0; i<ccodeID.length; i++){
                            ItemData item = new ItemData(fcodeID[i],fcodename[i]);

                            itemList.add(item);
                        }
                        gAdapter = new MyGridAdapter(cord.this, itemList);
                        gridView.setAdapter(gAdapter);

                        break;
                    case 4:
                        for(int i = 0; i<ccodeID.length; i++){
                            ItemData item = new ItemData(gcodeID[i],gcodename[i]);

                            itemList.add(item);
                        }
                        gAdapter = new MyGridAdapter(cord.this, itemList);
                        gridView.setAdapter(gAdapter);

                        break;
                    case 5:
                        for(int i = 0; i<ccodeID.length; i++){
                            ItemData item = new ItemData(acodeID[i],acodename[i]);

                            itemList.add(item);
                        }
                        gAdapter = new MyGridAdapter(cord.this, itemList);
                        gridView.setAdapter(gAdapter);

                        break;
                    case 6:
                        for(int i = 0; i<ccodeID.length; i++){
                            ItemData item = new ItemData(bcodeID[i],bcodename[i]);

                            itemList.add(item);
                        }
                        gAdapter = new MyGridAdapter(cord.this, itemList);
                        gridView.setAdapter(gAdapter);

                        break;
                }

            }
        });


    }

    private class MyGridAdapter extends BaseAdapter {

        private Context context; // 현재 메인액티비티에서 어댑터를 붙이는 역할
        private List<ItemData> itemDataList;//아이템 리스트에 들어갈 변수
        private LayoutInflater mInflater;

        public MyGridAdapter(Context context, List<ItemData> itemdata) {
            this.context = context;
            this.itemDataList = itemdata;
            this.mInflater = LayoutInflater.from(context);

        }

        @Override
        public int getCount() {
            return itemDataList.size();
        }

        @Override
        public Object getItem(int position) {

            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (itemView == null) {
                itemView = mInflater.inflate(R.layout.item_listview, null);
            }
            ImageView ivPoster = (ImageView) itemView.findViewById(R.id.ivPoster);
            TextView tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);



            ItemData itemData = itemDataList.get(position);
            tvTitle.setText(itemData.getTitle());
            ivPoster.setImageResource(itemData.getImgID());
            return itemView;
        }

    }


}


package com.example.asdfe;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class gtMyAdapter extends BaseAdapter {


     List<gtItemData> itemDataListe;//아이템 리스트에 들어갈 변수
     LayoutInflater mInflater;
     gtMyAdapter(Context context, List<gtItemData> itemDataList) {
        this.itemDataListe=itemDataList;
        this.mInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemDataListe.size();//렝스가아니고 사이즈
    }

    @Override
    public Object getItem(int position) {
        return itemDataListe.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView=convertView;
        if(itemView==null) {
            itemView=mInflater.inflate(R.layout.guitarlistview2,null);
        }
        ImageView ivPoster=(ImageView)itemView.findViewById(R.id.ivGuitar);
        TextView tvTitle=(TextView)itemView.findViewById(R.id.tvTitle);
        TextView tvContent=(TextView)itemView.findViewById(R.id.tvContent);
        gtItemData itemData=itemDataListe.get(position);
        ivPoster.setImageResource(itemData.imgID);
        tvTitle.setText(itemData.title);
        tvContent.setText(itemData.content);

        return itemView;
    }
}

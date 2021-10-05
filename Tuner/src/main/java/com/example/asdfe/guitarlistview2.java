package com.example.asdfe;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class guitarlistview2 extends AppCompatActivity {

    ListView guitarlistview2;
    gtMyAdapter gtadapter;
    int posterID[]={R.drawable.fender1,R.drawable.ibanez,R.drawable.jacson1,R.drawable.swing,
            R.drawable.heritage,R.drawable.esp1,R.drawable.cort,R.drawable.spear,R.drawable.gibson,R.drawable.epiphone,R.drawable.reedox};
    String tvtitle[]= {"Fender","Ibanez","jacson","Swing","Heritage","ESP","Cort","Spear","Gibson","Epiphone","Reedoox"};
    String tvcontent[]={"국내,해외에서 인기받는 고가형기타","일본이 자랑하는 세계적인 브랜드.","락기타의 대표 선두주자.","보급형 국내브랜드",
            "소수에게 사랑받는 기타 현역 기타리스트에게 압도적인 지지","유명브랜드의 장점만을 고루 카피,응용한 기타","초보자들에게 추천하는 국산 일렉기타","오래된 명성광 그 퀄리티로 인정받는기타"
            ,"무겁지만 음폭이 넓고 기름지며 따듯한소리를 전달하는기타","에피폰악기    들은 100년이 넘는 전통과 역사로 최고의 기술력을 자랑하는 브랜드","많은 매니아, 프로 연주자들에게 인정받고 있는 레독스 기타"};
    String tvdcontent[]={"국내,해외에서 인기받는 고가형기타","일본이 자랑하는 세계적인 브랜드.","락기타의 대표 선두주자.","보급형 국내브랜드",
            "소수에게 사랑받는 기타 현역 기타리스트에게 압도적인 지지","유명브랜드의 장점만을 고루 카피,응용한 기타","초보자들에게 추천하는 국산 일렉기타","오래된 명성광 그 퀄리티로 인정받는기타"
            ,"무겁지만 음폭이 넓고 기름지며 따듯한소리를 전달하는기타","에피폰악기들은 100년이 넘는 전통과 역사로 최고의 기술력을 자랑하는 브랜드","많은 매니아, 프로 연주자들에게 인정받고 있는 레독스 기타"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitarlistview);

        guitarlistview2=(ListView)findViewById(R.id.guitarlistview2);
        List<gtItemData> data = new ArrayList<gtItemData>();
        for (int i = 0 ; i<posterID.length; i++){
            data.add(new gtItemData(posterID[i],tvtitle[i],tvcontent[i]));
        } // guitarlistView.xml 데이터 add


        gtadapter=new gtMyAdapter(this,data);
        guitarlistview2.setAdapter(gtadapter);
        guitarlistview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            final int pos= position;
                View dialogView = (View) View.inflate(com.example.asdfe.guitarlistview2.this,R.layout.dialog,null);//메인액티비티에 인플레이트시킨다
                AlertDialog.Builder dlg = new AlertDialog.Builder(com.example.asdfe.guitarlistview2.this);//메인액티비티에 대화상자를 만든다
                ImageView ivPoster = (ImageView)dialogView.findViewById(R.id.ivPoster);//이미지뷰 캐스팅
                TextView tvtext = (TextView) dialogView.findViewById(R.id.tvtext);
                ivPoster.setImageResource(posterID[pos]);
                dlg.setTitle(tvtitle[pos]);
                tvtext.setText(tvdcontent[pos]);
                Log.i("Guitar_Name",tvtitle[position]);
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기",null);
                dlg.show();


            }
        });

        }

}

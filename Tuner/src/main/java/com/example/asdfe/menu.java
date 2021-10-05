package com.example.asdfe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {
    Button menubtn1,menubtn2,menubtn3,menubtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setIcon(R.drawable.yth_round);

        menubtn1=(Button)findViewById(R.id.menubtn1);
        menubtn2=(Button)findViewById(R.id.menubtn2);
        menubtn3=(Button)findViewById(R.id.menubtn3);
        menubtn4=(Button)findViewById(R.id.menubtn4);
        menubtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cord.class);
                startActivity(intent);

            }
        });
        menubtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), version.class);
                startActivity(intent);
            }
        });
        menubtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("plain/text");
                String[] address = {"yth9425@naver.com"};
                email.putExtra(Intent.EXTRA_EMAIL, address);
                email.putExtra(Intent.EXTRA_SUBJECT,"제목을 입력하세요.");
                email.putExtra(Intent.EXTRA_TEXT,"후원받습니다 133-141140-02-013 기업은행 \n");
                startActivity(email);

            }
        });
        menubtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), guitarlistview2.class);
                startActivity(intent);
            }
        });
    }
}

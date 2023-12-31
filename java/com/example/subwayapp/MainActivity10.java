package com.example.subwayapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//주문하기 > 주문 순서 6
public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

//        야채 선택 체크박스는 체크 안 해도 상관없음!
//        체크 하거나 안 하거나 아래 이벤트 처리 동일

//        소스 추천조합 버튼 클릭 이벤트
        Button sause = (Button) findViewById(R.id.sause);
        sause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://whhyuny.blogspot.com/2021/01/blog-post_5.html"));
                startActivity(intent);
            }
        });
        
//        다음 주문 버튼 클릭 시 이벤트
        Button nextorder5 = (Button) findViewById(R.id.nextorder5);
        nextorder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}

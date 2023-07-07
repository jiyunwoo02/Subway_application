package com.example.subwayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//주문하기 > 주문 순서 5
public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

//        야채 선택 체크박스는 체크 안 해도 상관없음!
//        체크 하거나 안 하거나 아래 이벤트 처리 동일

//        다음 주문 버튼 클릭 시 이벤트
        Button nextorder4 = (Button) findViewById(R.id.nextorder4);
        nextorder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(intent);
            }
        });
    }

}

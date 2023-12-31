package com.example.subwayapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity13 extends AppCompatActivity {

//    서비스: 사용자 인터페이스 없이 백그라운드에서 실행되는 컴포넌트
//    - 배경 음악 재생
//    헤드폰 이미지 클릭 > 음악 재생 / 멈추기

    Intent intent;
    Button btnStart, btnStop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicplay);
        setTitle("크리스마스 캐롤 제공 서비스");

//        인텐트 사용
        intent = new Intent(this, MusicService.class);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

//        재생 버튼 클릭 시 이벤트 처리
        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(intent);
                Log.i("서비스 재생 테스트", "startService()");
            }
        });

//        중지 버튼 클릭 시 이벤트 처리
        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopService(intent);
                Log.i("서비스 중지 테스트", "stopService()");
            }
        });
    }
}

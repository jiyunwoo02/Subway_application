package com.example.subwayapp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

//즐기기 버튼 클릭 시 화면
public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        서브웨이 이미지 클릭 이벤트
        ImageView img = (ImageView) findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }

//    레시피추천 버튼 클릭 이벤트
    public void recipeClicked(View view){
//        다이얼로그
        final Dialog eventimgDialog3 = new Dialog(this);
        eventimgDialog3.setContentView(R.layout.reco);
        eventimgDialog3.setTitle("추천레시피 상세 화면");
        Button recommend = (Button) findViewById(R.id.recommend);
        eventimgDialog3.show();
    }

//    주문 방법 버튼 클릭 이벤트
    public void howorderClicked(View view){
//        인텐트 사용
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.subway.co.kr/utilizationSubway"));
        startActivity(intent);
    }

//    tip 버튼 클릭 이벤트
    public void tipClicked(View view){
//        인텐트 사용
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://univ20.com/109267"));
        startActivity(intent);
    }

//    유튜브 버튼 클릭 이벤트
    public void youtubeClicked(View view){
//        인텐트 사용
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/user/Subwaykr"));
        startActivity(intent);
    }


}

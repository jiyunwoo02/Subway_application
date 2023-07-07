package com.example.subwayapp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 앱 주요 메인 화면
// AndroidMainfest.xml 파일에 액티비티 추가!!

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        즐기기 버튼 클릭 시 이벤트
        Button enjoy = (Button) findViewById(R.id.enjoy);
        enjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });

//        헤드폰 이미지뷰 클릭 시 이벤트
        ImageView musichear = (ImageView) findViewById(R.id.musichear);
        musichear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity13.class);
                startActivity(intent);
            }
        });

//        주문하기 버튼 클릭 시 이벤트
        Button order = (Button) findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"로그인한 회원만 주문할 수 있습니다. \n비회원 주문신청 시 주문이 기각될 수 있습니다.",Toast.LENGTH_LONG).show();
                //                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(intent);
            }
        });

//        사용자 이미지 클릭 시 이벤트
        ImageView user = (ImageView) findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });

//        샌드위치 사진 옆 화살표 버튼 클릭 시 이벤트
        Button arrow = (Button) findViewById(R.id.arrow);
        arrow.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(intent);
            }
        });
    }

//    이벤트 이미지 옆의 자세히 보기 버튼 클릭 시 이벤트 처리
    public void eventseeClicked(View v) {
//        다이얼로그 사용
        final Dialog eventimgDialog2 = new Dialog(this);
        eventimgDialog2.setContentView(R.layout.event);
        eventimgDialog2.setTitle("이벤트 상세 화면");
        Button see = (Button) findViewById(R.id.see);
        eventimgDialog2.show();
    }

//    매장 찾기 버튼 클릭 시 네이버 지도 사이트로 이동 이벤트 처리
    public void mapfindClicked(View v){
        Button mapfind = (Button) findViewById(R.id.mapfind);
         mapfind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/"));
                startActivity(intent);
            }
        });
    }

//    서브웨이 사이트 버튼 클릭 시 서브웨이 공식 사이트로 이동 이벤트 처리
    public void siteClicked(View view){
        Button site=(Button) findViewById(R.id.site);
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.subway.co.kr/"));
                startActivity(intent);
            }
        });
    }

//    주문현황 버튼 클릭 시 이벤트
    public void orderstatusClicked(View view){
//        다이얼로그
        final Dialog orderstatusDialog = new Dialog(this);
        orderstatusDialog.setContentView(R.layout.custom_dialog7);
        orderstatusDialog.show();

        Button hamcoffee = (Button) orderstatusDialog.findViewById(R.id.hamcoffee);
        TextView hamstatus = (TextView) orderstatusDialog.findViewById(R.id.hamstatus);

//        버튼 클릭 시 이벤트
        hamcoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hamstatus.setVisibility(View.VISIBLE);
            }
        });
    }

}

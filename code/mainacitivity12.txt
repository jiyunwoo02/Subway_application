package com.example.subwayapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 주문하기 > 주문 순서 8
public class MainActivity12 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

//        네이버 지도 매장 찾기 버튼 클릭 이벤트
        Button navermapbutton = (Button) findViewById(R.id.navermapbutton);
        navermapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
//                클릭하면 바로 네이버 지도에 서브웨이 결과 나와있음
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/서브웨이"));
                startActivity(intent);
            }
        });

        EditText storetext = (EditText) findViewById(R.id.storetext);
        EditText timetext = (EditText) findViewById(R.id.timetext);
        Button ordersubmit = (Button) findViewById(R.id.ordersubmit);

//        제출 버튼 클릭 이벤트
        ordersubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                두 사항이 모두 입력되었을 때!
                if(storetext.getText().toString().trim().length() > 0 && timetext.getText().toString().trim().length() > 0) {
//                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), timetext.getText() + " 에 " + storetext.getText() +
                            " 에서 주문 픽업 방문 예약 되었습니다. 시간 안에 주문 수령 후 현장 결제 부탁드립니다.", Toast.LENGTH_LONG).show();
//                    인텐트 사용
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(intent);
                }
                else
//                    예외처리
//                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(),"다시 입력 바랍니다.", Toast.LENGTH_LONG).show();
            }
//
        });
    }
}

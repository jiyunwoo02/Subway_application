package com.example.subwayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//주문하기 > 주문 순서 1
public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.rb4);
        RadioButton rb5 = (RadioButton) findViewById(R.id.rb5);
        RadioButton rb6 = (RadioButton) findViewById(R.id.rb6);
        RadioButton rb7 = (RadioButton) findViewById(R.id.rb7);
        RadioButton rb8 = (RadioButton) findViewById(R.id.rb8);

//        라디오그룹 체크 이벤트 처리
        RadioGroup menu = (RadioGroup) findViewById(R.id.menu);
        menu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton whatmenu = radioGroup.findViewById(i);

                //  라디오버튼이 체크되어있으면 다음 주문 가능 이벤트 처리
                // 라디오버튼 클릭 x 예외 처리
                if (whatmenu.isChecked()== true) {
//                  토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), whatmenu.getText() + " 가 선택되었습니다.", Toast.LENGTH_LONG).show();

                    // 다음 주문 버튼 클릭 시 이벤트
                    Button nextorder1 = (Button) findViewById(R.id.nextorder1);
                    nextorder1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                          인텐트 사용
                            Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
                            startActivity(intent);
                        }
                    });
                }

            }
        });
    }
}
package com.example.subwayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 주문하기 > 주문 순서 2~3
public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        RadioButton rb10 = (RadioButton) findViewById(R.id.rb10);
        RadioButton rb11 = (RadioButton) findViewById(R.id.rb11);

//        라디오그룹 1 체크 이벤트 처리
        RadioGroup size = (RadioGroup) findViewById(R.id.topping);
        size.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton whatsize = radioGroup.findViewById(i);

                //  라디오버튼이 체크되어있으면 다음 주문 가능 이벤트 처리
                // 라디오버튼 클릭 x 예외 처리
                if (whatsize.isChecked() == true) {
//                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), whatsize.getText() + " 가 선택되었습니다.", Toast.LENGTH_LONG).show();

                    //  다음 주문 버튼 클릭 시 이벤트 -> 없음, 아래 라디오버튼 체크되어야함!
                    Button nextorder2 = (Button) findViewById(R.id.nextorder2);
                    nextorder2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {}
                    });

                    RadioButton rb12 = (RadioButton) findViewById(R.id.rb12);
                    RadioButton rb13 = (RadioButton) findViewById(R.id.rb13);
                    RadioButton rb14 = (RadioButton) findViewById(R.id.rb14);
                    RadioButton rb15 = (RadioButton) findViewById(R.id.rb15);
                    RadioButton rb16 = (RadioButton) findViewById(R.id.rb16);
                    RadioButton rb17 = (RadioButton) findViewById(R.id.rb17);

//                  ->  라디오그룹 1이 체크된 상태에서 실행됨 (if문 내)
//                  라디오그룹 2 클릭 이벤트 처리
                    RadioGroup bread = (RadioGroup) findViewById(R.id.bread);
                    bread.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton whatbread = radioGroup.findViewById(i);

                            //  라디오버튼이 체크되어있으면 다음 주문 가능 이벤트 처리
                            // 라디오버튼 클릭 x 예외 처리
                            if (whatbread.isChecked() == true) {
//                              토스트 메시지 출력
                                Toast.makeText(getApplicationContext(), whatbread.getText() + " 가 선택되었습니다.", Toast.LENGTH_LONG).show();

                                // 다음 주문 버튼 클릭 시 이벤트
                                // 라디오버튼 클릭 x 예외 처리
                                Button nextorder2 = (Button) findViewById(R.id.nextorder2);
                                nextorder2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
//                                      인텐트 사용
                                        Intent intent = new Intent(getApplicationContext(), MainActivity8.class);
                                        startActivity(intent);
                                    }
                                });

                            }
                        }
                    });

                }
            }
        });
    }
}

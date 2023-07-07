package com.example.subwayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 주문하기 > 주문 순서 4
public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

//        토핑 추가 체크박스는 체크 안 해도 상관없음! 체크 하거나 안 하거나 아래 이벤트 처리 동일
//        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
//        CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
//        CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
//        CheckBox cb4 = (CheckBox) findViewById(R.id.cb4);

        RadioButton rb12 = (RadioButton) findViewById(R.id.rb12);
        RadioButton rb13 = (RadioButton) findViewById(R.id.rb13);

//        라디오그룹 (2)
        RadioGroup breadheat = (RadioGroup) findViewById(R.id.breadheat);
        breadheat.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton whatheat = radioGroup.findViewById(i);

//                토스트 메시지 출력
                Toast.makeText(getApplicationContext(), whatheat.getText() + " 가 선택되었습니다.", Toast.LENGTH_LONG).show();

                //  라디오버튼이 체크되어있으면 다음 주문 가능 이벤트 처리
                //  라디오버튼 클릭 x 예외 처리
                if (whatheat.isChecked() == true) {
//                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), whatheat.getText() + " 가 선택되었습니다.", Toast.LENGTH_LONG).show();

                    //  다음 주문 버튼 클릭 시 이벤트 -> 없음, 아래 라디오버튼 체크되어야함!
                    Button nextorder3 = (Button) findViewById(R.id.nextorder3);
                    nextorder3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {}
                    });

                    RadioButton rb14 = (RadioButton) findViewById(R.id.rb14);
                    RadioButton rb15 = (RadioButton) findViewById(R.id.rb15);

//                  라디오그룹 (3)
                    RadioGroup setadd = (RadioGroup) findViewById(R.id.setadd);
                    setadd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup radioGroup, int i) {
                            RadioButton whatset = radioGroup.findViewById(i);

                            //  라디오버튼이 체크되어있으면 다음 주문 가능 이벤트 처리
                            //  라디오버튼 클릭 x 예외 처리
                            if (whatset.isChecked() == true) {
//                              토스트 메시지 출력
                                Toast.makeText(getApplicationContext(), whatset.getText() + " 가 선택되었습니다.", Toast.LENGTH_LONG).show();

//                              다음 주문 버튼 클릭 시 이벤트
                                Button nextorder3 = (Button) findViewById(R.id.nextorder3);
                                nextorder3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //  인텐트 사용
                                        Intent intent = new Intent(getApplicationContext(), MainActivity9.class);
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
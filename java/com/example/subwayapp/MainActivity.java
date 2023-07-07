package com.example.subwayapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

//첫 화면
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        첫 화면에서 USE APP 버튼 누르면 -> 두번째 화면인 앱의 메인 화면으로 이동
        Button use = (Button) findViewById(R.id.use);
        use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }

//    첫 화면에서 로그인 버튼 클릭 시 이벤트 처리 -> 대화상자
    public void loginClicked(View v) {
//      Dialog
        final Dialog loginDialog = new Dialog(this);
        loginDialog.setContentView(R.layout.custom_dialog);
        loginDialog.setTitle("로그인 화면");

        Button loginbu = (Button) loginDialog.findViewById(R.id.loginbu);
        final EditText id = (EditText) loginDialog.findViewById(R.id.text3);
        final EditText pw = (EditText) loginDialog.findViewById(R.id.pw2);

//        로그인 버튼 클릭 이벤트
        loginbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().trim().length() > 0 && pw.getText().toString().trim().length() > 0) {
//                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), "로그인 성공, "+id.getText().toString()+"님 환영합니다.",Toast.LENGTH_LONG).show();
                    loginDialog.dismiss(); // 안전 종료
//                    인텐트 사용
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
//                    토스트 메시지
                    Toast.makeText(getApplicationContext(),"메인 화면으로 이동하였습니다.", Toast.LENGTH_LONG).show();
                } else {
                    //                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), "다시 입력해주십시오.",Toast.LENGTH_LONG).show();
                }
            }
        });
        loginDialog.show();
    }

//    첫 화면에서 회원가입 버튼 클릭 시 이벤트 처리 -> 대화상자
    public void newClicked(View v) {
//      Dialog
        final Dialog newloginDialog = new Dialog(this);
        newloginDialog.setContentView(R.layout.custom_dialog2);
        newloginDialog.setTitle("회원가입 화면");

        Button newbu = (Button) newloginDialog.findViewById(R.id.submit);
        final EditText name = (EditText) newloginDialog.findViewById(R.id.name);
        final EditText email = (EditText) newloginDialog.findViewById(R.id.email);
        final EditText id2 = (EditText) newloginDialog.findViewById(R.id.id2);
        final EditText pw2 = (EditText) newloginDialog.findViewById(R.id.pw2);

//        회원가입 버튼 클릭 이벤트
        newbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().trim().length() > 0 && email.getText().toString().trim().length() > 0
                        && id2.getText().toString().trim().length()>0 && pw2.getText().toString().trim().length()>0) {
                    //                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), "회원가입을 성공하였습니다.",Toast.LENGTH_LONG).show();
                    newloginDialog.dismiss(); // 안전 종료
                } else {
                    //                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), "다시 입력해주십시오.", Toast.LENGTH_LONG).show();
                }
            }
        });
        newloginDialog.show();
    }
}
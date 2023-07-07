package com.example.subwayapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//사용자 이미지 클릭 시 마이페이지
public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

//        서브웨이 이미지 클릭 이벤트
        ImageView img2 = (ImageView) findViewById(R.id.img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                인텐트 사용
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

//        서비스 이용약관 버튼 누르면 팝업 이벤트 처리
        Button service= (Button) findViewById(R.id.service);
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity4.this);
                ad.setTitle("사용자 이용약관");
                ad.setMessage("제 1조 (목적)\n\n본 약관은 서비스(이하 회사라 한다)는 홈페이지에서 제공하는 서비스(이하 서비스라 한다)를 제공함에 있어 회사와 이용자의 권리, 의무 및 책임사항을 규정함을 목적으로 합니다.    \n\n제 2조 (용어의 정의)    \n\n1. 본 약관에서 사용하는 용어의 정의는 다음과 같습니다.  '서비스'란 회사가 이용자에게 서비스를 제공하기 위하여 컴퓨터 등 정보통신설비를 이용하여 구성한 가상의 공간을 의미하며, 서비스 자체를 의미하기도 합니다.  '회원(이하 회원이라 한다)'이란 개인정보를 제공하여 회원등록을 한 자로서 홈페이지의 정보를 지속적으로 제공받으며 홈페이지가 제공하는 서비스를 계속적으로 이용할 수 있는 자를 말합니다.  '아이디(이하 ID라 한다)'란 회원의 식별과 회원의 서비스 이용을 위하여 회원이 선정하고 회사가 승인하는 회원 고유의 계정 정보를 의미합니다.  '비밀번호'란 회원이 부여 받은 ID와 일치된 회원임을 확인하고, 회원의 개인정보를 보호하기 위하여 회원이 정한 문자와 숫자의 조합을 의미합니다.  '회원탈퇴(이하 탈퇴라 한다)'란 회원이 이용계약을 해지하는 것을 의미합니다.    \n\n2. 본 약관에서 사용하는 용어의 정의는 제1항에서 정하는 것을 제외하고는 관계법령 및 서비스 별 안내에서 정하는 바에 의합니다.");
                ad.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
            }
        });

//        qna 버튼 클릭 이벤트
        Button qna= (Button) findViewById(R.id.qna);
        qna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                AlertDialog
                AlertDialog.Builder ad2 = new AlertDialog.Builder(MainActivity4.this);
                ad2.setTitle("문의사항");
                ad2.setMessage("Q. 포인트는 무엇이고 어떻게 적립ㆍ사용하나요? \n\n" +
                        "A. 앱 사용이 가능한 매장이라면 어느 매장에서든 앱 주문 및 매장 주문 시에 적립ㆍ사용하실 수 있는 통합 포인트 서비스이며,\n" +
                        "써브웨이 앱 또는 홈페이지를 통해 회원가입하시면, 서비스를 이용하실 수 있습니다.\n" +
                        "\n" +
                        "(1) 적립\n" +
                        "앱을 통해 주문하신 경우 결제금액에 따라 포인트가 자동 적립 됩니다.\n" +
                        "매장에서(오프라인) 결제 시에는 포인트 적립을 요청하시고 직원 안내에 따라 앱 내 QR 코드를 리딩 또는 핸드폰 번호를 조회하여 하여 적립 받으실 수 있습니다.\n" +
                        "\n" +
                        "(2) 사용\n" +
                        "포인트는 가용 포인트가 3,000포인트 이상일 때부터 10포인트 단위로 사용 가능합니다.\n" +
                        "온라인: 결제 시 포인트 란에 10포인트 단위로 입력하여 사용합니다.\n" +
                        "오프라인: 결제 시 포인트 사용을 요청하시고, 써브웨이 앱의 QR코드를 리딩하여 포인트로 결제하실 수 있습니다.단, 휴대폰 번호 조회를 통한 포인트 사용은 불가합니다.\n" +
                        "\n" +
                        "(3)소멸\n" +
                        "포인트 유효기간은 적립일로부터 12개월이며, 유효기간이 경과된 포인트는 유효기간이 종료되는 해당 월 말일에 소멸되며 소멸된 포인트는 복구가 복구가 불가합니다.\n" +
                        "소멸 예정 포인트는 앱 내 '멤버십'-> '포인트'에서 확인하실 수 있으며, 등록된 이메일을 통해 안내드리고 있습니다.\n" +
                        "다만 메일 설정에 따라 이메일 안내가 도달하지 않거나 스팸으로 분류되는 경우가 있으니 이용에 참고하여 주십시오.\n\n" +
                        "Q. 오프라인 구매 시 포인트 적립을 하지 못했습니다. 추후 적립이 가능한가요?\n\n" +
                        "A. 현장 적립을 하지 못하신 경우, 구매일로부터 7일 이내로 영수증을 지참하여 구매 매장에 방문하시면 추후 적립을 받으실 수 있습니다.\n" +
                        "(예) 7월 1일 구매 시 7월 8일까지 추후적립 가능\n\n" +
                        "Q. 30cm 샌드위치의 기준은 무엇인가요?\n\n" +
                        "A. 써브웨이 샌드위치는 15cm와 30cm 두 가지 사이즈로 즐기 실 수 있습니다.\n" +
                        "30cm 샌드위치는 동일한 미트, 치즈, 야채, 소스를 넣을 시 30cm 샌드위치로 할인 적용 받으실 수 있으며, 취식의 용이성을 위해 드시기 편하도록 샌드위치 제조 후 반으로 잘라 제공해 드릴 수 있습니다.\n\n" +
                        "더 궁금한 사항이 있으시면 문의하기 버튼을 클릭하여 문의해 주시기 바랍니다. ");
                ad2.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad2.show();
            }
        });

    }

//    문의하기 버튼 클릭 이벤트
    public void questionClicked(View v) {
//        Dialog
        final Dialog questionDialog = new Dialog(this);
        questionDialog.setContentView(R.layout.custom_dialog4);
        questionDialog.setTitle("문의하기");
        questionDialog.show();

        Button submit = (Button) questionDialog.findViewById(R.id.submit);
        final EditText emailid = (EditText) questionDialog.findViewById(R.id.emailid);
        final EditText text3 = (EditText) questionDialog.findViewById(R.id.text3);

//        제출 버튼 클릭 이벤트
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailid.getText().toString().trim().length() > 0 && text3.getText().toString().trim().length() > 0){
//                    토스트 메시지
                    Toast.makeText(getApplicationContext(),"문의사항이 제출되었습니다.",Toast.LENGTH_LONG).show();
                    questionDialog.dismiss();
                } else {
                    //                    토스트 메시지
                    Toast.makeText(getApplicationContext(), "정상적으로 제출되지 못하였습니다. \n다시 확인해 주십시오.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

//    리뷰 작성 버튼 클릭 이벤트
    public void reviewClicked(View v) {
        final Dialog reviewDialog = new Dialog(this);
        reviewDialog.setContentView(R.layout.custom_dialog5);
        reviewDialog.setTitle("리뷰 작성 상세 화면");
        reviewDialog.show();

        Button tunareview = (Button) reviewDialog.findViewById(R.id.tunareview);
        Button chickenreview = (Button) reviewDialog.findViewById(R.id.chickenreview);
        RelativeLayout reviewwrite = (RelativeLayout) reviewDialog.findViewById(R.id.reviewwrite);
        Button reviewsubmit = (Button) reviewDialog.findViewById(R.id.reviewsubmit);
        EditText nickname = (EditText) reviewDialog.findViewById(R.id.nickname);
        EditText reviewtext = (EditText) reviewDialog.findViewById(R.id.reviewtext);

//        버튼 1 클릭 이벤트
        tunareview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reviewwrite.setVisibility(View.VISIBLE);
            }
        });
//        버튼 2 클릭 이벤트
        chickenreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reviewwrite.setVisibility(View.VISIBLE);
            }
        });

//        제출 버튼 클릭 이벤트
        reviewsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nickname.getText().toString().trim().length() > 0 && reviewtext.getText().toString().trim().length() > 0){
//                    토스트 메시지 출력
                    Toast.makeText(getApplicationContext(),"작성하신 리뷰가 전송되었습니다.",Toast.LENGTH_LONG).show();
                    reviewDialog.dismiss();
                } else {
                    //   토스트 메시지 출력
                    Toast.makeText(getApplicationContext(), "정상적으로 전송되지 못하였습니다. 다시 확인해 주십시오.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

//    포인트 버튼 클릭 이벤트
    public void pointClicked(View v) {
//        Dialog
        final Dialog pointDialog = new Dialog(this);
        pointDialog.setContentView(R.layout.custom_dialog3);
        pointDialog.show();
    }

//    주문내역 버튼 클릭 이벤트
    public void orderedClicked(View v) {
//        Dialog
        final Dialog orederedDialog = new Dialog(this);
        orederedDialog.setContentView(R.layout.custom_dialog6);
        orederedDialog.show();

//        ad 버튼 클릭 이벤트
        Button ad = (Button) orederedDialog.findViewById(R.id.ad);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              인텐트 사용
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jDU-TJK4vwI"));
                startActivity(intent);
            }
        });
    }

//    쿠폰 버튼 클릭 이벤트
    public void couponClicked(View v) {
//        Dialog
        final Dialog eventimgDialog3 = new Dialog(this);
        eventimgDialog3.setContentView(R.layout.coupon);
        eventimgDialog3.show();
    }
}

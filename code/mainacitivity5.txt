package com.example.subwayapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// 메뉴 자세히 보기 버튼 클릭 시
public class MainActivity5 extends AppCompatActivity {
    // ArrayAdapter를 상속하여 커스텀 어댑터뷰 작성
    //    리스트뷰
    ListView list;
    String[] titles = {
            "치킨 슬라이스 (265kcal)",
            "에그마요 (416kcal)",
            "K-BBQ (372kcal)",
            "로스트 치킨 (300kcal)",
            "쉬림프 (229kcal)",
            "스테이크 앤 치즈 (355kcal)",
            "베기 (209kcal)",
            "서브웨이 클럽 (299kcal)",
            "참치 (316kcal)",
            "치킨 데리야끼 (314kcal)",
            "스파이시 이탈리안 (464kcal)",
            "쉬림프 에그 그릴드 랩 (366kcal)",
            "치킨 베이컨 미니 랩 (391kcal)",
            "치킨 베이컨 아보카도 샐러드 (200kcal)",
            "햄 샐러드 (99.5kcal)",
            "머쉬룸 수프 (147kcal)",
            "초코칩 쿠키 (228kcal)",
            "해쉬 브라운 (86kcal)"
    };
    Integer[] images = {
            R.drawable.chickenslice,
            R.drawable.eggmayo,
            R.drawable.kbbq,
            R.drawable.roastchicken,
            R.drawable.shrimp,
            R.drawable.steakcheese,
            R.drawable.veggie,
            R.drawable.subwayclub,
            R.drawable.tuna,
            R.drawable.chickenteriyaki,
            R.drawable.spicyitalian,
            R.drawable.shrimpeggwrap,
            R.drawable.chickenbaconwrap,
            R.drawable.chickenbaconavocado,
            R.drawable.ham,
            R.drawable.mushroomsoup,
            R.drawable.chococookie,
            R.drawable.hashbrown
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_adapter);

//        커스텀리스트
        CustomList adapter = new CustomList(MainActivity5.this);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter); // getView() 호출됨
//       리스트뷰 클릭 이벤트
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                토스트 메시지 출력
                Toast.makeText(getBaseContext(), titles[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

//    커스텀리스트, arrayadapter
    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;
        public CustomList(Activity context) {
            super(context, R.layout.listitem, titles);
            this.context = context;
        }
        @Override

// 한 화면에 보일수 있는 데이터들을 뷰로 생성
// 안보이는 데이터를 위한 뷰(row view)는 나중에 사용되기 위해서 메모리에 유지했다가
// 뷰가 표시될 필요가 있을 때 (아래로 스크롤하면)
// 표시될 뷰의 위치값이 전달되면서 호출되어
// 뷰를 반환하고 리스트뷰에 표시됨!

        public View getView(int position, View view, ViewGroup parent) {
//            layoutinflater
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.listitem, null, true); // xml 레이아웃을 가지고 뷰 객체화
            ImageView image = (ImageView) rowView.findViewById(R.id.sandwichimage);
            TextView name = (TextView) rowView.findViewById(R.id.sandwichname);
            TextView rating = (TextView) rowView.findViewById(R.id.sandwichrating);
            TextView number = (TextView) rowView.findViewById(R.id.sandwichnumber);

            name.setText(titles[position]);
            image.setImageResource(images[position]);
            rating.setText("9.0"+position);
            number.setText(1+position+"");
            return rowView;
        }
    }

}

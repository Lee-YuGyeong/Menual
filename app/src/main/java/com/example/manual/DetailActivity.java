package com.example.manual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DetailActivity extends AppCompatActivity {

    ListView listView;
    DetailListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        int btn = intent.getExtras().getInt("btn");
        int btn2 = intent.getExtras().getInt("btn2");

        adapter = new DetailListAdapter();

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        if(btn == 1) {

            if(btn2 == 0){

                adapter.addData("1.전화앱누르기", ContextCompat.getDrawable(this, R.drawable.call1));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.call2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.phone_2));

            }else if(btn2 == 1){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.phone_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.phone_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.phone_2));


            }else{

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.phone_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.phone_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.phone_2));


            }

           }

        if(btn == 2) {

            if(btn2 == 0){

                adapter.addData("1.바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2.상대방의 전화번호나 이름을 적어줍니다.",ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3.보낼메세지를 입력합니다.",ContextCompat.getDrawable(this, R.drawable.mail1_3));
                adapter.addData("4.보내기 버튼을 눌러줍니다.",ContextCompat.getDrawable(this, R.drawable.mail1_5));
                adapter.addData("5.보낸 메세지를 확인합니다.",ContextCompat.getDrawable(this, R.drawable.mail1_4));

            }else if(btn2 == 1){

                adapter.addData("1.바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2.상대방의 전화번호나 이름을 적어줍니다.",ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3.하단의 앨범 아이콘을 눌러줍니다.",ContextCompat.getDrawable(this, R.drawable.mail2_5));
                adapter.addData("4.원하는 사진을 눌러줍니다.",ContextCompat.getDrawable(this, R.drawable.mail2_2));
                adapter.addData("5.보내기 버튼을 눌러줍니다.",ContextCompat.getDrawable(this, R.drawable.mail2_3));
                adapter.addData("6.보낸 사진메세지를 확인합니다.",ContextCompat.getDrawable(this, R.drawable.mail2_4));

            }else{

                adapter.addData("1.바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2.상대방의 전화번호나 이름을 적어줍니다.",ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3.키보드에서 이모티콘 아이콘을 눌러줍니다.",ContextCompat.getDrawable(this, R.drawable.mail3_1));
                adapter.addData("4.원하는 이모티콘을 눌러줍니다.",ContextCompat.getDrawable(this, R.drawable.mail3_2));
                adapter.addData("5.보내기 버튼을 눌러줍니다.",ContextCompat.getDrawable(this, R.drawable.mail3_3));
                adapter.addData("6.보낸 이모티콘을 확인합니다.",ContextCompat.getDrawable(this, R.drawable.mail3_4));

            }

        }
        if(btn == 3) {

            if(btn2 == 0) {

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ", ContextCompat.getDrawable(this, R.drawable.mail_2));

            }else{

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }

        }
        if(btn == 4) {

            if(btn2 == 0){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));

            }else if(btn2 == 1){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }else if(btn2 == 2){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }else if(btn2 == 3){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }else if(btn2 == 4){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }else if(btn2 == 5){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }else{

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }

        }

        if(btn == 5) {

            if(btn2 == 0){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));

            }else if(btn2 == 1){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }else{

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }

        }

        if(btn == 6) {

            if(btn2 == 0){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));

            }else if(btn2 == 1){

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }else{

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            }

        }

    }
}

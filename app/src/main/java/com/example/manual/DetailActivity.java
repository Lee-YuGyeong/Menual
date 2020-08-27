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

                adapter.addData("1. 연락처 앱 아이콘을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_add_1));
                adapter.addData("2. 오른쪽 아래 + 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_add_2));
                adapter.addData("3. 이름과 전화번호를 입력하고 아래 저장 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_add_3));


            }else if(btn2 == 1){

                adapter.addData("1. 다이얼 앱 아이콘을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_call_1));
                adapter.addData("2. 전화번호를 누른 뒤 아래 전화 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_call_2));


            }else{

                adapter.addData("1. 녹음 버튼을 누릅니다.", ContextCompat.getDrawable(this, R.drawable.c_recode));

            }

           }
        if(btn == 2) {
            if (btn2 == 0) {

                adapter.addData("1.바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2.상대방의 전화번호나 이름을 적어줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3.보낼메세지를 입력합니다.", ContextCompat.getDrawable(this, R.drawable.mail1_3));
                adapter.addData("4.보내기 버튼을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_5));
                adapter.addData("5.보낸 메세지를 확인합니다.", ContextCompat.getDrawable(this, R.drawable.mail1_4));

            } else if (btn2 == 1) {


                adapter.addData("1.바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2.상대방의 전화번호나 이름을 적어줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3.하단의 앨범 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail2_5));
                adapter.addData("4.원하는 사진을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail2_2));
                adapter.addData("5.보내기 버튼을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail2_3));
                adapter.addData("6.보낸 사진메세지를 확인합니다.", ContextCompat.getDrawable(this, R.drawable.mail2_4));

            } else {

                adapter.addData("1.바탕화면에서 메세지 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_1));
                adapter.addData("2.상대방의 전화번호나 이름을 적어줍니다.", ContextCompat.getDrawable(this, R.drawable.mail1_2));
                adapter.addData("3.키보드에서 이모티콘 아이콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail3_1));
                adapter.addData("4.원하는 이모티콘을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail3_2));
                adapter.addData("5.보내기 버튼을 눌러줍니다.", ContextCompat.getDrawable(this, R.drawable.mail3_3));
                adapter.addData("6.보낸 이모티콘을 확인합니다.", ContextCompat.getDrawable(this, R.drawable.mail3_4));

            }
        }
        if(btn == 3) {

            if (btn2 == 0) {

                adapter.addData("전면 카메라: 셀카 찍을 때 사용", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("후면 카메라: 일반적으로 사진 찍을 때 사용", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("전면 카메라와 후면 카메라 비교하기", ContextCompat.getDrawable(this, R.drawable.camera1_3));
                //사진 수정해야 함

            } else if (btn2 == 1) {
                adapter.addData("1. 카메라 누르기", ContextCompat.getDrawable(this, R.drawable.menu_camera));
                adapter.addData("2. 카메라 모양 버튼 누르기", ContextCompat.getDrawable(this, R.drawable.camera2_2));
                adapter.addData("3. 셀카 카메라로 전환 완료", ContextCompat.getDrawable(this, R.drawable.camera2_4));
            } else if (btn2 == 2) {

                adapter.addData("1.카메라 누르기", ContextCompat.getDrawable(this, R.drawable.menu_camera));
                adapter.addData("2.흰색 동그라미 버튼 누르기", ContextCompat.getDrawable(this, R.drawable.camera3_1));
                //adapter.addData("3. ㅋㅋ",ContextCompat.getDrawable(this, R.drawable.mail_2));


            } else if (btn2 == 3) {

                adapter.addData("1.동영상 촬영 시작: 빨간색 동그라미 버튼 누르기", ContextCompat.getDrawable(this, R.drawable.camera4_1));
                adapter.addData("2.동영상 촬영 일시 중지: ", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3.동영상 촬영 중지(촬영 끝내기)", ContextCompat.getDrawable(this, R.drawable.mail_2));
                //사진 수정해야 함

            } else if (btn2 == 4) {

                adapter.addData("1.갤러리(사진첩) 누르기", ContextCompat.getDrawable(this, R.drawable.menu_gallery));
                adapter.addData("2.카메라 앨범 누르기", ContextCompat.getDrawable(this, R.drawable.camera5_1));
                adapter.addData("3.편집하고 싶은 사진 누르기", ContextCompat.getDrawable(this, R.drawable.camera5_2));
                adapter.addData("4.붙어있는 동그라미 세 개 누르기", ContextCompat.getDrawable(this, R.drawable.camera5_3));
                adapter.addData("5.원하는 느낌의 사진 누르기", ContextCompat.getDrawable(this, R.drawable.camera5_4));


            } else if (btn2 == 5) {

                adapter.addData("1.갤러리(사진첩) 들어가기", ContextCompat.getDrawable(this, R.drawable.menu_gallery));
                adapter.addData("2.네모 모양 버튼 누르기", ContextCompat.getDrawable(this, R.drawable.camera6_1));
                adapter.addData("3.원하는 크기로 사진 조절하기", ContextCompat.getDrawable(this, R.drawable.camera6_2));
                adapter.addData("4.(사진 조절 완료 후) 저장버튼 누르기 ", ContextCompat.getDrawable(this, R.drawable.camera6_3));


            } else {

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("2.닫기", ContextCompat.getDrawable(this, R.drawable.mail_2));
                adapter.addData("3. ㅋㅋ", ContextCompat.getDrawable(this, R.drawable.mail_2));
                //할지 말지 고민 중임 .....................................................................


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

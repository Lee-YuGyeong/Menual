package com.example.manual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter adapter;
    int btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        btn = intent.getExtras().getInt("btn");

        adapter = new ListAdapter();

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        int i;

        if(btn == 1) {
            adapter.addData("연락처 추가하기",ContextCompat.getDrawable(this, R.drawable.phone_2)) ;
            adapter.addData("전화하기",ContextCompat.getDrawable(this, R.drawable.phone_2));
            adapter.addData("통화내용 녹음하기",ContextCompat.getDrawable(this, R.drawable.phone_2));

        }
        if(btn == 2){
            adapter.addData("문자 보내기",ContextCompat.getDrawable(this, R.drawable.mail_2));
            adapter.addData("사진/동영상 보내기",ContextCompat.getDrawable(this, R.drawable.mail_2));
            adapter.addData("이모티콘 전송하기",ContextCompat.getDrawable(this, R.drawable.mail_2));
        }
        if(btn == 3){
            //adapter.addData("카메라 살펴보기",ContextCompat.getDrawable(this, R.drawable.camera_2));
            adapter.addData("사진 촬영하기",ContextCompat.getDrawable(this, R.drawable.camera_2));
            adapter.addData("셀카 카메라로 전환하기",ContextCompat.getDrawable(this, R.drawable.camera_2));
            adapter.addData("동영상 촬영하기",ContextCompat.getDrawable(this, R.drawable.camera_2));
            adapter.addData("사진 편집하기",ContextCompat.getDrawable(this, R.drawable.camera_2));
            adapter.addData("사진 자르기",ContextCompat.getDrawable(this, R.drawable.camera_2));

        }
        if(btn == 4){
            adapter.addData("채팅하기",ContextCompat.getDrawable(this, R.drawable.kakao_2));
            adapter.addData("사진/동영상 전송하기",ContextCompat.getDrawable(this, R.drawable.kakao_2));
            adapter.addData("이모티콘 보내기",ContextCompat.getDrawable(this, R.drawable.kakao_2));
            adapter.addData("친구 추가하기",ContextCompat.getDrawable(this, R.drawable.kakao_2));
            adapter.addData("친구 차단하기",ContextCompat.getDrawable(this, R.drawable.kakao_2));
            adapter.addData("채팅방 나가기",ContextCompat.getDrawable(this, R.drawable.kakao_2));

        }
        if(btn == 5) {
            adapter.addData("버스찾기",ContextCompat.getDrawable(this, R.drawable.bus_2));
            adapter.addData("지하철찾기",ContextCompat.getDrawable(this, R.drawable.bus_2));
            adapter.addData("기차 예매하기",ContextCompat.getDrawable(this, R.drawable.bus_2));
            adapter.addData("버스 예매하기",ContextCompat.getDrawable(this, R.drawable.bus_2));

        }
        if(btn == 6) {
            adapter.addData("유튜브로 영상 보기 전에 확인하기",ContextCompat.getDrawable(this, R.drawable.youtube_2));
            adapter.addData("유튜브의 영상 구독하기",ContextCompat.getDrawable(this, R.drawable.youtube_2));
            adapter.addData("유튜브의 영상 알람 설정하기",ContextCompat.getDrawable(this, R.drawable.youtube_2));
            adapter.addData("유튜브의 영상 좋아요/싫어요 버튼 누르기",ContextCompat.getDrawable(this, R.drawable.youtube_2));
            adapter.addData("유튜브의 영상에 댓글 달기",ContextCompat.getDrawable(this, R.drawable.youtube_2));
            adapter.addData("유튜브의 영상을 고화질로 보기",ContextCompat.getDrawable(this, R.drawable.youtube_2));
            adapter.addData("유튜브의 영상을 가로로 크게 보기",ContextCompat.getDrawable(this, R.drawable.youtube_2));
            adapter.addData("유튜브의 영상을 가족과 친구들에게 공유하기",ContextCompat.getDrawable(this, R.drawable.youtube_2));

        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("btn",btn);
                intent.putExtra("btn2",position);
                startActivity(intent);

        }
        });
    }

}

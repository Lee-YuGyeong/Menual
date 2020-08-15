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

                adapter.addData("1.누르기", ContextCompat.getDrawable(this, R.drawable.phone_2));
                adapter.addData("2.닫기",ContextCompat.getDrawable(this, R.drawable.phone_2));
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

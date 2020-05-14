package com.example.timer_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button  create_activity;


    //onCreate() 시스템이 Activity를 생성할 때 호출, 사용자 인터페이스 선언, 멤버변수 정의, 일부 ui 구성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create_activity = (Button)findViewById(R.id.Create_Activity);

        Log.d("TAG", "onCreate()");
    }

    //onStart()  activity가 생성 된 후 호출, activity가 사용자에게 보이게 됨 , 포그라운드에 올리도록 준비 완료 후 onResume()호출
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart()");

    }

    //onResume() activity가 포그라운드에 올라오고 호출 , 사용자와 상호작용
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("TAG", "onResume()");

    }

    //onPause()  activity가 포그라운드에서 벗어날때 호출, 부분적으로 보이지ㅁ나 포커스 상태가 아닌경우 일시정지 상태 유지
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("TAG", "onPause()");
    }

    //onStop() activity가 사용자에게 더이상 표시되지 않을 때 호출, 필요하지 않은 리로스 해제
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop()");
    }

    //onRestart() activity가 멈춘 상태에서 activity가 다시 시작되면 호출, 수행 후  onStart() 호출
   @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d("TAG", "ReStart()");
    }

    //onDestroy() activity가 소멸되기 직전에 호출
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy()");
    }

    public void create_activity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}

package com.example.helloandroid
/*app이란 이름의 모듈을 만들었기에 app/밑에 모두 있음
manifests/ : 메인환경파일인 AndroidManifest.xml파일
               애플리케이션이나 액티비티 및 서비스 설정
java/ : 앱 소스파일인 MainActivity.kt파일
res/ 	        : res는 resource의 줄임말
ㄴ    drawable/ :  그림, 배경색 자원
ㄴ    layout/    :  액티비티에 대한 UI정의한 레이아웃xml
ㄴ    mipmap/ :   아이콘
ㄴ    values/    :  프로그램에 쓸 색, 문자열, 스타일등의 xml

이떄 액티비티 : UI를 가진 일종의 객체로 앱은 1개 이상의 액티비티를 가진다*/
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("Hello Application");
    }
}
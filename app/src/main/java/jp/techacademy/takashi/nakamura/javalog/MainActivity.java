package jp.techacademy.takashi.nakamura.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human tanaka = new Human("田中佑二", 38, "釣り");
        Human suzuki = new Human("鈴木亮平", 25, "スキー");
        Human kimura = new Human("木村耕蔵", 57, "ゴルフ");

        tanaka.say();
        tanaka.think();
        suzuki.say();
        suzuki.think();
        kimura.say();
        kimura.think();
    }
}

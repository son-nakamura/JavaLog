package jp.techacademy.takashi.nakamura.javalog;

import android.util.Log;

public class BigDog extends Dog {

    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

//    @Override
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}

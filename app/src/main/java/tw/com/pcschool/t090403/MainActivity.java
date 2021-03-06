package tw.com.pcschool.t090403;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File F1 = getFilesDir();
        Log.d("FILE", "File:" + F1.toString());

        File F2 = getCacheDir();
        Log.d("FILE", "Cache:" + F2.toString());
    }
    public void click1(View v)
    {
        String result = MyUtils.getRawData(MainActivity.this, R.raw.animal);
        Log.d("READ", result);
    }
}

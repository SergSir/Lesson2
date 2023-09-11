package ru.mirea.lavrukhin.activitylifecycle;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

//1 вопрос - нет, метод «onCreate» не будет вызван
//2 вопрос - изменяется в процесссе, но начальный и конечный результат - onResume()
//3 вопрос - изменяется в процесссе, но начальный и конечный результат - onResume()
public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private EditText btnMirea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMirea = findViewById(R.id.editTextTextPersonName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
        btnMirea.setText("onStart()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState()");
        btnMirea.setText("onSaveInstanceState()");
    }
    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        Log.i(TAG, "onRestoreInstanceState()");
        btnMirea.setText("onRestoreInstanceState()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
        btnMirea.setText("onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
        btnMirea.setText("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
        btnMirea.setText("onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
        btnMirea.setText("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
        btnMirea.setText("onDestroy()");
    }
}
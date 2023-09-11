package ru.mirea.lavrukhin.toastap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText MyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyName = findViewById(R.id.editTextTextPersonName);
    }
    public void onClickNewToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ № 18 ГРУППА БСБО-06-21 Количество символов - " +
                        MyName.getText().length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
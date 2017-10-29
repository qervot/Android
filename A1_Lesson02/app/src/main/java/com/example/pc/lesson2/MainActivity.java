package com.example.pc.lesson2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Объявляем наши вью
    private TextView textView;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Указываем, какой лейяут отображать
        setContentView(R.layout.activity_main);
        //Находим такстВью
        textView = (TextView) findViewById(R.id.textview_description);
        //Объявляем и находим кнопку
        Button button = (Button) findViewById(R.id.button_show_description);
        //Вешаем слушатель нажатий
        button.setOnClickListener(onClickListener);
        //Находим спиннер
        spinner = (Spinner) findViewById(R.id.spinner_for_colors);
    }

    //Объявляем листенер (слушатель) нажатий
    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button_show_description) {
                //Получаем эффект
                String result = ColorSpec.getEffect(MainActivity.this, spinner.getSelectedItemPosition());
                //Устанавливаем текст в textView
                textView.setText(result);
            }
        }
    };
}

package com.example.myaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Boolean isNew= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maib_linear);

        // Получить пользовательский элемент по идентификатору
        editText = findViewById(R.id.EditText);
    }
    public void button1_onClick(View view) {
     if(isNew){
         editText.setText("");
     }
     isNew=false;

       String number = editText.getText().toString();
       switch (view.getId()){
           case R.id.button0_1:number = number +"1";break;
           case R.id.button0_2:number = number +"2";break;
           case R.id.button0_3:number = number +"3";break;
           case R.id.button0_4:number = number +"4";break;
           case R.id.button0_5:number = number +"5";break;
           case R.id.button0_6:number = number +"6";break;
           case R.id.button0_7:number = number +"7";break;
           case R.id.button0_8:number = number +"8";break;
           case R.id.button0_9:number = number +"9";break;
           case R.id.button0_0:number = number +"0";break;
           case R.id.button_dot:number = number +".";break;
           case R.id.button_minus:number = number +"-";break;
           case R.id.button_plus:number = number +"+";break;
           case R.id.button_multiply:number = number +"*";break;
           case R.id.button_share:number = number +"/";break;
           case R.id.button_equals:number = number +"=";break;
           case R.id.button_percentage:number = number +"%";break;





       }
       editText.setText(number);
    }

}
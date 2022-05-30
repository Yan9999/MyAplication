package com.example.myaplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity  extends AppCompatActivity {
    EditText editText;
    Boolean isNew= true;

    String oldNumber;
    String operator="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получить пользовательский элемент по идентификатору
        editText = findViewById(R.id.EditText1);

    }
    public void button1_onClick(View view) {
        if(isNew){
            editText.setText(" ");
        }
        isNew=false;

        String number = editText.getText().toString();
        switch (view.getId()){
            case R.id.button0_1:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"1";break;
                }

            case R.id.button0_2:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"2";break;}
            case R.id.button0_3:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"3";break;}
            case R.id.button0_4:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"4";break;}
            case R.id.button0_5:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"5";break;}
            case R.id.button0_6:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"6";break;}
            case R.id.button0_7:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"7";break;}
            case R.id.button0_8:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{number = number +"8";break;}
            case R.id.button0_9:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+number.substring(1);
                }else{
                    number = number +"9";break;}
            case R.id.button0_0:
                if(isZero(number)&& number.length() == 1 ){
                    number = " "+"0";
                }else {
                    number = number +"0";
                }
                break;
            case R.id.button_AC:number =""; break;
            case R.id.button_dot:

                if(dotIsTrue(number)){

                }else {
                    number = number + ".";
                }
                break;

        }
        editText.setText(number);
    }
    public void operation (View view){
        isNew=true;
        oldNumber = editText.getText().toString();
        switch (view.getId()){
            case R.id.button_minus: operator=  "-";break;
            case R.id.button_plus: operator="+";break;
            case R.id.button_multiply: operator="*";break;
            case R.id.button_share: operator="/";break;
        }
    }


    public void Equals (View view){
        String newNumber = editText.getText().toString();
        Double result =0.0;
        switch (operator){
            case "-":result =Double.parseDouble(oldNumber)- Double.parseDouble(newNumber);break;
            case "+":result =Double.parseDouble(oldNumber)+ Double.parseDouble(newNumber);break;
            case "/":try { result =Double.parseDouble(oldNumber)/ Double.parseDouble(newNumber); }
            catch (ArithmeticException ex){
                editText.setText("Делить на 0 нельзя!");
            }
                break;
            case "*":result =Double.parseDouble(oldNumber)* Double.parseDouble(newNumber);break;
            case "%": result =Double.parseDouble(newNumber) *Double.parseDouble(oldNumber) / 100;break;
        }

        editText.setText(""+result+"");
    }

    public void clickPercent (View view) {

        if(operator == ""){
            isNew=true;
            oldNumber = editText.getText().toString();
            operator = "%";
        }else{
            String newNumber = editText.getText().toString();
            Double result = 0.0;
            switch (operator) {
                case "-": result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber) *Double.parseDouble(oldNumber) / 100;break;
                case "+": result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber) *Double.parseDouble(oldNumber) / 100;break;

                case "/":result =  Double.parseDouble(oldNumber) / Double.parseDouble(newNumber) *Double.parseDouble(oldNumber) / 100;break;



                case "*": result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber) *Double.parseDouble(oldNumber) / 100;break;
            }
            editText.setText(" "+result+"");
        }

    }

    public boolean dotIsTrue(String number ){
        if(number.indexOf(".")== -1){
            return false;
        }else{
            return true;
        }

    }

    public boolean isZero(String number) {
        if (  number.equals("0")|| number.equals("")){
            return true;
        }else{
            return false;
        }
    }




}

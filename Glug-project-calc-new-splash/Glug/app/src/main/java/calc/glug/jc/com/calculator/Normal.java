package calc.glug.jc.com.calculator;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import static calc.glug.jc.com.calculator.MainActivity.checkSubmit;
import static calc.glug.jc.com.calculator.MainActivity.screenTextMath;
import static calc.glug.jc.com.calculator.MainActivity.textAns;
import static calc.glug.jc.com.calculator.MainActivity.textMath;


/**
 * A simple {@link Fragment} subclass.
 */
public class Normal extends Fragment implements View.OnClickListener {

    private Handler handler = new Handler();

    Button btn7, btn8, btn9, btn6, btn5, btn4, btn1, btn0, btn2, btn3, btnPlus, btnMinus, btnDiv, btnMul, btnBack, btnClear, btnResult, btnDot,btnPi;


    public Normal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View myView = inflater.inflate(R.layout.fragment_normal, container, false);

        btn0 = (Button) myView.findViewById(R.id.btn_0);
        btn0.setOnClickListener(this);

        btn1 = (Button) myView.findViewById(R.id.btn_1);
        btn1.setOnClickListener(this);


        btn2 = (Button) myView.findViewById(R.id.btn_2);
        btn2.setOnClickListener(this);


        btn3 = (Button) myView.findViewById(R.id.btn_3);
        btn3.setOnClickListener(this);

        btn4 = (Button) myView.findViewById(R.id.btn_4);
        btn4.setOnClickListener(this);

        btn5 = (Button) myView.findViewById(R.id.btn_5);
        btn5.setOnClickListener(this);

        btn6 = (Button) myView.findViewById(R.id.btn_6);
        btn6.setOnClickListener(this);

        btn7 = (Button) myView.findViewById(R.id.btn_7);
        btn7.setOnClickListener(this);

        btn8 = (Button) myView.findViewById(R.id.btn_8);
        btn8.setOnClickListener(this);

        btn9 = (Button) myView.findViewById(R.id.btn_9);
        btn9.setOnClickListener(this);


        btnPlus = (Button) myView.findViewById(R.id.btn_plus);
        btnPlus.setOnClickListener(this);


        btnMinus = (Button) myView.findViewById(R.id.btn_minus);
        btnMinus.setOnClickListener(this);

        btnMul = (Button) myView.findViewById(R.id.btn_multiply);
        btnMul.setOnClickListener(this);

        btnDiv = (Button) myView.findViewById(R.id.btn_divide);
        btnDiv.setOnClickListener(this);

        btnBack = (Button) myView.findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);

        btnClear = (Button) myView.findViewById(R.id.btn_clear);
        btnClear.setOnClickListener(this);


        btnResult = (Button) myView.findViewById(R.id.btn_equals);
        btnResult.setOnClickListener(this);

        btnDot = (Button) myView.findViewById(R.id.btn_decimal);
        btnDot.setOnClickListener(this);

        btnPi = (Button)myView.findViewById(R.id.btn_Pi);
        btnPi.setOnClickListener(this);


        return myView;

    }

    public void error() {
        MainActivity.ScreenAns.setText("Math Error !");
        textAns = screenTextMath = new StringBuilder("");
        MainActivity.textMath = new StringBuilder("0+");
    }

    public void submit(String[] elementMath) {
        InfixToPostfix ITP = new InfixToPostfix();
        if (textMath.length() > 0) {
            try {
                if (!ITP.check_error)
                    elementMath = ITP.processString(textMath.toString());
                if (!ITP.check_error)
                    elementMath = ITP.postfix(elementMath);
                if (!ITP.check_error)
                    textAns = new StringBuilder(ITP.valueMath(elementMath));
                MainActivity.ScreenAns.setText(textAns);

                screenTextMath = new StringBuilder("");
                textMath = new StringBuilder("0+");
                checkSubmit = 1;

            } catch (Exception e) {
                error();
            }
            if (ITP.check_error) error();
        }
    }


    @Override
    public void onClick(View view) {

        int id = view.getId();
        String elementMath[] = null;

        //screenTextMath is initially " "
        //checkSubmit = 1 --> if submitted
        //checkSubmit = 0 --> if not submitted

        if (id == R.id.btn_0){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("0");
                screenTextMath.append("0");
            }
           MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_1){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("1");
                screenTextMath.append("1");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_2){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("2");
                screenTextMath.append("2");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }



        else if (id == R.id.btn_3){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("3");
                screenTextMath.append("3");
            }

            MainActivity.ScreenMath.setText(screenTextMath);
        }



        else if (id == R.id.btn_4){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("4");
                screenTextMath.append("4");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_5){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("5");
                screenTextMath.append("5");
            }
            MainActivity.ScreenMath.setText(screenTextMath.toString());
        }

        else if (id == R.id.btn_6){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("6");
                screenTextMath.append("6");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_7){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("7");
                screenTextMath.append("7");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_8){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("8");
                screenTextMath.append("8");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_9){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("9");
                screenTextMath.append("9");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_Pi){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("π");
                screenTextMath.append("π");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_decimal){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append(".");
                screenTextMath.append(".");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else if (id == R.id.btn_plus){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("+");
                screenTextMath.append("+");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else  if (id == R.id.btn_minus){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("-");
                screenTextMath.append("-");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }

        else  if (id == R.id.btn_multiply){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("*");
                screenTextMath.append("*");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }



        else if (id == R.id.btn_divide){
            if (screenTextMath.length()<48) {
                if (checkSubmit == 1)
                {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("/");
                screenTextMath.append("/");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }


        else if (id == R.id.btn_equals){
            submit(elementMath);
            btnBack.setEnabled(false);
        }

        else if(id == R.id.btn_clear){
            textMath = new StringBuilder("0+"); //bug here
            screenTextMath = new StringBuilder("");
            textAns = new StringBuilder("0");
            MainActivity.ScreenMath.animate().alpha(0f).setDuration(300);
            MainActivity.ScreenAns.animate().alpha(0f).setDuration(300);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    MainActivity.ScreenMath.animate().alpha(1f).setDuration(300);
                    MainActivity.ScreenAns.animate().alpha(1f).setDuration(300);
                    MainActivity.ScreenAns.setText(textAns);
                    MainActivity.ScreenMath.setText("");
                }
            },300);
            btnBack.setEnabled(true);

        }

        else if(id == R.id.btn_back){
            if (MainActivity.ScreenMath.length()>0){
                char c = textMath.charAt(textMath.length()-1);
                if (textMath.length() > 1 && c == '(' && textMath.charAt(textMath.length()-2) == '^'){
                    screenTextMath = new StringBuilder(screenTextMath.substring(0,screenTextMath.length()-2));
                    textMath = new StringBuilder(textMath.substring(0,textMath.length()-2));
                }
                else if (textMath.length() > 1 && c == '(' && (textMath.charAt(textMath.length()-2) == 's' || textMath.charAt(textMath.length()-2) == 'c' || textMath.charAt(textMath.length()-2) == 't') ){
                    textMath = new StringBuilder(textMath.substring(0,textMath.length()-2));
                    screenTextMath = new StringBuilder(screenTextMath.substring(0,screenTextMath.length()-4));
                }
                else if (textMath.length() > 1 && c == '(' && (textMath.charAt(textMath.length()-2) == 'l' )){
                    textMath = new StringBuilder(textMath.substring(0,textMath.length()-2));
                    screenTextMath = new StringBuilder(screenTextMath.substring(0,screenTextMath.length()-3));
                }

                else {
                    textMath = new StringBuilder(textMath.substring(0,textMath.length()-1));
                    screenTextMath = new StringBuilder(screenTextMath.substring(0,screenTextMath.length()-1));
                }
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
    }
}


























package calc.glug.jc.com.calculator;


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
public class Scientific extends Fragment implements View.OnClickListener {

    private Handler handler = new Handler();
    Button btnSin, btnCos, btnTan, btnFact, btnInverse, btnRoot, btnPow, btnLn, btnBOpen, btnBClose,
    btnMod;



    public Scientific() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View myView = inflater.inflate(R.layout.fragment_scientific, container, false);


        btnSin = (Button) myView.findViewById(R.id.btn_sin);
        btnSin.setOnClickListener(this);


        btnCos = (Button) myView.findViewById(R.id.btn_cos);
        btnCos.setOnClickListener(this);

        btnTan = (Button) myView.findViewById(R.id.btn_tan);
        btnTan.setOnClickListener(this);


        btnFact = (Button) myView.findViewById(R.id.btn_fact);
        btnFact.setOnClickListener(this);


        btnRoot = (Button) myView.findViewById(R.id.btn_root);
        btnRoot.setOnClickListener(this);


        btnInverse = (Button) myView.findViewById(R.id.btn_inverse);
        btnInverse.setOnClickListener(this);


        btnPow = (Button) myView.findViewById(R.id.btn_xy);
        btnPow.setOnClickListener(this);


        btnLn = (Button) myView.findViewById(R.id.btn_ln);
        btnLn.setOnClickListener(this);

        btnMod = (Button)myView.findViewById(R.id.btn_mod);
        btnMod.setOnClickListener(this);

        btnBOpen = (Button) myView.findViewById(R.id.btn_left);
        btnBOpen.setOnClickListener(this);

        btnBClose = (Button) myView.findViewById(R.id.btn_right);
        btnBClose.setOnClickListener(this);


        //return inflater.inflate(R.layout.fragment_scientific, container, false);
        return myView;
    }

    public void error() {
        MainActivity.ScreenAns.setText("Math Error !");
        textAns  = screenTextMath = new StringBuilder("");
        MainActivity.textMath = new StringBuilder("0+");
    }

    public void submit(String[] elementMath) {
        InfixToPostfix ITP = new InfixToPostfix();
        if (MainActivity.textMath.length() > 0) {
            try {
                if (!ITP.check_error)
                    elementMath = ITP.processString(MainActivity.textMath.toString());
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

           if (id == R.id.btn_xy) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("^(");
                screenTextMath.append("^(");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_ln) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("l(");
                screenTextMath.append("Ln(");

            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
           else if (id == R.id.btn_mod) {
               if (screenTextMath.length() < 48) {
                   if (checkSubmit == 1) {
                       screenTextMath = new StringBuilder("");
                       textMath = new StringBuilder("0+");
                       checkSubmit = 0;
                   }
                   textMath.append("%");
                   screenTextMath.append("%");

               }
               MainActivity.ScreenMath.setText(screenTextMath);
           }
        else if (id == R.id.btn_root) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("@");
                screenTextMath.append("√");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_fact) {
            if (screenTextMath.length() < 48) {

                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("!");
                screenTextMath.append("!");

            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_sin) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("s(");
                screenTextMath.append("Sin(");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_cos) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("c(");
                screenTextMath.append("Cos(");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_tan) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("t(");
                screenTextMath.append("Tan(");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_left) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append("(");
                screenTextMath.append("(");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_right) {
            if (screenTextMath.length() < 48) {
                if (checkSubmit == 1) {
                    screenTextMath = new StringBuilder("");
                    textMath = new StringBuilder("0+");
                    checkSubmit = 0;
                }
                textMath.append(")");
                screenTextMath.append(")");
            }
            MainActivity.ScreenMath.setText(screenTextMath);
        }
        else if (id == R.id.btn_inverse) {
            if (screenTextMath.length() == 0) screenTextMath = new StringBuilder("0");
            screenTextMath = new StringBuilder("1/(" + screenTextMath + ")");
            MainActivity.ScreenMath.setText(screenTextMath);
            if (checkSubmit == 0) submit(elementMath);
            textMath = new StringBuilder("1/" + textAns);
            submit(elementMath);

        }



    }
}


package practice.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numEditText1, numEditText2;
    Button plusButton, minusButton, mulButton, divButton;
    TextView resultText;

    String num1 = "", num2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numEditText1 = (EditText) findViewById(R.id.numEditText1);
        numEditText2 = (EditText) findViewById(R.id.numEditText2);

        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        mulButton = (Button) findViewById(R.id.mulButton);
        divButton = (Button) findViewById(R.id.divButton);

        resultText = (TextView) findViewById(R.id.resultText);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1 != "" && num2 != "") {
                    int integerNum1 = Integer.parseInt(num1);
                    int integerNum2 = Integer.parseInt(num2);

                    resultText.setText(integerNum1 + integerNum2 + "");
                } else {
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1 != "" && num2 != "") {
                    int integerNum1 = Integer.parseInt(num1);
                    int integerNum2 = Integer.parseInt(num2);

                    resultText.setText(integerNum1 - integerNum2 + "");
                } else {
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1 != "" && num2 != "") {
                    int integerNum1 = Integer.parseInt(num1);
                    int integerNum2 = Integer.parseInt(num2);

                    resultText.setText(integerNum1 * integerNum2 + "");
                } else {
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1 != "" && num2 != "") {
                    int integerNum1 = Integer.parseInt(num1);
                    int integerNum2 = Integer.parseInt(num2);

                    resultText.setText(integerNum1 / integerNum2 + "");
                } else {
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void focusCheck (int num) {

        if (numEditText1.isFocused() == true) {

            num1 = numEditText1.getText().toString() + num + "";
            numEditText1.setText(num1);

        } else if (numEditText2.isFocused() == true) {

            num2 = numEditText2.getText().toString() + num + "";
            numEditText2.setText(num2);

        } else {
            Toast.makeText(this, "먼저 숫자 입력 칸을 클릭해주세요", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.num0:
                focusCheck(0);
                break;

            case R.id.num1:
                focusCheck(1);
                break;

            case R.id.num2:
                focusCheck(2);
                break;

            case R.id.num3:
                focusCheck(3);
                break;

            case R.id.num4:
                focusCheck(4);
                break;

            case R.id.num5:
                focusCheck(5);
                break;

            case R.id.num6:
                focusCheck(6);
                break;

            case R.id.num7:
                focusCheck(7);
                break;

            case R.id.num8:
                focusCheck(8);
                break;

            case R.id.num9:
                focusCheck(9);
                break;

        }

    }
}

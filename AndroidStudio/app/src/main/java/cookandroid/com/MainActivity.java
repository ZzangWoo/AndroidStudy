package cookandroid.com;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;
    EditText editText1, editText2;
    TextView resultText;

    int num1, num2, result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.plusButton);
        button1.setBackgroundColor(Color.GRAY);
        button2 = (Button) findViewById(R.id.minusButton);
        button2.setBackgroundColor(Color.GREEN);
        button3 = (Button) findViewById(R.id.mulButton);
        button3.setBackgroundColor(Color.RED);
        button4 = (Button) findViewById(R.id.divButton);
        button4.setBackgroundColor(Color.YELLOW);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        resultText = (TextView) findViewById(R.id.resultText);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1 != null && editText2 != null) {

                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());

                    result = num1 + num2;
                    resultText.setText("계산결과 : " + result);

                } else {
                    Toast.makeText(MainActivity.this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1 != null && editText2 != null) {

                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());

                    result = num1 - num2;
                    resultText.setText("계산결과 : " + result);

                } else {
                    Toast.makeText(MainActivity.this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1 != null && editText2 != null) {

                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());

                    result = num1 * num2;
                    resultText.setText("계산결과 : " + result);

                } else {
                    Toast.makeText(MainActivity.this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1 != null && editText2 != null) {

                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());

                    result = num1 / num2;
                    resultText.setText("계산결과 : " + result);

                } else {
                    Toast.makeText(MainActivity.this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

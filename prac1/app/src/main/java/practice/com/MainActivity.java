package practice.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox startCheckBox;
    TextView favoriteQuestionText;
    RadioGroup radioGroup;
    RadioButton dogButton, catButton;
    Button selectButton;
    ImageView animalImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startCheckBox = (CheckBox) findViewById(R.id.startCheckBox);
        favoriteQuestionText = (TextView) findViewById(R.id.favoriteQuestionText);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        dogButton = (RadioButton) findViewById(R.id.dogButton);
        catButton = (RadioButton) findViewById(R.id.catButton);
        selectButton = (Button) findViewById(R.id.selectButton);
        animalImage = (ImageView) findViewById(R.id.animalImage);

        startCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (startCheckBox.isChecked() == true) {

                    favoriteQuestionText.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    selectButton.setVisibility(View.VISIBLE);
                    animalImage.setVisibility(View.VISIBLE);

                } else {

                    favoriteQuestionText.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    selectButton.setVisibility(View.INVISIBLE);
                    animalImage.setVisibility(View.INVISIBLE);

                }

            }
        });

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (radioGroup.getCheckedRadioButtonId()) {

                    case R.id.dogButton :
                        animalImage.setImageResource(R.drawable.dog);
                        break;

                    case R.id.catButton :
                        animalImage.setImageResource(R.drawable.cat);
                        break;

                    default :
                        Toast.makeText(MainActivity.this, "동물을 선택해주세요", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });

    }
}

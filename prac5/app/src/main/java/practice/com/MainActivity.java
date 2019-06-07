package practice.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button preButton, nextButton;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preButton = (Button) findViewById(R.id.preButton);
        nextButton = (Button) findViewById(R.id.nextButton);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        preButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showPrevious();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();
            }
        });

    }
}

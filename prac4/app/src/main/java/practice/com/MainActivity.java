package practice.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 자동 완성될 문자열을 배열로 정의한다
        String[] items = {"CSI-뉴욕", "CSI-라스베가스", "CSI-마이애미", "Friends", "Fringe", "Lost"};

        // AutoCompleteTextView 연결
        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);

        // ArrayAdapter에 문자열 배열을 집어넣기
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);
        auto.setAdapter(adapter);

        // MultiAutoCompleteTextView 연결
        MultiAutoCompleteTextView multi = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);

        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        multi.setTokenizer(token);
        multi.setAdapter(adapter);

    }
}

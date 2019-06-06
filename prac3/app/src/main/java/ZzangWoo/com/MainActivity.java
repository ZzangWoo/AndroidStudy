package ZzangWoo.com;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer;
    Button reservationButton, endButton;
    RadioGroup radioGroup;
    RadioButton dateRadioButton, timeRadioButton;
    CalendarView calendarView;
    TimePicker timePicker;
    TextView yearText, monthText, dayText, hourText, minuteText;

    int selectYear, selectMonth, selectDay; // 캘린더 값 저장해줄 변수
    int selectHour, selectMinute; // TimePicker 값 저장해줄 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("시간 예약");

        chronometer = (Chronometer) findViewById(R.id.chronometer1);

        reservationButton = (Button) findViewById(R.id.reservationButton);
        endButton = (Button) findViewById(R.id.endButton);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        dateRadioButton = (RadioButton) findViewById(R.id.dateRadioButton);
        timeRadioButton = (RadioButton) findViewById(R.id.timeRadioButton);

        calendarView = (CalendarView) findViewById(R.id.calendarView1);

        timePicker = (TimePicker) findViewById(R.id.timePicker1);

        yearText = (TextView) findViewById(R.id.yearText);
        monthText = (TextView) findViewById(R.id.monthText);
        dayText = (TextView) findViewById(R.id.dayText);
        hourText = (TextView) findViewById(R.id.hourText);
        minuteText = (TextView) findViewById(R.id.minuteText);

        timePicker.setVisibility(View.INVISIBLE);
        calendarView.setVisibility(View.INVISIBLE);

        dateRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendarView.setVisibility(View.VISIBLE);
                timePicker.setVisibility(View.INVISIBLE);
            }
        });

        timeRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePicker.setVisibility(View.VISIBLE);
                calendarView.setVisibility(View.INVISIBLE);
            }
        });

        reservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.setBase(SystemClock.elapsedRealtime()); // 크로노미터 0으로 초기화
                chronometer.start(); // 시작
                chronometer.setTextColor(Color.RED);
            }
        });

        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.stop();
                chronometer.setTextColor(Color.BLUE);

                yearText.setText(Integer.toString(selectYear));
                monthText.setText(Integer.toString(selectMonth));
                dayText.setText(Integer.toString(selectDay));
                hourText.setText(Integer.toString(selectHour));
                minuteText.setText(Integer.toString(selectMinute));
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {
                selectYear = year;
                selectMonth = month + 1; // '월'은 0부터 시작해서 +1을 해줘야함
                selectDay = day;
            }
        });

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                selectHour = hour;
                selectMinute = minute;
            }
        });

    }
}

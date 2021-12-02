package com.alitech.radiobutton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.ShowYourSelection);
        textView.setEnabled(false);
    }
    public void selectItem (View view){
        Boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.Excellent:
                if (checked){
                    textView.setText("Excellent");
                    textView.setEnabled(true);
                } else {
                    textView.setEnabled(false);
                }
                break;
            case R.id.Very_Good:
                if (checked){
                    textView.setText("Very_Good");
                    textView.setEnabled(true);
                } else {
                    textView.setEnabled(false);
                }
                break;
            case R.id.Good:
                if (checked){
                    textView.setText("Good");
                    textView.setEnabled(true);
                } else {
                    textView.setEnabled(false);
                }
                break;
            case R.id.Accept:
                if (checked){
                    textView.setText("Accept");
                    textView.setEnabled(true);
                } else {
                    textView.setEnabled(false);
                }
                break;
        }
    }
}

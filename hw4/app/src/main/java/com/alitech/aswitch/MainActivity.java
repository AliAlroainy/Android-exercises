package com.alitech.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.ShowResult);
        textView.setVisibility(View.INVISIBLE);
    }
    public void switchResult(View view){
        Boolean checked = ((Switch) view).isChecked();
        if (checked){
            textView.setText("Switch On");
            textView.setVisibility(View.VISIBLE);
        }else{
            textView.setVisibility(View.INVISIBLE);
        }
    }
}

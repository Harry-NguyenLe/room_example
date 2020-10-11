package vn.edu.csc.roomexampleapp.view;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import vn.edu.csc.roomexampleapp.R;

public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.setListBridge();
        mainViewModel.getBridgeName().observe(this, bridges -> {
            mTextView.setText(bridges.get(0).getBridgeName() + "--" + bridges.get(1).getBridgeName());
        });
    }
}
package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textView;  // Khai báo TextView
    EditText editText;  // Khai báo EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText editText= findViewById(R.id.edtA);
        textView = findViewById(R.id.edtB);
        Button btnDoi =(Button) findViewById(R.id.button1);
        btnDoi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int namDuong = Integer.parseInt(editText.getText().toString());;
                int canIndex = namDuong % 10;
                int chiIndex = namDuong % 12;
                String[] can ={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỳ"};
                String[] chi={"Ty","Suu","Dan","Maõ","Thìn","Tỵ","Ngo","Mùi","Thân","Dậu","Tuat","Hợi"};
                String namAmLich = can[canIndex] + " "+ chi[chiIndex];
                textView.setText("Năm âm lịch: " + namAmLich);

            }
        });

    }
}
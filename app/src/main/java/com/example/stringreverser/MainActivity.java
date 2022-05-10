package com.example.stringreverser;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView result;

    Button equalSign, copier;
    EditText input;
    ClipData clip  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.viewer);

        input = (EditText) findViewById(R.id.editor);
        equalSign = (Button) findViewById(R.id.equalSign);
        copier = (Button) findViewById(R.id.copier);



        equalSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText( new StringReverser().reverse(input.getText().toString()));
            }
        });

        copier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clip = ClipData.newPlainText("ResultCopy",result.getText());
                clipboard.setPrimaryClip(clip);
            }
        });

    }
}

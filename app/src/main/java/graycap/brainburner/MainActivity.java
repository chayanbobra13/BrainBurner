package graycap.brainburner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitButton (View view){
        RadioButton ans1_radioButton = findViewById(R.id.ans1_radiobutton);
        CheckBox ans3_1_checkBox = findViewById(R.id.ans3_1_checkbox);
        CheckBox ans3_2_checkBox = findViewById(R.id.ans3_2_checkbox);
        EditText ans2_editText = findViewById(R.id.ans2_editText);
        EditText ans4_editText = findViewById(R.id.ans4_editText);
        RadioButton ans5_radiobutton = findViewById(R.id.ans5_radiobutton);

        // radio button  for ans 1 is checked score +1
        if (ans1_radioButton.isChecked()){ score += 1 ;}

        // edit text for ans 4 is match score +1
        if (ans2_editText.getText().toString().equals("apache 2.0")) { score += 1 ;}

        // check box for ans 3
        if (ans3_1_checkBox.isChecked() && ans3_2_checkBox.isChecked()){ score +=1;}

        // edit text for ans 4 is match score +1
        if (ans4_editText.getText().toString().equals("andy rubin")) { score += 1 ;}

        // radio button for ans 5 is checked score +1
        if (ans5_radiobutton.isChecked()){ score += 1 ;}

        Toast.makeText(MainActivity.this,"Your score : " + score * 10 ,Toast.LENGTH_SHORT).show();
    }

    public void resetButton(View view){
        score = 0 ;
        Toast.makeText(MainActivity.this,"Your quiz has restarted " + score ,Toast.LENGTH_SHORT).show();
    }

}


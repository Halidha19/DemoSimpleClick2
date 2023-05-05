package sg.edu.rp.c346.id22035802.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;



public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;

    ToggleButton tbtn;

    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.ButtonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action

                String said = "";
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale) {
                    said = "He said";
                } else {
                    said = "She said";
                }

                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(said + stringResponse);

                Toast.makeText(MainActivity.this, "The button has been clicked",
                        Toast.LENGTH_LONG).show();

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbtn.isChecked()) {
                } else {
                    etInput.setEnabled(false);
                }

            }

        });
    }
}
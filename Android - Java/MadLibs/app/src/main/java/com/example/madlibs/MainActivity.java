package com.example.madlibs;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

        //import all text the user can put in
        EditText adjective1 = findViewById(R.id.adjective1);
        EditText adjective2 = findViewById(R.id.adjective2);
        EditText noun1 = findViewById(R.id.noun1);
        EditText pastVerb = findViewById(R.id.pastVerb);
        EditText adjective3 = findViewById(R.id.adjective3);
        EditText dayOfWeek = findViewById(R.id.dayOfWeek);
        EditText food = findViewById(R.id.food);
        EditText noun2 = findViewById(R.id.noun2);

        //import all 4 lib selecters
        RadioButton lib1Selected = findViewById(R.id.lib1Select);
        RadioButton lib2Selected = findViewById(R.id.lib2Select);
        RadioButton lib3Selected = findViewById(R.id.lib3Select);
        RadioButton randomLibSelect = findViewById(R.id.randomLibSelect);
        RadioGroup radioGroup = findViewById(R.id.libSelectionGroup);

        //import output
        TextView madLibPrint = findViewById(R.id.madLibPrint);

        View submit = findViewById(R.id.libPlayer);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set to -1 so that no bias can occur
                int libSelected = -1;
                Random randy = new Random();

                //if a button is checked, give that output
                    if (lib1Selected.isChecked()) {
                        madLibPrint.setText("It was a(n) " + adjective1.getText().toString() + " day. The air felt " + adjective2.getText().toString() + ", and a(n) " + noun1.getText().toString() + " was nearby. I " + pastVerb.getText().toString() + " all afternoon, and by the time it was over, I felt " + adjective3.getText().toString() + ". Later, on " + dayOfWeek.getText().toString() + ", I grabbed some " + food.getText().toString() + " and sat down by a " + noun2.getText().toString() + " to relax.");
                    } else if (lib2Selected.isChecked()) {
                        madLibPrint.setText("The " + adjective1.getText().toString() + " weather set the tone for the day. Everything looked " + adjective2.getText().toString() + " under the sky. I found a " + noun1.getText().toString() + " that caught my attention and " + pastVerb.getText().toString() + ". That was enough to make me feel " + adjective3.getText().toString() + ". By the end of that " + dayOfWeek.getText().toString() + ", I was craving " + food.getText().toString() + " and thinking about a " + noun2.getText().toString() + " I had seen earlier.");
                    } else if (lib3Selected.isChecked()) {
                        madLibPrint.setText("I woke up to a(n) " + adjective1.getText().toString() + " morning, which quickly turned " + adjective2.getText().toString() + ". A(n) " + noun1.getText().toString() + " crossed my path, and I " + pastVerb.getText().toString() + ", feeling " + adjective3.getText().toString() + ". When " + dayOfWeek.getText().toString() + " arrived, I treated myself to some " + food.getText().toString() + " and spent the evening by a " + noun2.getText().toString() + ".");
                    } else if (randomLibSelect.isChecked()) {
                        //to make sure it's random, based off of libSelected
                        libSelected = randy.nextInt(3);

                        if (libSelected == 0) {
                            madLibPrint.setText("It was a(n) " + adjective1.getText().toString() + " day. The air felt " + adjective2.getText().toString() + ", and a(n) " + noun1.getText().toString() + " was nearby. I " + pastVerb.getText().toString() + " all afternoon, and by the time it was over, I felt " + adjective3.getText().toString() + ". Later, on " + dayOfWeek.getText().toString() + ", I grabbed some " + food.getText().toString() + " and sat down by a " + noun2.getText().toString() + " to relax.");
                        } else if (libSelected == 1) {
                            madLibPrint.setText("The " + adjective1.getText().toString() + " weather set the tone for the day. Everything looked " + adjective2.getText().toString() + " under the sky. I found a " + noun1.getText().toString() + " that caught my attention and " + pastVerb.getText().toString() + ". That was enough to make me feel " + adjective3.getText().toString() + ". By the end of that " + dayOfWeek.getText().toString() + ", I was craving " + food.getText().toString() + " and thinking about a " + noun2.getText().toString() + " I had seen earlier.");
                        } else if (libSelected == 2) {
                            madLibPrint.setText("I woke up to a(n) " + adjective1.getText().toString() + " morning, which quickly turned " + adjective2.getText().toString() + ". A(n) " + noun1.getText().toString() + " crossed my path, and I " + pastVerb.getText().toString() + ", feeling " + adjective3.getText().toString() + ". When " + dayOfWeek.getText().toString() + " arrived, I treated myself to some " + food.getText().toString() + " and spent the evening by a " + noun2.getText().toString() + ".");
                        }

                    }
                }
        });

    }
}

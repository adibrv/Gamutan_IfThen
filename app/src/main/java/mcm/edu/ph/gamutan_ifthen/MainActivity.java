package mcm.edu.ph.gamutan_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("You wake up to an unusual room you don't remember. In front of you are two colored doors in RED and BLUE. \n \n " +
                "1) Go to the RED room \n" +
                "2.) Go to the BLUE room");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        TextView txtLore = findViewById(R.id.txtLore);
        TextView txtDecision = findViewById(R.id.txtDecision);


        if(view.getId() == R.id.btnDecision1) {
            txtDecision.setText("You entered the RED room without a shadow of doubt and you find yourself swimming in blood. you quickly realize that you cannot swim. \nYou drowned.");
            txtLore.setText("BAD ENDING");
        }
        else if(view.getId() == R.id.btnDecision2) {
            txtLore.setText("GOOD ENDING");
            txtDecision.setText("You are now free as you open the door and smell the fresh air.");
        }
    }
}
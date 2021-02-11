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
        txtLore.setText("You wake up to an unusual room you don't remember. In front of you are two colored doors in RED and BLUE. \n \n +" +
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
        }
        else if(view.getId() == R.id.btnDecision2) {
            txtDecision.setText("Entering the BLUE room gave you an oddly welcoming and nice looking cake on a table. Beyond the table, you see two doors labeled 1 and 2. \nYou then decide for your next decision.");
            txtLore.setText("1) Eat the nice tasty yummy looking cake \n" +
                    "2) Try to open the doors");
            if(view.getId() == R.id.btnDecision2) {
                txtDecision.setText("Before reaching the doors, the floor beyond the table breaks and it was too late for you to realize which led you to falling to your death.");
                txtLore.setText("BAD ENDING");
            }
            else if(view.getId() == R.id.btnDecision1) {
                txtDecision.setText("You proceed to eat the cake. The cake tastes good but you suddenly bite into something hard which is a capsule. \n" +
                        "You then open the capsule. The capsule contains a key and a note which reads: \n" +
                        "Do not go near the two doors. Look behind. \n" +
                        "Looking behind made you notice that the door you came in from is locked and changed color from BLUE to GREEN. What will you do?");
                txtLore.setText("1) Approach the number labeled doors to try and unlock it \n" +
                        "2) Try to unlock the GREEN door");
                if(view.getId() == R.id.btnDecision1) {
                    txtDecision.setText("Before reaching the doors, the floor beyond the table breaks and it was too late for you to realize which led you to falling to your death.");
                    txtLore.setText("BAD ENDING");
                }
                else if(view.getId() == R.id.btnDecision2) {
                    txtDecision.setText("You try to unlock the GREEN door in which it worked. You open the GREEN door, seeing the trees and the beauty of nature, you notice that you are now free.");
                    txtLore.setText("GOOD ENDING");
                }
            }
        }
        
    }
}
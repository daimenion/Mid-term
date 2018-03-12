package com.example.tech.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    static int DRAWABLE_ID[]={
            R.drawable.card_1c,
            R.drawable.card_1d,
            R.drawable.card_1h,
            R.drawable.card_1s,
            R.drawable.card_2c,
            R.drawable.card_2d,
            R.drawable.card_2h,
            R.drawable.card_2s,
            R.drawable.card_3c,
            R.drawable.card_3d,
            R.drawable.card_3h,
            R.drawable.card_3s,
            R.drawable.card_4c,
            R.drawable.card_4d,
            R.drawable.card_4h,
            R.drawable.card_4s,
            R.drawable.card_5c,
            R.drawable.card_5d,
            R.drawable.card_5h,
            R.drawable.card_5s,
            R.drawable.card_6c,
            R.drawable.card_6d,
            R.drawable.card_6h,
            R.drawable.card_6s,
            R.drawable.card_7c,
            R.drawable.card_7d,
            R.drawable.card_7h,
            R.drawable.card_7s,
            R.drawable.card_8c,
            R.drawable.card_8d,
            R.drawable.card_8h,
            R.drawable.card_8s,
            R.drawable.card_9c,
            R.drawable.card_9d,
            R.drawable.card_9h,
            R.drawable.card_9s,
            R.drawable.card_10c,
            R.drawable.card_10d,
            R.drawable.card_10h,
            R.drawable.card_10s,
            R.drawable.card_11c,
            R.drawable.card_11d,
            R.drawable.card_11h,
            R.drawable.card_11s,
            R.drawable.card_12c,
            R.drawable.card_12d,
            R.drawable.card_12h,
            R.drawable.card_12s,
            R.drawable.card_13c,
            R.drawable.card_13d,
            R.drawable.card_13h,
            R.drawable.card_13s,
            R.drawable.cardback
    };



    private ImageButton pic1;
    private ImageButton pic2;

    private ImageButton pic3;

    private ImageButton[]storePic=new ImageButton[8];


   // private TextView msg;
    private int cardAmount;


   // private Button [] cardButton= new Button[16];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void RandomCard() {
        for (int x = 0;x<4;x++) {
            String aButtonId = "A" + (x + 1);
            String bButtonId = "B" + (x + 1);
            String cButtonId = "C" + (x + 1);
            String dButtonId = "D" + (x + 1);

           // cardButton[x] = findViewById(R.id.A1);
            int resID = getResources().getIdentifier(aButtonId,
                    "id", getPackageName());
            //cardButton[x] = (findViewById(resID));
            final int finalI = x;

            for (int y = 0; y < 8; y++) {
                int card3 = new Random().nextInt(52);
                pic3.setImageResource(DRAWABLE_ID[card3]);
                cardAmount++;
            }

            int card1 = new Random().nextInt(8);
            int card2 = new Random().nextInt(8);

            pic1.setImageResource(DRAWABLE_ID[card1]);
            pic2.setImageResource(DRAWABLE_ID[card2]);

        }
    }


}

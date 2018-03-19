// midterm by Minxu Huang and nicoles , 2018,3,18, Matching cards
package com.example.tech.midterm;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

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


    private ImageButton[] card = new ImageButton[9];

    private ImageButton[] pic3 = new ImageButton[4];




    private TextView msg;
    private TextView score;
    private  int scor = 0;
    private TextView timer;
    private  float time = 30000;

    private int cardAmount;

    private Button reset;

    private int pic = -1;
    private int pic2 = -1;

    private int storePic;
    private int storePic2;

    private boolean[] flipcard = new boolean[9];
    private  int cards[] = new int [9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.msg);
        msg.setText("Pick a card, any card");

        score = findViewById(R.id.Score);
        score.setText("Score: " + scor);

        timer = findViewById(R.id.Timer);
        new CountDownTimer(30000, 1000) {
            public void onTick(long second) {
                timer.setText("Time Left: " + second / 1000);

            }

            public void onFinish() {
                for (int x = 0; x < 9; x++) {
                    card[x].setImageResource(DRAWABLE_ID[52]);

                }
            }

        }.start();

        random();

        card[0] = (ImageButton) findViewById(R.id.A1);
        card[0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(0);
            }
        });

        card[1] = (ImageButton) findViewById(R.id.A2);
        card[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(1);
            }
        });

        card[2] = (ImageButton) findViewById(R.id.A3);
        card[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(2);
            }
        });

        card[3] = (ImageButton) findViewById(R.id.B1);
        card[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(3);
            }
        });

        card[4] = (ImageButton) findViewById(R.id.B2);
        card[4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(4);
            }
        });

        card[5] = (ImageButton) findViewById(R.id.B3);
        card[5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(5);
            }
        });

        card[6] = (ImageButton) findViewById(R.id.C1);
        card[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(6);
            }
        });

        card[7] = (ImageButton) findViewById(R.id.C2);
        card[7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(7);
            }
        });

        card[8] = (ImageButton) findViewById(R.id.C3);
        card[8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                RandomCard(8);
            }
        });


            flipcard[0] = false;
            flipcard[1] = false;
            flipcard[2] = false;
            flipcard[3] = false;
        flipcard[4] = false;
        flipcard[5] = false;
        flipcard[6] = false;
        flipcard[7] = false;
        flipcard[8] = false;

    }
    int ind ;

    public void random()
    {
        int tempCards[]= new int[5];
        int randomCard;
        boolean duplicate = false;

        for (int x = 0 ; x < tempCards.length ; x++)
        {
            tempCards[x] = -1;
        }

        for (int i = 0 ; i < tempCards.length ; i++)
        {
            duplicate = false;
            do
            {
                randomCard = new Random().nextInt(52);

                for (int d = 0 ; d < tempCards.length ; d++)
                {
                    if (randomCard == tempCards[d])
                        duplicate = true;
                }

            }   while (duplicate == true);
            tempCards[i] = randomCard;
        }

        for (int x = 0 ; x < cards.length ; x++)
        {
            cards[x] = -1;
        }

        for (int i = 0 ; i < 4; i++)
        {
            do {
                ind = new Random().nextInt(9);
            }while (cards[ind] != -1);

            cards[ind] = tempCards[i];

            do {
                ind = new Random().nextInt(9);
            }   while (cards[ind] != -1);

            cards[ind] = tempCards[i];

        }

        do {
            ind = new Random().nextInt(9);
        }   while (cards[ind] != -1);
        cards[ind] = tempCards[4];
    }
//  pick cards out of the 52 cards
    public void RandomCard(int cardd) {
        if(pic == -1 && flipcard[cardd] == false) {
            pic = cardd;
            storePic = cards[cardd];
            flipcard[cardd] = true;
            msg.setText("pick another card");
            card[cardd].setImageResource(DRAWABLE_ID[cards[cardd]]);
        }else if (pic == cardd && flipcard[cardd] == true&& pic2== -1){
            pic = -1;
            storePic = -1;
            flipcard[cardd] = false;
            msg.setText("pick a card");
            card[cardd].setImageResource(DRAWABLE_ID[52]);

        }else if(pic2 == -1 && flipcard[cardd] == false){
            pic2 = cardd;
            storePic2= cards[cardd];
            flipcard[cardd] = true;
            card[cardd].setImageResource(DRAWABLE_ID[cards[cardd]]);
            if (pic==pic2){
                msg.setText("Corret!!");
                scor++;
                score.setText("Score: "+scor);
            }else{
                msg.setText("pick another one");

                card[cardd].setImageResource(DRAWABLE_ID[52]);
                pic2 = -1;
                storePic2 = -1;
            }
          }
        }
    }



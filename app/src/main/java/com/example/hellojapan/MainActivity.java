package com.example.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView currentCharacter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView hiraganaImg = findViewById(R.id.hiraganaImg);
        ImageView katakanaImg = findViewById(R.id.katakanaImg);
        Button hiraganaSwitch = findViewById(R.id.hiragana);
        Button katakanaSwitch = findViewById(R.id.katakana);
        Button btnA = findViewById(R.id.btnA);
        Button btnI = findViewById(R.id.btnI);
        Button btnU = findViewById(R.id.btnU);
        Button btnE = findViewById(R.id.btnE);
        Button btnO = findViewById(R.id.btnO);
        Button btnKA = findViewById(R.id.btnKA);
        Button btnKI = findViewById(R.id.btnKI);
        Button btnKU = findViewById(R.id.btnKU);
        Button btnKE = findViewById(R.id.btnKE);
        Button btnKO = findViewById(R.id.btnKO);
        Button btnSA = findViewById(R.id.btnSA);
        Button btnSHI = findViewById(R.id.btnSHI);
        Button btnSU = findViewById(R.id.btnSU);
        Button btnSE = findViewById(R.id.btnSE);
        Button btnSO = findViewById(R.id.btnSO);
        Button btnTA = findViewById(R.id.btnTA);
        Button btnCHI = findViewById(R.id.btnCHI);
        Button btnTSU = findViewById(R.id.btnTSU);
        Button btnTE = findViewById(R.id.btnTE);
        Button btnTO = findViewById(R.id.btnTO);
        Button btnNA = findViewById(R.id.btnNA);
        Button btnNI = findViewById(R.id.btnNI);
        Button btnNU = findViewById(R.id.btnNU);
        Button btnNE = findViewById(R.id.btnNE);
        Button btnNO = findViewById(R.id.btnNO);
        Button btnHA = findViewById(R.id.btnHA);
        Button btnHI = findViewById(R.id.btnHI);
        Button btnFU = findViewById(R.id.btnFU);
        Button btnHE = findViewById(R.id.btnHE);
        Button btnHO = findViewById(R.id.btnHO);
        Button btnMA = findViewById(R.id.btnMA);
        Button btnMI = findViewById(R.id.btnMI);
        Button btnMU = findViewById(R.id.btnMU);
        Button btnME = findViewById(R.id.btnME);
        Button btnMO = findViewById(R.id.btnMO);
        Button btnYA = findViewById(R.id.btnYA);
        Button btnYU = findViewById(R.id.btnYU);
        Button btnYO = findViewById(R.id.btnYO);
        Button btnRA = findViewById(R.id.btnRA);
        Button btnRI = findViewById(R.id.btnRI);
        Button btnRU = findViewById(R.id.btnRU);
        Button btnRE = findViewById(R.id.btnRE);
        Button btnRO = findViewById(R.id.btnRO);
        Button btnWA = findViewById(R.id.btnWA);
        Button btnWO = findViewById(R.id.btnWO);
        Button btnN = findViewById(R.id.btnN);

        MediaPlayer a = MediaPlayer.create(MainActivity.this,R.raw.a);
        MediaPlayer i = MediaPlayer.create(MainActivity.this,R.raw.i);
        MediaPlayer u = MediaPlayer.create(MainActivity.this,R.raw.u);
        MediaPlayer e = MediaPlayer.create(MainActivity.this,R.raw.e);
        MediaPlayer o = MediaPlayer.create(MainActivity.this,R.raw.o);
        MediaPlayer ka = MediaPlayer.create(MainActivity.this,R.raw.ka);
        MediaPlayer ki = MediaPlayer.create(MainActivity.this,R.raw.ki);
        MediaPlayer ku = MediaPlayer.create(MainActivity.this,R.raw.ku);
        MediaPlayer ke = MediaPlayer.create(MainActivity.this,R.raw.ke);
        MediaPlayer ko = MediaPlayer.create(MainActivity.this,R.raw.ko);
        MediaPlayer sa = MediaPlayer.create(MainActivity.this,R.raw.sa);
        MediaPlayer shi = MediaPlayer.create(MainActivity.this,R.raw.shi);
        MediaPlayer su = MediaPlayer.create(MainActivity.this,R.raw.su);
        MediaPlayer se = MediaPlayer.create(MainActivity.this,R.raw.se);
        MediaPlayer so = MediaPlayer.create(MainActivity.this,R.raw.so);
        MediaPlayer ta = MediaPlayer.create(MainActivity.this,R.raw.ta);
        MediaPlayer chi = MediaPlayer.create(MainActivity.this,R.raw.chi);
        MediaPlayer tsu = MediaPlayer.create(MainActivity.this,R.raw.tsu);
        MediaPlayer te = MediaPlayer.create(MainActivity.this,R.raw.te);
        MediaPlayer to = MediaPlayer.create(MainActivity.this,R.raw.to);
        MediaPlayer na = MediaPlayer.create(MainActivity.this,R.raw.na);
        MediaPlayer ni = MediaPlayer.create(MainActivity.this,R.raw.ni);
        MediaPlayer nu = MediaPlayer.create(MainActivity.this,R.raw.nu);
        MediaPlayer ne = MediaPlayer.create(MainActivity.this,R.raw.ne);
        MediaPlayer no = MediaPlayer.create(MainActivity.this,R.raw.no);
        MediaPlayer ha = MediaPlayer.create(MainActivity.this,R.raw.ha);
        MediaPlayer hi = MediaPlayer.create(MainActivity.this,R.raw.hi);
        MediaPlayer fu = MediaPlayer.create(MainActivity.this,R.raw.fu);
        MediaPlayer he = MediaPlayer.create(MainActivity.this,R.raw.he);
        MediaPlayer ho = MediaPlayer.create(MainActivity.this,R.raw.ho);
        MediaPlayer ma = MediaPlayer.create(MainActivity.this,R.raw.ma);
        MediaPlayer mi = MediaPlayer.create(MainActivity.this,R.raw.mi);
        MediaPlayer mu = MediaPlayer.create(MainActivity.this,R.raw.mu);
        MediaPlayer me = MediaPlayer.create(MainActivity.this,R.raw.me);
        MediaPlayer mo = MediaPlayer.create(MainActivity.this,R.raw.mo);
        MediaPlayer ya = MediaPlayer.create(MainActivity.this,R.raw.ya);
        MediaPlayer yu = MediaPlayer.create(MainActivity.this,R.raw.yu);
        MediaPlayer yo = MediaPlayer.create(MainActivity.this,R.raw.yo);
        MediaPlayer ra = MediaPlayer.create(MainActivity.this,R.raw.ra);
        MediaPlayer ri = MediaPlayer.create(MainActivity.this,R.raw.ri);
        MediaPlayer ru = MediaPlayer.create(MainActivity.this,R.raw.ru);
        MediaPlayer re = MediaPlayer.create(MainActivity.this,R.raw.re);
        MediaPlayer ro = MediaPlayer.create(MainActivity.this,R.raw.ro);
        MediaPlayer wa = MediaPlayer.create(MainActivity.this,R.raw.wa);
        MediaPlayer wo = MediaPlayer.create(MainActivity.this,R.raw.wo);
        MediaPlayer n = MediaPlayer.create(MainActivity.this,R.raw.n);


        currentCharacter = hiraganaImg;
        hiraganaSwitch.setBackgroundColor(Color.BLACK);
        hiraganaSwitch.setTextColor(Color.WHITE);
        katakanaSwitch.setBackgroundColor(Color.WHITE);
        katakanaSwitch.setTextColor(Color.BLACK);

        hiraganaSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hiraganaImg.animate().alpha(1).setDuration(500);
                katakanaImg.animate().alpha(0).setDuration(500);
                hiraganaSwitch.setBackgroundColor(Color.BLACK);
                hiraganaSwitch.setTextColor(Color.WHITE);
                katakanaSwitch.setBackgroundColor(Color.WHITE);
                katakanaSwitch.setTextColor(Color.BLACK);
                currentCharacter = hiraganaImg;
            }
        });

        katakanaSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hiraganaImg.animate().alpha(0).setDuration(500);
                katakanaImg.animate().alpha(1).setDuration(500);
                hiraganaSwitch.setBackgroundColor(Color.WHITE);
                hiraganaSwitch.setTextColor(Color.BLACK);
                katakanaSwitch.setBackgroundColor(Color.BLACK);
                katakanaSwitch.setTextColor(Color.WHITE);
                currentCharacter = katakanaImg;
            }
        });

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {a.start();}
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {a.start();}
        });
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {i.start();}
        });
        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {u.start();}
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {e.start();}
        });
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {o.start();}
        });
        btnKA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ka.start();}
        });
        btnKI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ki.start();}
        });
        btnKU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ku.start();}
        });
        btnKE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ke.start();}
        });
        btnKO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ko.start();}
        });
        btnSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {sa.start();}
        });
        btnSHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {shi.start();}
        });
        btnSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {su.start();}
        });
        btnSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {se.start();}
        });
        btnSO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {so.start();}
        });
        btnTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ta.start();}
        });
        btnCHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {chi.start();}
        });
        btnTSU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tsu.start();}
        });
        btnTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {te.start();}
        });
        btnTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {to.start();}
        });
        btnNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {na.start();}
        });
        btnNI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ni.start();}
        });
        btnNU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {nu.start();}
        });
        btnNE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ne.start();}
        });
        btnNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {no.start();}
        });
        btnHA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ha.start();}
        });
        btnHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {hi.start();}
        });
        btnFU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {fu.start();}
        });
        btnHE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {he.start();}
        });
        btnHO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ho.start();}
        });
        btnMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ma.start();}
        });
        btnMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {mi.start();}
        });
        btnMU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {mu.start();}
        });
        btnME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {me.start();}
        });
        btnMO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {mo.start();}
        });
        btnYA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ya.start();}
        });
        btnYU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {yu.start();}
        });
        btnYO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {yo.start();}
        });
        btnRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ra.start();}
        });
        btnRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ri.start();}
        });
        btnRU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ru.start();}
        });
        btnRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {re.start();}
        });
        btnRO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {ro.start();}
        });
        btnWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {wa.start();}
        });
        btnWO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {wo.start();}
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {n.start();}
        });




    }
}
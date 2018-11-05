package com.aliaskarurakov.android.accessscopethisandstatic;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlienShip girlShip = new AlienShip();
        AlienShip boyShip = new AlienShip();

        Log.i("numShips: ",""+AlienShip.getNumShips());

        girlShip.shipName = "Corrine Yu";
        boyShip.shipName = "Andre LaMothe";

        Log.i("girlShip shieldStrngth: ", "" + girlShip.
                getShieldStrength());
        Log.i("boyShip shieldStrngth: ", "" + boyShip.
                getShieldStrength());

        girlShip.hitDetected();
        Log.i("girlShip shieldStrngth: ", "" + girlShip.
                getShieldStrength());

        Log.i("boyShip shieldStrngth: ", "" + boyShip.
                getShieldStrength());
        boyShip.hitDetected();
        boyShip.hitDetected();
        boyShip.hitDetected();
        Log.i("girlShip shieldStrngth: ", "" + girlShip.
                getShieldStrength());
        Log.i("boyShip shieldStrngth: ", "" + boyShip.
                getShieldStrength());
        boyShip.hitDetected();//ahhh
        Log.i("girlShip shieldStrngth: ", "" + girlShip.
                getShieldStrength());
        Log.i("boyShip shieldStrngth: ", "" + boyShip.
                getShieldStrength());
        Log.i("numShips: ", "" + AlienShip.getNumShips());
    }
}

package com.app.yoursingleradio.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.app.yoursingleradio.Config;
import com.app.yoursingleradio.R;
import com.app.yoursingleradio.utilities.GDPR;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;

public class ActivitySplash extends AppCompatActivity {

    private InterstitialAd interstitialAd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        if (Config.ENABLE_ADMOB_INTERSTITIAL_ADS_ON_LOAD) {
            loadInterstitialAd();
        }

        new CountDownTimer(Config.SPLASH_SCREEN_DURATION, 1000) {
            @Override
            public void onFinish() {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
                if (Config.ENABLE_ADMOB_INTERSTITIAL_ADS_ON_LOAD) {
                    if (interstitialAd.isLoaded()) {
                        interstitialAd.show();
                    }
                }
            }

            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();

    }

    private void loadInterstitialAd() {
        Log.d("TAG", "showAd");
        interstitialAd = new InterstitialAd(getApplicationContext());
        interstitialAd.setAdUnitId(getResources().getString(R.string.admob_interstitial_unit_id));
        interstitialAd.loadAd(GDPR.getAdRequest(this));
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {

            }
        });
    }

}
package pritesh.patel.cyberpaths.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Result extends AppCompatActivity {
    TextView resultView;
    TextView player1;
    TextView player2;
    private AdView mAdView;
//    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(pritesh.patel.cyberpaths.tictactoe.R.layout.activity_result);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
//        mInterstitialAd = new InterstitialAd(this);

        // set the ad unit ID
//        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));
//
//        AdRequest adRequest = new AdRequest.Builder()
////                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
////                // Check the LogCat to get your test device ID
////                .addTestDevice("2217D213C9103D43B6112EB151986803")
//                .build();
//
//        // Load ads into Interstitial Ads
//        mInterstitialAd.loadAd(adRequest);
//
//        mInterstitialAd.setAdListener(new AdListener() {
//            public void onAdLoaded() {
//                showInterstitial();
//            }
//        });


        mAdView = (AdView) findViewById(pritesh.patel.cyberpaths.tictactoe.R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                // Check the LogCat to get your test device ID
//                .addTestDevice("2217D213C9103D43B6112EB151986803")
                .build();
        mAdView.loadAd(adRequest2);

        Intent resultIntent = getIntent();
        int result = resultIntent.getIntExtra("result", 0);
        resultView = (TextView) findViewById(pritesh.patel.cyberpaths.tictactoe.R.id.result1);
        player1 = (TextView) findViewById(pritesh.patel.cyberpaths.tictactoe.R.id.player1score);
        player2 = (TextView) findViewById(pritesh.patel.cyberpaths.tictactoe.R.id.player2score);

        if (result == 1) {
            resultView.setText("Player 1 Wins");
            constants.p1 += 1;
        } else if (result == 2) {
            resultView.setText("Player 2 Wins");
            constants.p2 += 1;
        } else
            resultView.setText("DRAW!!!!!!");
        player1.setText(constants.p1 + "");
        player2.setText(constants.p2 + "");

    }


//    private void showInterstitial() {
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//        }
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu,menu);
//        return true;
//    }
@Override
public void onPause() {
    if (mAdView != null) {
        mAdView.pause();
    }
    super.onPause();
}

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed();
            Intent intent = new Intent(Result.this, Result.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
    public void newGame1(View view)
    {
        constants.p1=0;
        constants.p2=0;
        Intent newIntent = new Intent(this,newGame.class);
        startActivity(newIntent);
        finish();
    }

        public void play(View view) {
        Intent newIntent = new Intent(this,newGame.class);
        startActivity(newIntent);
        finish();
    }
}

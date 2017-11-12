package com.sidd.payments.paymentsantad.LoginSplash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.sidd.payments.paymentsantad.LoginSplash.LoadingTask.SplashLoading;
import com.sidd.payments.paymentsantad.LoginSplash.Login.Intermediate;
import com.sidd.payments.paymentsantad.LoginSplash.Login.Login;
import com.sidd.payments.paymentsantad.R;


/**
 * Created by siddh on 09-11-2017.
 */

public class SplashOnLoad extends Activity implements SplashLoading.LoadingTaskFinishedListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Show the splash screen
        setContentView(R.layout.splash_screeen);
        // Find the progress bar
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.activity_splash_progress_bar);
        // Start your loading
        new SplashLoading(progressBar, this).execute("www.google.co.uk"); // Pass in whatever you need a url is just an example we don't use it in this tutorial
    }

    @Override
    public void onTaskFinished() {
        completeSplash();
    }

    private void completeSplash(){
        startApp();
        finish(); // Don't forget to finish this Splash Activity so the user can't return to it!
    }

    private void startApp() {
        Intent intent = new Intent(SplashOnLoad.this, Intermediate.class);
        startActivity(intent);
    }

}

package com.sidd.payments.paymentsantad.LoginSplash.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.sidd.payments.paymentsantad.R;

import de.mrapp.android.dialog.ProgressDialog;
import de.mrapp.android.dialog.animation.RectangleRevealAnimation;

/**
 * Created by siddh on 09-11-2017.
 */

public class Intermediate extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate_activity);




        /*WizardDialog.Builder dialogBuilder = new WizardDialog.Builder(this);
        dialogBuilder.showHeader(true);
        dialogBuilder.setHeaderBackground(R.drawable.header_background);
        dialogBuilder.addFragment(R.string.signup_fragment_title, Signup.class, null);
        dialogBuilder.addFragment(R.string.mobile_email_fragment_title, MobileEmail.class, null);
        //dialogBuilder.addFragment(R.string.fragment3_title, Fragment3.class);
        dialogBuilder.setTabPosition(WizardDialog.TabPosition.PREFER_HEADER);
        dialogBuilder.enableTabLayout(true);
        dialogBuilder.enableSwipe(true);
        dialogBuilder.showButtonBar(true);
        WizardDialog dialog = dialogBuilder.create();
        dialog.show();*/

        ProgressDialog.Builder dialogBuilder = new ProgressDialog.Builder(this);
        RectangleRevealAnimation animation = new RectangleRevealAnimation.Builder(this).setX(0).setY(0).setWidth(0).setHeight(0).setDuration(1000L).create();
        dialogBuilder.showHeader(true);
        dialogBuilder.setHeaderBackground(R.drawable.header_background);
        dialogBuilder.setShowAnimation(animation);
        dialogBuilder.setTitle("Loading User Profile ");
        dialogBuilder.setMessage("Please Wait");
        dialogBuilder.setProgressBarPosition(ProgressDialog.ProgressBarPosition.LEFT);
       final ProgressDialog dialog = dialogBuilder.create();
        dialog.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public  void run() {
                //your code here
                dialog.dismiss();
                StartUserProfile();
            }
        }, 3000);


    }
void StartUserProfile()
{
    Intent intent = new Intent(this, UserProfileMain.class);
    startActivity(intent);
}

}

package id.co.passionit.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SplashscreenActivity extends AppCompatActivity {
    public static final int SPLASH_TIME = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        setContentView(R.layout.activity_splashscreen);

        TextView textViewAppName = (TextView) findViewById(R.id.textAppName);

        Typeface face= Typeface.createFromAsset(getAssets(), "WoodfordBournePRO-Light.otf");
        textViewAppName.setTypeface(face);

        final boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashscreenActivity.this, SignUpSignInActivity.class));
                finish();
            }
        }, SPLASH_TIME);
    }
}

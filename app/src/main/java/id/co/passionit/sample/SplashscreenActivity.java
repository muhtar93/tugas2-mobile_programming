package id.co.passionit.sample;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        TextView textViewAppName = (TextView) findViewById(R.id.textAppName);

        Typeface face= Typeface.createFromAsset(getAssets(), "WoodfordBournePRO-Light.otf");
        textViewAppName.setTypeface(face);
    }
}

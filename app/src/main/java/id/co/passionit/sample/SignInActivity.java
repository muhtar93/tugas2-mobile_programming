package id.co.passionit.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        setContentView(R.layout.activity_sign_in);

        TextView textViewAppName = (TextView) findViewById(R.id.textAppName);
        EditText editTextEmailOrFullName = (EditText) findViewById(R.id.editTextEmailOrFullName);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        Button btnSignIn = (Button) findViewById(R.id.btnSignIn);
        TextView textViewCreateNow = (TextView) findViewById(R.id.textViewCreateNow);
        TextView textViewDonHave = (TextView) findViewById(R.id.textViewDonHave);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "WoodfordBournePRO-Light.otf");
        Typeface typefaceBold = Typeface.createFromAsset(getAssets(), "WoodfordBournePRO-Ultra.otf");
        textViewAppName.setTypeface(typeface);
        editTextEmailOrFullName.setTypeface(typeface);
        editTextPassword.setTypeface(typeface);
        btnSignIn.setTypeface(typeface);
        textViewDonHave.setTypeface(typeface);
        textViewCreateNow.setTypeface(typefaceBold);

        textViewCreateNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignInActivity.this, "ouh", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

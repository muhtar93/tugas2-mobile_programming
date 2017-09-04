package id.co.passionit.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpSignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        setContentView(R.layout.activity_sign_up);


        TextView textViewAppName = (TextView) findViewById(R.id.textAppName);
        TextView textViewNote = (TextView) findViewById(R.id.textNote);
        Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
        Button btnSignIn = (Button) findViewById(R.id.btnSignIn);

        Typeface face= Typeface.createFromAsset(getAssets(), "WoodfordBournePRO-Light.otf");
        textViewAppName.setTypeface(face);
        textViewNote.setTypeface(face);
        btnSignUp.setTypeface(face);
        btnSignIn.setTypeface(face);


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpSignInActivity.this, SignUpActivity.class));
            }
        });

    }
}

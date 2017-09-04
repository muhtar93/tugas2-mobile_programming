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

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        setContentView(R.layout.activity_sign_up2);

        TextView textViewAppName = (TextView) findViewById(R.id.textAppName);
        TextView textViewAlready = (TextView) findViewById(R.id.textViewAlready);
        TextView textViewSignIn = (TextView) findViewById(R.id.textViewSignIn);
        EditText editTextFullName = (EditText) findViewById(R.id.editTextFullName);
        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
        Button btnFb = (Button) findViewById(R.id.btnFb);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "WoodfordBournePRO-Light.otf");
        Typeface typefaceBold = Typeface.createFromAsset(getAssets(), "WoodfordBournePRO-Ultra.otf");
        textViewAppName.setTypeface(typeface);
        textViewAlready.setTypeface(typeface);
        textViewSignIn.setTypeface(typefaceBold);
        editTextFullName.setTypeface(typeface);
        editTextEmail.setTypeface(typeface);
        editTextPassword.setTypeface(typeface);
        btnSignUp.setTypeface(typeface);
        btnFb.setTypeface(typeface);

        textViewSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
            }
        });
    }
}

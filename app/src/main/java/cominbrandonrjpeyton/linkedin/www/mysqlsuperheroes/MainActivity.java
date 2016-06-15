package cominbrandonrjpeyton.linkedin.www.mysqlsuperheroes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText CodenameET, PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CodenameET = (EditText)findViewById(R.id.et_codename);
        PasswordEt = (EditText)findViewById(R.id.et_password);
    }

    public void onLogin(View view) {
        String codename = CodenameET.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, codename, password);
    }

    public void openReg (View view) {
        startActivity(new Intent(this, Register.class));
    }
}

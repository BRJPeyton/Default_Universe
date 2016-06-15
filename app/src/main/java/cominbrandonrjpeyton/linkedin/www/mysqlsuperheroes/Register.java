package cominbrandonrjpeyton.linkedin.www.mysqlsuperheroes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name, surname, age, codename, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText)findViewById(R.id.name);
        surname = (EditText)findViewById(R.id.surname);
        age = (EditText)findViewById(R.id.age);
        codename = (EditText)findViewById(R.id.codename);
        password = (EditText)findViewById(R.id.password);
    }

    public void onReg (View view) {
        String str_name = name.getText().toString();
        String str_surname = surname.getText().toString();
        String str_age = age.getText().toString();
        String str_codename = codename.getText().toString();
        String str_password = password.getText().toString();
        String type = "register";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_name, str_surname, str_age, str_codename, str_password);
    }

}

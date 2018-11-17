package ucb.bo.edu.actividad11;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private View layoutPrincipal;
    private SessionManager session;
    private TextInputLayout txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txt = (TextInputLayout) findViewById(R.id.editarUsuario);
        session = new SessionManager(getApplicationContext());


    }

    public void mostrarUsuario(View view) {
        if (view.getId() == R.id.mostrarUsuario) {
            String x=txt.getEditText().getText().toString();
            session.saveUser(x);
            Intent i = new Intent(this, SecondActivity.class);
            startActivity(i);

        }
    }

}

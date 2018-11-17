package ucb.bo.edu.actividad11;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SecondActivity extends AppCompatActivity {

    private SessionManager sessionManager;
    private TextView txtSelectd;
    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.txtSelectd=(TextView) findViewById(R.id.txtSelected);
        sessionManager = new SessionManager(getApplicationContext());
        this.txtSelectd.setText(sessionManager.getUserName());

    }


}

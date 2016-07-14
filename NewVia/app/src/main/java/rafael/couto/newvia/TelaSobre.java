package rafael.couto.newvia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TelaSobre extends AppCompatActivity {

    private Button btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        inicarCampos();

        iniciarClicks();
    }//fecha onCreate
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void inicarCampos(){
        btnEmail = (Button) findViewById(R.id.btnEmail);
    }

    public void iniciarClicks(){
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(android.content.Intent.ACTION_SEND);
                String[] recipients = new String[]{getResources().getString(R.string.tvContato, "")};
                it.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
                it.putExtra(android.content.Intent.EXTRA_SUBJECT, R.string.solicitacao);
                it.putExtra(android.content.Intent.EXTRA_TEXT, R.string.insira);
                it.setType("message/rfc822");
                startActivity(Intent.createChooser(it, getString(R.string.send)));
            }
        });
    }
}//fecha Main

package rafael.couto.newvia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TelaAdm extends AppCompatActivity {

    private Button btnLigarAdm;
    private Button btnEmailAdm;
    private Button btnFace;
    private Button btnTwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        iniciarCampos();

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

    private void iniciarCampos(){
        btnLigarAdm = (Button) findViewById(R.id.btnLigarAdm);
        btnEmailAdm = (Button) findViewById(R.id.btnEmailAdm);
        btnFace = (Button) findViewById(R.id.btnFace);
        btnTwitter = (Button) findViewById(R.id.btnTwitter);
    }

    private void iniciarClicks(){
        btnLigarAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno="tel:05134662811";
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse(phno));
                startActivity(i);
            }
        });

        btnEmailAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(android.content.Intent.ACTION_SEND);
                String[] recipients = new String[]{getResources().getString(R.string.tvContatoAdm, "")};
                it.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
                it.putExtra(android.content.Intent.EXTRA_SUBJECT, R.string.tvAssuntoAdm);
                it.putExtra(android.content.Intent.EXTRA_TEXT, R.string.insira);
                it.setType("message/rfc822");
                startActivity(Intent.createChooser(it, getString(R.string.send)));
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri
                            .parse("fb://page/702228193172376/")));
                } catch (Exception e) {
                    //open play link in browser
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri
                            .parse("https://www.facebook.com/shoppingviaporcello")));
                }
            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri
                            .parse("twitter://ViaPorcello/")));
                } catch (Exception e) {
                    //open play link in browser
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri
                            .parse("https://twitter.com/ViaPorcello")));
                }
            }
        });
    }
}//fecha main

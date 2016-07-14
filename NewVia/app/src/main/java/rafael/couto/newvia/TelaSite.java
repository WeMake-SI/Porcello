package rafael.couto.newvia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TelaSite extends AppCompatActivity {

    private WebView wvSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_site);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        iniciarCampos();

        definirSite();
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
        wvSite = (WebView) findViewById(R.id.wvSite);
    }

    private void definirSite(){
        wvSite.getSettings().setJavaScriptEnabled(true);
        wvSite.getSettings().setUseWideViewPort(true);
        wvSite.getSettings().setBuiltInZoomControls(true);
        wvSite.setWebViewClient(new WebViewClient());
        wvSite.loadUrl("http://viaporcello.com.br/");
    }
}//fecha Main

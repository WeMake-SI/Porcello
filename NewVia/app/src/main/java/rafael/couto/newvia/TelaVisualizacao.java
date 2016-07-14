package rafael.couto.newvia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class TelaVisualizacao extends AppCompatActivity {

    private ImageView ivEmpresa;
    private TextView tvNomeView;
    private TextView tvDescricaoView;
    private TextView tvCategoriaView;
    private TextView tvAtendimentoView;
    private Button btnLigar;

    private Loja l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_visualizacao);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        iniciarCampos();

        catchExtra();

        buscarImagens();

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

    public void iniciarCampos(){
        ivEmpresa = (ImageView) findViewById(R.id.ivEmpresa);
        tvNomeView = (TextView) findViewById(R.id.tvNomeView);
        tvDescricaoView = (TextView) findViewById(R.id.tvDescricaoView);
        tvCategoriaView = (TextView) findViewById(R.id.tvCategoriaView);
        tvAtendimentoView = (TextView) findViewById(R.id.tvAtendimentoView);
        btnLigar = (Button) findViewById(R.id.btnLigar);
    }

    public void catchExtra(){
        l = (Loja) getIntent().getSerializableExtra("loja");
        tvNomeView.setText(l.getNome());
        tvNomeView.setVisibility(View.INVISIBLE);
        tvDescricaoView.setText(l.getDescricao());
        tvCategoriaView.setText(l.getCategoria());
        tvAtendimentoView.setText(l.getAtendimento());
    }

    public void iniciarClicks(){
        btnLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno="tel:"+l.getContato();
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse(phno));
                startActivity(i);
            }
        });
    }

    public void buscarImagens(){
        if(tvNomeView.getText().toString().equalsIgnoreCase("Amo Bijuterias")) {
            Picasso.with(this)
                    .load("http://imgur.com/mnTrVpo.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Banana Apples")){
            Picasso.with(this)
                    .load("http://imgur.com/dE5P8kP.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Bola Cheia")){
            Picasso.with(this)
                    .load("http://imgur.com/G9OOPpw.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Busca Pé")){
            Picasso.with(this)
                    .load("http://imgur.com/2OXL8hr.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Café Café")){
            Picasso.with(this)
                    .load("http://imgur.com/4aU6LM9.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Cheias de Charme")){
            Picasso.with(this)
                    .load("http://imgur.com/dwbaU4P.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("China City")){
            Picasso.with(this)
                    .load("http://imgur.com/49MTKn7.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Conceito Z")){
            Picasso.with(this)
                    .load("http://imgur.com/UVDQbCX.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Confraria do Lanche")){
            Picasso.with(this)
                    .load("http://imgur.com/Sg5OKTO.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Deli Noni")){
            Picasso.with(this)
                    .load("http://imgur.com/t8fmv54.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Dequi Side")){
            Picasso.with(this)
                    .load("http://imgur.com/VkkCBUm.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Elaine")){
            Picasso.with(this)
                    .load("http://imgur.com/y7FtpJ9.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Estilo & Cia.")){
            Picasso.with(this)
                    .load("http://imgur.com/c8DRo2u.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Excel")){
            Picasso.with(this)
                    .load("http://imgur.com/VbrgJTb.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Gabriel")) {
            Picasso.with(this)
                    .load("http://imgur.com/0UBr50z.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Gallery")){
            Picasso.with(this)
                    .load("http://imgur.com/ZcHNMJ9.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Info House")){
            Picasso.with(this)
                    .load("http://imgur.com/nSAD8Od.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Japesca")){
            Picasso.with(this)
                    .load("http://imgur.com/vUaNp6o.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Joara")){
            Picasso.with(this)
                    .load("http://imgur.com/KOkKAwU.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Los Chiapas")){
            Picasso.with(this)
                    .load("http://imgur.com/5b6TF4X.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Luna Bella")){
            Picasso.with(this)
                    .load("http://imgur.com/zzgK5Il.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Mapa da Malha")){
            Picasso.with(this)
                    .load("http://imgur.com/d46qwhn.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Meia & Cia.")){
            Picasso.with(this)
                    .load("http://imgur.com/xj6V9s1.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("O Boticário")) {
            Picasso.with(this)
                    .load("http://imgur.com/tX6HfYl.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Olitse")){
            Picasso.with(this)
                    .load("http://imgur.com/5BQUfFH.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Pastel Center")){
            Picasso.with(this)
                    .load("http://imgur.com/OomNwol.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Pizzolotto")){
            Picasso.with(this)
                    .load("http://imgur.com/5m4LTVz.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Planeta Surf")){
            Picasso.with(this)
                    .load("http://imgur.com/ZsYp8qb.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Ramlig")){
            Picasso.with(this)
                    .load("http://imgur.com/VwvTm3q.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Rede 10")) {
            Picasso.with(this)
                    .load("http://imgur.com/jpMZ701.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Redeprint")){
            Picasso.with(this)
                    .load("http://imgur.com/hqvRC1v.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Rosa Moschetta")){
            Picasso.with(this)
                    .load("http://imgur.com/gjpLPzx.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Stein")){
            Picasso.with(this)
                    .load("http://imgur.com/FCP6Ev0.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Studio M")) {
            Picasso.with(this)
                    .load("http://imgur.com/se0SzU3.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Summer Glasses")){
            Picasso.with(this)
                    .load("http://imgur.com/SV9gB59.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Talismã")){
            Picasso.with(this)
                    .load("http://imgur.com/GeaDzJq.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Titton")){
            Picasso.with(this)
                    .load("http://imgur.com/qJY34VO.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else if(tvNomeView.getText().toString().equalsIgnoreCase("Toque Final")){
            Picasso.with(this)
                    .load("http://imgur.com/qrfHm0u.jpg")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }else{
            Picasso.with(this)
                    .load("http://imgur.com/NdSH61Q.png")
                    .placeholder(R.drawable.load)
                    .error(R.drawable.error)
                    .into(ivEmpresa);
        }
    }
}//fecha Main

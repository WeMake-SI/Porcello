package rafael.couto.newvia;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TelaLojas extends AppCompatActivity {

    private Button btn01;
    private Button btn02;
    private Button btn03;
    private Button btn05;
    private Button btn06;
    private Button btn07;
    private Button btn08;
    private Button btn09;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;
    private Button btn23;
    private Button btn24;
    private Button btn25;
    private Button btn26;
    private Button btn27;
    private Button btn28;
    private Button btn29;
    private Button btn30;
    private Button btn31;
    private Button btn32;
    private Button btn33;
    private Button btn34;
    private Button btn35;
    private Button btn36;
    private Button btn37;
    private Button btn38;
    private Button btn39;
    private Button btn40;
    private Button btn41;

    private LinearLayout layoutLojas;

    private Loja l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lojas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        iniciarCampos();

        catchExtra();

        definirVisibilidade();

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

    private void catchExtra(){
        l = (Loja) getIntent().getSerializableExtra("loja");
    }

    private void iniciarCampos(){
        btn01 = (Button) findViewById(R.id.btn01);
        btn02 = (Button) findViewById(R.id.btn02);
        btn03 = (Button) findViewById(R.id.btn03);
        btn05 = (Button) findViewById(R.id.btn05);
        btn06 = (Button) findViewById(R.id.btn06);
        btn07 = (Button) findViewById(R.id.btn07);
        btn08 = (Button) findViewById(R.id.btn08);
        btn09 = (Button) findViewById(R.id.btn09);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        btn19 = (Button) findViewById(R.id.btn19);
        btn20 = (Button) findViewById(R.id.btn20);
        btn21 = (Button) findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn24 = (Button) findViewById(R.id.btn24);
        btn25 = (Button) findViewById(R.id.btn25);
        btn26 = (Button) findViewById(R.id.btn26);
        btn27 = (Button) findViewById(R.id.btn27);
        btn28 = (Button) findViewById(R.id.btn28);
        btn29 = (Button) findViewById(R.id.btn29);
        btn30 = (Button) findViewById(R.id.btn30);
        btn31 = (Button) findViewById(R.id.btn31);
        btn32 = (Button) findViewById(R.id.btn32);
        btn33 = (Button) findViewById(R.id.btn33);
        btn34 = (Button) findViewById(R.id.btn34);
        btn35 = (Button) findViewById(R.id.btn35);
        btn36 = (Button) findViewById(R.id.btn36);
        btn37 = (Button) findViewById(R.id.btn37);
        btn38 = (Button) findViewById(R.id.btn38);
        btn39 = (Button) findViewById(R.id.btn39);
        btn40 = (Button) findViewById(R.id.btn40);
        btn41 = (Button) findViewById(R.id.btn41);

        layoutLojas = (LinearLayout) findViewById(R.id.layoutLojas);
    }

    private void iniciarClicks(){
        //onClick 01 - 10
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeAmo));
                l.setDescricao(getString(R.string.descAmo));
                l.setCategoria(getString(R.string.aces));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contAmo));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeBanana));
                l.setDescricao(getString(R.string.descBanana));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contBanana));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeBola));
                l.setDescricao(getString(R.string.descBola));
                l.setCategoria(getString(R.string.esp));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contBola));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeBusca));
                l.setDescricao(getString(R.string.descBusca));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contBusca));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeCafe));
                l.setDescricao(getString(R.string.descCafe));
                l.setCategoria(getString(R.string.alim));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contCafe));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeCheias));
                l.setDescricao(getString(R.string.descRoupas));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contCheias));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeChina));
                l.setDescricao(getString(R.string.descChina));
                l.setCategoria(getString(R.string.alim));
                l.setAtendimento(getString(R.string.atendRest));
                l.setContato(getString(R.string.contChina));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeConceito));
                l.setDescricao(getString(R.string.descConceito));
                l.setCategoria(getString(R.string.salao));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contConceito));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeConfraria));
                l.setDescricao(getString(R.string.descConfraria));
                l.setCategoria(getString(R.string.alim));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contConfraria));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        //onClick 11 - 20
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeDeli));
                l.setDescricao(getString(R.string.descDeli));
                l.setCategoria(getString(R.string.alim));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contDeli));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeDequi));
                l.setDescricao(getString(R.string.descRoupas));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contDequi));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeElaine));
                l.setDescricao(getString(R.string.descRoupas));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contElaine));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeEstilo));
                l.setDescricao(getString(R.string.descEstilo));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contEstilo));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeExcel));
                l.setDescricao(getString(R.string.descExcel));
                l.setCategoria(getString(R.string.info));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contExcel));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeGabriel));
                l.setDescricao(getString(R.string.descOtica));
                l.setCategoria(getString(R.string.ot));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contGabriel));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeGallery));
                l.setDescricao(getString(R.string.descGallery));
                l.setCategoria(getString(R.string.tab));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contGallery));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeInfo));
                l.setDescricao(getString(R.string.descInfo));
                l.setCategoria(getString(R.string.info));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contInfo));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeJapesca));
                l.setDescricao(getString(R.string.descJapesca));
                l.setCategoria(getString(R.string.alim));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contJapesca));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        //onClick 21 - 30
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeJoara));
                l.setDescricao(getString(R.string.descJoara));
                l.setCategoria(getString(R.string.flor));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contJoara));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeChiapas));
                l.setDescricao(getString(R.string.descChiapas));
                l.setCategoria(getString(R.string.alim));
                l.setAtendimento(getString(R.string.atendRest));
                l.setContato(getString(R.string.contChiapas));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeLuna));
                l.setDescricao(getString(R.string.descLuna));
                l.setCategoria(getString(R.string.sap));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contLuna));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeMapa));
                l.setDescricao(getString(R.string.descMapa));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contMapa));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeMeia));
                l.setDescricao(getString(R.string.descMeia));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contMeia));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeBoticario));
                l.setDescricao(getString(R.string.descBoticario));
                l.setCategoria(getString(R.string.perf));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contBoticario));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeOlitse));
                l.setDescricao(getString(R.string.descOlitse));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contOlitse));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomePastel));
                l.setDescricao(getString(R.string.descPastel));
                l.setCategoria(getString(R.string.alim));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contPastel));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomePizzolotto));
                l.setDescricao(getString(R.string.descPizzolotto));
                l.setCategoria(getString(R.string.ot));
                l.setAtendimento(getString(R.string.atendPizzolotto));
                l.setContato(getString(R.string.contPizzolotto));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomePlaneta));
                l.setDescricao(getString(R.string.descPlaneta));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contPlaneta));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        //onClick 31 - 41
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeRamlig));
                l.setDescricao(getString(R.string.descOtica));
                l.setCategoria(getString(R.string.ot));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contRamlig));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeRede));
                l.setDescricao(getString(R.string.descRede));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contRede));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeRedeprint));
                l.setDescricao(getString(R.string.descRedeprint));
                l.setCategoria(getString(R.string.graf));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contRedeprint));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeRosa));
                l.setDescricao(getString(R.string.descRosa));
                l.setCategoria(getString(R.string.mani));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contRosa));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeStein));
                l.setDescricao(getString(R.string.descStein));
                l.setCategoria(getString(R.string.aces));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contStein));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeStudio));
                l.setDescricao(getString(R.string.descStudio));
                l.setCategoria(getString(R.string.sap));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contStudio));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeSummer));
                l.setDescricao(getString(R.string.descSummer));
                l.setCategoria(getString(R.string.aces));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contSummer));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeTalisma));
                l.setDescricao(getString(R.string.descTalisma));
                l.setCategoria(getString(R.string.livr));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contTalisma));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeTitton));
                l.setDescricao(getString(R.string.descTitton));
                l.setCategoria(getString(R.string.vest));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contTitton));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeToque));
                l.setDescricao(getString(R.string.descToque));
                l.setCategoria(getString(R.string.aces));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contToque));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setNome(getString(R.string.nomeBeauty));
                l.setDescricao(getString(R.string.descBeauty));
                l.setCategoria(getString(R.string.salao));
                l.setAtendimento(getString(R.string.atendimento));
                l.setContato(getString(R.string.contBeauty));

                Intent it = new Intent(TelaLojas.this, TelaVisualizacao.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });
    }

    private void definirVisibilidade(){
        layoutLojas.removeAllViews();

        if(l.getSelecao().equalsIgnoreCase("aces")){
            layoutLojas.addView(btn01);
            layoutLojas.addView(btn35);
            layoutLojas.addView(btn37);
            layoutLojas.addView(btn40);
            if(Build.VERSION.SDK_INT<21) {
                btn40.setBackground(getResources().getDrawable(R.drawable.buttonbglast));
            }else{
                btn40.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonbglast));
            }
        }else if(l.getSelecao().equalsIgnoreCase("alim")){
            layoutLojas.addView(btn06);
            layoutLojas.addView(btn08);
            layoutLojas.addView(btn10);
            layoutLojas.addView(btn11);
            layoutLojas.addView(btn20);
            layoutLojas.addView(btn22);
            layoutLojas.addView(btn28);
            if(Build.VERSION.SDK_INT<21) {
                btn28.setBackground(getResources().getDrawable(R.drawable.buttonbglast));
            }else{
                btn28.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonbglast));
            }
        }else if(l.getSelecao().equalsIgnoreCase("inf")){
            layoutLojas.addView(btn15);
            layoutLojas.addView(btn19);
            if(Build.VERSION.SDK_INT<21) {
                btn19.setBackground(getResources().getDrawable(R.drawable.buttonbglast));
            }else{
                btn19.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonbglast));
            }
        }else if(l.getSelecao().equalsIgnoreCase("otica")){
            layoutLojas.addView(btn16);
            layoutLojas.addView(btn29);
            layoutLojas.addView(btn31);
            if(Build.VERSION.SDK_INT<21) {
                btn31.setBackground(getResources().getDrawable(R.drawable.buttonbglast));
            }else{
                btn31.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonbglast));
            }
        }else if(l.getSelecao().equalsIgnoreCase("salao")){
            layoutLojas.addView(btn09);
            layoutLojas.addView(btn41);
            if(Build.VERSION.SDK_INT<21) {
                btn41.setBackground(getResources().getDrawable(R.drawable.buttonbglast));
            }else{
                btn41.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonbglast));
            }
        }else if(l.getSelecao().equalsIgnoreCase("sap")){
            layoutLojas.addView(btn23);
            layoutLojas.addView(btn32);
            layoutLojas.addView(btn36);
            if(Build.VERSION.SDK_INT<21) {
                btn36.setBackground(getResources().getDrawable(R.drawable.buttonbglast));
            }else{
                btn36.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonbglast));
            }
        }else if(l.getSelecao().equalsIgnoreCase("vest")){
            layoutLojas.addView(btn02);
            layoutLojas.addView(btn05);
            layoutLojas.addView(btn07);
            layoutLojas.addView(btn12);
            layoutLojas.addView(btn13);
            layoutLojas.addView(btn14);
            layoutLojas.addView(btn24);
            layoutLojas.addView(btn25);
            layoutLojas.addView(btn27);
            layoutLojas.addView(btn30);
            layoutLojas.addView(btn32);
            layoutLojas.addView(btn39);
            if(Build.VERSION.SDK_INT<21) {
                btn39.setBackground(getResources().getDrawable(R.drawable.buttonbglast));
            }else{
                btn39.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonbglast));
            }
        }else{
            layoutLojas.addView(btn01);
            layoutLojas.addView(btn02);
            layoutLojas.addView(btn03);
            layoutLojas.addView(btn05);
            layoutLojas.addView(btn06);
            layoutLojas.addView(btn07);
            layoutLojas.addView(btn08);
            layoutLojas.addView(btn09);
            layoutLojas.addView(btn10);
            layoutLojas.addView(btn11);
            layoutLojas.addView(btn12);
            layoutLojas.addView(btn13);
            layoutLojas.addView(btn14);
            layoutLojas.addView(btn15);
            layoutLojas.addView(btn16);
            layoutLojas.addView(btn17);
            layoutLojas.addView(btn19);
            layoutLojas.addView(btn20);
            layoutLojas.addView(btn21);
            layoutLojas.addView(btn22);
            layoutLojas.addView(btn23);
            layoutLojas.addView(btn24);
            layoutLojas.addView(btn25);
            layoutLojas.addView(btn26);
            layoutLojas.addView(btn27);
            layoutLojas.addView(btn28);
            layoutLojas.addView(btn29);
            layoutLojas.addView(btn30);
            layoutLojas.addView(btn31);
            layoutLojas.addView(btn32);
            layoutLojas.addView(btn33);
            layoutLojas.addView(btn34);
            layoutLojas.addView(btn35);
            layoutLojas.addView(btn36);
            layoutLojas.addView(btn37);
            layoutLojas.addView(btn38);
            layoutLojas.addView(btn39);
            layoutLojas.addView(btn40);
            layoutLojas.addView(btn41);
        }
    }
}//fecha main

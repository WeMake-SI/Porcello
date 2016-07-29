package rafael.couto.newvia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TelaLojas extends AppCompatActivity {

    private ListView listView;
    private AdapterLoja adapterLoja;
    private ArrayList<Loja> lojas;
    private String filtro;

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lojas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        AQUI ESSE AQUI OOOHH
        if(savedInstanceState != null)
        {
            filtro = savedInstanceState.getString("FILTRO");
        }

        Log.i("FILTRO", "Passou " + filtro);


        listView = (ListView) findViewById(R.id.list_view);

        adapterLoja = new AdapterLoja(getBaseContext(), criarArrayList());

        listView.setAdapter(adapterLoja);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Loja loja = (Loja) listView.getItemAtPosition(position);

                Intent intent = new Intent(TelaLojas.this, TelaVisualizacao.class);
                intent.putExtra("loja", loja);

                startActivity(intent);

                Log.i("FILTRO", "BLA BLA" + filtro);
            }
        });
    }

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


    private ArrayList<Loja> criarArrayList(){
        //TODO: Mudar URL das imagens no ultimo parametro

        Loja amo = new Loja(getString(R.string.nomeAmo),
                            getString(R.string.descAmo),
                            getString(R.string.aces),
                            getString(R.string.atendimento),
                            getString(R.string.open_hour),
                            getString(R.string.close_hour),
                            getString(R.string.contAmo),
                            null,
                            "dE5P8kP.png");

        Loja banana = new Loja(getString(R.string.nomeBanana),
                               getString(R.string.descBanana),
                               getString(R.string.vest),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contBanana),
                               null,
                               null);

        Loja beauty = new Loja(getString(R.string.nomeBeauty),
                               getString(R.string.descBeauty),
                               getString(R.string.salao),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contBeauty),
                               null,
                               null);

        Loja bola = new Loja(getString(R.string.nomeBola),
                             getString(R.string.descBola),
                             getString(R.string.alim),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contBola),
                             null,
                             null);

        Loja boticario = new Loja(getString(R.string.nomeBoticario),
                                  getString(R.string.descBoticario),
                                  getString(R.string.perf),
                                  getString(R.string.atendimento),
                                  getString(R.string.open_hour),
                                  getString(R.string.close_hour),
                                  getString(R.string.contBoticario),
                                  null,
                                  null);

        Loja busca = new Loja(getString(R.string.nomeBusca),
                              getString(R.string.descBusca),
                              getString(R.string.vest),
                              getString(R.string.atendimento),
                              getString(R.string.open_hour),
                              getString(R.string.close_hour),
                              getString(R.string.contBusca),
                              null,
                              null);

        Loja cafe = new Loja(getString(R.string.nomeCafe),
                             getString(R.string.descCafe),
                             getString(R.string.alim),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contCafe),
                             null,
                             null);

        Loja cheias = new Loja(getString(R.string.nomeCheias),
                               getString(R.string.descCheias),
                               getString(R.string.vest),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contCheias),
                               null,
                               null);

        Loja chiapas = new Loja(getString(R.string.nomeChiapas),
                                getString(R.string.descChiapas),
                                getString(R.string.alim),
                                getString(R.string.atendimento),
                                getString(R.string.open_hour),
                                getString(R.string.close_hour),
                                getString(R.string.contChiapas),
                                null,
                                null);

        Loja china = new Loja(getString(R.string.nomeChina),
                              getString(R.string.descChina),
                              getString(R.string.alim),
                              getString(R.string.atendimento),
                              getString(R.string.open_hour),
                              getString(R.string.close_hour),
                              getString(R.string.contChina),
                              null,
                              null);

        Loja conceito = new Loja(getString(R.string.nomeConceito),
                                 getString(R.string.descConceito),
                                 getString(R.string.salao),
                                 getString(R.string.atendimento),
                                 getString(R.string.open_hour),
                                 getString(R.string.close_hour),
                                 getString(R.string.contConceito),
                                 null,
                                 null);

        Loja confraria = new Loja(getString(R.string.nomeConfraria),
                                  getString(R.string.descConfraria),
                                  getString(R.string.alim),
                                  getString(R.string.atendimento),
                                  getString(R.string.open_hour),
                                  getString(R.string.close_hour),
                                  getString(R.string.contConfraria),
                                  null,
                                  null);

        Loja deli = new Loja(getString(R.string.nomeDeli),
                             getString(R.string.descDeli),
                             getString(R.string.alim),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contDeli),
                             null,
                             null);

        Loja dequi = new Loja(getString(R.string.nomeDequi),
                              getString(R.string.descDequi),
                              getString(R.string.esp),
                              getString(R.string.atendimento),
                              getString(R.string.open_hour),
                              getString(R.string.close_hour),
                              getString(R.string.contDequi),
                              null,
                              null);

        Loja elaine = new Loja(getString(R.string.nomeElaine),
                               getString(R.string.descElaine),
                               getString(R.string.vest),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contElaine),
                               null,
                               null);

        Loja estilo = new Loja(getString(R.string.nomeEstilo),
                               getString(R.string.descEstilo),
                               getString(R.string.vest),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contEstilo),
                               null,
                               null);

        Loja excel = new Loja(getString(R.string.nomeExcel),
                              getString(R.string.descExcel),
                              getString(R.string.info),
                              getString(R.string.atendimento),
                              getString(R.string.open_hour),
                              getString(R.string.close_hour),
                              getString(R.string.contExcel),
                              null,
                              null);

        Loja gabriel = new Loja(getString(R.string.nomeGabriel),
                                getString(R.string.descGabriel),
                                getString(R.string.ot),
                                getString(R.string.atendimento),
                                getString(R.string.open_hour),
                                getString(R.string.close_hour),
                                getString(R.string.contGabriel),
                                null,
                                null);

        Loja gallery = new Loja(getString(R.string.nomeGallery),
                                getString(R.string.descGallery),
                                getString(R.string.tab),
                                getString(R.string.atendimento),
                                getString(R.string.open_hour),
                                getString(R.string.close_hour),
                                getString(R.string.contGallery),
                                null,
                                null);

        Loja info = new Loja(getString(R.string.nomeInfo),
                             getString(R.string.descInfo),
                             getString(R.string.info),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contInfo),
                             null,
                             null);

        Loja japesca = new Loja(getString(R.string.nomeJapesca),
                                getString(R.string.descJapesca),
                                getString(R.string.alim),
                                getString(R.string.atendimento),
                                getString(R.string.open_hour),
                                getString(R.string.close_hour),
                                getString(R.string.contJapesca),
                                null,
                                null);

        Loja joara = new Loja(getString(R.string.nomeJoara),
                              getString(R.string.descJoara),
                              getString(R.string.flor),
                              getString(R.string.atendimento),
                              getString(R.string.open_hour),
                              getString(R.string.close_hour),
                              getString(R.string.contJoara),
                              null,
                              null);

        Loja luna = new Loja(getString(R.string.nomeLuna),
                             getString(R.string.descLuna),
                             getString(R.string.sap),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contLuna),
                             null,
                             null);

        Loja mapa = new Loja(getString(R.string.nomeMapa),
                             getString(R.string.descMapa),
                             getString(R.string.vest),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contMapa),
                             null,
                             null);

        Loja meia = new Loja(getString(R.string.nomeMeia),
                             getString(R.string.descMeia),
                             getString(R.string.vest),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contMeia),
                             null,
                             null);

        Loja olitse = new Loja(getString(R.string.nomeOlitse),
                               getString(R.string.descOlitse),
                               getString(R.string.vest),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contOlitse),
                               null,
                               null);

        Loja pastel = new Loja(getString(R.string.nomePastel),
                               getString(R.string.descPastel),
                               getString(R.string.alim),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contPastel),
                               null,
                               null);

        Loja pizzolotto = new Loja(getString(R.string.nomePizzolotto),
                                   getString(R.string.descPizzolotto),
                                   getString(R.string.ot),
                                   getString(R.string.atendimento),
                                   getString(R.string.open_hour),
                                   getString(R.string.close_hour),
                                   getString(R.string.contPizzolotto),
                                   null,
                                   null);

        Loja planeta = new Loja(getString(R.string.nomePlaneta),
                                getString(R.string.descPlaneta),
                                getString(R.string.esp),
                                getString(R.string.atendimento),
                                getString(R.string.open_hour),
                                getString(R.string.close_hour),
                                getString(R.string.contPlaneta),
                                null,
                                null);

        Loja ramlig = new Loja(getString(R.string.nomeRamlig),
                               getString(R.string.descRamlig),
                               getString(R.string.ot),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contRamlig),
                               null,
                               null);

        Loja rede = new Loja(getString(R.string.nomeRede),
                             getString(R.string.descRede),
                             getString(R.string.tel),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contRede),
                             null,
                             null);

        Loja redeprint = new Loja(getString(R.string.nomeRedeprint),
                                  getString(R.string.descRedeprint),
                                  getString(R.string.graf),
                                  getString(R.string.atendimento),
                                  getString(R.string.open_hour),
                                  getString(R.string.close_hour),
                                  getString(R.string.contRedeprint),
                                  null,
                                  null);

        Loja rosa = new Loja(getString(R.string.nomeRosa),
                             getString(R.string.descRosa),
                             getString(R.string.mani),
                             getString(R.string.atendimento),
                             getString(R.string.open_hour),
                             getString(R.string.close_hour),
                             getString(R.string.contRosa),
                             null,
                             null);

        Loja stein = new Loja(getString(R.string.nomeStein),
                              getString(R.string.descStein),
                              getString(R.string.aces),
                              getString(R.string.atendimento),
                              getString(R.string.open_hour),
                              getString(R.string.close_hour),
                              getString(R.string.contStein),
                              null,
                              null);

        Loja studio = new Loja(getString(R.string.nomeStudio),
                               getString(R.string.descStudio),
                               getString(R.string.sap),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contStudio),
                               null,
                               null);

        Loja summer = new Loja(getString(R.string.nomeSummer),
                               getString(R.string.descSummer),
                               getString(R.string.aces),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contSummer),
                               null,
                               null);

        Loja talisma = new Loja(getString(R.string.nomeTalisma),
                                getString(R.string.descTalisma),
                                getString(R.string.livr),
                                getString(R.string.atendimento),
                                getString(R.string.open_hour),
                                getString(R.string.close_hour),
                                getString(R.string.contTalisma),
                                null,
                                null);

        Loja titton = new Loja(getString(R.string.nomeTitton),
                               getString(R.string.descTitton),
                               getString(R.string.vest),
                               getString(R.string.atendimento),
                               getString(R.string.open_hour),
                               getString(R.string.close_hour),
                               getString(R.string.contTitton),
                               null,
                               null);

        Loja toque = new Loja(getString(R.string.nomeToque),
                              getString(R.string.descToque),
                              getString(R.string.aces),
                              getString(R.string.atendimento),
                              getString(R.string.open_hour),
                              getString(R.string.close_hour),
                              getString(R.string.contToque),
                              null,
                              null);

        lojas = new ArrayList<>();

        lojas.add(amo);
        lojas.add(banana);
        lojas.add(beauty);
        lojas.add(bola);
        lojas.add(boticario);
        lojas.add(busca);
        lojas.add(cafe);
        lojas.add(cheias);
        lojas.add(chiapas);
        lojas.add(china);
        lojas.add(conceito);
        lojas.add(confraria);
        lojas.add(deli);
        lojas.add(dequi);
        lojas.add(elaine);
        lojas.add(estilo);
        lojas.add(excel);
        lojas.add(gabriel);
        lojas.add(gallery);
        lojas.add(info);
        lojas.add(japesca);
        lojas.add(joara);
        lojas.add(luna);
        lojas.add(mapa);
        lojas.add(meia);
        lojas.add(olitse);
        lojas.add(pastel);
        lojas.add(pizzolotto);
        lojas.add(planeta);
        lojas.add(ramlig);
        lojas.add(rede);
        lojas.add(redeprint);
        lojas.add(rosa);
        lojas.add(stein);
        lojas.add(studio);
        lojas.add(summer);
        lojas.add(talisma);
        lojas.add(titton);
        lojas.add(toque);

        filtro = getIntent().getStringExtra("filtro");

        if(filtro != null)
        {
            ArrayList<Loja> filtroLojas = new ArrayList<>();

            for(int i = 0; i < lojas.size(); i++ )
            {
                if(lojas.get(i).getCategoria().equalsIgnoreCase(filtro)) filtroLojas.add(lojas.get(i));
            }
            return filtroLojas;
        }

        return lojas;
    }
}
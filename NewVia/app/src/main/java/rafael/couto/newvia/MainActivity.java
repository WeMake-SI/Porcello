package rafael.couto.newvia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MainActivity extends AppCompatActivity {

    private Drawer result = null;

    private Button btnLojas;
    private Button btnMapa;
    private Button btnSite;

    private Loja l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iniciarCampos();

        //Navigation Drawer
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.via2)
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        //Handle Toolbar
        result = new DrawerBuilder()
                .withSelectedItem(-1)
                .withActivity(this)
                .withAccountHeader(headerResult)
                .withToolbar(toolbar)
                .withSavedInstance(savedInstanceState)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.inicio).withIdentifier(0).withIcon(R.drawable.home),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.aces).withIdentifier(1).withIcon(R.drawable.accessories),
                        new PrimaryDrawerItem().withName(R.string.alim).withIdentifier(2).withIcon(R.drawable.food),
                        new PrimaryDrawerItem().withName(R.string.esp).withIdentifier(3).withIcon(R.drawable.sport),
                        new PrimaryDrawerItem().withName(R.string.flor).withIdentifier(4).withIcon(R.drawable.flower),
                        new PrimaryDrawerItem().withName(R.string.graf).withIdentifier(5).withIcon(R.drawable.graphic),
                        new PrimaryDrawerItem().withName(R.string.info).withIdentifier(6).withIcon(R.drawable.computer),
                        new PrimaryDrawerItem().withName(R.string.livr).withIdentifier(8).withIcon(R.drawable.book),
                        new PrimaryDrawerItem().withName(R.string.mani).withIdentifier(9).withIcon(R.drawable.medicine),
                        new PrimaryDrawerItem().withName(R.string.ot).withIdentifier(10).withIcon(R.drawable.glasses),
                        new PrimaryDrawerItem().withName(R.string.perf).withIdentifier(11).withIcon(R.drawable.perfume),
                        new PrimaryDrawerItem().withName(R.string.salao).withIdentifier(12).withIcon(R.drawable.salon),
                        new PrimaryDrawerItem().withName(R.string.sap).withIdentifier(13).withIcon(R.drawable.shoe),
                        new PrimaryDrawerItem().withName(R.string.tab).withIdentifier(14).withIcon(R.drawable.magazine),
                        new PrimaryDrawerItem().withName(R.string.tel).withIdentifier(15).withIcon(R.drawable.phone),
                        new PrimaryDrawerItem().withName(R.string.vest).withIdentifier(16).withIcon(R.drawable.clothes),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.adm).withIdentifier(19).withIcon(R.drawable.adm),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.title_activity_tela_sobre).withIdentifier(17).withIcon(R.drawable.logowe),
                        new PrimaryDrawerItem().withName(R.string.sair).withIdentifier(18).withIcon(R.drawable.sair)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(
                            View view,
                            int position,
                            IDrawerItem drawerItem) {
                        switch (drawerItem.getIdentifier()) {
                            case 0:
                                result.closeDrawer();
                                break;
                            case 1:
                                Intent itAcessorio = new Intent(MainActivity.this, TelaLojas.class);
                                itAcessorio.putExtra("filtro", getString(R.string.aces));
                                startActivity(itAcessorio);
                                break;
                            case 2:
                                Intent itAlim = new Intent(MainActivity.this, TelaLojas.class);
                                itAlim.putExtra("filtro", getString(R.string.alim));
                                startActivity(itAlim);
                                break;
                            case 3:
                                Intent itEsportes = new Intent(MainActivity.this, TelaLojas.class);
                                itEsportes.putExtra("filtro", getString(R.string.esp));
                                startActivity(itEsportes);
                                break;
                            case 4:
                                Intent itFloricultura = new Intent(MainActivity.this, TelaLojas.class);
                                itFloricultura.putExtra("filtro", getString(R.string.flor));
                                startActivity(itFloricultura);
                                break;
                            case 5:
                                Intent itGrafica = new Intent(MainActivity.this, TelaLojas.class);
                                itGrafica.putExtra("filtro", getString(R.string.graf));
                                startActivity(itGrafica);
                                break;
                            case 6:
                                Intent itInf = new Intent(MainActivity.this, TelaLojas.class);
                                itInf.putExtra("filtro", getString(R.string.info));
                                startActivity(itInf);
                                break;
                            case 8:
                                Intent itLivraria = new Intent(MainActivity.this, TelaLojas.class);
                                itLivraria.putExtra("filtro", getString(R.string.livr));
                                startActivity(itLivraria);
                                break;
                            case 9:
                                Intent itFarmacia = new Intent(MainActivity.this, TelaLojas.class);
                                itFarmacia.putExtra("filtro", getString(R.string.mani));
                                startActivity(itFarmacia);
                                break;
                            case 10:
                                Intent itOtica = new Intent(MainActivity.this, TelaLojas.class);
                                itOtica.putExtra("filtro", getString(R.string.ot));
                                startActivity(itOtica);
                                break;
                            case 11:
                                Intent itPerfume = new Intent(MainActivity.this, TelaLojas.class);
                                itPerfume.putExtra("filtro", getString(R.string.perf));
                                startActivity(itPerfume);
                                break;
                            case 12:
                                Intent itSalao = new Intent(MainActivity.this, TelaLojas.class);
                                itSalao.putExtra("filtro", getString(R.string.salao));
                                startActivity(itSalao);
                                break;
                            case 13:
                                Intent itSap = new Intent(MainActivity.this, TelaLojas.class);
                                itSap.putExtra("filtro", getString(R.string.sap));
                                startActivity(itSap);
                                break;
                            case 14:
                                Intent itTabacaria = new Intent(MainActivity.this, TelaLojas.class);
                                itTabacaria.putExtra("filtro", getString(R.string.tab));
                                startActivity(itTabacaria);
                                break;
                            case 15:
                                Intent itExcel = new Intent(MainActivity.this, TelaLojas.class);
                                itExcel.putExtra("filtro", getString(R.string.info));
                                startActivity(itExcel);
                                break;
                            case 16:
                                Intent itVest = new Intent(MainActivity.this, TelaLojas.class);
                                itVest.putExtra("filtro", getString(R.string.vest));
                                startActivity(itVest);
                                break;
                            case 17:
                                Intent it17 = new Intent(MainActivity.this, TelaSobre.class);
                                startActivity(it17);
                                break;
                            case 18:
                                finish();
                                break;
                            case 19:
                                Intent it18 = new Intent(MainActivity.this, TelaAdm.class);
                                startActivity(it18);
                                break;
                        }
                        return false;
                    }
                }).build();

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

    //Inicia botões
    private void iniciarCampos(){
        btnLojas = (Button) findViewById(R.id.btnLojas);
        btnMapa = (Button) findViewById(R.id.btnMapa);
        btnSite = (Button) findViewById(R.id.btnSite);
    }

    //Inicia cliques
    private void iniciarClicks(){
        btnLojas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l = new Loja();
                l.setSelecao("all");
                Intent it = new Intent(MainActivity.this, TelaLojas.class);
                it.putExtra("loja", l);
                startActivity(it);
            }
        });

        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(it);
            }
        });

        btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, TelaSite.class);
                startActivity(it);
            }
        });
    }
}//fecha Main

package rafael.couto.newvia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Evandro on 2016-07-15.
 */
public class AdapterLoja extends BaseAdapter
{
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Loja> lojas;

    public AdapterLoja(Context context, LayoutInflater inflater, ArrayList<Loja> lojas){
        this.context = context;
        this.inflater = inflater;
        this.lojas = lojas;
    }

    @Override
    public int getCount(){
        return lojas.size();
    }

    @Override
    public Object getItem(int position){
        return lojas.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        convertView = inflater.inflate(R.layout.list_item_loja, null);

        ImageView storeImage = (ImageView) convertView.findViewById(R.id.list_item_loja_image);
        TextView storeName = (TextView) convertView.findViewById(R.id.list_item_loja_name);
        TextView storeOpenHour = (TextView) convertView.findViewById(R.id.list_item_loja_open_hour);
        TextView storeCloseHour = (TextView) convertView.findViewById(R.id.list_item_loja_close_hour);

        Loja loja = lojas.get(position);

        //TODO: Atualizar url das imagens
        Picasso.with(context).load("http://imgur.com/" + loja.getImageURL()).error(R.drawable.error).placeholder(R.drawable.load).into(storeImage);
        storeName.setText(loja.getNome());
        storeOpenHour.setText(loja.getAbertura());
        storeCloseHour.setText(loja.getFechamento());

        return convertView;
    }
}

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

public class AdapterLoja extends BaseAdapter
{
    ViewHolder holder;
    private Context context;
    private ArrayList<Loja> lojas;

    public AdapterLoja(Context context, ArrayList<Loja> lojas){
        this.context = context;
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
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_loja, parent, false);

            holder = new ViewHolder();

            holder.storeImage = (ImageView) convertView.findViewById(R.id.list_item_loja_image);
            holder.storeName = (TextView) convertView.findViewById(R.id.list_item_loja_name);
            holder.storeOpenHour = (TextView) convertView.findViewById(R.id.list_item_loja_open_hour);
            holder.storeCloseHour = (TextView) convertView.findViewById(R.id.list_item_loja_close_hour);

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        Loja loja = lojas.get(position);

        //TODO: Atualizar url das imagens
        Picasso.with(context).load("http://imgur.com/" + loja.getImageURL()).error(R.drawable.error).placeholder(R.drawable.load).into(holder.storeImage);

        holder.storeName.setText(loja.getNome());
        holder.storeOpenHour.setText(loja.getAbertura());
        holder.storeCloseHour.setText(loja.getFechamento());

        return convertView;
    }

    static class ViewHolder
    {
        ImageView storeImage;
        TextView storeName;
        TextView storeOpenHour;
        TextView storeCloseHour;
    }
}

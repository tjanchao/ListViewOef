package be.ehb.listviewoef.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import be.ehb.listviewoef.R;
import be.ehb.listviewoef.model.Country;

/**
 * Created by Q on 18-2-2018.
 */

public class CountryListAdapter extends BaseAdapter {

    private ArrayList<Country>countryList;

    private Activity activity;

    private static class ViewHolder {
        private TextView tvName;
        private TextView tvLanguage;
    }

    public CountryListAdapter(ArrayList<Country> countryList, Activity activity) {
        this.countryList = countryList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int i) {
        return countryList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder row = new ViewHolder();


        if (view == null) {
            view = activity.getLayoutInflater().inflate(R.layout.list_item_countries,null);

            row.tvName = view.findViewById(R.id.tv_name);
            row.tvLanguage = view.findViewById(R.id.tv_language);

            view.setTag(row);
        }
        else {
            row = (ViewHolder) view.getTag();
        }

        Country currentCountry = countryList.get(i);

        row.tvName.setText(currentCountry.getName());
        row.tvLanguage.setText(currentCountry.getLanguage());


        return view;
    }
}

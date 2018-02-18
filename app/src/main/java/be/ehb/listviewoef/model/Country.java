package be.ehb.listviewoef.model;

import android.support.annotation.NonNull;

/**
 * Created by Q on 18-2-2018.
 */

public class Country implements Comparable<Country> {

    private String name;
    private String language;

    public Country(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "be.ehb.listviewoef.model.Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }



    @Override
    public int compareTo(@NonNull Country country) {
        return this.name.compareTo(country.name);
    }
}

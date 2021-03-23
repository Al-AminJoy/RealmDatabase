package com.alamin.realmdatabase.config;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class AppConfiguration extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(getApplicationContext());
        RealmConfiguration configuration=new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(configuration);
    }
}

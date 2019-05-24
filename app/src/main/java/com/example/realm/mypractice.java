package com.example.realm;

import android.app.Application;

import io.realm.DynamicRealm;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmMigration;


public class mypractice extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            Realm.init(this);
        }
    }




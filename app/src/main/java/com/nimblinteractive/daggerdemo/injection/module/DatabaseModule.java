package com.nimblinteractive.daggerdemo.injection.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Chris Cadiz.
 */

@Module
public class DatabaseModule {

    @Provides
    Realm provideRealm(Context context) {
        Realm.init(context);
        RealmConfiguration.Builder builder = new RealmConfiguration.Builder();
        builder.name("daggerdemo.realm");

        RealmConfiguration config = builder.build();
        return Realm.getInstance(config);
    }
}

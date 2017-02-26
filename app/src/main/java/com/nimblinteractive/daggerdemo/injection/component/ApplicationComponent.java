package com.nimblinteractive.daggerdemo.injection.component;

/**
 * Created by Chris Cadiz.
 */

import android.app.Application;
import android.content.Context;

import com.nimblinteractive.daggerdemo.MainActivity;
import com.nimblinteractive.daggerdemo.injection.module.ApplicationModule;
import com.nimblinteractive.daggerdemo.injection.module.DatabaseModule;

import javax.inject.Singleton;

import dagger.Component;
import io.realm.Realm;

@Component(modules = {ApplicationModule.class, DatabaseModule.class})
@Singleton
public interface ApplicationComponent {

    void inject(MainActivity activity);
}

package com.nimblinteractive.daggerdemo;

import android.app.Application;

import com.nimblinteractive.daggerdemo.injection.component.ApplicationComponent;
import com.nimblinteractive.daggerdemo.injection.component.DaggerApplicationComponent;
import com.nimblinteractive.daggerdemo.injection.module.ApplicationModule;
import com.nimblinteractive.daggerdemo.injection.module.DatabaseModule;

/**
 * Created by Chris Cadiz.
 */

public class DaggerDemoApplication extends Application {

    private ApplicationComponent component;

    public ApplicationComponent getComponent() {
        if (component == null) {

            component = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .databaseModule(new DatabaseModule())
                    .build();
        }
        return component;
    }
}

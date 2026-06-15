package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.ironsource.j;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ContextProvider {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static volatile ContextProvider f17252d;

    /* renamed from: a  reason: collision with root package name */
    private Activity f17253a;

    /* renamed from: b  reason: collision with root package name */
    private Context f17254b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f17255c = new ConcurrentHashMap<>();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f17252d == null) {
            synchronized (ContextProvider.class) {
                if (f17252d == null) {
                    f17252d = new ContextProvider();
                }
            }
        }
        return f17252d;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f17254b;
        return (context != null || (activity = this.f17253a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        Activity activity = this.f17253a;
        return activity != null ? activity : j.f17882a.b();
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (a aVar : this.f17255c.values()) {
                aVar.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f17253a = activity;
            for (a aVar : this.f17255c.values()) {
                aVar.onResume(this.f17253a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f17255c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f17253a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f17254b = context;
        }
    }
}

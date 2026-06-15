package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f17882a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static AtomicReference<Boolean> f17883b = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<WeakReference<Activity>> f17884c = new AtomicReference<>(null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.f(activity, "activity");
            j.f17884c.compareAndSet(null, new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
            j.f17884c.set(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.n.f(activity, "activity");
            kotlin.jvm.internal.n.f(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
            j.f17884c.compareAndSet(null, new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
        }
    }

    private j() {
    }

    private final void a(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }

    public final void a(Context context) {
        Application application;
        kotlin.jvm.internal.n.f(context, "context");
        if (f17883b.compareAndSet(Boolean.FALSE, Boolean.TRUE)) {
            if (context instanceof Activity) {
                Application application2 = ((Activity) context).getApplication();
                kotlin.jvm.internal.n.e(application2, "context.application");
                a(application2);
                f17884c.set(new WeakReference<>(context));
                return;
            }
            if (context instanceof Service) {
                application = ((Service) context).getApplication();
                kotlin.jvm.internal.n.e(application, "context.application");
            } else if (!(context instanceof Application)) {
                return;
            } else {
                application = (Application) context;
            }
            a(application);
        }
    }

    public final Activity b() {
        WeakReference<Activity> weakReference = f17884c.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}

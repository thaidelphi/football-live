package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    private static final BackgroundDetector f12082e = new BackgroundDetector();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f12083a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f12084b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f12085c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f12086d = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void a(boolean z10);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @KeepForSdk
    public static BackgroundDetector b() {
        return f12082e;
    }

    @KeepForSdk
    public static void c(Application application) {
        BackgroundDetector backgroundDetector = f12082e;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f12086d) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f12086d = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f12082e) {
            Iterator it = this.f12085c.iterator();
            while (it.hasNext()) {
                ((BackgroundStateChangeListener) it.next()).a(z10);
            }
        }
    }

    @KeepForSdk
    public void a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f12082e) {
            this.f12085c.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public boolean d() {
        return this.f12083a.get();
    }

    @KeepForSdk
    @TargetApi(16)
    public boolean e(boolean z10) {
        if (!this.f12084b.get()) {
            if (!PlatformVersion.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f12084b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f12083a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f12084b;
        boolean compareAndSet = this.f12083a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f12084b;
        boolean compareAndSet = this.f12083a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f12083a.compareAndSet(false, true)) {
            this.f12084b.set(true);
            f(true);
        }
    }
}

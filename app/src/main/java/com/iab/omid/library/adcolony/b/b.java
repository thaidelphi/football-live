package com.iab.omid.library.adcolony.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static b f15587a = new b();

    /* renamed from: b  reason: collision with root package name */
    private boolean f15588b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15589c;

    /* renamed from: d  reason: collision with root package name */
    private a f15590d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f15587a;
    }

    private void a(boolean z10) {
        if (this.f15589c != z10) {
            this.f15589c = z10;
            if (this.f15588b) {
                e();
                a aVar = this.f15590d;
                if (aVar != null) {
                    aVar.a(!z10);
                }
            }
        }
    }

    private void e() {
        boolean z10 = !this.f15589c;
        for (com.iab.omid.library.adcolony.adsession.a aVar : com.iab.omid.library.adcolony.b.a.a().b()) {
            aVar.getAdSessionStatePublisher().a(z10);
        }
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f15590d = aVar;
    }

    public void b() {
        this.f15588b = true;
        this.f15589c = false;
        e();
    }

    public void c() {
        this.f15588b = false;
        this.f15589c = false;
        this.f15590d = null;
    }

    ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        View e8;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z10 = true;
            boolean z11 = d().importance != 100;
            boolean z12 = true;
            for (com.iab.omid.library.adcolony.adsession.a aVar : com.iab.omid.library.adcolony.b.a.a().c()) {
                if (aVar.f() && (e8 = aVar.e()) != null && e8.hasWindowFocus()) {
                    z12 = false;
                }
            }
            a((z11 && z12) ? false : false);
        }
    }
}

package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import com.ironsource.nk;
import com.ironsource.ok;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m  reason: collision with root package name */
    private static final b f18222m = new b();

    /* renamed from: n  reason: collision with root package name */
    private static AtomicBoolean f18223n = new AtomicBoolean(false);

    /* renamed from: o  reason: collision with root package name */
    static final long f18224o = 700;

    /* renamed from: a  reason: collision with root package name */
    private int f18225a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f18226b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18227c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18228d = true;

    /* renamed from: e  reason: collision with root package name */
    private ok f18229e = ok.NONE;

    /* renamed from: f  reason: collision with root package name */
    private final List<nk> f18230f = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f18231g = new Runnable() { // from class: com.ironsource.lifecycle.g
        @Override // java.lang.Runnable
        public final void run() {
            b.this.f();
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f18232h = new Runnable() { // from class: com.ironsource.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            b.this.g();
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f18233i = new Runnable() { // from class: com.ironsource.lifecycle.f
        @Override // java.lang.Runnable
        public final void run() {
            b.this.h();
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f18234j = new Runnable() { // from class: com.ironsource.lifecycle.d
        @Override // java.lang.Runnable
        public final void run() {
            b.this.i();
        }
    };

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f18235k = new Runnable() { // from class: com.ironsource.lifecycle.e
        @Override // java.lang.Runnable
        public final void run() {
            b.this.j();
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final a.InterfaceC0225a f18236l = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements a.InterfaceC0225a {
        a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0225a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0225a
        public void b(Activity activity) {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0225a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }
    }

    private void a() {
        if (this.f18226b == 0) {
            this.f18227c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f18232h);
            this.f18229e = ok.PAUSED;
        }
    }

    private void b() {
        if (this.f18225a == 0 && this.f18227c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f18233i);
            this.f18228d = true;
            this.f18229e = ok.STOPPED;
        }
    }

    public static b d() {
        return f18222m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        for (nk nkVar : this.f18230f) {
            nkVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        for (nk nkVar : this.f18230f) {
            nkVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        for (nk nkVar : this.f18230f) {
            nkVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        for (nk nkVar : this.f18230f) {
            nkVar.c();
        }
    }

    void a(Activity activity) {
        int i10 = this.f18226b - 1;
        this.f18226b = i10;
        if (i10 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f18231g, f18224o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        Application application;
        if (!f18223n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(nk nkVar) {
        if (!IronsourceLifecycleProvider.a() || nkVar == null || this.f18230f.contains(nkVar)) {
            return;
        }
        this.f18230f.add(nkVar);
    }

    void b(Activity activity) {
        int i10 = this.f18226b + 1;
        this.f18226b = i10;
        if (i10 == 1) {
            if (!this.f18227c) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f18231g);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f18234j);
            this.f18227c = false;
            this.f18229e = ok.RESUMED;
        }
    }

    public void b(nk nkVar) {
        if (this.f18230f.contains(nkVar)) {
            this.f18230f.remove(nkVar);
        }
    }

    public ok c() {
        return this.f18229e;
    }

    void c(Activity activity) {
        int i10 = this.f18225a + 1;
        this.f18225a = i10;
        if (i10 == 1 && this.f18228d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f18235k);
            this.f18228d = false;
            this.f18229e = ok.STARTED;
        }
    }

    void d(Activity activity) {
        this.f18225a--;
        b();
    }

    public boolean e() {
        return this.f18229e == ok.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a a10 = com.ironsource.lifecycle.a.a(activity);
        if (a10 != null) {
            a10.d(this.f18236l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }
}

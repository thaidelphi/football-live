package com.applovin.impl;

import com.applovin.impl.j4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j4 {

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f7324h = new Executor() { // from class: com.applovin.impl.gb
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public static final Executor f7325i = androidx.privacysandbox.ads.adservices.topics.i.f3728a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7327b;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f7331f;

    /* renamed from: g  reason: collision with root package name */
    private volatile Object f7332g;

    /* renamed from: a  reason: collision with root package name */
    private final Object f7326a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final List f7328c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f7329d = false;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f7330e = false;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(Object obj);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public j4(String str) {
        this.f7327b = str;
    }

    public static j4 a(String str, Object obj) {
        return new j4(str).b(obj);
    }

    public j4 b(Object obj) {
        a(true, obj, null);
        return this;
    }

    public boolean c() {
        return this.f7329d;
    }

    public boolean d() {
        return this.f7329d && !this.f7330e;
    }

    public String toString() {
        String str;
        if (!this.f7329d) {
            str = "Waiting";
        } else if (this.f7330e) {
            str = "Success -> " + this.f7331f;
        } else {
            str = "Failed -> " + this.f7332g;
        }
        return "Promise(" + b() + ": " + str + ")";
    }

    private Runnable c(final Executor executor, final b bVar) {
        return new Runnable() { // from class: com.applovin.impl.fb
            @Override // java.lang.Runnable
            public final void run() {
                j4.this.b(executor, bVar);
            }
        };
    }

    public j4 a(Object obj) {
        a(false, null, obj);
        return this;
    }

    public String b() {
        String str = this.f7327b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, final b bVar) {
        try {
            executor.execute(new Runnable() { // from class: com.applovin.impl.eb
                @Override // java.lang.Runnable
                public final void run() {
                    j4.this.a(bVar);
                }
            });
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, final Runnable runnable) {
        a(executor, new b() { // from class: com.applovin.impl.db
            @Override // com.applovin.impl.j4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                j4.a(runnable, z10, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    public void a(Executor executor, final a aVar) {
        a(executor, new b() { // from class: com.applovin.impl.cb
            @Override // com.applovin.impl.j4.b
            public final void a(boolean z10, Object obj, Object obj2) {
                j4.a(j4.a.this, z10, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z10, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable c10 = c(executor, bVar);
        synchronized (this.f7326a) {
            if (!this.f7329d) {
                this.f7328c.add(c10);
            } else {
                c10.run();
            }
        }
    }

    public Object a() {
        f1.a(d());
        return this.f7332g;
    }

    private void a(boolean z10, Object obj, Object obj2) {
        synchronized (this.f7326a) {
            if (this.f7329d) {
                return;
            }
            this.f7331f = obj;
            this.f7332g = obj2;
            this.f7330e = z10;
            this.f7329d = true;
            for (Runnable runnable : this.f7328c) {
                runnable.run();
            }
            this.f7328c.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f7330e, this.f7331f, this.f7332g);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        f1.a(th);
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.f8884u0;
        if (jVar != null) {
            z1 D = jVar.D();
            D.a("Promise", "PromiseCallback: " + b(), th);
        }
    }
}

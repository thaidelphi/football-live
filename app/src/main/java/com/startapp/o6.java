package com.startapp;

import android.content.Context;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class o6<T> extends x1<T> {

    /* renamed from: e  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.e> f22348e;

    /* renamed from: f  reason: collision with root package name */
    public final t4<w2> f22349f;

    /* renamed from: g  reason: collision with root package name */
    public final String f22350g;

    /* renamed from: h  reason: collision with root package name */
    public final String f22351h;

    /* renamed from: i  reason: collision with root package name */
    public final a f22352i;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o6.this.g();
        }
    }

    public o6(Context context, t4<com.startapp.sdk.adsbase.e> t4Var, t4<w2> t4Var2, String str, String str2) {
        super(context, 1000L);
        this.f22352i = new a();
        this.f22348e = t4Var;
        this.f22349f = t4Var2;
        this.f22350g = str;
        this.f22351h = str2;
    }

    @Override // com.startapp.x1
    public final T a() {
        T a10;
        if (f()) {
            synchronized (this) {
                a10 = a(this.f22348e.a().getString(this.f22350g, null));
            }
            return a10;
        }
        return null;
    }

    public abstract T a(String str);

    public final synchronized void b(T t10) {
        if (t10 != null) {
            this.f22348e.a().edit().putString(this.f22350g, c(t10)).putLong(this.f22351h, System.currentTimeMillis()).apply();
        }
        a(Math.max(60000L, d()));
    }

    public String c(T t10) {
        if (t10 != null) {
            return t10.toString();
        }
        return null;
    }

    public abstract long d();

    public final synchronized void e() {
        a(Math.max(0L, (Math.max(60000L, d()) + this.f22348e.a().getLong(this.f22351h, 0L)) - System.currentTimeMillis()));
    }

    public abstract boolean f();

    public abstract void g();

    public final synchronized void a(long j10) {
        if (f()) {
            this.f22349f.a().a(this.f22352i);
            this.f22349f.a().a(this.f22352i, j10);
        }
    }
}

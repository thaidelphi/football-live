package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l2.c;
import l2.m;
import l2.q;
import l2.r;
import l2.t;
/* compiled from: RequestManager.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k implements ComponentCallbacks2, m {

    /* renamed from: l  reason: collision with root package name */
    private static final o2.f f10312l = o2.f.h0(Bitmap.class).M();

    /* renamed from: m  reason: collision with root package name */
    private static final o2.f f10313m = o2.f.h0(j2.c.class).M();

    /* renamed from: n  reason: collision with root package name */
    private static final o2.f f10314n = o2.f.i0(y1.j.f32926c).U(g.LOW).b0(true);

    /* renamed from: a  reason: collision with root package name */
    protected final com.bumptech.glide.b f10315a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f10316b;

    /* renamed from: c  reason: collision with root package name */
    final l2.l f10317c;

    /* renamed from: d  reason: collision with root package name */
    private final r f10318d;

    /* renamed from: e  reason: collision with root package name */
    private final q f10319e;

    /* renamed from: f  reason: collision with root package name */
    private final t f10320f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f10321g;

    /* renamed from: h  reason: collision with root package name */
    private final l2.c f10322h;

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArrayList<o2.e<Object>> f10323i;

    /* renamed from: j  reason: collision with root package name */
    private o2.f f10324j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10325k;

    /* compiled from: RequestManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f10317c.a(kVar);
        }
    }

    /* compiled from: RequestManager.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final r f10327a;

        b(r rVar) {
            this.f10327a = rVar;
        }

        @Override // l2.c.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f10327a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, l2.l lVar, q qVar, Context context) {
        this(bVar, lVar, qVar, new r(), bVar.g(), context);
    }

    private void z(p2.h<?> hVar) {
        boolean y10 = y(hVar);
        o2.c e8 = hVar.e();
        if (y10 || this.f10315a.p(hVar) || e8 == null) {
            return;
        }
        hVar.c(null);
        e8.clear();
    }

    public <ResourceType> j<ResourceType> i(Class<ResourceType> cls) {
        return new j<>(this.f10315a, this, cls, this.f10316b);
    }

    public j<Bitmap> j() {
        return i(Bitmap.class).c(f10312l);
    }

    public j<Drawable> k() {
        return i(Drawable.class);
    }

    public j<j2.c> l() {
        return i(j2.c.class).c(f10313m);
    }

    public void m(p2.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        z(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<o2.e<Object>> n() {
        return this.f10323i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized o2.f o() {
        return this.f10324j;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // l2.m
    public synchronized void onDestroy() {
        this.f10320f.onDestroy();
        for (p2.h<?> hVar : this.f10320f.j()) {
            m(hVar);
        }
        this.f10320f.i();
        this.f10318d.b();
        this.f10317c.b(this);
        this.f10317c.b(this.f10322h);
        s2.k.v(this.f10321g);
        this.f10315a.s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // l2.m
    public synchronized void onStart() {
        v();
        this.f10320f.onStart();
    }

    @Override // l2.m
    public synchronized void onStop() {
        u();
        this.f10320f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f10325k) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> l<?, T> p(Class<T> cls) {
        return this.f10315a.i().e(cls);
    }

    public j<Drawable> q(Integer num) {
        return k().u0(num);
    }

    public j<Drawable> r(String str) {
        return k().w0(str);
    }

    public synchronized void s() {
        this.f10318d.c();
    }

    public synchronized void t() {
        s();
        for (k kVar : this.f10319e.a()) {
            kVar.s();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f10318d + ", treeNode=" + this.f10319e + "}";
    }

    public synchronized void u() {
        this.f10318d.d();
    }

    public synchronized void v() {
        this.f10318d.f();
    }

    protected synchronized void w(o2.f fVar) {
        this.f10324j = fVar.clone().d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void x(p2.h<?> hVar, o2.c cVar) {
        this.f10320f.k(hVar);
        this.f10318d.g(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean y(p2.h<?> hVar) {
        o2.c e8 = hVar.e();
        if (e8 == null) {
            return true;
        }
        if (this.f10318d.a(e8)) {
            this.f10320f.l(hVar);
            hVar.c(null);
            return true;
        }
        return false;
    }

    k(com.bumptech.glide.b bVar, l2.l lVar, q qVar, r rVar, l2.d dVar, Context context) {
        this.f10320f = new t();
        a aVar = new a();
        this.f10321g = aVar;
        this.f10315a = bVar;
        this.f10317c = lVar;
        this.f10319e = qVar;
        this.f10318d = rVar;
        this.f10316b = context;
        l2.c a10 = dVar.a(context.getApplicationContext(), new b(rVar));
        this.f10322h = a10;
        if (s2.k.q()) {
            s2.k.u(aVar);
        } else {
            lVar.a(this);
        }
        lVar.a(a10);
        this.f10323i = new CopyOnWriteArrayList<>(bVar.i().c());
        w(bVar.i().d());
        bVar.o(this);
    }
}

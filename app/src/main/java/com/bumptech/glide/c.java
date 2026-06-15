package com.bumptech.glide;

import a2.a;
import a2.i;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l2.p;
/* compiled from: GlideBuilder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private y1.k f10260c;

    /* renamed from: d  reason: collision with root package name */
    private z1.e f10261d;

    /* renamed from: e  reason: collision with root package name */
    private z1.b f10262e;

    /* renamed from: f  reason: collision with root package name */
    private a2.h f10263f;

    /* renamed from: g  reason: collision with root package name */
    private b2.a f10264g;

    /* renamed from: h  reason: collision with root package name */
    private b2.a f10265h;

    /* renamed from: i  reason: collision with root package name */
    private a.InterfaceC0006a f10266i;

    /* renamed from: j  reason: collision with root package name */
    private a2.i f10267j;

    /* renamed from: k  reason: collision with root package name */
    private l2.d f10268k;

    /* renamed from: n  reason: collision with root package name */
    private p.b f10271n;

    /* renamed from: o  reason: collision with root package name */
    private b2.a f10272o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10273p;

    /* renamed from: q  reason: collision with root package name */
    private List<o2.e<Object>> f10274q;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f10258a = new androidx.collection.a();

    /* renamed from: b  reason: collision with root package name */
    private final e.a f10259b = new e.a();

    /* renamed from: l  reason: collision with root package name */
    private int f10269l = 4;

    /* renamed from: m  reason: collision with root package name */
    private b.a f10270m = new a();

    /* compiled from: GlideBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public o2.f build() {
            return new o2.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlideBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        b() {
        }
    }

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0168c {
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {
        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.b a(Context context) {
        if (this.f10264g == null) {
            this.f10264g = b2.a.h();
        }
        if (this.f10265h == null) {
            this.f10265h = b2.a.e();
        }
        if (this.f10272o == null) {
            this.f10272o = b2.a.c();
        }
        if (this.f10267j == null) {
            this.f10267j = new i.a(context).a();
        }
        if (this.f10268k == null) {
            this.f10268k = new l2.f();
        }
        if (this.f10261d == null) {
            int b10 = this.f10267j.b();
            if (b10 > 0) {
                this.f10261d = new z1.k(b10);
            } else {
                this.f10261d = new z1.f();
            }
        }
        if (this.f10262e == null) {
            this.f10262e = new z1.j(this.f10267j.a());
        }
        if (this.f10263f == null) {
            this.f10263f = new a2.g(this.f10267j.d());
        }
        if (this.f10266i == null) {
            this.f10266i = new a2.f(context);
        }
        if (this.f10260c == null) {
            this.f10260c = new y1.k(this.f10263f, this.f10266i, this.f10265h, this.f10264g, b2.a.i(), this.f10272o, this.f10273p);
        }
        List<o2.e<Object>> list = this.f10274q;
        if (list == null) {
            this.f10274q = Collections.emptyList();
        } else {
            this.f10274q = Collections.unmodifiableList(list);
        }
        e b11 = this.f10259b.b();
        return new com.bumptech.glide.b(context, this.f10260c, this.f10263f, this.f10261d, this.f10262e, new p(this.f10271n, b11), this.f10268k, this.f10269l, this.f10270m, this.f10258a, this.f10274q, b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(p.b bVar) {
        this.f10271n = bVar;
    }
}

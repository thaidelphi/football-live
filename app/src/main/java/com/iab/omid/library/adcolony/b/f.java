package com.iab.omid.library.adcolony.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.b.b;
import com.iab.omid.library.adcolony.walking.TreeWalker;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f implements com.iab.omid.library.adcolony.a.c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f15601a;

    /* renamed from: b  reason: collision with root package name */
    private float f15602b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.adcolony.a.e f15603c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.adcolony.a.b f15604d;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.adcolony.a.d f15605e;

    /* renamed from: f  reason: collision with root package name */
    private a f15606f;

    public f(com.iab.omid.library.adcolony.a.e eVar, com.iab.omid.library.adcolony.a.b bVar) {
        this.f15603c = eVar;
        this.f15604d = bVar;
    }

    public static f a() {
        if (f15601a == null) {
            f15601a = new f(new com.iab.omid.library.adcolony.a.e(), new com.iab.omid.library.adcolony.a.b());
        }
        return f15601a;
    }

    private a e() {
        if (this.f15606f == null) {
            this.f15606f = a.a();
        }
        return this.f15606f;
    }

    @Override // com.iab.omid.library.adcolony.a.c
    public void a(float f10) {
        this.f15602b = f10;
        for (com.iab.omid.library.adcolony.adsession.a aVar : e().c()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f15605e = this.f15603c.a(new Handler(), context, this.f15604d.a(), this);
    }

    @Override // com.iab.omid.library.adcolony.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f15605e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f15605e.b();
    }

    public float d() {
        return this.f15602b;
    }
}

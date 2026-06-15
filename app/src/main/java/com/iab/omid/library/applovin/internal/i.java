package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* renamed from: f  reason: collision with root package name */
    private static i f15732f;

    /* renamed from: a  reason: collision with root package name */
    private float f15733a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f15734b;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f15735c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f15736d;

    /* renamed from: e  reason: collision with root package name */
    private c f15737e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f15734b = eVar;
        this.f15735c = bVar;
    }

    private c a() {
        if (this.f15737e == null) {
            this.f15737e = c.c();
        }
        return this.f15737e;
    }

    public static i c() {
        if (f15732f == null) {
            f15732f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f15732f;
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f15733a = f10;
        for (com.iab.omid.library.applovin.adsession.a aVar : a().a()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f15736d = this.f15734b.a(new Handler(), context, this.f15735c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f15733a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f15736d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f15736d.d();
    }
}

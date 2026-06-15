package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.internal.d;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class i implements d.a, com.iab.omid.library.ironsrc.devicevolume.c {

    /* renamed from: f  reason: collision with root package name */
    private static i f15861f;

    /* renamed from: a  reason: collision with root package name */
    private float f15862a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.e f15863b;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.b f15864c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f15865d;

    /* renamed from: e  reason: collision with root package name */
    private c f15866e;

    public i(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.f15863b = eVar;
        this.f15864c = bVar;
    }

    private c a() {
        if (this.f15866e == null) {
            this.f15866e = c.c();
        }
        return this.f15866e;
    }

    public static i c() {
        if (f15861f == null) {
            f15861f = new i(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f15861f;
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f10) {
        this.f15862a = f10;
        for (com.iab.omid.library.ironsrc.adsession.a aVar : a().a()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f15865d = this.f15863b.a(new Handler(), context, this.f15864c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f15862a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f15865d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f15865d.d();
    }
}

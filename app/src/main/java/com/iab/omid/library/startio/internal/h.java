package com.iab.omid.library.startio.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.startio.internal.d;
import com.iab.omid.library.startio.walking.TreeWalker;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class h implements d.a, com.iab.omid.library.startio.devicevolume.c {

    /* renamed from: f  reason: collision with root package name */
    private static h f15995f;

    /* renamed from: a  reason: collision with root package name */
    private float f15996a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.startio.devicevolume.e f15997b;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.startio.devicevolume.b f15998c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.startio.devicevolume.d f15999d;

    /* renamed from: e  reason: collision with root package name */
    private c f16000e;

    public h(com.iab.omid.library.startio.devicevolume.e eVar, com.iab.omid.library.startio.devicevolume.b bVar) {
        this.f15997b = eVar;
        this.f15998c = bVar;
    }

    private c a() {
        if (this.f16000e == null) {
            this.f16000e = c.c();
        }
        return this.f16000e;
    }

    public static h c() {
        if (f15995f == null) {
            f15995f = new h(new com.iab.omid.library.startio.devicevolume.e(), new com.iab.omid.library.startio.devicevolume.b());
        }
        return f15995f;
    }

    @Override // com.iab.omid.library.startio.devicevolume.c
    public void a(float f10) {
        this.f15996a = f10;
        for (com.iab.omid.library.startio.adsession.a aVar : a().a()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f15999d = this.f15997b.a(new Handler(), context, this.f15998c.a(), this);
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f15996a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f15999d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f15999d.d();
    }
}

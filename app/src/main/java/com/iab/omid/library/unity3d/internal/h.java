package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.internal.d;
import com.iab.omid.library.unity3d.walking.TreeWalker;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class h implements d.a, com.iab.omid.library.unity3d.devicevolume.c {

    /* renamed from: f  reason: collision with root package name */
    private static h f16123f;

    /* renamed from: a  reason: collision with root package name */
    private float f16124a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.e f16125b;

    /* renamed from: c  reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.b f16126c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.unity3d.devicevolume.d f16127d;

    /* renamed from: e  reason: collision with root package name */
    private c f16128e;

    public h(com.iab.omid.library.unity3d.devicevolume.e eVar, com.iab.omid.library.unity3d.devicevolume.b bVar) {
        this.f16125b = eVar;
        this.f16126c = bVar;
    }

    private c a() {
        if (this.f16128e == null) {
            this.f16128e = c.c();
        }
        return this.f16128e;
    }

    public static h c() {
        if (f16123f == null) {
            f16123f = new h(new com.iab.omid.library.unity3d.devicevolume.e(), new com.iab.omid.library.unity3d.devicevolume.b());
        }
        return f16123f;
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.c
    public void a(float f10) {
        this.f16124a = f10;
        for (com.iab.omid.library.unity3d.adsession.a aVar : a().a()) {
            aVar.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f16127d = this.f16125b.a(new Handler(), context, this.f16126c.a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f16124a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f16127d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f16127d.d();
    }
}

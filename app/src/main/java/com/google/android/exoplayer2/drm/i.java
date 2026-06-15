package com.google.android.exoplayer2.drm;

import a5.p0;
import android.net.Uri;
import com.google.android.exoplayer2.drm.e;
import java.util.Map;
import n3.u1;
import y5.s0;
import z4.l;
import z4.v;
/* compiled from: DefaultDrmSessionManagerProvider.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements r3.o {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10520a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private u1.f f10521b;

    /* renamed from: c  reason: collision with root package name */
    private l f10522c;

    /* renamed from: d  reason: collision with root package name */
    private l.a f10523d;

    /* renamed from: e  reason: collision with root package name */
    private String f10524e;

    private l b(u1.f fVar) {
        l.a aVar = this.f10523d;
        if (aVar == null) {
            aVar = new v.b().f(this.f10524e);
        }
        Uri uri = fVar.f28408c;
        r rVar = new r(uri == null ? null : uri.toString(), fVar.f28413h, aVar);
        s0<Map.Entry<String, String>> it = fVar.f28410e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            rVar.e(next.getKey(), next.getValue());
        }
        e a10 = new e.b().e(fVar.f28406a, q.f10540d).b(fVar.f28411f).c(fVar.f28412g).d(a6.b.k(fVar.f28415j)).a(rVar);
        a10.F(0, fVar.c());
        return a10;
    }

    @Override // r3.o
    public l a(u1 u1Var) {
        l lVar;
        a5.a.e(u1Var.f28373b);
        u1.f fVar = u1Var.f28373b.f28439c;
        if (fVar != null && p0.f482a >= 18) {
            synchronized (this.f10520a) {
                if (!p0.c(fVar, this.f10521b)) {
                    this.f10521b = fVar;
                    this.f10522c = b(fVar);
                }
                lVar = (l) a5.a.e(this.f10522c);
            }
            return lVar;
        }
        return l.f10531a;
    }
}

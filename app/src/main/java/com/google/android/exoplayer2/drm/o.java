package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.drm.k;
import java.util.Map;
import java.util.UUID;
/* compiled from: ErrorStateDrmSession.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f10534a;

    public o(j.a aVar) {
        this.f10534a = (j.a) a5.a.e(aVar);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void a(k.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void b(k.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final UUID c() {
        return n3.i.f28004a;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public q3.b e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public Map<String, String> f() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public boolean g(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.a getError() {
        return this.f10534a;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public int getState() {
        return 1;
    }
}

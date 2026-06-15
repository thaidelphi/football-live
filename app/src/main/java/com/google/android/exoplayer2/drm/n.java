package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o3.q1;
/* compiled from: DummyExoMediaDrm.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n implements p {
    @Override // com.google.android.exoplayer2.drm.p
    public Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public p.d b() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void e(p.b bVar) {
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public int g() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.p
    public q3.b h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void j(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public /* synthetic */ void l(byte[] bArr, q1 q1Var) {
        r3.p.a(this, bArr, q1Var);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public p.a m(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.p
    public void release() {
    }
}

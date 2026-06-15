package x3;

import java.nio.ByteBuffer;
import n3.m1;
import p3.i0;
/* compiled from: C2Mp3TimestampTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f32471a;

    /* renamed from: b  reason: collision with root package name */
    private long f32472b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32473c;

    private long a(long j10) {
        return this.f32471a + Math.max(0L, ((this.f32472b - 529) * 1000000) / j10);
    }

    public long b(m1 m1Var) {
        return a(m1Var.f28199z);
    }

    public void c() {
        this.f32471a = 0L;
        this.f32472b = 0L;
        this.f32473c = false;
    }

    public long d(m1 m1Var, q3.g gVar) {
        if (this.f32472b == 0) {
            this.f32471a = gVar.f30093e;
        }
        if (this.f32473c) {
            return gVar.f30093e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a5.a.e(gVar.f30091c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m7 = i0.m(i10);
        if (m7 == -1) {
            this.f32473c = true;
            this.f32472b = 0L;
            this.f32471a = gVar.f30093e;
            a5.t.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f30093e;
        }
        long a10 = a(m1Var.f28199z);
        this.f32472b += m7;
        return a10;
    }
}

package androidx.room;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorProgram.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j0 implements v0.i {

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f4204a = new ArrayList();

    private void b(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f4204a.size()) {
            for (int size = this.f4204a.size(); size <= i11; size++) {
                this.f4204a.add(null);
            }
        }
        this.f4204a.set(i11, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Object> a() {
        return this.f4204a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // v0.i
    public void d0(int i10, String str) {
        b(i10, str);
    }

    @Override // v0.i
    public void m0(int i10, long j10) {
        b(i10, Long.valueOf(j10));
    }

    @Override // v0.i
    public void p(int i10, double d10) {
        b(i10, Double.valueOf(d10));
    }

    @Override // v0.i
    public void p0(int i10, byte[] bArr) {
        b(i10, bArr);
    }

    @Override // v0.i
    public void v0(int i10) {
        b(i10, null);
    }
}

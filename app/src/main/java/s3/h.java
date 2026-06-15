package s3;

import a5.c0;
import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import n3.m1;
import s3.t;
/* compiled from: DummyTrackOutput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements t {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f30713a = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    @Override // s3.t
    public void a(m1 m1Var) {
    }

    @Override // s3.t
    public /* synthetic */ int b(z4.i iVar, int i10, boolean z10) {
        return s.a(this, iVar, i10, z10);
    }

    @Override // s3.t
    public int c(z4.i iVar, int i10, boolean z10, int i11) throws IOException {
        int b10 = iVar.b(this.f30713a, 0, Math.min(this.f30713a.length, i10));
        if (b10 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return b10;
    }

    @Override // s3.t
    public /* synthetic */ void d(c0 c0Var, int i10) {
        s.b(this, c0Var, i10);
    }

    @Override // s3.t
    public void e(long j10, int i10, int i11, int i12, t.a aVar) {
    }

    @Override // s3.t
    public void f(c0 c0Var, int i10, int i11) {
        c0Var.L(i10);
    }
}

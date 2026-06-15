package s3;

import a5.c0;
import c4.b;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: Id3Peeker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f30718a = new c0(10);

    public Metadata a(j jVar, b.a aVar) throws IOException {
        Metadata metadata = null;
        int i10 = 0;
        while (true) {
            try {
                jVar.n(this.f30718a.d(), 0, 10);
                this.f30718a.K(0);
                if (this.f30718a.C() != 4801587) {
                    break;
                }
                this.f30718a.L(3);
                int y10 = this.f30718a.y();
                int i11 = y10 + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f30718a.d(), 0, bArr, 0, 10);
                    jVar.n(bArr, 10, y10);
                    metadata = new c4.b(aVar).e(bArr, i11);
                } else {
                    jVar.h(y10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        jVar.e();
        jVar.h(i10);
        return metadata;
    }
}

package s3;

import java.io.IOException;
/* compiled from: ExtractorInput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface j extends z4.i {
    long a();

    @Override // z4.i
    int b(byte[] bArr, int i10, int i11) throws IOException;

    boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void e();

    boolean f(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long g();

    long getPosition();

    void h(int i10) throws IOException;

    void j(int i10) throws IOException;

    boolean k(int i10, boolean z10) throws IOException;

    void n(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}

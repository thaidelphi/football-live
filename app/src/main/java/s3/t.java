package s3;

import a5.c0;
import java.io.IOException;
import java.util.Arrays;
import n3.m1;
/* compiled from: TrackOutput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface t {

    /* compiled from: TrackOutput.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f30727a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f30728b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30729c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30730d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f30727a = i10;
            this.f30728b = bArr;
            this.f30729c = i11;
            this.f30730d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30727a == aVar.f30727a && this.f30729c == aVar.f30729c && this.f30730d == aVar.f30730d && Arrays.equals(this.f30728b, aVar.f30728b);
        }

        public int hashCode() {
            return (((((this.f30727a * 31) + Arrays.hashCode(this.f30728b)) * 31) + this.f30729c) * 31) + this.f30730d;
        }
    }

    void a(m1 m1Var);

    int b(z4.i iVar, int i10, boolean z10) throws IOException;

    int c(z4.i iVar, int i10, boolean z10, int i11) throws IOException;

    void d(c0 c0Var, int i10);

    void e(long j10, int i10, int i11, int i12, a aVar);

    void f(c0 c0Var, int i10, int i11);
}

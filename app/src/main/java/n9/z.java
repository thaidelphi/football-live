package n9;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
/* compiled from: RequestBody.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestBody.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f29018a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29019b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f29020c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f29021d;

        a(u uVar, int i10, byte[] bArr, int i11) {
            this.f29018a = uVar;
            this.f29019b = i10;
            this.f29020c = bArr;
            this.f29021d = i11;
        }

        @Override // n9.z
        public long a() {
            return this.f29019b;
        }

        @Override // n9.z
        public u b() {
            return this.f29018a;
        }

        @Override // n9.z
        public void f(y9.d dVar) throws IOException {
            dVar.t0(this.f29020c, this.f29021d, this.f29019b);
        }
    }

    public static z c(u uVar, String str) {
        Charset charset = o9.c.f29481j;
        if (uVar != null) {
            Charset a10 = uVar.a();
            if (a10 == null) {
                uVar = u.d(uVar + "; charset=utf-8");
            } else {
                charset = a10;
            }
        }
        return d(uVar, str.getBytes(charset));
    }

    public static z d(u uVar, byte[] bArr) {
        return e(uVar, bArr, 0, bArr.length);
    }

    public static z e(u uVar, byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "content == null");
        o9.c.f(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }

    public abstract long a() throws IOException;

    public abstract u b();

    public abstract void f(y9.d dVar) throws IOException;
}

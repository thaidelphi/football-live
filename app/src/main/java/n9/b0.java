package n9;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
/* compiled from: ResponseBody.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class b0 implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResponseBody.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class a extends b0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f28713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f28714b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ y9.e f28715c;

        a(u uVar, long j10, y9.e eVar) {
            this.f28713a = uVar;
            this.f28714b = j10;
            this.f28715c = eVar;
        }

        @Override // n9.b0
        public long b() {
            return this.f28714b;
        }

        @Override // n9.b0
        public u f() {
            return this.f28713a;
        }

        @Override // n9.b0
        public y9.e t() {
            return this.f28715c;
        }
    }

    private Charset a() {
        u f10 = f();
        return f10 != null ? f10.b(o9.c.f29481j) : o9.c.f29481j;
    }

    public static b0 j(u uVar, long j10, y9.e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new a(uVar, j10, eVar);
    }

    public static b0 k(u uVar, byte[] bArr) {
        return j(uVar, bArr.length, new y9.c().O(bArr));
    }

    public abstract long b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o9.c.g(t());
    }

    public abstract u f();

    public abstract y9.e t();

    public final String w() throws IOException {
        y9.e t10 = t();
        try {
            return t10.s0(o9.c.c(t10, a()));
        } finally {
            o9.c.g(t10);
        }
    }
}

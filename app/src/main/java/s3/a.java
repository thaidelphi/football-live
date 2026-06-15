package s3;

import a5.p0;
import java.io.IOException;
/* compiled from: BinarySearchSeeker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0352a f30662a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f30663b;

    /* renamed from: c  reason: collision with root package name */
    protected c f30664c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30665d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0352a implements q {

        /* renamed from: a  reason: collision with root package name */
        private final d f30666a;

        /* renamed from: b  reason: collision with root package name */
        private final long f30667b;

        /* renamed from: c  reason: collision with root package name */
        private final long f30668c;

        /* renamed from: d  reason: collision with root package name */
        private final long f30669d;

        /* renamed from: e  reason: collision with root package name */
        private final long f30670e;

        /* renamed from: f  reason: collision with root package name */
        private final long f30671f;

        /* renamed from: g  reason: collision with root package name */
        private final long f30672g;

        public C0352a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f30666a = dVar;
            this.f30667b = j10;
            this.f30668c = j11;
            this.f30669d = j12;
            this.f30670e = j13;
            this.f30671f = j14;
            this.f30672g = j15;
        }

        public long j(long j10) {
            return this.f30666a.a(j10);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements d {
        @Override // s3.a.d
        public long a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f30673a;

        /* renamed from: b  reason: collision with root package name */
        private final long f30674b;

        /* renamed from: c  reason: collision with root package name */
        private final long f30675c;

        /* renamed from: d  reason: collision with root package name */
        private long f30676d;

        /* renamed from: e  reason: collision with root package name */
        private long f30677e;

        /* renamed from: f  reason: collision with root package name */
        private long f30678f;

        /* renamed from: g  reason: collision with root package name */
        private long f30679g;

        /* renamed from: h  reason: collision with root package name */
        private long f30680h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f30673a = j10;
            this.f30674b = j11;
            this.f30676d = j12;
            this.f30677e = j13;
            this.f30678f = j14;
            this.f30679g = j15;
            this.f30675c = j16;
            this.f30680h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return p0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f30679g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f30678f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f30680h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f30673a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f30674b;
        }

        private void n() {
            this.f30680h = h(this.f30674b, this.f30676d, this.f30677e, this.f30678f, this.f30679g, this.f30675c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f30677e = j10;
            this.f30679g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f30676d = j10;
            this.f30678f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        long a(long j10);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f30681d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        private final int f30682a;

        /* renamed from: b  reason: collision with root package name */
        private final long f30683b;

        /* renamed from: c  reason: collision with root package name */
        private final long f30684c;

        private e(int i10, long j10, long j11) {
            this.f30682a = i10;
            this.f30683b = j10;
            this.f30684c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        e a(j jVar, long j10) throws IOException;

        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f30663b = fVar;
        this.f30665d = i10;
        this.f30662a = new C0352a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f30662a.j(j10), this.f30662a.f30668c, this.f30662a.f30669d, this.f30662a.f30670e, this.f30662a.f30671f, this.f30662a.f30672g);
    }

    public final q b() {
        return this.f30662a;
    }

    public int c(j jVar, p pVar) throws IOException {
        while (true) {
            c cVar = (c) a5.a.h(this.f30664c);
            long j10 = cVar.j();
            long i10 = cVar.i();
            long k10 = cVar.k();
            if (i10 - j10 <= this.f30665d) {
                e(false, j10);
                return g(jVar, j10, pVar);
            } else if (!i(jVar, k10)) {
                return g(jVar, k10, pVar);
            } else {
                jVar.e();
                e a10 = this.f30663b.a(jVar, cVar.m());
                int i11 = a10.f30682a;
                if (i11 == -3) {
                    e(false, k10);
                    return g(jVar, k10, pVar);
                } else if (i11 == -2) {
                    cVar.p(a10.f30683b, a10.f30684c);
                } else if (i11 != -1) {
                    if (i11 == 0) {
                        i(jVar, a10.f30684c);
                        e(true, a10.f30684c);
                        return g(jVar, a10.f30684c, pVar);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    cVar.o(a10.f30683b, a10.f30684c);
                }
            }
        }
    }

    public final boolean d() {
        return this.f30664c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f30664c = null;
        this.f30663b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(j jVar, long j10, p pVar) {
        if (j10 == jVar.getPosition()) {
            return 0;
        }
        pVar.f30719a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f30664c;
        if (cVar == null || cVar.l() != j10) {
            this.f30664c = a(j10);
        }
    }

    protected final boolean i(j jVar, long j10) throws IOException {
        long position = j10 - jVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        jVar.j((int) position);
        return true;
    }
}

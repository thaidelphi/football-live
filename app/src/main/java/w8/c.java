package w8;

import java.io.Serializable;
import kotlin.jvm.internal.h;
/* compiled from: Random.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32384a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final c f32385b = o8.b.f29469a.b();

    /* compiled from: Random.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends c implements Serializable {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        @Override // w8.c
        public int b(int i10) {
            return c.f32385b.b(i10);
        }

        @Override // w8.c
        public int c() {
            return c.f32385b.c();
        }

        @Override // w8.c
        public long d() {
            return c.f32385b.d();
        }

        @Override // w8.c
        public long e(long j10, long j11) {
            return c.f32385b.e(j10, j11);
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public abstract long d();

    public long e(long j10, long j11) {
        long d10;
        boolean z10;
        long d11;
        long j12;
        long j13;
        int c10;
        d.b(j10, j11);
        long j14 = j11 - j10;
        if (j14 <= 0) {
            do {
                d10 = d();
                z10 = false;
                if (j10 <= d10 && d10 < j11) {
                    z10 = true;
                    continue;
                }
            } while (!z10);
            return d10;
        }
        if (((-j14) & j14) == j14) {
            int i10 = (int) j14;
            int i11 = (int) (j14 >>> 32);
            if (i10 != 0) {
                c10 = b(d.c(i10));
            } else if (i11 == 1) {
                c10 = c();
            } else {
                j13 = (b(d.c(i11)) << 32) + (c() & 4294967295L);
            }
            j13 = c10 & 4294967295L;
        } else {
            do {
                d11 = d() >>> 1;
                j12 = d11 % j14;
            } while ((d11 - j12) + (j14 - 1) < 0);
            j13 = j12;
        }
        return j10 + j13;
    }
}

package u3;

import a5.p0;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
/* compiled from: MlltSeeker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f31342a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f31343b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31344c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f31342a = jArr;
        this.f31343b = jArr2;
        this.f31344c = j10 == -9223372036854775807L ? p0.C0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c e(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.f10604e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += mlltFrame.f10602c + mlltFrame.f10604e[i12];
            j12 += mlltFrame.f10603d + mlltFrame.f10605f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> f(long j10, long[] jArr, long[] jArr2) {
        int i10 = p0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i11];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i11] - j12))) + j12));
    }

    @Override // u3.f
    public long a(long j10) {
        return p0.C0(((Long) f(j10, this.f31342a, this.f31343b).second).longValue());
    }

    @Override // u3.f
    public long b() {
        return -1L;
    }

    @Override // s3.q
    public boolean c() {
        return true;
    }

    @Override // s3.q
    public long d() {
        return this.f31344c;
    }
}

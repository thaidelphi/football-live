package s3;

import a5.p0;
import java.util.Arrays;
/* compiled from: ChunkIndex.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements q {

    /* renamed from: a  reason: collision with root package name */
    public final int f30685a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f30686b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f30687c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f30688d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f30689e;

    /* renamed from: f  reason: collision with root package name */
    private final long f30690f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f30686b = iArr;
        this.f30687c = jArr;
        this.f30688d = jArr2;
        this.f30689e = jArr3;
        int length = iArr.length;
        this.f30685a = length;
        if (length > 0) {
            this.f30690f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f30690f = 0L;
        }
    }

    public int e(long j10) {
        return p0.i(this.f30689e, j10, true, true);
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f30685a + ", sizes=" + Arrays.toString(this.f30686b) + ", offsets=" + Arrays.toString(this.f30687c) + ", timeUs=" + Arrays.toString(this.f30689e) + ", durationsUs=" + Arrays.toString(this.f30688d) + ")";
    }
}

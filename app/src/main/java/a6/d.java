package a6;

import x5.g;
/* compiled from: Longs.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d {
    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static long b(long... jArr) {
        g.d(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            if (jArr[i10] > j10) {
                j10 = jArr[i10];
            }
        }
        return j10;
    }
}

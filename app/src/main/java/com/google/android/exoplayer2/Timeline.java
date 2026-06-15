package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.redexgen.X.AbstractC1589es;
import com.facebook.ads.redexgen.X.AbstractC1594ex;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.C0736Dv;
import com.facebook.ads.redexgen.X.C1248Yf;
import com.facebook.ads.redexgen.X.C1250Yh;
import com.facebook.ads.redexgen.X.C4T;
import com.facebook.ads.redexgen.X.D9;
import com.facebook.ads.redexgen.X.InterfaceC0972Na;
import com.facebook.ads.redexgen.X.InterfaceC0973Nb;
import com.facebook.ads.redexgen.X.NZ;
import com.facebook.ads.redexgen.X.OI;
import com.google.android.exoplayer2.Timeline;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class Timeline implements InterfaceC0973Nb {
    public static String[] A00 = {"WkVexZ4Kygk3uKicUY1OXfODb", "GIiS2UJhm7eNWc1RNsVtI188MaIWXiP1", "mvb2ZOpLQSukRu8SaaR11ChJ6YlWeg17", "GpqGNDRh5SNWW3ILzx0b4GigB2QZ", "l3gcwBnDpUyGEIuzCOMvj8Zkex2sIVDq", "5vqwZr1Euu5eHU7", "X2iFApCkixWr4HhP0VYktwd8lnJlTLsj", "DmEaLbFXoo0zDFQ2cF3ATofiD0Mpaqc2"};
    public static final Timeline A02 = new C0736Dv();
    public static final String A05 = AbstractC1672gE.A0h(0);
    public static final String A03 = AbstractC1672gE.A0h(1);
    public static final String A04 = AbstractC1672gE.A0h(2);
    public static final InterfaceC0972Na<Timeline> A01 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yj
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            Timeline A022;
            A022 = Timeline.A02(bundle);
            return A022;
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C1250Yh A0I(int i10, C1250Yh c1250Yh, boolean z10);

    public abstract C1248Yf A0L(int i10, C1248Yf c1248Yf, long j10);

    public abstract Object A0M(int i10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline$Window> */
    public static D9 A02(Bundle bundle) {
        OI A042 = A04(C1248Yf.A0J, AbstractC1594ex.A00(bundle, A05));
        OI A043 = A04(C1250Yh.A08, AbstractC1594ex.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(A042.size());
        }
        return new D9(A042, A043, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.Nb> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Na != com.google.android.exoplayer2.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.Nb> */
    public static <T extends InterfaceC0973Nb> OI<T> A04(InterfaceC0972Na<T> interfaceC0972Na, IBinder iBinder) {
        if (iBinder == null) {
            return OI.A03();
        }
        C4T c4t = new C4T();
        OI<Bundle> A002 = NZ.A00(iBinder);
        for (int i10 = 0; i10 < A002.size(); i10++) {
            c4t.A04(interfaceC0972Na.A6V(A002.get(i10)));
        }
        return c4t.A05();
    }

    public static int[] A05(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int A08(int i10, int i11, boolean z10) {
        switch (i11) {
            case 0:
                if (i10 == A0C(z10)) {
                    return -1;
                }
                return i10 + 1;
            case 1:
                return i10;
            case 2:
                if (i10 == A0C(z10)) {
                    return A0B(z10);
                }
                return i10 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i10, C1250Yh c1250Yh, C1248Yf c1248Yf, int i11, boolean z10) {
        int i12 = A0H(i10, c1250Yh).A00;
        int windowIndex = A0K(i12, c1248Yf).A01;
        if (windowIndex == i10) {
            int A08 = A08(i12, i11, z10);
            String[] strArr = A00;
            String str = strArr[3];
            String str2 = strArr[0];
            int length = str.length();
            int windowIndex2 = str2.length();
            if (length != windowIndex2) {
                A00[4] = "IqWzMtwlvGQ3uqJzMIx5j0VAke1rLFLr";
                if (A08 == -1) {
                    return -1;
                }
                int windowIndex3 = A0K(A08, c1248Yf).A00;
                return windowIndex3;
            }
            throw new RuntimeException();
        }
        int windowIndex4 = i10 + 1;
        return windowIndex4;
    }

    public int A0B(boolean z10) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z10) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C1248Yf c1248Yf, C1250Yh c1250Yh, int i10, long j10) {
        return A0E(c1248Yf, c1250Yh, i10, j10);
    }

    public final Pair<Object, Long> A0E(C1248Yf c1248Yf, C1250Yh c1250Yh, int i10, long j10) {
        return (Pair) AbstractC1589es.A01(A0G(c1248Yf, c1250Yh, i10, j10, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C1248Yf c1248Yf, C1250Yh c1250Yh, int i10, long j10, long j11) {
        return A0G(c1248Yf, c1250Yh, i10, j10, j11);
    }

    public final Pair<Object, Long> A0G(C1248Yf c1248Yf, C1250Yh c1250Yh, int i10, long j10, long j11) {
        AbstractC1589es.A00(i10, 0, A07());
        A0L(i10, c1248Yf, j11);
        if (j10 == -9223372036854775807L) {
            j10 = c1248Yf.A05();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = c1248Yf.A00;
        A0H(i11, c1250Yh);
        while (i11 < c1248Yf.A01 && c1250Yh.A02 != j10 && A0H(i11 + 1, c1250Yh).A02 <= j10) {
            i11++;
        }
        A0I(i11, c1250Yh, true);
        long j12 = c1250Yh.A02;
        if (A00[7].charAt(7) != 'm') {
            A00[1] = "3ZieKL5X1T768JW4phYrzNkptEzy1ocP";
            long j13 = j10 - j12;
            if (c1250Yh.A01 != -9223372036854775807L) {
                long j14 = c1250Yh.A01;
                if (A00[1].charAt(2) == 'i') {
                    A00[2] = "LahSWw1T0AjdVvbLLNcvYZLp9vt0kwQB";
                    j13 = Math.min(j13, j14 - 1);
                }
            }
            return Pair.create(AbstractC1589es.A01(c1250Yh.A04), Long.valueOf(Math.max(0L, j13)));
        }
        throw new RuntimeException();
    }

    public final C1250Yh A0H(int i10, C1250Yh c1250Yh) {
        return A0I(i10, c1250Yh, false);
    }

    public C1250Yh A0J(Object obj, C1250Yh c1250Yh) {
        return A0I(A0A(obj), c1250Yh, true);
    }

    public final C1248Yf A0K(int i10, C1248Yf c1248Yf) {
        return A0L(i10, c1248Yf, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i10, C1250Yh c1250Yh, C1248Yf c1248Yf, int i11, boolean z10) {
        return A09(i10, c1250Yh, c1248Yf, i11, z10) == -1;
    }

    public final boolean equals(Object obj) {
        int A0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C1248Yf c1248Yf = new C1248Yf();
        C1250Yh otherPeriod = new C1250Yh();
        C1248Yf c1248Yf2 = new C1248Yf();
        C1250Yh c1250Yh = new C1250Yh();
        int i10 = 0;
        while (true) {
            int A07 = A07();
            if (A00[2].charAt(20) == 'v') {
                throw new RuntimeException();
            }
            A00[4] = "PMvZEUC2BBAfRxUz3Ht2Mf4aXvWRW3I0";
            if (i10 < A07) {
                if (!A0K(i10, c1248Yf).equals(timeline.A0K(i10, c1248Yf2))) {
                    return false;
                }
                i10++;
            } else {
                for (int i11 = 0; i11 < A06(); i11++) {
                    if (!A0I(i11, otherPeriod, true).equals(timeline.A0I(i11, c1250Yh, true))) {
                        return false;
                    }
                }
                int A0B = A0B(true);
                if (A0B == timeline.A0B(true) && (A0C = A0C(true)) == timeline.A0C(true)) {
                    while (A0B != A0C) {
                        int A08 = A08(A0B, 0, true);
                        if (A08 != timeline.A08(A0B, 0, true)) {
                            return false;
                        }
                        A0B = A08;
                    }
                    return true;
                }
                return false;
            }
        }
    }

    public final int hashCode() {
        C1248Yf c1248Yf = new C1248Yf();
        C1250Yh c1250Yh = new C1250Yh();
        int result = 7 * 31;
        int i10 = result + A07();
        for (int i11 = 0; i11 < A07(); i11++) {
            C1248Yf window = A0K(i11, c1248Yf);
            i10 = (i10 * 31) + window.hashCode();
        }
        int result2 = i10 * 31;
        int i12 = result2 + A06();
        for (int i13 = 0; i13 < A06(); i13++) {
            i12 = (i12 * 31) + A0I(i13, c1250Yh, true).hashCode();
        }
        int A0B = A0B(true);
        while (A0B != -1) {
            int windowIndex = i12 * 31;
            i12 = windowIndex + A0B;
            A0B = A08(A0B, 0, true);
        }
        return i12;
    }
}

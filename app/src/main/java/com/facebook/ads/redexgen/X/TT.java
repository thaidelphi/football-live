package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Metadata;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TT extends AbstractC1205Wm {
    public static byte[] A01;
    public static String[] A02 = {"7v8", "DJnAqA6E6GDxffX70NYr0", "HMLexD2OfxLNkU4i", "PdG9cApk0h3cc1dwc0B2XtSkTW0Y6TE7", "k5UYWxYoR6LVtHRSH", "eRCldoUDD0o6zGdoEaM2lUCIMkyllDxL", "lqQ9oYP4JspO70UG6xFVp2o", "mWW9QFKoLcrpuCRp3uybTZIfvCH3M1OH"};
    public static final byte[] A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[7] = "0GryWP3WhhGjhrW1os7LcWQKbX07XUhe";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-26, -6, -23, -18, -12, -76, -12, -11, -6, -8};
    }

    static {
        A01();
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
        A03 = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    }

    public static boolean A02(C1648fq c1648fq) {
        return A03(c1648fq, A04);
    }

    public static boolean A03(C1648fq c1648fq, byte[] bArr) {
        if (c1648fq.A07() < bArr.length) {
            return false;
        }
        int A09 = c1648fq.A09();
        int startPosition = bArr.length;
        byte[] header = new byte[startPosition];
        int startPosition2 = bArr.length;
        c1648fq.A0k(header, 0, startPosition2);
        c1648fq.A0f(A09);
        return Arrays.equals(header, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    public final long A0E(C1648fq c1648fq) {
        return A0D(AbstractC1150Ue.A05(c1648fq.A0l()));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    public final void A0I(boolean z10) {
        super.A0I(z10);
        if (z10) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public final boolean A0J(C1648fq c1648fq, long j10, C1204Wl c1204Wl) throws Q6 {
        if (A03(c1648fq, A04)) {
            byte[] headerBytes = Arrays.copyOf(c1648fq.A0l(), c1648fq.A0A());
            int A012 = AbstractC1150Ue.A01(headerBytes);
            List<byte[]> A06 = AbstractC1150Ue.A06(headerBytes);
            if (c1204Wl.A00 != null) {
                return true;
            }
            c1204Wl.A00 = new P5().A11(A00(0, 10, 32)).A0b(A012).A0m(48000).A12(A06).A14();
            return true;
        } else if (A03(c1648fq, A03)) {
            AbstractC1589es.A02(c1204Wl.A00);
            if (this.A00) {
                return true;
            }
            this.A00 = true;
            c1648fq.A0g(A03.length);
            C1161Us A05 = AbstractC1164Uv.A05(c1648fq, false, false);
            String[] strArr = A02;
            if (strArr[6].length() != strArr[0].length()) {
                String[] strArr2 = A02;
                strArr2[1] = "KPvlxsXHjKjWQgdGdRHEY";
                strArr2[4] = "TRmC9Fc3RAZb1EOf4";
                Metadata A022 = AbstractC1164Uv.A02(C0958Mm.A02(A05.A02));
                if (A022 == null) {
                    return true;
                }
                c1204Wl.A00 = c1204Wl.A00.A07().A0v(A022.A04(c1204Wl.A00.A0P)).A14();
                return true;
            }
            throw new RuntimeException();
        } else {
            AbstractC1589es.A02(c1204Wl.A00);
            return false;
        }
    }
}

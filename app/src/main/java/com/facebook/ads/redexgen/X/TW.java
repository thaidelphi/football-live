package com.facebook.ads.redexgen.X;

import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TW extends AbstractC1205Wm {
    public static String[] A02 = {"Oy4cVVo1q05MAKbLPgmqOD", "7ew8nUwi6G1RDKOByqWkFvsVE50B", "tr9sMmGcyDTt6qfpdd2BTd", "eXs9qGzfQAFNSJTKrpKETmvICTHM0C", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "kT8YhkgkCWBzT", "adqnmN7RQmpyCH5w2Bo90q", "mGhREreuXJXYJiMK3twEX63YkdwWzEmG"};
    public UU A00;
    public TX A01;

    private int A00(C1648fq c1648fq) {
        int i10 = (c1648fq.A0l()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c1648fq.A0g(4);
            c1648fq.A0S();
        }
        int result = UQ.A00(c1648fq, i10);
        c1648fq.A0f(0);
        return result;
    }

    public static boolean A01(C1648fq c1648fq) {
        if (c1648fq.A07() >= 5) {
            int A0I = c1648fq.A0I();
            if (A02[1].length() != 28) {
                throw new RuntimeException();
            }
            A02[5] = "CqKN6S";
            if (A0I == 127 && c1648fq.A0Q() == 1179402563) {
                return true;
            }
        }
        return false;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    public final long A0E(C1648fq c1648fq) {
        if (!A02(c1648fq.A0l())) {
            return -1L;
        }
        return A00(c1648fq);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    public final void A0I(boolean z10) {
        super.A0I(z10);
        if (z10) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0J(C1648fq c1648fq, long j10, C1204Wl c1204Wl) {
        byte[] A0l = c1648fq.A0l();
        UU uu = this.A00;
        if (uu == null) {
            UU uu2 = new UU(A0l, 17);
            this.A00 = uu2;
            c1204Wl.A00 = uu2.A08(Arrays.copyOfRange(A0l, 9, c1648fq.A0A()), null);
            return true;
        } else if ((A0l[0] & Byte.MAX_VALUE) == 3) {
            UT A04 = US.A04(c1648fq);
            UU streamMetadata = uu.A09(A04);
            this.A00 = streamMetadata;
            this.A01 = new TX(streamMetadata, A04);
            return true;
        } else if (!A02(A0l)) {
            return true;
        } else {
            if (this.A01 != null) {
                this.A01.A00(j10);
                c1204Wl.A01 = this.A01;
            }
            AbstractC1589es.A01(c1204Wl.A00);
            return false;
        }
    }
}

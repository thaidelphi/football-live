package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TU implements UK {
    public static byte[] A03;
    public static final UO A04;
    public UL A00;
    public AbstractC1205Wm A01;
    public boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{16, 55, 63, 58, 51, 50, 118, 34, 57, 118, 50, 51, 34, 51, 36, 59, 63, 56, 51, 118, 52, 63, 34, 37, 34, 36, 51, 55, 59, 118, 34, 47, 38, 51};
    }

    static {
        A02();
        A04 = new UO() { // from class: com.facebook.ads.redexgen.X.TV
            @Override // com.facebook.ads.redexgen.X.UO
            public final UK[] A5D() {
                return TU.A04();
            }

            @Override // com.facebook.ads.redexgen.X.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
    }

    public static C1648fq A00(C1648fq c1648fq) {
        c1648fq.A0f(0);
        return c1648fq;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean A03(WJ wj) throws IOException {
        C1201Wi c1201Wi = new C1201Wi();
        if (c1201Wi.A05(wj, true) && (c1201Wi.A04 & 2) == 2) {
            int length = Math.min(c1201Wi.A00, 8);
            C1648fq c1648fq = new C1648fq(length);
            wj.AG1(c1648fq.A0l(), 0, length);
            if (TW.A01(A00(c1648fq))) {
                this.A01 = new TW();
            } else if (TR.A06(A00(c1648fq))) {
                this.A01 = new TR();
            } else if (!TT.A02(A00(c1648fq))) {
                return false;
            } else {
                this.A01 = new TT();
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ UK[] A04() {
        return new UK[]{new TU()};
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A00 = ul;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        AbstractC1589es.A02(this.A00);
        if (this.A01 == null) {
            if (A03(wj)) {
                wj.AHr();
            } else {
                throw Q6.A01(A01(0, 34, 38), null);
            }
        }
        if (!this.A02) {
            InterfaceC1157Uo AJX = this.A00.AJX(0, 1);
            this.A00.A6E();
            this.A01.A0H(this.A00, AJX);
            this.A02 = true;
        }
        return this.A01.A0B(wj, c1152Ug);
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        if (this.A01 != null) {
            this.A01.A0G(j10, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        try {
            return A03(wj);
        } catch (Q6 unused) {
            return false;
        }
    }
}

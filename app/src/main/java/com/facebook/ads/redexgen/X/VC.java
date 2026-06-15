package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class VC implements UK {
    public static String[] A0G = {"6g1bNUUtl11iOkvfCAAvxfkod66CAynh", "ESP77TUHVM5E0aYj50BwdUYMZdXJLl2H", "rJS4B60nmJzBMWXgQ03gexZm0GZpuq60", "TsTl4S97KlIct3G4gSUvIT8y1ZwUZOZm", "RUalil3bEnxMCMWUU0RdSQ9LkcF0n8OO", "cHPAPrxsCe7kd0frShZJMVLg3ZxxABA0", "URkVam1mW6LKnDHTLEHiqe7yjH3ZIR", "RrLxT"};
    public static final UO A0H = new UO() { // from class: com.facebook.ads.redexgen.X.VF
        @Override // com.facebook.ads.redexgen.X.UO
        public final UK[] A5D() {
            return VC.A07();
        }

        @Override // com.facebook.ads.redexgen.X.UO
        public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
            return UN.A01(this, uri, map);
        }
    };
    public int A00;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public UL A06;
    public VI A07;
    public V6 A08;
    public boolean A09;
    public boolean A0A;
    public final C1648fq A0D = new C1648fq(4);
    public final C1648fq A0C = new C1648fq(9);
    public final C1648fq A0F = new C1648fq(11);
    public final C1648fq A0E = new C1648fq();
    public final V9 A0B = new V9();
    public int A01 = 1;

    private long A00() {
        if (this.A09) {
            return this.A04 + this.A05;
        }
        if (this.A0B.A0D() == -9223372036854775807L) {
            return 0L;
        }
        return this.A05;
    }

    private C1648fq A01(WJ wj) throws IOException {
        if (this.A02 > this.A0E.A08()) {
            this.A0E.A0j(new byte[Math.max(this.A0E.A08() * 2, this.A02)], 0);
        } else {
            this.A0E.A0f(0);
        }
        this.A0E.A0e(this.A02);
        wj.readFully(this.A0E.A0l(), 0, this.A02);
        return this.A0E;
    }

    @RequiresNonNull({"extractorOutput"})
    private void A02() {
        if (!this.A0A) {
            this.A06.AID(new C1191Vy(-9223372036854775807L));
            this.A0A = true;
        }
    }

    private void A03(WJ wj) throws IOException {
        wj.AJ9(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean A04(WJ wj) throws IOException {
        if (wj.AGZ(this.A0C.A0l(), 0, 9, true)) {
            this.A0C.A0f(0);
            this.A0C.A0g(4);
            int A0I = this.A0C.A0I();
            int flags = A0I & 4;
            boolean hasVideo = flags != 0;
            int flags2 = A0I & 1;
            boolean z10 = flags2 != 0;
            if (hasVideo && this.A07 == null) {
                this.A07 = new VI(this.A06.AJX(8, 1));
            }
            String[] strArr = A0G;
            String str = strArr[2];
            String str2 = strArr[3];
            int charAt = str.charAt(28);
            int flags3 = str2.charAt(28);
            if (charAt != flags3) {
                String[] strArr2 = A0G;
                strArr2[2] = "sPc1XlZn2p7PIxLjHHqxieonMYpqOOHM";
                strArr2[3] = "siXOeJWJ0xDsCtlJTOYquQvLYq37jPih";
                if (z10 && this.A08 == null) {
                    this.A08 = new V6(this.A06.AJX(9, 2));
                }
                this.A06.A6E();
                int flags4 = this.A0C.A0C();
                this.A00 = (flags4 - 9) + 4;
                this.A01 = 2;
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean A05(WJ wj) throws IOException {
        boolean z10 = true;
        boolean z11 = false;
        long A00 = A00();
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            z11 = this.A07.A00(A01(wj), A00);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            z11 = this.A08.A00(A01(wj), A00);
        } else {
            if (this.A03 == 18) {
                boolean wasConsumed = this.A0A;
                if (!wasConsumed) {
                    z11 = this.A0B.A00(A01(wj), A00);
                    long timestampUs = this.A0B.A0D();
                    if (timestampUs != -9223372036854775807L) {
                        this.A06.AID(new W2(this.A0B.A0E(), this.A0B.A0F(), timestampUs));
                        this.A0A = true;
                    }
                }
            }
            wj.AJ9(this.A02);
            z10 = false;
        }
        boolean wasConsumed2 = this.A09;
        if (!wasConsumed2 && z11) {
            this.A09 = true;
            this.A04 = this.A0B.A0D() == -9223372036854775807L ? -this.A05 : 0L;
        }
        this.A00 = 4;
        String[] strArr = A0G;
        if (strArr[7].length() != strArr[6].length()) {
            String[] strArr2 = A0G;
            strArr2[7] = "Joz9i";
            strArr2[6] = "wg6LgmNKrc2rFHmIRC6XZE8fQl8u56";
            this.A01 = 2;
            return z10;
        }
        throw new RuntimeException();
    }

    private boolean A06(WJ wj) throws IOException {
        if (wj.AGZ(this.A0F.A0l(), 0, 11, true)) {
            this.A0F.A0f(0);
            this.A03 = this.A0F.A0I();
            this.A02 = this.A0F.A0K();
            this.A05 = this.A0F.A0K();
            this.A05 = ((this.A0F.A0I() << 24) | this.A05) * 1000;
            this.A0F.A0g(3);
            this.A01 = 4;
            return true;
        }
        return false;
    }

    public static /* synthetic */ UK[] A07() {
        return new UK[]{new VC()};
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A06 = ul;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        AbstractC1589es.A02(this.A06);
        while (true) {
            switch (this.A01) {
                case 1:
                    if (A04(wj)) {
                        break;
                    } else {
                        return -1;
                    }
                case 2:
                    A03(wj);
                    break;
                case 3:
                    if (A06(wj)) {
                        break;
                    } else {
                        return -1;
                    }
                case 4:
                    if (!A05(wj)) {
                        break;
                    } else {
                        return 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        if (j10 == 0) {
            this.A01 = 1;
            this.A09 = false;
        } else {
            this.A01 = 3;
        }
        this.A00 = 0;
        String[] strArr = A0G;
        if (strArr[4].charAt(17) != strArr[1].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[7] = "ZPBZK";
        strArr2[6] = "RQrePEMRu13dKDo3jQj0SkyLE1RpCV";
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        wj.AG1(this.A0D.A0l(), 0, 3);
        this.A0D.A0f(0);
        if (this.A0D.A0K() != 4607062) {
            return false;
        }
        wj.AG1(this.A0D.A0l(), 0, 2);
        this.A0D.A0f(0);
        if ((this.A0D.A0M() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        wj.AG1(this.A0D.A0l(), 0, 4);
        this.A0D.A0f(0);
        int dataOffset = this.A0D.A0C();
        wj.AHr();
        wj.A3x(dataOffset);
        wj.AG1(this.A0D.A0l(), 0, 4);
        this.A0D.A0f(0);
        int dataOffset2 = this.A0D.A0C();
        return dataOffset2 == 0;
    }
}

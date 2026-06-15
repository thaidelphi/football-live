package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.android.exoplayer2.Metadata;
import java.io.IOException;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class VW implements UK {
    public static String[] A0E = {"b8zxPGVc77C8YlQoWjcqZfexAySqCipq", "Tz2LgWHh4TaGmnCQJEaHYkVmZtglWZja", "vv0qg0JwaSkQghtdVwzniTtFCK6rd5XH", "rI4ufMStmvmyFX1azsqmhFT6sTspnCji", "s4vEvmA0YlUFhGtbykT1SgV6Rmnd4dfN", "", "ZeP2jCuoxXRjkLxyeTqY5NWBkRSt0GUO", "BeUfobZaXEgk1vHHg5qegAWWhLyO"};
    public static final UO A0F = new UO() { // from class: com.facebook.ads.redexgen.X.Ve
        @Override // com.facebook.ads.redexgen.X.UO
        public final UK[] A5D() {
            return VW.A09();
        }

        @Override // com.facebook.ads.redexgen.X.UO
        public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
            return UN.A01(this, uri, map);
        }
    };
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Metadata A05;
    public UL A06;
    public UU A07;
    public InterfaceC1157Uo A08;
    public C1172Vf A09;
    public final UP A0A;
    public final C1648fq A0B;
    public final boolean A0C;
    public final byte[] A0D;

    public VW() {
        this(0);
    }

    public VW(int i10) {
        this.A0D = new byte[42];
        this.A0B = new C1648fq(new byte[32768], 0);
        this.A0C = (i10 & 1) != 0;
        this.A0A = new UP();
        this.A03 = 0;
    }

    private int A00(WJ wj, C1152Ug c1152Ug) throws IOException {
        AbstractC1589es.A01(this.A08);
        AbstractC1589es.A01(this.A07);
        if (this.A09 != null && this.A09.A0B()) {
            C1172Vf c1172Vf = this.A09;
            String[] strArr = A0E;
            if (strArr[0].charAt(16) != strArr[2].charAt(16)) {
                String[] strArr2 = A0E;
                strArr2[0] = "Wrn8iwZbvFTMzyULGJq4KlCaMJjw9X7M";
                strArr2[2] = "geT2vOINuTMF3b7pTvnt8dOx6Eb23e1Q";
                return c1172Vf.A08(wj, c1152Ug);
            }
            throw new RuntimeException();
        } else if (this.A04 == -1) {
            this.A04 = UQ.A01(wj, this.A07);
            return 0;
        } else {
            int A0A = this.A0B.A0A();
            boolean z10 = false;
            if (A0A < 32768) {
                int read = wj.read(this.A0B.A0l(), A0A, 32768 - A0A);
                z10 = read == -1;
                if (!z10) {
                    this.A0B.A0e(A0A + read);
                } else {
                    int currentLimit = this.A0B.A07();
                    if (currentLimit == 0) {
                        A03();
                        String[] strArr3 = A0E;
                        String str = strArr3[0];
                        String str2 = strArr3[2];
                        int charAt = str.charAt(16);
                        int currentLimit2 = str2.charAt(16);
                        if (charAt != currentLimit2) {
                            String[] strArr4 = A0E;
                            strArr4[6] = "waaSqI27CqSUXyly1wq2DbYpw5UE8TCS";
                            strArr4[3] = "vEOMs2OACLPHrHhDHCqWJ1G1Spw17Rot";
                            return -1;
                        }
                        throw new RuntimeException();
                    }
                }
            }
            int A09 = this.A0B.A09();
            int i10 = this.A00;
            int currentLimit3 = this.A02;
            if (i10 < currentLimit3) {
                C1648fq c1648fq = this.A0B;
                int i11 = this.A02;
                int currentLimit4 = this.A00;
                int i12 = i11 - currentLimit4;
                int currentLimit5 = this.A0B.A07();
                c1648fq.A0g(Math.min(i12, currentLimit5));
            }
            long A01 = A01(this.A0B, z10);
            int A092 = this.A0B.A09() - A09;
            this.A0B.A0f(A09);
            this.A08.AHx(this.A0B, A092);
            int currentLimit6 = this.A00;
            this.A00 = currentLimit6 + A092;
            if (A0E[5].length() != 29) {
                String[] strArr5 = A0E;
                strArr5[0] = "Ya2fOcoOng8GUYfY6HqKCD0S72LcOgrK";
                strArr5[2] = "fIQIBkjf3eJORY2jPBmA7XcSdHqMqleE";
                int currentLimit7 = (A01 > (-1L) ? 1 : (A01 == (-1L) ? 0 : -1));
                if (currentLimit7 != 0) {
                    A03();
                    this.A00 = 0;
                    this.A04 = A01;
                }
                if (this.A0B.A07() < 16) {
                    int A07 = this.A0B.A07();
                    System.arraycopy(this.A0B.A0l(), this.A0B.A09(), this.A0B.A0l(), 0, A07);
                    this.A0B.A0f(0);
                    this.A0B.A0e(A07);
                }
                return 0;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0034 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A01(com.facebook.ads.redexgen.X.C1648fq r5, boolean r6) {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.UU r0 = r4.A07
            com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0)
            int r3 = r5.A09()
        L9:
            int r0 = r5.A0A()
            int r0 = r0 + (-16)
            if (r3 > r0) goto L2b
            r5.A0f(r3)
            com.facebook.ads.redexgen.X.UU r2 = r4.A07
            int r1 = r4.A01
            com.facebook.ads.redexgen.X.UP r0 = r4.A0A
            boolean r0 = com.facebook.ads.redexgen.X.UQ.A08(r5, r2, r1, r0)
            if (r0 == 0) goto L28
            r5.A0f(r3)
            com.facebook.ads.redexgen.X.UP r0 = r4.A0A
            long r0 = r0.A00
            return r0
        L28:
            int r3 = r3 + 1
            goto L9
        L2b:
            if (r6 == 0) goto L65
        L2d:
            int r1 = r5.A0A()
            int r0 = r4.A02
            int r1 = r1 - r0
            if (r3 > r1) goto L5d
            r5.A0f(r3)
            com.facebook.ads.redexgen.X.UU r2 = r4.A07     // Catch: java.lang.IndexOutOfBoundsException -> L44
            int r1 = r4.A01     // Catch: java.lang.IndexOutOfBoundsException -> L44
            com.facebook.ads.redexgen.X.UP r0 = r4.A0A     // Catch: java.lang.IndexOutOfBoundsException -> L44
            boolean r2 = com.facebook.ads.redexgen.X.UQ.A08(r5, r2, r1, r0)     // Catch: java.lang.IndexOutOfBoundsException -> L44
            goto L45
        L44:
            r2 = 0
        L45:
            int r1 = r5.A09()
            int r0 = r5.A0A()
            if (r1 <= r0) goto L50
            r2 = 0
        L50:
            if (r2 == 0) goto L5a
            r5.A0f(r3)
            com.facebook.ads.redexgen.X.UP r0 = r4.A0A
            long r0 = r0.A00
            return r0
        L5a:
            int r3 = r3 + 1
            goto L2d
        L5d:
            int r0 = r5.A0A()
            r5.A0f(r0)
            goto L68
        L65:
            r5.A0f(r3)
        L68:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VW.A01(com.facebook.ads.redexgen.X.fq, boolean):long");
    }

    private Uj A02(long j10, long j11) {
        AbstractC1589es.A01(this.A07);
        if (this.A07.A0A != null) {
            return new W3(this.A07, j10);
        }
        if (j11 != -1 && this.A07.A09 > 0) {
            this.A09 = new C1172Vf(this.A07, this.A01, j10, j11);
            return this.A09.A09();
        }
        return new C1191Vy(this.A07.A06());
    }

    private void A03() {
        ((InterfaceC1157Uo) AbstractC1672gE.A0f(this.A08)).AI0((this.A04 * 1000000) / ((UU) AbstractC1672gE.A0f(this.A07)).A07, 1, this.A00, 0, null);
    }

    private void A04(WJ wj) throws IOException {
        this.A01 = US.A00(wj);
        ((UL) AbstractC1672gE.A0f(this.A06)).AID(A02(wj.A8d(), wj.A8E()));
        this.A03 = 5;
    }

    private void A05(WJ wj) throws IOException {
        wj.AG1(this.A0D, 0, this.A0D.length);
        wj.AHr();
        this.A03 = 2;
    }

    private void A06(WJ wj) throws IOException {
        this.A05 = US.A02(wj, !this.A0C);
        this.A03 = 1;
    }

    private void A07(WJ wj) throws IOException {
        boolean z10 = false;
        UR metadataHolder = new UR(this.A07);
        while (!z10) {
            z10 = US.A0B(wj, metadataHolder);
            this.A07 = (UU) AbstractC1672gE.A0f(metadataHolder.A00);
        }
        AbstractC1589es.A01(this.A07);
        this.A02 = Math.max(this.A07.A06, 6);
        ((InterfaceC1157Uo) AbstractC1672gE.A0f(this.A08)).A6U(this.A07.A08(this.A0D, this.A05));
        this.A03 = 4;
    }

    private void A08(WJ wj) throws IOException {
        US.A09(wj);
        this.A03 = 3;
    }

    public static /* synthetic */ UK[] A09() {
        return new UK[]{new VW()};
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A06 = ul;
        this.A08 = ul.AJX(0, 1);
        ul.A6E();
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        switch (this.A03) {
            case 0:
                A06(wj);
                return 0;
            case 1:
                A05(wj);
                return 0;
            case 2:
                A08(wj);
                if (A0E[7].length() != 28) {
                    throw new RuntimeException();
                }
                A0E[7] = "zJCdOrVJVUlJhvvR3L8JmhucXOLV";
                return 0;
            case 3:
                A07(wj);
                return 0;
            case 4:
                A04(wj);
                return 0;
            case 5:
                return A00(wj, c1152Ug);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        if (j10 == 0) {
            this.A03 = 0;
        } else if (this.A09 != null) {
            this.A09.A0A(j11);
        }
        this.A04 = j11 != 0 ? -1L : 0L;
        this.A00 = 0;
        this.A0B.A0d(0);
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        US.A01(wj, false);
        return US.A0A(wj);
    }
}

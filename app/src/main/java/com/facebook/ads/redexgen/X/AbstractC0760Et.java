package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Et  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0760Et implements InterfaceC1259Yq, InterfaceC1054Qi {
    public static String[] A0E = {"oB8o3Th5", "AnBFzSQbBg7XonHstrV3SXteCYipj8mo", "WENq94c1TqAN1gNb1fPTxU5Kb6Tz0I9", "", "Eik8wychv9XYh12j89wk1XzQBHMCrxnW", "ZFvCNUCB", "84HfrcJvuRCzsvJUAR9q", "8Dt8DsXmJbmtS34K0KUNF631ZMZAqH3y"};
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C1057Ql A05;
    public RK A06;
    public InterfaceC1381bV A07;
    public boolean A08;
    public boolean A09;
    public ZM[] A0A;
    public final int A0C;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public MI A0B = MI.A09;
    public final P6 A0D = new P6();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j10, boolean z10) throws EK;

    public abstract void A1c(ZM[] zmArr, long j10, long j11) throws EK;

    public AbstractC0760Et(int i10) {
        this.A0C = i10;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j10, boolean z10) throws EK {
        this.A08 = false;
        this.A02 = j10;
        this.A03 = j10;
        A1a(j10, z10);
    }

    public final int A1Q(long j10) {
        return ((InterfaceC1381bV) AbstractC1589es.A01(this.A07)).AJ8(j10 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(P6 p62, C1214Ww c1214Ww, int i10) {
        int AGX = ((InterfaceC1381bV) AbstractC1589es.A01(this.A07)).AGX(p62, c1214Ww, i10);
        if (AGX == -4) {
            if (c1214Ww.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c1214Ww.A00 = c1214Ww.A01;
            c1214Ww.A01 += this.A04;
            this.A03 = Math.max(this.A03, c1214Ww.A01);
        } else if (AGX == -5) {
            Object A01 = AbstractC1589es.A01(p62.A00);
            String[] strArr = A0E;
            String str = strArr[5];
            String str2 = strArr[0];
            int length = str.length();
            int result = str2.length();
            if (length != result) {
                throw new RuntimeException();
            }
            A0E[6] = "ZS";
            ZM zm = (ZM) A01;
            int result2 = (zm.A0M > Long.MAX_VALUE ? 1 : (zm.A0M == Long.MAX_VALUE ? 0 : -1));
            if (result2 != 0) {
                p62.A00 = zm.A07().A0s(zm.A0M + this.A04).A14();
            }
        }
        return AGX;
    }

    public final EK A1S(Throwable th, ZM zm, int i10) {
        return A1T(th, zm, false, i10);
    }

    public final EK A1T(Throwable th, ZM zm, boolean z10, int i10) {
        int i11 = 4;
        if (zm != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AJR(zm);
                i11 = AbstractC1047Qb.A03(formatSupport);
            } catch (EK unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return EK.A04(th, getName(), A1O(), zm, i11, z10, i10);
    }

    public final P6 A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C1057Ql A1V() {
        return (C1057Ql) AbstractC1589es.A01(this.A05);
    }

    public final RK A1W() {
        return (RK) AbstractC1589es.A01(this.A06);
    }

    public void A1X() throws EK {
    }

    public void A1Y() {
    }

    public void A1b(boolean z10, boolean z11) throws EK {
    }

    public final boolean A1d() {
        return A9f() ? this.A08 : ((InterfaceC1381bV) AbstractC1589es.A01(this.A07)).AAT();
    }

    public final ZM[] A1e() {
        return (ZM[]) AbstractC1589es.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void A5n() {
        AbstractC1589es.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void A6B(C1057Ql c1057Ql, ZM[] zmArr, InterfaceC1381bV interfaceC1381bV, long j10, boolean z10, boolean z11, long j11, long j12) throws EK {
        AbstractC1589es.A08(this.A01 == 0);
        this.A05 = c1057Ql;
        this.A01 = 1;
        A1b(z10, z11);
        AHg(zmArr, interfaceC1381bV, j11, j12);
        A1P(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final InterfaceC1054Qi A73() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public PD A8J() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final MI A8z() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final int A90() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final InterfaceC1381bV A93() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq, com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final int A9D() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.X.QS
    public void A9Y(int i10, Object obj) throws EK {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final boolean A9f() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void A9z(int i10, RK rk) {
        this.A00 = i10;
        this.A06 = rk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final boolean AAC() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void ABp() throws IOException {
        ((InterfaceC1381bV) AbstractC1589es.A01(this.A07)).ABm();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void AHg(ZM[] zmArr, InterfaceC1381bV interfaceC1381bV, long j10, long j11) throws EK {
        AbstractC1589es.A08(!this.A08);
        this.A07 = interfaceC1381bV;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j10;
        }
        this.A0A = zmArr;
        this.A04 = j11;
        A1c(zmArr, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void AHs(long j10) throws EK {
        A1P(j10, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void AIT() {
        this.A08 = true;
    }

    public int AJT() throws EK {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void start() throws EK {
        AbstractC1589es.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public final void stop() {
        AbstractC1589es.A08(this.A01 == 2);
        this.A01 = 1;
        String[] strArr = A0E;
        if (strArr[5].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0E[2] = "cRJyAHvNnFjWqvJO5qcvTUpDvTM";
        A1Y();
    }
}

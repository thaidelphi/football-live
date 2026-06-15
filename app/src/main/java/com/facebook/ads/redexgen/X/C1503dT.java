package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.dT  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1503dT extends FrameLayout implements DS {
    public static byte[] A0B;
    public static final RelativeLayout.LayoutParams A0C;
    public C05576e A00;
    public Intent A01;
    public Bundle A02;
    public DS A03;
    public final AbstractC2058md A04;
    public final AbstractC2058md A05;
    public final C05576e A06;
    public final C1900k1 A07;
    public final A7 A08;
    public final View$OnSystemUiVisibilityChangeListenerC0705Cq A09;
    public final DR A0A;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0B = new byte[]{117, 105, 100, 102, 96, 104, 96, 107, 113};
    }

    static {
        A0A();
        A0C = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1503dT(C1900k1 c1900k1, A7 a72, AbstractC2058md abstractC2058md, AbstractC2058md abstractC2058md2, DR dr, C05576e c05576e) {
        super(c1900k1);
        this.A07 = c1900k1;
        this.A08 = a72;
        this.A05 = abstractC2058md;
        this.A04 = abstractC2058md2;
        this.A0A = dr;
        this.A06 = c05576e;
        this.A09 = new View$OnSystemUiVisibilityChangeListenerC0705Cq(this);
        this.A09.A05(EnumC0704Cp.A02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1741hM A05(C0833Ho c0833Ho, EC ec) {
        return new C1741hM(this.A07, this.A08, this.A0A, this.A04, this.A04.A0s(), ec, true, c0833Ho);
    }

    private C0906Kj A06() {
        if (this.A04.A1b().A0F().A07() != null) {
            this.A05.A14(this.A04.A1b().A0F().A07().A0N());
            this.A05.A15(this.A04.A1b().A0F().A07().A0P());
        }
        C1736hH c1736hH = new C1736hH();
        C0833Ho A07 = A07(c1736hH, this.A04);
        C0906Kj c0906Kj = new C0906Kj(this.A07, c1736hH, this.A08, this.A05, new C05987t(this.A07), this.A0A);
        c0906Kj.setVideoLeadingPlayableAdListener(new C1504dU(this, A07, c1736hH));
        return c0906Kj;
    }

    private C0833Ho A07(EC ec, AbstractC2058md abstractC2058md) {
        C04672p A07 = abstractC2058md.A1b().A0F().A07();
        if (A07 == null || !A07.A0M()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(0, 9, 37), ec.A8b());
        return new C0833Ho(this.A07, abstractC2058md, A07, this.A08, null, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A03 != null) {
            this.A03.onDestroy();
            if (this.A03 instanceof View) {
                ((View) this.A03).setVisibility(8);
                removeView((View) this.A03);
            }
        }
    }

    private final void A0B(Intent intent, Bundle bundle, C05576e c05576e) {
        this.A03 = A06();
        this.A03.AAj(intent, bundle, c05576e);
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AAj(Intent intent, Bundle bundle, C05576e c05576e) {
        this.A01 = intent;
        this.A02 = bundle;
        this.A00 = c05576e;
        this.A0A.A3v(this, A0C);
        A0B(intent, bundle, c05576e);
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEP(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEs(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AI1(Bundle bundle) {
    }

    public DS getContentView() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public String getCurrentClientToken() {
        return this.A05.A1g();
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void onDestroy() {
    }

    public void setListener(DR dr) {
    }
}

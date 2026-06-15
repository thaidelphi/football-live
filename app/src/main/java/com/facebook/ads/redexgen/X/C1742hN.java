package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.hN  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1742hN implements InterfaceC0831Hm {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ C1741hM A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A01();
    }

    public C1742hN(C1741hM c1741hM) {
        this.A00 = c1741hM;
    }

    public /* synthetic */ C1742hN(C1741hM c1741hM, C1749hU c1749hU) {
        this(c1741hM);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Hm
    public final void ACm() {
        this.A00.A0U(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Hm
    public final void ADP() {
        boolean z10;
        AbstractC2058md abstractC2058md;
        DR dr;
        EC ec;
        A7 a72;
        AbstractC2058md abstractC2058md2;
        C0833Ho c0833Ho;
        C0833Ho c0833Ho2;
        C1900k1 c1900k1;
        EC ec2;
        AbstractC2058md abstractC2058md3;
        AbstractC2058md abstractC2058md4;
        C1900k1 c1900k12;
        AbstractC2058md abstractC2058md5;
        AbstractC2058md abstractC2058md6;
        C1900k1 c1900k13;
        C04672p c04672p;
        C1900k1 c1900k14;
        C1900k1 c1900k15;
        z10 = this.A00.A0Z;
        if (!z10) {
            abstractC2058md = this.A00.A0I;
            if (!TextUtils.isEmpty(abstractC2058md.A1g())) {
                a72 = this.A00.A0M;
                abstractC2058md2 = this.A00.A0I;
                String A1g = abstractC2058md2.A1g();
                FB fb = new FB();
                c0833Ho = this.A00.A07;
                FB A03 = fb.A03(c0833Ho.getViewabilityChecker());
                c0833Ho2 = this.A00.A07;
                a72.AB0(A1g, A03.A02(c0833Ho2.getTouchDataRecorder()).A05());
                c1900k1 = this.A00.A0L;
                C0677Bh A00 = C0677Bh.A00(c1900k1);
                ec2 = this.A00.A0R;
                String A8b = ec2.A8b();
                abstractC2058md3 = this.A00.A0I;
                A00.A0E(A8b, abstractC2058md3.A1g());
                abstractC2058md4 = this.A00.A0I;
                C04592h A1c = abstractC2058md4.A1c();
                c1900k12 = this.A00.A0L;
                C04592h.A07(A1c, c1900k12);
                abstractC2058md5 = this.A00.A0I;
                String A0g = abstractC2058md5.A0g();
                abstractC2058md6 = this.A00.A0I;
                AbstractC04783a.A02(A0g, AbstractC0693Ce.A00(abstractC2058md6.A0i()));
                c1900k13 = this.A00.A0L;
                c1900k13.A0F().A3B();
                c04672p = this.A00.A0J;
                if (c04672p.A0P()) {
                    c1900k14 = this.A00.A0L;
                    c1900k14.A0F().ADh();
                }
            }
            C1741hM c1741hM = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            dr = c1741hM.A0Q;
            ec = this.A00.A0R;
            dr.A4Z(ec.A86());
            return;
        }
        c1900k15 = this.A00.A0L;
        c1900k15.A0F().ADi();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Hm
    public final void ADv() {
        DR dr;
        EC ec;
        dr = this.A00.A0Q;
        ec = this.A00.A0R;
        dr.A4Z(ec.A7r());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Hm
    public final void AFo() {
        DR dr;
        dr = this.A00.A0Q;
        dr.ACY(15);
    }
}

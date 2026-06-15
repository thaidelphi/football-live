package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.oc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2166oc<ModelType, StateType> {
    public static byte[] A0A;
    public static final C2166oc A0B;
    public EnumC2167od A00;
    public EnumC2154oQ A01;
    public String A02;
    public boolean A03;
    public final boolean A04;
    public final C2166oc A05;
    public final ModelType A06;
    public final StateType A07;
    public final String A08;
    public final List<InterfaceC2170og<ModelType, StateType>> A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A03(InterfaceC2153oP interfaceC2153oP) {
        for (InterfaceC2170og<ModelType, StateType> interfaceC2170og : this.A09) {
            interfaceC2170og.A6H(this, interfaceC2153oP);
        }
        EnumC2154oQ A9K = interfaceC2153oP.A9K(this);
        this.A01 = A9K;
        if (A9K == EnumC2154oQ.A02) {
            this.A03 = true;
        }
    }

    static {
        A02();
        A0B = new C2166oc(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A0B, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oc != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oe != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2166oc(com.facebook.ads.redexgen.X.C2168oe<ModelType, StateType> r9) {
        /*
            r8 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.X.C2168oe.A01(r9)
            java.lang.Object r2 = com.facebook.ads.redexgen.X.C2168oe.A02(r9)
            java.lang.String r3 = com.facebook.ads.redexgen.X.C2168oe.A03(r9)
            java.lang.String r4 = com.facebook.ads.redexgen.X.C2168oe.A03(r9)
            java.util.List r0 = com.facebook.ads.redexgen.X.C2168oe.A04(r9)
            if (r0 != 0) goto L27
            java.util.List r5 = java.util.Collections.emptyList()
        L1a:
            com.facebook.ads.redexgen.X.oc r6 = com.facebook.ads.redexgen.X.C2168oe.A00(r9)
            boolean r7 = com.facebook.ads.redexgen.X.C2168oe.A05(r9)
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L27:
            java.util.List r5 = com.facebook.ads.redexgen.X.C2168oe.A04(r9)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2166oc.<init>(com.facebook.ads.redexgen.X.oe):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oc != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C2166oc(ModelType modeltype, StateType statetype, String str, String str2, List<InterfaceC2170og<ModelType, StateType>> list, C2166oc c2166oc, boolean z10) {
        this.A00 = EnumC2167od.A02;
        if (!(modeltype instanceof View)) {
            this.A06 = modeltype;
            this.A07 = statetype;
            this.A08 = str;
            this.A02 = str2;
            this.A05 = c2166oc;
            this.A03 = false;
            this.A09 = list;
            this.A04 = z10;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C2168oe<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C2168oe<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oc != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A03;
    }
}

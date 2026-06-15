package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.io  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1825io extends AnonymousClass24 {
    public static byte[] A01;
    public final /* synthetic */ C1816ie A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, 63};
    }

    public C1825io(C1816ie c1816ie) {
        this.A00 = c1816ie;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0B(C2076mv c2076mv) {
        this.A00.A1W(c2076mv);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0C() {
        InterfaceC1815id interfaceC1815id;
        InterfaceC1815id interfaceC1815id2;
        interfaceC1815id = this.A00.A0G;
        if (interfaceC1815id != null) {
            interfaceC1815id2 = this.A00.A0G;
            interfaceC1815id2.AC6();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0F(AnonymousClass23 anonymousClass23) {
        C0957Mj c0957Mj;
        C0957Mj c0957Mj2;
        c0957Mj = this.A00.A0A;
        if (c0957Mj != null) {
            c0957Mj2 = this.A00.A0A;
            c0957Mj2.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass24
    public final void A0G(C0660Ag c0660Ag) {
        long j10;
        InterfaceC1815id interfaceC1815id;
        InterfaceC1815id interfaceC1815id2;
        InterfaceC04311f A0F = this.A00.A12().A0F();
        j10 = this.A00.A00;
        A0F.A3D(C0709Cu.A01(j10), c0660Ag.A03().getErrorCode(), c0660Ag.A04());
        interfaceC1815id = this.A00.A0G;
        if (interfaceC1815id != null) {
            interfaceC1815id2 = this.A00.A0G;
            interfaceC1815id2.AD4(c0660Ag);
        }
    }
}

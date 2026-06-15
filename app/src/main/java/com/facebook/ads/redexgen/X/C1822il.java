package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.il  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1822il implements InterfaceC05907l {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C2076mv A00;
    public final /* synthetic */ C1816ie A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, 63, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, 63, 55, 4};
    }

    static {
        A01();
    }

    public C1822il(C1816ie c1816ie, C2076mv c2076mv, boolean z10) {
        this.A01 = c1816ie;
        this.A00 = c2076mv;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACa() {
        C1900k1 c1900k1;
        long j10;
        InterfaceC1815id interfaceC1815id;
        InterfaceC1815id interfaceC1815id2;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 111);
        c1900k1 = this.A01.A0c;
        InterfaceC04311f A0F = c1900k1.A0F();
        j10 = this.A01.A00;
        A0F.A3D(C0709Cu.A01(j10), adErrorType.getErrorCode(), A00);
        interfaceC1815id = this.A01.A0G;
        if (interfaceC1815id != null) {
            interfaceC1815id2 = this.A01.A0G;
            interfaceC1815id2.AD4(C0660Ag.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACj() {
        InterfaceC1815id interfaceC1815id;
        AQ aq;
        C1900k1 c1900k1;
        InterfaceC1815id interfaceC1815id2;
        C1900k1 c1900k12;
        boolean A0r;
        InterfaceC1815id interfaceC1815id3;
        C0957Mj c0957Mj;
        C0957Mj c0957Mj2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            c0957Mj = this.A01.A0A;
            if (c0957Mj != null) {
                c0957Mj2 = this.A01.A0A;
                c0957Mj2.A0L();
            }
        }
        interfaceC1815id = this.A01.A0G;
        if (interfaceC1815id != null) {
            aq = this.A01.A0E;
            if (aq.equals(AQ.A04)) {
                A0r = this.A01.A0r();
                if (!A0r) {
                    interfaceC1815id3 = this.A01.A0G;
                    interfaceC1815id3.AE5();
                }
            }
            if (this.A02) {
                C1816ie c1816ie = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    c1900k1 = c1816ie.A0c;
                    if (C06419m.A1l(c1900k1) && this.A01.A10() != null && this.A01.A10().A1F()) {
                        C1816ie c1816ie2 = this.A01;
                        c1900k12 = this.A01.A0c;
                        c1816ie2.A0M = AbstractC0811Gs.A01(c1900k12, this.A01.A10(), 4, new C1823im(this));
                        return;
                    }
                    C1816ie c1816ie3 = this.A01;
                    if (A04[3].length() != 28) {
                        A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                        interfaceC1815id2 = c1816ie3.A0G;
                        interfaceC1815id2.ACA();
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}

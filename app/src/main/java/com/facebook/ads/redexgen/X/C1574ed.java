package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ed  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1574ed implements InterfaceC0762Ev {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ C0914Kr A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 99);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{21, 19, 5, 18, 63, 14, 1, 22, 9, 7, 1, 20, 9, 15, 14, 63, 9, 1, 2};
    }

    static {
        A01();
    }

    public C1574ed(C0914Kr c0914Kr) {
        this.A00 = c0914Kr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEM(String str) {
        C0754En c0754En;
        C0754En c0754En2;
        this.A00.A0Q = false;
        c0754En = this.A00.A0F;
        c0754En.setProgress(100);
        c0754En2 = this.A00.A0F;
        D3.A0L(c0754En2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEO(String str) {
        C0754En c0754En;
        C0753Em c0753Em;
        boolean z10;
        int i10;
        this.A00.A0Q = true;
        c0754En = this.A00.A0F;
        D3.A0L(c0754En, 0);
        c0753Em = this.A00.A0E;
        c0753Em.setUrl(str);
        z10 = this.A00.A0P;
        if (!z10) {
            C0914Kr c0914Kr = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            i10 = c0914Kr.A02;
            if (i10 > 1) {
                this.A00.A0P = true;
                this.A00.A0h(A00(0, 19, 3));
            }
        }
        C0914Kr.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEj(int i10) {
        boolean z10;
        C0754En c0754En;
        z10 = this.A00.A0Q;
        if (z10) {
            c0754En = this.A00.A0F;
            c0754En.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEl(String str) {
        C0753Em c0753Em;
        c0753Em = this.A00.A0E;
        c0753Em.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEo() {
        ((AbstractC1603f6) this.A00).A0A.ACY(14);
    }
}

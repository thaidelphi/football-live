package com.facebook.ads.redexgen.X;

import android.content.Intent;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Lm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0934Lm extends AbstractC1769hq {
    public static byte[] A01;
    public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};
    public final /* synthetic */ C0728Dn A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
            strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-102};
    }

    static {
        A01();
    }

    public C0934Lm(C0728Dn c0728Dn) {
        this.A00 = c0728Dn;
    }

    @Override // com.facebook.ads.redexgen.X.DR
    public final void A4Z(String str) {
        String str2;
        C1900k1 c1900k1;
        StringBuilder append = new StringBuilder().append(str).append(A00(0, 1, 92));
        str2 = this.A00.A0A;
        Intent intent = new Intent(append.append(str2).toString());
        c1900k1 = this.A00.A02;
        AnonymousClass42.A00(c1900k1).A07(intent);
    }
}

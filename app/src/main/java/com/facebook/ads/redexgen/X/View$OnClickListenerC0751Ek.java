package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ek  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0751Ek implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0753Em A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, 29, 19, 33, 30, 24, 19, -35, 24, 29, 35, 20, 29, 35, -35, 16, 18, 35, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1900k1 c1900k1;
        C1900k1 c1900k12;
        C1900k1 c1900k13;
        InterfaceC0752El interfaceC0752El;
        if (BQ.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 12);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 51);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, C5.A00(str3));
            intent.addFlags(268435456);
            c1900k1 = this.A00.A0A;
            c1900k1.A0F().A9o();
            try {
                c1900k13 = this.A00.A0A;
                C0683Bq.A0D(c1900k13, intent);
                interfaceC0752El = this.A00.A05;
                interfaceC0752El.AEF();
            } catch (C0681Bo e8) {
                Throwable cause = e8.getCause();
                Throwable th = e8;
                if (cause != null) {
                    th = e8.getCause();
                }
                c1900k12 = this.A00.A0A;
                c1900k12.A08().AAu(A00(11, 11, 3), AbstractC06048a.A00, new C06058b(th));
            }
        } catch (Throwable th2) {
            BQ.A00(th2, this);
        }
    }

    public View$OnClickListenerC0751Ek(C0753Em c0753Em) {
        this.A00 = c0753Em;
    }
}

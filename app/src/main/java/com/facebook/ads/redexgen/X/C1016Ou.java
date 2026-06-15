package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.WindowManager;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ou  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1016Ou implements InterfaceC1704gl {
    public static byte[] A01;
    public final WindowManager A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 22);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-21, -35, -30, -40, -29, -21};
    }

    public C1016Ou(WindowManager windowManager) {
        this.A00 = windowManager;
    }

    public static C1016Ou A00(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(A01(0, 6, 94));
        if (windowManager != null) {
            return new C1016Ou(windowManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1704gl
    public final void AGf(InterfaceC1703gk interfaceC1703gk) {
        interfaceC1703gk.ACs(this.A00.getDefaultDisplay());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1704gl
    public final void AJb() {
    }
}

package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ot  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1015Ot implements InterfaceC1704gl, DisplayManager.DisplayListener {
    public static byte[] A02;
    public static String[] A03 = {"oklm2xDKThiHJxM7u7wJcS0aWKi7wHNG", "OMqczftRveSo8kDMbZ9CVJeODI1lBKoY", "hSopR0pwnfuZ", "ytB3yXO7eYGwCr", "5Nu394ILVyp8", "JsK3O3lWwEDWoyjTtKlw", "iluqzB6DVhpHhr", "2Kpj6p"};
    public InterfaceC1703gk A00;
    public final DisplayManager A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A03[0].charAt(22) != '0') {
                throw new RuntimeException();
            }
            A03[1] = "us7UOyDv98ElpwA7KIZxKDLq69Mb6PPz";
            copyOfRange[i13] = (byte) ((b10 - i12) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-104, -99, -89, -92, -96, -107, -83};
    }

    static {
        A03();
    }

    public C1015Ot(DisplayManager displayManager) {
        this.A01 = displayManager;
    }

    private Display A00() {
        return this.A01.getDisplay(0);
    }

    public static C1015Ot A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 14));
        if (displayManager != null) {
            return new C1015Ot(displayManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1704gl
    public final void AGf(InterfaceC1703gk interfaceC1703gk) {
        this.A00 = interfaceC1703gk;
        this.A01.registerDisplayListener(this, AbstractC1672gE.A0Y());
        interfaceC1703gk.ACs(A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1704gl
    public final void AJb() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (this.A00 != null && i10 == 0) {
            this.A00.ACs(A00());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}

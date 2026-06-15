package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class H8 implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"1JwnbZc", "kkmIQJqvWiBwk9jfILYgPIrgQCS38owh", "N8yLaPVokkuJ1YkIyuCF7aIX6VfLiVBd", "jm5vdlZ72Lbf6a1gReW0ha76qwb04vv", "DCC4I5JAGBbf78VQRaqWv8G", "3hSFZU1sfTZMtq4oO1UMPPTcQg0VdY6I", "fV1nhS4pYMKgLfTP54XPcsPXLQx3eWXA", "qgSXXDY"};
    public final /* synthetic */ C0914Kr A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 14, 0, 13, -6, -2, 7, 4, -2, 6, -6, 4, -4, -3, -12, -14, -28, -15, -34, -22, -28, -8, -17, -32, -29, -34, -30, -21, -24, -30, -22, -34, -24, -32, -31};
    }

    static {
        A01();
    }

    public H8(C0914Kr c0914Kr) {
        this.A00 = c0914Kr;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        InputMethodManager inputMethodManager;
        InputMethodManager inputMethodManager2;
        boolean z11;
        int i10;
        switch (motionEvent.getActionMasked()) {
            case 0:
                z10 = this.A00.A0O;
                if (z10) {
                    return false;
                }
                inputMethodManager = this.A00.A09;
                if (inputMethodManager != null) {
                    C0914Kr c0914Kr = this.A00;
                    if (A02[6].charAt(16) != 'R') {
                        String[] strArr = A02;
                        strArr[0] = "d6v6uEk";
                        strArr[7] = "mdHpVNv";
                        inputMethodManager2 = c0914Kr.A09;
                        if (!inputMethodManager2.isAcceptingText()) {
                            return false;
                        }
                        this.A00.A0O = true;
                        this.A00.A0h(A00(14, 21, 98));
                        return false;
                    }
                    throw new RuntimeException();
                }
                return false;
            case 1:
                C0914Kr.A07(this.A00);
                z11 = this.A00.A0N;
                if (A02[2].charAt(15) != 'o') {
                    String[] strArr2 = A02;
                    strArr2[0] = "JX78O96";
                    strArr2[7] = "bIdbL9K";
                    if (z11) {
                        return false;
                    }
                    i10 = this.A00.A07;
                    if (i10 < 5) {
                        return false;
                    }
                    this.A00.A0N = true;
                    this.A00.A0h(A00(0, 14, 126));
                    return false;
                }
                throw new RuntimeException();
            default:
                return false;
        }
    }
}

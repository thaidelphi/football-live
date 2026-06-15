package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class GG implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"p7naAKHB4xLvoRE2lSSuhG1PZJd5v7nu", "WvtGE9IzO9nFNtvFFTJqUhWwvt66h6nL", "VCCKY7KSUUOD77sUX9kuHB9VbhmabzsO", "cnwdl7GMxNwVad4p0Oh4XJmd2VWgvA9c", "WrV0BeHEM3l4rmxeVHIasZWQtGmyI4N8", "o1aT8vujxCaaiLUwRZbljoToDOgVH3wd", "xRriwdEy6j865I4a7V8cGrqA6QrsYUim", "9xiHe0uHFaNvIWsoa90uuUt6pGUbqrnm"};
    public final /* synthetic */ C1652fu A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[1].charAt(22) != strArr[4].charAt(22)) {
                break;
            }
            String[] strArr2 = A02;
            strArr2[2] = "QNYUYdnqHgiLJjFZUPg17w9dElY9CMJL";
            strArr2[0] = "MmMVh7wO8RKpCmRa2XK3GpXBkp039CBt";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            int i14 = (copyOfRange[i13] - i12) - 121;
            String[] strArr3 = A02;
            if (strArr3[6].charAt(7) == strArr3[5].charAt(7)) {
                break;
            }
            String[] strArr4 = A02;
            strArr4[7] = "upZvC29S1gYfpKTic3DC7WgaDELdGVOI";
            strArr4[3] = "622S9DNbpY0TGJih4dXFXUlLvodGjwfO";
            copyOfRange[i13] = (byte) i14;
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A01 = new byte[]{23, 21, 7, 20, 1, 5, 14, 11, 5, 13, 1, 11, 3, 4, 68, 66, 52, 65, 46, 58, 52, 72, 63, 48, 51, 46, 50, 59, 56, 50, 58, 46, 56, 48, 49};
    }

    static {
        A01();
    }

    public GG(C1652fu c1652fu) {
        this.A00 = c1652fu;
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
                z10 = this.A00.A0T;
                if (!z10) {
                    inputMethodManager = this.A00.A0B;
                    if (inputMethodManager != null) {
                        inputMethodManager2 = this.A00.A0B;
                        if (inputMethodManager2.isAcceptingText()) {
                            this.A00.A0T = true;
                            C1652fu c1652fu = this.A00;
                            String[] strArr = A02;
                            if (strArr[1].charAt(22) == strArr[4].charAt(22)) {
                                String[] strArr2 = A02;
                                strArr2[7] = "y8iXjV8I9QfHTyCtOipg4lT6AE7AaFQc";
                                strArr2[3] = "XU6FCJR6sW2kminM5RICnJzgT3NrL5su";
                                c1652fu.A0h(A00(14, 21, 86));
                                break;
                            } else {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
                break;
            case 1:
                C1652fu.A05(this.A00);
                z11 = this.A00.A0S;
                if (!z11) {
                    i10 = this.A00.A08;
                    if (i10 >= 5) {
                        this.A00.A0S = true;
                        this.A00.A0h(A00(0, 14, 41));
                        break;
                    }
                }
                break;
        }
        String[] strArr3 = A02;
        if (strArr3[6].charAt(7) != strArr3[5].charAt(7)) {
            String[] strArr4 = A02;
            strArr4[6] = "ebvcteC2Y0dTtDk82YoZqGoSTVtPrEa5";
            strArr4[5] = "fbe5xbn5zq5FbTQSbq0ElFkb30D7M3tE";
            return false;
        }
        throw new RuntimeException();
    }
}

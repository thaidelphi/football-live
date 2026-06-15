package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.j3;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.ig  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC1817ig implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, AnonymousClass80 {
    public static byte[] A02;
    public static String[] A03 = {"2Mr7WzO4XT19fyb3DHhbNTMzGWXczG8b", "vf19oH1ZBxP9VPI3JVFDPhemIBzJ7OC4", "PwSJ9ELrmEQEpkj", "NKBqcIyQCWq", "qemkSyFbN3a9gQ2aUzusWvKKRIknTA5w", "Z", "UIuvCrnGUlyr13fhGKhlPOBYvJPgs1Zm", "jOlkEqTUPEoF6L4suBriQ9wTaVLjQjL5"};
    public final C1900k1 A00;
    public final /* synthetic */ C1816ie A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(17) == 't') {
                throw new RuntimeException();
            }
            A03[6] = "LYjyLl4kg8CHjw2beKSdtMq0XfNpXvKm";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 40);
            String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[6] = "YSbRSDMNs4CLdH15XbZL4GcvXcpOIsjI";
            copyOfRange[i13] = b10;
            i13++;
        }
    }

    public static void A02() {
        A02 = new byte[]{101, 64, 4, 71, 69, 74, 74, 75, 80, 4, 70, 65, 4, 71, 72, 77, 71, 79, 65, 64, 4, 70, 65, 66, 75, 86, 65, 4, 77, 80, 4, 77, 87, 4, 82, 77, 65, 83, 65, 64, 10, 42, 5, 0, 10, 2, 26, 73, 1, 8, 25, 25, 12, 7, 12, 13, 73, 29, 6, 6, 73, 15, 8, 26, 29, 71, 13, 9, 10, 62, 47, 34, 46, 37, 40, 46, 5, 46, 63, 60, 36, 57, 32, 24, 57, 118, 34, 57, 35, 53, 62, 118, 50, 55, 34, 55, 118, 36, 51, 53, 57, 36, 50, 51, 50, 122, 118, 38, 58, 51, 55, 37, 51, 118, 51, 56, 37, 35, 36, 51, 118, 34, 57, 35, 53, 62, 118, 51, 32, 51, 56, 34, 37, 118, 36, 51, 55, 53, 62, 118, 34, 62, 51, 118, 55, 50, 118, 0, 63, 51, 33, 118, 52, 47, 118, 36, 51, 34, 35, 36, 56, 63, 56, 49, 118, 48, 55, 58, 37, 51, 118, 63, 48, 118, 47, 57, 35, 118, 63, 56, 34, 51, 36, 53, 51, 38, 34, 118, 34, 62, 51, 118, 51, 32, 51, 56, 34, 120, 13, 11, 16, 120, 98, Byte.MAX_VALUE};
    }

    static {
        A02();
    }

    public View$OnClickListenerC1817ig(C1816ie c1816ie, C1900k1 c1900k1) {
        this.A01 = c1816ie;
        this.A00 = c1900k1;
    }

    public /* synthetic */ View$OnClickListenerC1817ig(C1816ie c1816ie, C1900k1 c1900k1, C1826ip c1826ip) {
        this(c1816ie, c1900k1);
    }

    private Map<String, String> A01() {
        JL jl;
        C0710Cv c0710Cv;
        AX ax;
        boolean z10;
        boolean z11;
        AX ax2;
        FB fb = new FB();
        jl = this.A01.A0R;
        FB A032 = fb.A03(jl);
        c0710Cv = this.A01.A0f;
        Map<String, String> A05 = A032.A02(c0710Cv).A05();
        ax = this.A01.A0I;
        if (ax != null) {
            ax2 = this.A01.A0I;
            A05.put(A00(j3.c.b.f17911b, 3, 62), String.valueOf(ax2.A05()));
        }
        z10 = this.A01.A0W;
        if (z10) {
            z11 = this.A01.A0W;
            A05.put(A00(198, 3, 75), String.valueOf(z11));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass80
    public final C1900k1 A6c() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0710Cv c0710Cv;
        C1900k1 c1900k1;
        C0710Cv c0710Cv2;
        C1900k1 c1900k12;
        C0710Cv c0710Cv3;
        C0710Cv c0710Cv4;
        if (BQ.A02(this)) {
            return;
        }
        try {
            c0710Cv = this.A01.A0f;
            boolean A08 = c0710Cv.A08();
            String A00 = A00(66, 17, 99);
            if (!A08) {
                Log.e(A00, A00(83, 115, 126));
            }
            c1900k1 = this.A01.A0c;
            int minimumElapsedTime = C06419m.A0J(c1900k1);
            if (minimumElapsedTime >= 0) {
                c0710Cv3 = this.A01.A0f;
                if (c0710Cv3.A03() < minimumElapsedTime) {
                    c0710Cv4 = this.A01.A0f;
                    if (!c0710Cv4.A07()) {
                        Log.e(A00, A00(0, 41, 12));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 65));
                        return;
                    }
                }
            }
            c0710Cv2 = this.A01.A0f;
            c1900k12 = this.A01.A0c;
            if (c0710Cv2.A09(c1900k12)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th) {
            BQ.A00(th, this);
            String[] strArr = A03;
            if (strArr[1].charAt(15) != strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            A03[7] = "EqeSsMwGTYaeKofhe8hU7ULkNSCE0y6O";
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        F9 f92;
        F9 f93;
        View view3;
        View view4;
        F9 f94;
        F9 f95;
        view2 = this.A01.A04;
        if (view2 != null) {
            f92 = this.A01.A0L;
            if (f92 != null) {
                f93 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                f93.setBounds(0, 0, width, view4.getHeight());
                f94 = this.A01.A0L;
                f95 = this.A01.A0L;
                f94.A0D(!f95.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0710Cv c0710Cv;
        C1900k1 c1900k1;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c0710Cv = this.A01.A0f;
        c1900k1 = this.A01.A0c;
        view2 = this.A01.A04;
        c0710Cv.A06(c1900k1, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (A03[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "w4fxh8qGKfQUI633kdvfD6D1dPFrXVB8";
            strArr[0] = "m7FEgH87ot2vGtV3LgABw7ULf2zod61Q";
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}

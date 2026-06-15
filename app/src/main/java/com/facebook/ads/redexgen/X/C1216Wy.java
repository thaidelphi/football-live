package com.facebook.ads.redexgen.X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Wy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1216Wy {
    public static String[] A08 = {"ZlBfYAKNGoaEoOfXvHwMWEEt86OhxI6B", "LUt7xf4ry7QMbgRq", "3UMO73rfFvDVUTBA3PzWSO", "RukvTyNKzj8npqFzjDhdMWvuokdbQYJ5", "WpVtknp2YD2cnCa6Giy0t1YOkqbih8Aj", "qv428Rpw3Cwz", "c5BlJ3WOj1u8KduDqMtpOA1oyL0HcZ67", "QVjctD50nJf8yNgx9rZn2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C1215Wx> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public C1216Wy(int i10, int i11) {
        A0C(i10);
        this.A01 = i11;
    }

    private SpannableString A04() {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int length = spannableStringBuilder.length();
        int i11 = -1;
        int nextColor = -1;
        int i12 = 0;
        int color = -1;
        boolean z10 = false;
        int colorStartPosition = -1;
        for (int italicStartPosition = 0; italicStartPosition < this.A06.size(); italicStartPosition++) {
            C1215Wx c1215Wx = this.A06.get(italicStartPosition);
            boolean z11 = c1215Wx.A02;
            int length2 = c1215Wx.A01;
            if (length2 != 8) {
                z10 = length2 == 7;
                if (length2 != 7) {
                    colorStartPosition = C1C.A0T()[length2];
                }
            }
            int underlineStartPosition = c1215Wx.A00;
            if (italicStartPosition + 1 < this.A06.size()) {
                i10 = this.A06.get(italicStartPosition + 1).A00;
            } else {
                i10 = length;
            }
            if (underlineStartPosition != i10) {
                if (i11 != -1 && !z11) {
                    A06(spannableStringBuilder, i11, underlineStartPosition);
                    i11 = -1;
                } else if (i11 == -1 && z11) {
                    i11 = underlineStartPosition;
                }
                String[] strArr = A08;
                if (strArr[0].charAt(9) == strArr[3].charAt(9)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "kePNqBKHXCizwUbHoA5sKxa5GvuFfgvO";
                strArr2[3] = "Y8jZiBwK43L2ugJcc0epidRtXTdO8YAX";
                if (nextColor != -1 && !z10) {
                    A05(spannableStringBuilder, nextColor, underlineStartPosition);
                    nextColor = -1;
                } else {
                    String[] strArr3 = A08;
                    if (strArr3[0].charAt(9) == strArr3[3].charAt(9)) {
                        throw new RuntimeException();
                    }
                    A08[7] = "o96AaNGdtXn3nHhJHBOhn";
                    if (nextColor == -1 && z10) {
                        nextColor = underlineStartPosition;
                    }
                }
                if (colorStartPosition != color) {
                    A07(spannableStringBuilder, i12, underlineStartPosition, color);
                    color = colorStartPosition;
                    i12 = underlineStartPosition;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            A06(spannableStringBuilder, i11, length);
        }
        if (nextColor != -1 && nextColor != length) {
            A05(spannableStringBuilder, nextColor, length);
        }
        if (i12 != length) {
            A07(spannableStringBuilder, i12, length, color);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        if (i12 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0013 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.C1053Qh A08(int r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1216Wy.A08(int):com.facebook.ads.redexgen.X.Qh");
    }

    public final void A09() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i10 = length3 - 1; i10 >= 0; i10--) {
                C1215Wx c1215Wx = this.A06.get(i10);
                int length4 = c1215Wx.A00;
                if (length4 == length) {
                    int length5 = c1215Wx.A00;
                    c1215Wx.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A() {
        /*
            r6 = this;
            java.util.List<android.text.SpannableString> r1 = r6.A07
            android.text.SpannableString r0 = r6.A04()
            r1.add(r0)
            java.lang.StringBuilder r0 = r6.A05
            r5 = 0
            r0.setLength(r5)
            java.util.List<com.facebook.ads.redexgen.X.Wx> r0 = r6.A06
            r0.clear()
            int r1 = r6.A01
            int r0 = r6.A03
            int r4 = java.lang.Math.min(r1, r0)
        L1c:
            java.util.List<android.text.SpannableString> r0 = r6.A07
            int r0 = r0.size()
            if (r0 < r4) goto L50
            java.util.List<android.text.SpannableString> r3 = r6.A07
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1216Wy.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L4a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1216Wy.A08
            java.lang.String r1 = "RGosVt0uGPjOGt4u"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "bwvEW4AK2khj"
            r0 = 5
            r2[r0] = r1
            r3.remove(r5)
            goto L1c
        L4a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1216Wy.A0A():void");
    }

    public final void A0B(char c10) {
        if (this.A05.length() < 32) {
            this.A05.append(c10);
        }
    }

    public final void A0C(int i10) {
        this.A00 = i10;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0D(int i10) {
        this.A00 = i10;
    }

    public final void A0E(int i10) {
        this.A01 = i10;
    }

    public final void A0F(int i10, boolean z10) {
        this.A06.add(new C1215Wx(i10, z10, this.A05.length()));
    }

    public final boolean A0G() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }
}

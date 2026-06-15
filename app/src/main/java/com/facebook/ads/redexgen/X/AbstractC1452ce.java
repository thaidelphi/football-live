package com.facebook.ads.redexgen.X;

import android.text.Spannable;
/* renamed from: com.facebook.ads.redexgen.X.ce  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1452ce {
    public static void A00(Spannable spannable, Object obj, int i10, int i11, int i12) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i10 && spannable.getSpanEnd(obj2) == i11 && spannable.getSpanFlags(obj2) == i12) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i10, i11, i12);
    }
}

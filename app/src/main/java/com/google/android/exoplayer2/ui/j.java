package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.RecyclerView;
import n4.b;
/* compiled from: SubtitleViewUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof r4.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(b.C0322b c0322b) {
        c0322b.b();
        if (c0322b.e() instanceof Spanned) {
            if (!(c0322b.e() instanceof Spannable)) {
                c0322b.o(SpannableString.valueOf(c0322b.e()));
            }
            g((Spannable) a5.a.e(c0322b.e()), new x5.h() { // from class: com.google.android.exoplayer2.ui.h
                @Override // x5.h
                public final boolean apply(Object obj) {
                    boolean c10;
                    c10 = j.c(obj);
                    return c10;
                }
            });
        }
        f(c0322b);
    }

    public static void f(b.C0322b c0322b) {
        c0322b.q(-3.4028235E38f, RecyclerView.UNDEFINED_DURATION);
        if (c0322b.e() instanceof Spanned) {
            if (!(c0322b.e() instanceof Spannable)) {
                c0322b.o(SpannableString.valueOf(c0322b.e()));
            }
            g((Spannable) a5.a.e(c0322b.e()), new x5.h() { // from class: com.google.android.exoplayer2.ui.i
                @Override // x5.h
                public final boolean apply(Object obj) {
                    boolean d10;
                    d10 = j.d(obj);
                    return d10;
                }
            });
        }
    }

    private static void g(Spannable spannable, x5.h<Object> hVar) {
        Object[] spans;
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (hVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else if (i10 != 1) {
            if (i10 != 2) {
                return -3.4028235E38f;
            }
            return f10;
        } else {
            f11 = i11;
        }
        return f10 * f11;
    }
}

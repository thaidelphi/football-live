package fr.castorflex.android.circularprogressbar;

import android.animation.ValueAnimator;
/* compiled from: CircularProgressBarUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10) {
        if (i10 < 0 || i10 > 360) {
            throw new IllegalArgumentException(String.format("Illegal angle %d: must be >=0 and <= 360", Integer.valueOf(i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least 1 color");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(float f10, String str) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("%s %d must be positive", str, Float.valueOf(f10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Speed must be >= 0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float e(ValueAnimator valueAnimator) {
        return valueAnimator.getInterpolator().getInterpolation(Math.min(valueAnimator.getDuration() > 0 ? ((float) valueAnimator.getCurrentPlayTime()) / ((float) valueAnimator.getDuration()) : 0.0f, 1.0f));
    }
}

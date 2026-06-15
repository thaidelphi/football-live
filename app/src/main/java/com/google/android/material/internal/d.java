package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.k0;
import androidx.core.view.m0;
/* compiled from: EdgeToEdgeUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z11 = false;
        boolean z12 = num == null || num.intValue() == 0;
        if (num2 == null || num2.intValue() == 0) {
            z11 = true;
        }
        if (z12 || z11) {
            int b10 = j5.a.b(window.getContext(), 16842801, -16777216);
            if (z12) {
                num = Integer.valueOf(b10);
            }
            if (z11) {
                num2 = Integer.valueOf(b10);
            }
        }
        k0.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b11 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b11);
        boolean d10 = d(c10, j5.a.f(num.intValue()));
        boolean d11 = d(b11, j5.a.f(num2.intValue()));
        m0 a10 = k0.a(window, window.getDecorView());
        if (a10 != null) {
            a10.b(d10);
            a10.a(d11);
        }
    }

    @TargetApi(21)
    private static int b(Context context, boolean z10) {
        if (!z10 || Build.VERSION.SDK_INT >= 27) {
            if (z10) {
                return 0;
            }
            return j5.a.b(context, 16843858, -16777216);
        }
        return androidx.core.graphics.a.j(j5.a.b(context, 16843858, -16777216), 128);
    }

    @TargetApi(21)
    private static int c(Context context, boolean z10) {
        if (!z10 || Build.VERSION.SDK_INT >= 23) {
            if (z10) {
                return 0;
            }
            return j5.a.b(context, 16843857, -16777216);
        }
        return androidx.core.graphics.a.j(j5.a.b(context, 16843857, -16777216), 128);
    }

    private static boolean d(int i10, boolean z10) {
        return j5.a.f(i10) || (i10 == 0 && z10);
    }
}

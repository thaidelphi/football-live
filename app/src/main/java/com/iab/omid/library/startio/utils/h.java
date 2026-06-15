package com.iab.omid.library.startio.utils;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h {
    public static String a(View view) {
        if (Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility == 8) {
                return "viewGone";
            }
            if (visibility == 4) {
                return "viewInvisible";
            }
            if (visibility != 0) {
                return "viewNotVisible";
            }
            if (view.getAlpha() == 0.0f) {
                return "viewAlphaZero";
            }
            return null;
        }
        return "notAttached";
    }

    public static View b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static float c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean d(View view) {
        return a(view) == null;
    }

    public static boolean e(View view) {
        if ((Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) && view.isShown()) {
            while (view != null) {
                if (view.getAlpha() == 0.0f) {
                    return false;
                }
                view = b(view);
            }
            return true;
        }
        return false;
    }
}

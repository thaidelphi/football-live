package com.iab.omid.library.ironsrc.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
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

    public static Activity b(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static View c(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static float d(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean e(View view) {
        Activity b10;
        if (Build.VERSION.SDK_INT < 24 || (b10 = b(view)) == null) {
            return false;
        }
        return b10.isInPictureInPictureMode();
    }

    public static boolean f(View view) {
        return a(view) == null;
    }

    public static boolean g(View view) {
        if ((Build.VERSION.SDK_INT < 19 || view.isAttachedToWindow()) && view.isShown()) {
            while (view != null) {
                if (view.getAlpha() == 0.0f) {
                    return false;
                }
                view = c(view);
            }
            return true;
        }
        return false;
    }
}

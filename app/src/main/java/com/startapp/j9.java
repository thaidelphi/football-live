package com.startapp;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j9 {
    public static int a(Context context, int i10) {
        return Math.round(TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics()));
    }

    public static int b(Context context, int i10) {
        return Math.round(i10 / context.getResources().getDisplayMetrics().density);
    }

    public static void a(TextView textView, Set<String> set) {
        if (set.contains("UNDERLINE")) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
        int i10 = 0;
        if (set.contains("BOLD") && set.contains("ITALIC")) {
            i10 = 3;
        } else if (set.contains("BOLD")) {
            i10 = 1;
        } else if (set.contains("ITALIC")) {
            i10 = 2;
        }
        textView.setTypeface(null, i10);
    }

    public static RelativeLayout.LayoutParams a(Context context, int[] iArr, int[] iArr2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        for (int i10 : iArr2) {
            layoutParams.addRule(i10);
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = i12 == 0 ? 0 : Math.round(TypedValue.applyDimension(1, i12, context.getResources().getDisplayMetrics()));
        }
        layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        return layoutParams;
    }

    public static void a(Context context, WindowManager windowManager, Point point) {
        if (Build.VERSION.SDK_INT >= 13) {
            windowManager.getDefaultDisplay().getSize(point);
        } else {
            point.x = windowManager.getDefaultDisplay().getWidth();
            point.y = windowManager.getDefaultDisplay().getHeight();
        }
        point.x = Math.round(point.x / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(point.y / context.getResources().getDisplayMetrics().density);
    }
}

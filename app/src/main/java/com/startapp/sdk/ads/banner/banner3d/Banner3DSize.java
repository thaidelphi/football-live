package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.j9;
import com.startapp.l3;
import com.startapp.o0;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerOptions;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Banner3DSize {

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Size {
        XXSMALL(new o0(280, 50)),
        XSMALL(new o0(300, 50)),
        SMALL(new o0(320, 50)),
        MEDIUM(new o0(468, 60)),
        LARGE(new o0(728, 90)),
        XLARGE(new o0(1024, 90));
        
        private o0 size;

        Size(o0 o0Var) {
            this.size = o0Var;
        }

        public o0 getSize() {
            return this.size;
        }
    }

    public static boolean a(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D, o0 o0Var) {
        Size[] values;
        Point point = new Point();
        point.x = bannerOptions.o();
        point.y = bannerOptions.d();
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().width > 0) {
            point.x = Math.round((banner3D.getLayoutParams().width + 1) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().height > 0) {
            point.y = Math.round((banner3D.getLayoutParams().height + 1) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() == null || banner3D.getLayoutParams().width <= 0 || banner3D.getLayoutParams().height <= 0) {
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                try {
                    View view = (View) viewParent;
                    if (view instanceof Banner) {
                        view = (View) view.getParent();
                    }
                    boolean z10 = false;
                    boolean z11 = false;
                    while (view != null && (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0)) {
                        if (view.getMeasuredWidth() > 0 && !z10) {
                            point.x = Math.round(((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / context.getResources().getDisplayMetrics().density);
                            z10 = true;
                        }
                        if (view.getMeasuredHeight() > 0 && !z11) {
                            point.y = Math.round(((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) / context.getResources().getDisplayMetrics().density);
                            z11 = true;
                        }
                        view = (View) view.getParent();
                    }
                    if (view == null) {
                        point.x = Math.round(decorView.getMeasuredWidth() / context.getResources().getDisplayMetrics().density);
                        point.y = Math.round(decorView.getMeasuredHeight() / context.getResources().getDisplayMetrics().density);
                    } else {
                        if (!z10) {
                            point.x = Math.round(((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / context.getResources().getDisplayMetrics().density);
                        }
                        if (!z11) {
                            point.y = Math.round(((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) / context.getResources().getDisplayMetrics().density);
                        }
                    }
                } catch (Throwable th) {
                    point.x = Math.round(decorView.getMeasuredWidth() / context.getResources().getDisplayMetrics().density);
                    point.y = Math.round(decorView.getMeasuredHeight() / context.getResources().getDisplayMetrics().density);
                    l3.a(th);
                }
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        j9.a(context, windowManager, point);
                    }
                } catch (Throwable th2) {
                    l3.a(th2);
                }
            }
        }
        o0 o0Var2 = new o0(point.x, point.y);
        Point point2 = o0Var2.f22339a;
        o0Var.a(point2.x, point2.y);
        boolean z12 = false;
        for (Size size : Size.values()) {
            if (size.getSize().f22339a.x <= o0Var2.f22339a.x && size.getSize().f22339a.y <= o0Var2.f22339a.y) {
                bannerOptions.a(size.getSize().f22339a.x, size.getSize().f22339a.y);
                z12 = true;
            }
        }
        if (!z12) {
            bannerOptions.a(0, 0);
        }
        return z12;
    }
}

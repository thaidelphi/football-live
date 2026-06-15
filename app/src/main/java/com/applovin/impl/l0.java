package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f7431a = new HashMap(2);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f7432a;

        /* renamed from: b  reason: collision with root package name */
        int f7433b;

        /* renamed from: c  reason: collision with root package name */
        int f7434c;

        /* renamed from: d  reason: collision with root package name */
        int f7435d;

        /* renamed from: com.applovin.impl.l0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0124a {

            /* renamed from: a  reason: collision with root package name */
            private int f7436a;

            /* renamed from: b  reason: collision with root package name */
            private int f7437b;

            /* renamed from: c  reason: collision with root package name */
            private int f7438c;

            /* renamed from: d  reason: collision with root package name */
            private int f7439d;

            C0124a() {
            }

            public C0124a a(int i10) {
                this.f7438c = i10;
                return this;
            }

            public C0124a b(int i10) {
                this.f7439d = i10;
                return this;
            }

            public C0124a c(int i10) {
                this.f7436a = i10;
                return this;
            }

            public C0124a d(int i10) {
                this.f7437b = i10;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f7436a + ", topRight=" + this.f7437b + ", bottomLeft=" + this.f7438c + ", bottomRight=" + this.f7439d + ")";
            }

            public a a() {
                return new a(this.f7436a, this.f7437b, this.f7438c, this.f7439d);
            }
        }

        a(int i10, int i11, int i12, int i13) {
            this.f7432a = i10;
            this.f7433b = i11;
            this.f7434c = i12;
            this.f7435d = i13;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f7435d;
        }

        public int c() {
            return this.f7432a;
        }

        public int d() {
            return this.f7433b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return aVar.a(this) && c() == aVar.c() && d() == aVar.d() && a() == aVar.a() && b() == aVar.b();
            }
            return false;
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f7434c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.f8884u0;
        boolean z10 = jVar == null || ((Boolean) jVar.a(o4.f8105e6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f7431a;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else if (d()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        f7431a.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static Point a(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Point point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    public static a a(Context context, com.applovin.impl.sdk.j jVar) {
        a aVar = null;
        if (((Boolean) jVar.a(o4.W3)).booleanValue() && m()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVar = new a.C0124a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVar;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}

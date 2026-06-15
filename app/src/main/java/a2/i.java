package a2;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* compiled from: MemorySizeCalculator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f217a;

    /* renamed from: b  reason: collision with root package name */
    private final int f218b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f219c;

    /* renamed from: d  reason: collision with root package name */
    private final int f220d;

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        static final int f221i;

        /* renamed from: a  reason: collision with root package name */
        final Context f222a;

        /* renamed from: b  reason: collision with root package name */
        ActivityManager f223b;

        /* renamed from: c  reason: collision with root package name */
        c f224c;

        /* renamed from: e  reason: collision with root package name */
        float f226e;

        /* renamed from: d  reason: collision with root package name */
        float f225d = 2.0f;

        /* renamed from: f  reason: collision with root package name */
        float f227f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        float f228g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        int f229h = 4194304;

        static {
            f221i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f226e = f221i;
            this.f222a = context;
            this.f223b = (ActivityManager) context.getSystemService("activity");
            this.f224c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f223b)) {
                return;
            }
            this.f226e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayMetrics f230a;

        b(DisplayMetrics displayMetrics) {
            this.f230a = displayMetrics;
        }

        @Override // a2.i.c
        public int a() {
            return this.f230a.heightPixels;
        }

        @Override // a2.i.c
        public int b() {
            return this.f230a.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        int i10;
        this.f219c = aVar.f222a;
        if (e(aVar.f223b)) {
            i10 = aVar.f229h / 2;
        } else {
            i10 = aVar.f229h;
        }
        this.f220d = i10;
        int c10 = c(aVar.f223b, aVar.f227f, aVar.f228g);
        float b10 = aVar.f224c.b() * aVar.f224c.a() * 4;
        int round = Math.round(aVar.f226e * b10);
        int round2 = Math.round(b10 * aVar.f225d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f218b = round2;
            this.f217a = round;
        } else {
            float f10 = i11;
            float f11 = aVar.f226e;
            float f12 = aVar.f225d;
            float f13 = f10 / (f11 + f12);
            this.f218b = Math.round(f12 * f13);
            this.f217a = Math.round(f13 * aVar.f226e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f218b));
            sb.append(", pool size: ");
            sb.append(f(this.f217a));
            sb.append(", byte array size: ");
            sb.append(f(i10));
            sb.append(", memory class limited? ");
            sb.append(i12 > c10);
            sb.append(", max size: ");
            sb.append(f(c10));
            sb.append(", memoryClass: ");
            sb.append(aVar.f223b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f223b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        boolean e8 = e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e8) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f219c, i10);
    }

    public int a() {
        return this.f220d;
    }

    public int b() {
        return this.f217a;
    }

    public int d() {
        return this.f218b;
    }
}

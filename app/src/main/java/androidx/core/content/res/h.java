package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: ResourcesCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f2583a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<e, SparseArray<d>> f2584b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2585c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static Drawable a(Resources resources, int i10, int i11) {
            return resources.getDrawableForDensity(i10, i11);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f2586a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f2587b;

        /* renamed from: c  reason: collision with root package name */
        final int f2588c;

        d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f2586a = colorStateList;
            this.f2587b = configuration;
            this.f2588c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Resources f2589a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f2590b;

        e(Resources resources, Resources.Theme theme) {
            this.f2589a = resources;
            this.f2590b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f2589a.equals(eVar.f2589a) && androidx.core.util.d.a(this.f2590b, eVar.f2590b);
        }

        public int hashCode() {
            return androidx.core.util.d.b(this.f2589a, this.f2590b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class f {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void f(int i10);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g {

        /* compiled from: ResourcesCompat.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static class a {

            /* renamed from: a  reason: collision with root package name */
            private static final Object f2591a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f2592b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f2593c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                synchronized (f2591a) {
                    if (!f2593c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f2592b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e8) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e8);
                        }
                        f2593c = true;
                    }
                    Method method = f2592b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e10) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e10);
                            f2592b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.a(theme);
            } else if (i10 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(e eVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2585c) {
            WeakHashMap<e, SparseArray<d>> weakHashMap = f2584b;
            SparseArray<d> sparseArray = weakHashMap.get(eVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(eVar, sparseArray);
            }
            sparseArray.append(i10, new d(colorStateList, eVar.f2589a.getConfiguration(), theme));
        }
    }

    private static ColorStateList b(e eVar, int i10) {
        d dVar;
        Resources.Theme theme;
        synchronized (f2585c) {
            SparseArray<d> sparseArray = f2584b.get(eVar);
            if (sparseArray != null && sparseArray.size() > 0 && (dVar = sparseArray.get(i10)) != null) {
                if (dVar.f2587b.equals(eVar.f2589a.getConfiguration()) && (((theme = eVar.f2590b) == null && dVar.f2588c == 0) || (theme != null && dVar.f2588c == theme.hashCode()))) {
                    return dVar.f2586a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    public static Typeface c(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList b10 = b(eVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList k10 = k(resources, i10, theme);
        if (k10 != null) {
            a(eVar, i10, k10, theme);
            return k10;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return c.b(resources, i10, theme);
        } else {
            return resources.getColorStateList(i10);
        }
    }

    public static Drawable e(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.a(resources, i10, theme);
        }
        return resources.getDrawable(i10);
    }

    public static Drawable f(Resources resources, int i10, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            return b.b(resources, i10, i11, theme);
        }
        if (i12 >= 15) {
            return a.a(resources, i10, i11);
        }
        return resources.getDrawable(i10);
    }

    public static Typeface g(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i10, TypedValue typedValue, int i11, f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, typedValue, i11, fVar, null, true, false);
    }

    public static void i(Context context, int i10, f fVar, Handler handler) throws Resources.NotFoundException {
        androidx.core.util.i.f(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            m(context, i10, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal<TypedValue> threadLocal = f2583a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static ColorStateList k(Resources resources, int i10, Resources.Theme theme) {
        if (l(resources, i10)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e8) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            return null;
        }
    }

    private static boolean l(Resources resources, int i10) {
        TypedValue j10 = j();
        resources.getValue(i10, j10, true);
        int i11 = j10.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface m(Context context, int i10, TypedValue typedValue, int i11, f fVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface n10 = n(context, resources, typedValue, i10, i11, fVar, handler, z10, z11);
        if (n10 == null && fVar == null && !z11) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
        }
        return n10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface n(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.h.f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lbb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.c(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.e.f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.d(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            androidx.core.content.res.e$b r2 = androidx.core.content.res.e.b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L58
            r11.c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.e.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.e.d(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.d(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            goto L89
        L86:
            r11.c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb5
        La0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb5:
            if (r11 == 0) goto Lba
            r11.c(r15, r12)
        Lba:
            return r16
        Lbb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}

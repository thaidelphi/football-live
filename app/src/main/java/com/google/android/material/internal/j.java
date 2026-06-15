package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Constructor;
/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class j {

    /* renamed from: n  reason: collision with root package name */
    static final int f14432n;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f14433o;

    /* renamed from: p  reason: collision with root package name */
    private static Constructor<StaticLayout> f14434p;

    /* renamed from: q  reason: collision with root package name */
    private static Object f14435q;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f14436a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f14437b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14438c;

    /* renamed from: e  reason: collision with root package name */
    private int f14440e;

    /* renamed from: l  reason: collision with root package name */
    private boolean f14447l;

    /* renamed from: d  reason: collision with root package name */
    private int f14439d = 0;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f14441f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g  reason: collision with root package name */
    private int f14442g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: h  reason: collision with root package name */
    private float f14443h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    private float f14444i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private int f14445j = f14432n;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14446k = true;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f14448m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StaticLayoutBuilderCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        f14432n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private j(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f14436a = charSequence;
        this.f14437b = textPaint;
        this.f14438c = i10;
        this.f14440e = charSequence.length();
    }

    private void b() throws a {
        Class<?> cls;
        if (f14433o) {
            return;
        }
        try {
            boolean z10 = this.f14447l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f14435q = z10 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = j.class.getClassLoader();
                String str = this.f14447l ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f14435q = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f14434p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f14433o = true;
        } catch (Exception e8) {
            throw new a(e8);
        }
    }

    public static j c(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new j(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f14436a == null) {
            this.f14436a = "";
        }
        int max = Math.max(0, this.f14438c);
        CharSequence charSequence = this.f14436a;
        if (this.f14442g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f14437b, max, this.f14448m);
        }
        int min = Math.min(charSequence.length(), this.f14440e);
        this.f14440e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f14447l && this.f14442g == 1) {
                this.f14441f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f14439d, min, this.f14437b, max);
            obtain.setAlignment(this.f14441f);
            obtain.setIncludePad(this.f14446k);
            if (this.f14447l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f14448m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f14442g);
            float f10 = this.f14443h;
            if (f10 != 0.0f || this.f14444i != 1.0f) {
                obtain.setLineSpacing(f10, this.f14444i);
            }
            if (this.f14442g > 1) {
                obtain.setHyphenationFrequency(this.f14445j);
            }
            return obtain.build();
        }
        b();
        try {
            return (StaticLayout) ((Constructor) androidx.core.util.i.f(f14434p)).newInstance(charSequence, Integer.valueOf(this.f14439d), Integer.valueOf(this.f14440e), this.f14437b, Integer.valueOf(max), this.f14441f, androidx.core.util.i.f(f14435q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f14446k), null, Integer.valueOf(max), Integer.valueOf(this.f14442g));
        } catch (Exception e8) {
            throw new a(e8);
        }
    }

    public j d(Layout.Alignment alignment) {
        this.f14441f = alignment;
        return this;
    }

    public j e(TextUtils.TruncateAt truncateAt) {
        this.f14448m = truncateAt;
        return this;
    }

    public j f(int i10) {
        this.f14445j = i10;
        return this;
    }

    public j g(boolean z10) {
        this.f14446k = z10;
        return this;
    }

    public j h(boolean z10) {
        this.f14447l = z10;
        return this;
    }

    public j i(float f10, float f11) {
        this.f14443h = f10;
        this.f14444i = f11;
        return this;
    }

    public j j(int i10) {
        this.f14442g = i10;
        return this;
    }
}

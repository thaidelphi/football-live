package s5;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
/* compiled from: RippleUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f30781a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f30782b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f30783c;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f30784d;

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f30785e;

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f30786f;

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f30787g;

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f30788h;

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f30789i;

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f30790j;

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f30791k;

    /* renamed from: l  reason: collision with root package name */
    static final String f30792l;

    static {
        f30781a = Build.VERSION.SDK_INT >= 21;
        f30782b = new int[]{16842919};
        f30783c = new int[]{16843623, 16842908};
        f30784d = new int[]{16842908};
        f30785e = new int[]{16843623};
        f30786f = new int[]{16842913, 16842919};
        f30787g = new int[]{16842913, 16843623, 16842908};
        f30788h = new int[]{16842913, 16842908};
        f30789i = new int[]{16842913, 16843623};
        f30790j = new int[]{16842913};
        f30791k = new int[]{16842910, 16842919};
        f30792l = b.class.getSimpleName();
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f30791k, 0)) != 0) {
                Log.w(f30792l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}

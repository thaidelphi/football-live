package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
/* compiled from: PaintCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<androidx.core.util.e<Rect, Rect>> f2615a = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f10 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i10 = 0;
            while (i10 < length) {
                int charCount = Character.charCount(str.codePointAt(i10)) + i10;
                f10 += paint.measureText(str, i10, charCount);
                i10 = charCount;
            }
            if (measureText3 >= f10) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        androidx.core.util.e<Rect, Rect> b10 = b();
        paint.getTextBounds("\udfffd", 0, 2, b10.f2786a);
        paint.getTextBounds(str, 0, length, b10.f2787b);
        return !b10.f2786a.equals(b10.f2787b);
    }

    private static androidx.core.util.e<Rect, Rect> b() {
        ThreadLocal<androidx.core.util.e<Rect, Rect>> threadLocal = f2615a;
        androidx.core.util.e<Rect, Rect> eVar = threadLocal.get();
        if (eVar == null) {
            androidx.core.util.e<Rect, Rect> eVar2 = new androidx.core.util.e<>(new Rect(), new Rect());
            threadLocal.set(eVar2);
            return eVar2;
        }
        eVar.f2786a.setEmpty();
        eVar.f2787b.setEmpty();
        return eVar;
    }
}

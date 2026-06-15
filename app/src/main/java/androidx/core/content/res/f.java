package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k10 = k.k(resources, theme, attributeSet, v.d.A);
            float f10 = k.f(k10, xmlPullParser, "startX", v.d.J, 0.0f);
            float f11 = k.f(k10, xmlPullParser, "startY", v.d.K, 0.0f);
            float f12 = k.f(k10, xmlPullParser, "endX", v.d.L, 0.0f);
            float f13 = k.f(k10, xmlPullParser, "endY", v.d.M, 0.0f);
            float f14 = k.f(k10, xmlPullParser, "centerX", v.d.E, 0.0f);
            float f15 = k.f(k10, xmlPullParser, "centerY", v.d.F, 0.0f);
            int g10 = k.g(k10, xmlPullParser, "type", v.d.D, 0);
            int b10 = k.b(k10, xmlPullParser, "startColor", v.d.B, 0);
            boolean j10 = k.j(xmlPullParser, "centerColor");
            int b11 = k.b(k10, xmlPullParser, "centerColor", v.d.I, 0);
            int b12 = k.b(k10, xmlPullParser, "endColor", v.d.C, 0);
            int g11 = k.g(k10, xmlPullParser, "tileMode", v.d.H, 0);
            float f16 = k.f(k10, xmlPullParser, "gradientRadius", v.d.G, 0.0f);
            k10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b10, b12, j10, b11);
            if (g10 != 1) {
                if (g10 != 2) {
                    return new LinearGradient(f10, f11, f12, f13, a10.f2581a, a10.f2582b, d(g11));
                }
                return new SweepGradient(f14, f15, a10.f2581a, a10.f2582b);
            } else if (f16 > 0.0f) {
                return new RadialGradient(f14, f15, f16, a10.f2581a, a10.f2582b, d(g11));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = v.d.N
            android.content.res.TypedArray r3 = androidx.core.content.res.k.k(r9, r12, r11, r3)
            int r5 = v.d.O
            boolean r6 = r3.hasValue(r5)
            int r7 = v.d.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradientColorInflaterCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f2581a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f2582b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2581a = new int[size];
            this.f2582b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f2581a[i10] = list.get(i10).intValue();
                this.f2582b[i10] = list2.get(i10).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f2581a = new int[]{i10, i11};
            this.f2582b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f2581a = new int[]{i10, i11, i12};
            this.f2582b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

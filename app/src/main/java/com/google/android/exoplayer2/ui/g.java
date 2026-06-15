package com.google.android.exoplayer2.ui;

import a5.p0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: SubtitlePainter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* renamed from: a  reason: collision with root package name */
    private final float f11009a;

    /* renamed from: b  reason: collision with root package name */
    private final float f11010b;

    /* renamed from: c  reason: collision with root package name */
    private final float f11011c;

    /* renamed from: d  reason: collision with root package name */
    private final float f11012d;

    /* renamed from: e  reason: collision with root package name */
    private final float f11013e;

    /* renamed from: f  reason: collision with root package name */
    private final TextPaint f11014f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f11015g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f11016h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f11017i;

    /* renamed from: j  reason: collision with root package name */
    private Layout.Alignment f11018j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f11019k;

    /* renamed from: l  reason: collision with root package name */
    private float f11020l;

    /* renamed from: m  reason: collision with root package name */
    private int f11021m;

    /* renamed from: n  reason: collision with root package name */
    private int f11022n;

    /* renamed from: o  reason: collision with root package name */
    private float f11023o;

    /* renamed from: p  reason: collision with root package name */
    private int f11024p;

    /* renamed from: q  reason: collision with root package name */
    private float f11025q;

    /* renamed from: r  reason: collision with root package name */
    private float f11026r;

    /* renamed from: s  reason: collision with root package name */
    private int f11027s;

    /* renamed from: t  reason: collision with root package name */
    private int f11028t;

    /* renamed from: u  reason: collision with root package name */
    private int f11029u;

    /* renamed from: v  reason: collision with root package name */
    private int f11030v;

    /* renamed from: w  reason: collision with root package name */
    private int f11031w;

    /* renamed from: x  reason: collision with root package name */
    private float f11032x;

    /* renamed from: y  reason: collision with root package name */
    private float f11033y;

    /* renamed from: z  reason: collision with root package name */
    private float f11034z;

    public g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f11013e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11012d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f11009a = round;
        this.f11010b = round;
        this.f11011c = round;
        TextPaint textPaint = new TextPaint();
        this.f11014f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f11015g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f11016h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f11019k, (Rect) null, this.J, this.f11016h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        a5.a.e(this.J);
        a5.a.e(this.f11019k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f11029u) > 0) {
            this.f11015g.setColor(this.f11029u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f11015g);
        }
        int i10 = this.f11031w;
        if (i10 == 1) {
            this.f11014f.setStrokeJoin(Paint.Join.ROUND);
            this.f11014f.setStrokeWidth(this.f11009a);
            this.f11014f.setColor(this.f11030v);
            this.f11014f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f11014f;
            float f10 = this.f11010b;
            float f11 = this.f11011c;
            textPaint.setShadowLayer(f10, f11, f11, this.f11030v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f11030v;
            int i12 = z10 ? this.f11030v : -1;
            float f12 = this.f11010b / 2.0f;
            this.f11014f.setColor(this.f11027s);
            this.f11014f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f11014f.setShadowLayer(this.f11010b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f11014f.setShadowLayer(this.f11010b, f12, f12, i12);
        }
        this.f11014f.setColor(this.f11027s);
        this.f11014f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f11014f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f11019k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f11023o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f11020l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f11025q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f11026r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f11024p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f11022n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.g.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.g.g():void");
    }

    public void b(n4.b bVar, y4.b bVar2, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = bVar.f28600d == null;
        int i14 = -16777216;
        if (z10) {
            if (TextUtils.isEmpty(bVar.f28597a)) {
                return;
            }
            i14 = bVar.f28608l ? bVar.f28609m : bVar2.f33062c;
        }
        if (a(this.f11017i, bVar.f28597a) && p0.c(this.f11018j, bVar.f28598b) && this.f11019k == bVar.f28600d && this.f11020l == bVar.f28601e && this.f11021m == bVar.f28602f && p0.c(Integer.valueOf(this.f11022n), Integer.valueOf(bVar.f28603g)) && this.f11023o == bVar.f28604h && p0.c(Integer.valueOf(this.f11024p), Integer.valueOf(bVar.f28605i)) && this.f11025q == bVar.f28606j && this.f11026r == bVar.f28607k && this.f11027s == bVar2.f33060a && this.f11028t == bVar2.f33061b && this.f11029u == i14 && this.f11031w == bVar2.f33063d && this.f11030v == bVar2.f33064e && p0.c(this.f11014f.getTypeface(), bVar2.f33065f) && this.f11032x == f10 && this.f11033y == f11 && this.f11034z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f11017i = bVar.f28597a;
        this.f11018j = bVar.f28598b;
        this.f11019k = bVar.f28600d;
        this.f11020l = bVar.f28601e;
        this.f11021m = bVar.f28602f;
        this.f11022n = bVar.f28603g;
        this.f11023o = bVar.f28604h;
        this.f11024p = bVar.f28605i;
        this.f11025q = bVar.f28606j;
        this.f11026r = bVar.f28607k;
        this.f11027s = bVar2.f33060a;
        this.f11028t = bVar2.f33061b;
        this.f11029u = i14;
        this.f11031w = bVar2.f33063d;
        this.f11030v = bVar2.f33064e;
        this.f11014f.setTypeface(bVar2.f33065f);
        this.f11032x = f10;
        this.f11033y = f11;
        this.f11034z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            a5.a.e(this.f11017i);
            g();
        } else {
            a5.a.e(this.f11019k);
            f();
        }
        d(canvas, z10);
    }
}

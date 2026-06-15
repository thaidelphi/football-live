package r5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;
import d5.k;
/* compiled from: TextAppearance.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f30389a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f30390b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f30391c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30392d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30393e;

    /* renamed from: f  reason: collision with root package name */
    public final int f30394f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f30395g;

    /* renamed from: h  reason: collision with root package name */
    public final float f30396h;

    /* renamed from: i  reason: collision with root package name */
    public final float f30397i;

    /* renamed from: j  reason: collision with root package name */
    public final float f30398j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f30399k;

    /* renamed from: l  reason: collision with root package name */
    public final float f30400l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f30401m;

    /* renamed from: n  reason: collision with root package name */
    private float f30402n;

    /* renamed from: o  reason: collision with root package name */
    private final int f30403o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f30404p = false;

    /* renamed from: q  reason: collision with root package name */
    private Typeface f30405q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends h.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f30406a;

        a(f fVar) {
            this.f30406a = fVar;
        }

        @Override // androidx.core.content.res.h.f
        public void h(int i10) {
            d.this.f30404p = true;
            this.f30406a.a(i10);
        }

        @Override // androidx.core.content.res.h.f
        public void i(Typeface typeface) {
            d dVar = d.this;
            dVar.f30405q = Typeface.create(typeface, dVar.f30393e);
            d.this.f30404p = true;
            this.f30406a.b(d.this.f30405q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextPaint f30409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f30410c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f30408a = context;
            this.f30409b = textPaint;
            this.f30410c = fVar;
        }

        @Override // r5.f
        public void a(int i10) {
            this.f30410c.a(i10);
        }

        @Override // r5.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f30408a, this.f30409b, typeface);
            this.f30410c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, k.L4);
        l(obtainStyledAttributes.getDimension(k.M4, 0.0f));
        k(c.a(context, obtainStyledAttributes, k.P4));
        this.f30389a = c.a(context, obtainStyledAttributes, k.Q4);
        this.f30390b = c.a(context, obtainStyledAttributes, k.R4);
        this.f30393e = obtainStyledAttributes.getInt(k.O4, 0);
        this.f30394f = obtainStyledAttributes.getInt(k.N4, 1);
        int e8 = c.e(obtainStyledAttributes, k.X4, k.W4);
        this.f30403o = obtainStyledAttributes.getResourceId(e8, 0);
        this.f30392d = obtainStyledAttributes.getString(e8);
        this.f30395g = obtainStyledAttributes.getBoolean(k.Y4, false);
        this.f30391c = c.a(context, obtainStyledAttributes, k.S4);
        this.f30396h = obtainStyledAttributes.getFloat(k.T4, 0.0f);
        this.f30397i = obtainStyledAttributes.getFloat(k.U4, 0.0f);
        this.f30398j = obtainStyledAttributes.getFloat(k.V4, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f24171g3);
            int i11 = k.f24179h3;
            this.f30399k = obtainStyledAttributes2.hasValue(i11);
            this.f30400l = obtainStyledAttributes2.getFloat(i11, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f30399k = false;
        this.f30400l = 0.0f;
    }

    private void d() {
        String str;
        if (this.f30405q == null && (str = this.f30392d) != null) {
            this.f30405q = Typeface.create(str, this.f30393e);
        }
        if (this.f30405q == null) {
            int i10 = this.f30394f;
            if (i10 == 1) {
                this.f30405q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f30405q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f30405q = Typeface.DEFAULT;
            } else {
                this.f30405q = Typeface.MONOSPACE;
            }
            this.f30405q = Typeface.create(this.f30405q, this.f30393e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f30403o;
        return (i10 != 0 ? h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f30405q;
    }

    public Typeface f(Context context) {
        if (this.f30404p) {
            return this.f30405q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g10 = h.g(context, this.f30403o);
                this.f30405q = g10;
                if (g10 != null) {
                    this.f30405q = Typeface.create(g10, this.f30393e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e8) {
                Log.d("TextAppearance", "Error loading font " + this.f30392d, e8);
            }
        }
        d();
        this.f30404p = true;
        return this.f30405q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f30403o;
        if (i10 == 0) {
            this.f30404p = true;
        }
        if (this.f30404p) {
            fVar.b(this.f30405q, true);
            return;
        }
        try {
            h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f30404p = true;
            fVar.a(1);
        } catch (Exception e8) {
            Log.d("TextAppearance", "Error loading font " + this.f30392d, e8);
            this.f30404p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f30401m;
    }

    public float j() {
        return this.f30402n;
    }

    public void k(ColorStateList colorStateList) {
        this.f30401m = colorStateList;
    }

    public void l(float f10) {
        this.f30402n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f30401m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f30398j;
        float f11 = this.f30396h;
        float f12 = this.f30397i;
        ColorStateList colorStateList2 = this.f30391c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = g.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f30393e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f30402n);
        if (Build.VERSION.SDK_INT < 21 || !this.f30399k) {
            return;
        }
        textPaint.setLetterSpacing(this.f30400l);
    }
}

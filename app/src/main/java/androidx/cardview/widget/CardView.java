package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f1876h = {16842801};

    /* renamed from: i  reason: collision with root package name */
    private static final e f1877i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1878a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1879b;

    /* renamed from: c  reason: collision with root package name */
    int f1880c;

    /* renamed from: d  reason: collision with root package name */
    int f1881d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f1882e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f1883f;

    /* renamed from: g  reason: collision with root package name */
    private final d f1884g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f1885a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1883f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1882e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void b(Drawable drawable) {
            this.f1885a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable d() {
            return this.f1885a;
        }

        @Override // androidx.cardview.widget.d
        public void e(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.f1880c) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.f1881d) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        @Override // androidx.cardview.widget.d
        public boolean f() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f1877i = new b();
        } else if (i10 >= 17) {
            f1877i = new androidx.cardview.widget.a();
        } else {
            f1877i = new c();
        }
        f1877i.k();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o.a.f29022a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1877i.e(this.f1884g);
    }

    public float getCardElevation() {
        return f1877i.i(this.f1884g);
    }

    public int getContentPaddingBottom() {
        return this.f1882e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1882e.left;
    }

    public int getContentPaddingRight() {
        return this.f1882e.right;
    }

    public int getContentPaddingTop() {
        return this.f1882e.top;
    }

    public float getMaxCardElevation() {
        return f1877i.d(this.f1884g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1879b;
    }

    public float getRadius() {
        return f1877i.b(this.f1884g);
    }

    public boolean getUseCompatPadding() {
        return this.f1878a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        e eVar = f1877i;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.l(this.f1884g)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.f(this.f1884g)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1877i.m(this.f1884g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1877i.c(this.f1884g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1877i.n(this.f1884g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1881d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1880c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1879b) {
            this.f1879b = z10;
            f1877i.g(this.f1884g);
        }
    }

    public void setRadius(float f10) {
        f1877i.a(this.f1884g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1878a != z10) {
            this.f1878a = z10;
            f1877i.j(this.f1884g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1882e = rect;
        this.f1883f = new Rect();
        a aVar = new a();
        this.f1884g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.e.f29029a, i10, o.d.f29028a);
        int i11 = o.e.f29032d;
        if (obtainStyledAttributes.hasValue(i11)) {
            valueOf = obtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1876h);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(o.b.f29024b);
            } else {
                color = getResources().getColor(o.b.f29023a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(o.e.f29033e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(o.e.f29034f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(o.e.f29035g, 0.0f);
        this.f1878a = obtainStyledAttributes.getBoolean(o.e.f29037i, false);
        this.f1879b = obtainStyledAttributes.getBoolean(o.e.f29036h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(o.e.f29038j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(o.e.f29040l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(o.e.f29042n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(o.e.f29041m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(o.e.f29039k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1880c = obtainStyledAttributes.getDimensionPixelSize(o.e.f29030b, 0);
        this.f1881d = obtainStyledAttributes.getDimensionPixelSize(o.e.f29031c, 0);
        obtainStyledAttributes.recycle();
        f1877i.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1877i.m(this.f1884g, colorStateList);
    }
}

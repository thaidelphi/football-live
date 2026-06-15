package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: Constraints.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    d f2197a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f2197a == null) {
            this.f2197a = new d();
        }
        this.f2197a.h(this);
        return this.f2197a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;

        /* renamed from: p0  reason: collision with root package name */
        public float f2198p0;

        /* renamed from: q0  reason: collision with root package name */
        public boolean f2199q0;

        /* renamed from: r0  reason: collision with root package name */
        public float f2200r0;

        /* renamed from: s0  reason: collision with root package name */
        public float f2201s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f2202t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f2203u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f2204v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f2205w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f2206x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f2207y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f2208z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2198p0 = 1.0f;
            this.f2199q0 = false;
            this.f2200r0 = 0.0f;
            this.f2201s0 = 0.0f;
            this.f2202t0 = 0.0f;
            this.f2203u0 = 0.0f;
            this.f2204v0 = 1.0f;
            this.f2205w0 = 1.0f;
            this.f2206x0 = 0.0f;
            this.f2207y0 = 0.0f;
            this.f2208z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2198p0 = 1.0f;
            this.f2199q0 = false;
            this.f2200r0 = 0.0f;
            this.f2201s0 = 0.0f;
            this.f2202t0 = 0.0f;
            this.f2203u0 = 0.0f;
            this.f2204v0 = 1.0f;
            this.f2205w0 = 1.0f;
            this.f2206x0 = 0.0f;
            this.f2207y0 = 0.0f;
            this.f2208z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2315p2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f2321q2) {
                    this.f2198p0 = obtainStyledAttributes.getFloat(index, this.f2198p0);
                } else if (index == i.B2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2200r0 = obtainStyledAttributes.getFloat(index, this.f2200r0);
                        this.f2199q0 = true;
                    }
                } else if (index == i.f2369y2) {
                    this.f2202t0 = obtainStyledAttributes.getFloat(index, this.f2202t0);
                } else if (index == i.f2375z2) {
                    this.f2203u0 = obtainStyledAttributes.getFloat(index, this.f2203u0);
                } else if (index == i.f2363x2) {
                    this.f2201s0 = obtainStyledAttributes.getFloat(index, this.f2201s0);
                } else if (index == i.f2351v2) {
                    this.f2204v0 = obtainStyledAttributes.getFloat(index, this.f2204v0);
                } else if (index == i.f2357w2) {
                    this.f2205w0 = obtainStyledAttributes.getFloat(index, this.f2205w0);
                } else if (index == i.f2327r2) {
                    this.f2206x0 = obtainStyledAttributes.getFloat(index, this.f2206x0);
                } else if (index == i.f2333s2) {
                    this.f2207y0 = obtainStyledAttributes.getFloat(index, this.f2207y0);
                } else if (index == i.f2339t2) {
                    this.f2208z0 = obtainStyledAttributes.getFloat(index, this.f2208z0);
                } else if (index == i.f2345u2) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == i.A2 && Build.VERSION.SDK_INT >= 21) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}

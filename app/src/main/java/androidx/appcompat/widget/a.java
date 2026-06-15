package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsActionBarView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0021a f1435a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f1436b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f1437c;

    /* renamed from: d  reason: collision with root package name */
    protected c f1438d;

    /* renamed from: e  reason: collision with root package name */
    protected int f1439e;

    /* renamed from: f  reason: collision with root package name */
    protected androidx.core.view.g0 f1440f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1441g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1442h;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class C0021a implements androidx.core.view.h0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1443a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1444b;

        protected C0021a() {
        }

        @Override // androidx.core.view.h0
        public void a(View view) {
            this.f1443a = true;
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            if (this.f1443a) {
                return;
            }
            a aVar = a.this;
            aVar.f1440f = null;
            a.super.setVisibility(this.f1444b);
        }

        @Override // androidx.core.view.h0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1443a = false;
        }

        public C0021a d(androidx.core.view.g0 g0Var, int i10) {
            a.this.f1440f = g0Var;
            this.f1444b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, RecyclerView.UNDEFINED_DURATION), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.g0 f(int i10, long j10) {
        androidx.core.view.g0 g0Var = this.f1440f;
        if (g0Var != null) {
            g0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            androidx.core.view.g0 b10 = androidx.core.view.a0.e(this).b(1.0f);
            b10.f(j10);
            b10.h(this.f1435a.d(b10, i10));
            return b10;
        }
        androidx.core.view.g0 b11 = androidx.core.view.a0.e(this).b(0.0f);
        b11.f(j10);
        b11.h(this.f1435a.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        if (this.f1440f != null) {
            return this.f1435a.f1444b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1439e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.j.f24678a, e.a.f24542c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(e.j.f24723j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1438d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1442h = false;
        }
        if (!this.f1442h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1442h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1442h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1441g = false;
        }
        if (!this.f1441g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1441g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1441g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1439e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.g0 g0Var = this.f1440f;
            if (g0Var != null) {
                g0Var.c();
            }
            super.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1435a = new C0021a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(e.a.f24540a, typedValue, true) && typedValue.resourceId != 0) {
            this.f1436b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1436b = context;
        }
    }
}

package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.m0;
import com.google.android.material.internal.m;
/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class h extends androidx.appcompat.widget.d {

    /* renamed from: e  reason: collision with root package name */
    private final m0 f14662e;

    /* renamed from: f  reason: collision with root package name */
    private final AccessibilityManager f14663f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f14664g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14665h;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            h hVar = h.this;
            h.this.f(i10 < 0 ? hVar.f14662e.u() : hVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = h.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = h.this.f14662e.x();
                    i10 = h.this.f14662e.w();
                    j10 = h.this.f14662e.v();
                }
                onItemClickListener.onItemClick(h.this.f14662e.o(), view, i10, j10);
            }
            h.this.f14662e.dismiss();
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d5.b.f23971a);
    }

    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d10 = d();
        int i10 = 0;
        if (adapter == null || d10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f14662e.w()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, d10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable g10 = this.f14662e.g();
        if (g10 != null) {
            g10.getPadding(this.f14664g);
            Rect rect = this.f14664g;
            i11 += rect.left + rect.right;
        }
        return i11 + d10.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends ListAdapter & Filterable> void f(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout d10 = d();
        if (d10 != null && d10.O()) {
            return d10.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d10 = d();
        if (d10 != null && d10.O() && super.getHint() == null && com.google.android.material.internal.g.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f14662e.m(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f14663f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f14662e.show();
        } else {
            super.showDropDown();
        }
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(v5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f14664g = new Rect();
        Context context2 = getContext();
        TypedArray h10 = m.h(context2, attributeSet, d5.k.Y1, i10, d5.j.f24100b, new int[0]);
        int i11 = d5.k.Z1;
        if (h10.hasValue(i11) && h10.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f14665h = h10.getResourceId(d5.k.f24122a2, d5.h.f24074j);
        this.f14663f = (AccessibilityManager) context2.getSystemService("accessibility");
        m0 m0Var = new m0(context2);
        this.f14662e = m0Var;
        m0Var.I(true);
        m0Var.C(this);
        m0Var.H(2);
        m0Var.m(getAdapter());
        m0Var.K(new a());
        int i12 = d5.k.f24130b2;
        if (h10.hasValue(i12)) {
            setSimpleItems(h10.getResourceId(i12, 0));
        }
        h10.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f14665h, strArr));
    }
}

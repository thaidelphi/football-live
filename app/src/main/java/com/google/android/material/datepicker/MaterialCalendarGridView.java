package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f14135a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14136b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.Z(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter2().i());
        } else if (i10 == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public i getAdapter2() {
        return (i) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a10;
        int d10;
        int a11;
        int d11;
        int width;
        int i10;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        i adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.f14210b;
        b bVar = adapter2.f14212d;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.i(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<androidx.core.util.e<Long, Long>> it = dateSelector.F().iterator();
        while (it.hasNext()) {
            androidx.core.util.e<Long, Long> next = it.next();
            Long l10 = next.f2786a;
            if (l10 == null) {
                materialCalendarGridView = this;
            } else if (next.f2787b != null) {
                long longValue = l10.longValue();
                long longValue2 = next.f2787b.longValue();
                if (!e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean e8 = com.google.android.material.internal.o.e(this);
                    if (longValue < item.longValue()) {
                        if (adapter2.f(max)) {
                            left2 = 0;
                        } else if (!e8) {
                            left2 = materialCalendarGridView.c(max - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.c(max - 1).getLeft();
                        }
                        d10 = left2;
                        a10 = max;
                    } else {
                        materialCalendarGridView.f14135a.setTimeInMillis(longValue);
                        a10 = adapter2.a(materialCalendarGridView.f14135a.get(5));
                        d10 = d(materialCalendarGridView.c(a10));
                    }
                    if (longValue2 > item2.longValue()) {
                        if (adapter2.g(min)) {
                            left = getWidth();
                        } else if (!e8) {
                            left = materialCalendarGridView.c(min).getRight();
                        } else {
                            left = materialCalendarGridView.c(min).getLeft();
                        }
                        d11 = left;
                        a11 = min;
                    } else {
                        materialCalendarGridView.f14135a.setTimeInMillis(longValue2);
                        a11 = adapter2.a(materialCalendarGridView.f14135a.get(5));
                        d11 = d(materialCalendarGridView.c(a11));
                    }
                    int itemId = (int) adapter2.getItemId(a10);
                    int i11 = max;
                    int i12 = min;
                    int itemId2 = (int) adapter2.getItemId(a11);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c10 = materialCalendarGridView.c(numColumns);
                        int top = c10.getTop() + bVar.f14151a.c();
                        i iVar = adapter2;
                        int bottom = c10.getBottom() - bVar.f14151a.b();
                        if (!e8) {
                            i10 = numColumns > a10 ? 0 : d10;
                            width = a11 > numColumns2 ? getWidth() : d11;
                        } else {
                            int i13 = a11 > numColumns2 ? 0 : d11;
                            width = numColumns > a10 ? getWidth() : d10;
                            i10 = i13;
                        }
                        canvas.drawRect(i10, top, width, bottom, bVar.f14158h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = iVar;
                    }
                    materialCalendarGridView = this;
                    max = i11;
                    min = i12;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (super.onKeyDown(i10, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i10) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f14136b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, RecyclerView.UNDEFINED_DURATION));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14135a = o.k();
        if (f.B2(getContext())) {
            setNextFocusLeftId(d5.f.f24036a);
            setNextFocusRightId(d5.f.f24038c);
        }
        this.f14136b = f.C2(getContext());
        a0.q0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof i) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), i.class.getCanonicalName()));
    }
}

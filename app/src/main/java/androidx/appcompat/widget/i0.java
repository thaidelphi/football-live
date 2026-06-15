package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropDownListView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f1594a;

    /* renamed from: b  reason: collision with root package name */
    private int f1595b;

    /* renamed from: c  reason: collision with root package name */
    private int f1596c;

    /* renamed from: d  reason: collision with root package name */
    private int f1597d;

    /* renamed from: e  reason: collision with root package name */
    private int f1598e;

    /* renamed from: f  reason: collision with root package name */
    private int f1599f;

    /* renamed from: g  reason: collision with root package name */
    private Field f1600g;

    /* renamed from: h  reason: collision with root package name */
    private a f1601h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1602i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1603j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1604k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.core.view.g0 f1605l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.core.widget.g f1606m;

    /* renamed from: n  reason: collision with root package name */
    b f1607n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends g.c {

        /* renamed from: b  reason: collision with root package name */
        private boolean f1608b;

        a(Drawable drawable) {
            super(drawable);
            this.f1608b = true;
        }

        void c(boolean z10) {
            this.f1608b = z10;
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1608b) {
                super.draw(canvas);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1608b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1608b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1608b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // g.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1608b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DropDownListView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        public void b() {
            i0 i0Var = i0.this;
            i0Var.f1607n = null;
            i0Var.removeCallbacks(this);
        }

        public void c() {
            i0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0Var = i0.this;
            i0Var.f1607n = null;
            i0Var.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Context context, boolean z10) {
        super(context, null, e.a.A);
        this.f1594a = new Rect();
        this.f1595b = 0;
        this.f1596c = 0;
        this.f1597d = 0;
        this.f1598e = 0;
        this.f1603j = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1600g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
        }
    }

    private void a() {
        this.f1604k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1599f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.g0 g0Var = this.f1605l;
        if (g0Var != null) {
            g0Var.c();
            this.f1605l = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1594a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1594a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f1594a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1595b;
        rect.top -= this.f1596c;
        rect.right += this.f1597d;
        rect.bottom += this.f1598e;
        try {
            boolean z10 = this.f1600g.getBoolean(this);
            if (view.isEnabled() != z10) {
                this.f1600g.set(this, Boolean.valueOf(!z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f1594a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.k(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1604k = true;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            drawableHotspotChanged(f10, f11);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f1599f;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1599f = i10;
        float left = f10 - view.getLeft();
        float top = f11 - view.getTop();
        if (i11 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f1604k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        a aVar = this.f1601h;
        if (aVar != null) {
            aVar.c(z10);
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i15 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            if (i19 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1607n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.g r9 = r7.f1606m
            if (r9 != 0) goto L5a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.f1606m = r9
        L5a:
            androidx.core.widget.g r9 = r7.f1606m
            r9.m(r2)
            androidx.core.widget.g r9 = r7.f1606m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.g r8 = r7.f1606m
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1603j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1603j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1603j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1603j && this.f1602i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1607n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1607n == null) {
            b bVar = new b();
            this.f1607n = bVar;
            bVar.c();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1599f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1607n;
        if (bVar != null) {
            bVar.b();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z10) {
        this.f1602i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1601h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1595b = rect.left;
        this.f1596c = rect.top;
        this.f1597d = rect.right;
        this.f1598e = rect.bottom;
    }
}

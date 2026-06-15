package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
/* compiled from: ListPopupWindow.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m0 implements j.e {
    private static Method G;
    private static Method H;
    private static Method I;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: a  reason: collision with root package name */
    private Context f1658a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f1659b;

    /* renamed from: c  reason: collision with root package name */
    i0 f1660c;

    /* renamed from: d  reason: collision with root package name */
    private int f1661d;

    /* renamed from: e  reason: collision with root package name */
    private int f1662e;

    /* renamed from: f  reason: collision with root package name */
    private int f1663f;

    /* renamed from: g  reason: collision with root package name */
    private int f1664g;

    /* renamed from: h  reason: collision with root package name */
    private int f1665h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1666i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1667j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1668k;

    /* renamed from: l  reason: collision with root package name */
    private int f1669l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1670m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1671n;

    /* renamed from: o  reason: collision with root package name */
    int f1672o;

    /* renamed from: p  reason: collision with root package name */
    private View f1673p;

    /* renamed from: q  reason: collision with root package name */
    private int f1674q;

    /* renamed from: r  reason: collision with root package name */
    private DataSetObserver f1675r;

    /* renamed from: s  reason: collision with root package name */
    private View f1676s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f1677t;

    /* renamed from: u  reason: collision with root package name */
    private AdapterView.OnItemClickListener f1678u;

    /* renamed from: v  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1679v;

    /* renamed from: w  reason: collision with root package name */
    final g f1680w;

    /* renamed from: x  reason: collision with root package name */
    private final f f1681x;

    /* renamed from: y  reason: collision with root package name */
    private final e f1682y;

    /* renamed from: z  reason: collision with root package name */
    private final c f1683z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View s10 = m0.this.s();
            if (s10 == null || s10.getWindowToken() == null) {
                return;
            }
            m0.this.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            i0 i0Var;
            if (i10 == -1 || (i0Var = m0.this.f1660c) == null) {
                return;
            }
            i0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (m0.this.a()) {
                m0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            m0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || m0.this.z() || m0.this.F.getContentView() == null) {
                return;
            }
            m0 m0Var = m0.this;
            m0Var.B.removeCallbacks(m0Var.f1680w);
            m0.this.f1680w.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = m0.this.F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < m0.this.F.getWidth() && y10 >= 0 && y10 < m0.this.F.getHeight()) {
                m0 m0Var = m0.this;
                m0Var.B.postDelayed(m0Var.f1680w, 250L);
                return false;
            } else if (action == 1) {
                m0 m0Var2 = m0.this;
                m0Var2.B.removeCallbacks(m0Var2.f1680w);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0Var = m0.this.f1660c;
            if (i0Var == null || !androidx.core.view.a0.T(i0Var) || m0.this.f1660c.getCount() <= m0.this.f1660c.getChildCount()) {
                return;
            }
            int childCount = m0.this.f1660c.getChildCount();
            m0 m0Var = m0.this;
            if (childCount <= m0Var.f1672o) {
                m0Var.F.setInputMethodMode(2);
                m0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public m0(Context context) {
        this(context, null, e.a.E);
    }

    private void B() {
        View view = this.f1673p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1673p);
            }
        }
    }

    private void M(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.valueOf(z10));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.F.setIsClippedToScreen(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int p() {
        int i10;
        int i11;
        int makeMeasureSpec;
        int i12;
        if (this.f1660c == null) {
            Context context = this.f1658a;
            this.A = new a();
            i0 r10 = r(context, !this.E);
            this.f1660c = r10;
            Drawable drawable = this.f1677t;
            if (drawable != null) {
                r10.setSelector(drawable);
            }
            this.f1660c.setAdapter(this.f1659b);
            this.f1660c.setOnItemClickListener(this.f1678u);
            this.f1660c.setFocusable(true);
            this.f1660c.setFocusableInTouchMode(true);
            this.f1660c.setOnItemSelectedListener(new b());
            this.f1660c.setOnScrollListener(this.f1682y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1679v;
            if (onItemSelectedListener != null) {
                this.f1660c.setOnItemSelectedListener(onItemSelectedListener);
            }
            i0 i0Var = this.f1660c;
            View view = this.f1673p;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f1674q;
                if (i13 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(i0Var, layoutParams);
                } else if (i13 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1674q);
                } else {
                    linearLayout.addView(i0Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i14 = this.f1662e;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i10 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                i0Var = linearLayout;
            } else {
                i10 = 0;
            }
            this.F.setContentView(i0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.F.getContentView();
            View view2 = this.f1673p;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i10 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i10 = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f1666i) {
                this.f1664g = -i15;
            }
        } else {
            this.C.setEmpty();
            i11 = 0;
        }
        int t10 = t(s(), this.f1664g, this.F.getInputMethodMode() == 2);
        if (this.f1670m || this.f1661d == -1) {
            return t10 + i11;
        }
        int i16 = this.f1662e;
        if (i16 == -2) {
            int i17 = this.f1658a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), RecyclerView.UNDEFINED_DURATION);
        } else if (i16 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else {
            int i18 = this.f1658a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), 1073741824);
        }
        int d10 = this.f1660c.d(makeMeasureSpec, 0, -1, t10 - i10, -1);
        if (d10 > 0) {
            i10 += i11 + this.f1660c.getPaddingTop() + this.f1660c.getPaddingBottom();
        }
        return d10 + i10;
    }

    private int t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = H;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.F, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.F.getMaxAvailableHeight(view, i10);
        }
        return this.F.getMaxAvailableHeight(view, i10, z10);
    }

    public boolean A() {
        return this.E;
    }

    public void C(View view) {
        this.f1676s = view;
    }

    public void D(int i10) {
        this.F.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f1662e = rect.left + rect.right + i10;
            return;
        }
        P(i10);
    }

    public void F(int i10) {
        this.f1669l = i10;
    }

    public void G(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.E = z10;
        this.F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1678u = onItemClickListener;
    }

    public void L(boolean z10) {
        this.f1668k = true;
        this.f1667j = z10;
    }

    public void N(int i10) {
        this.f1674q = i10;
    }

    public void O(int i10) {
        i0 i0Var = this.f1660c;
        if (!a() || i0Var == null) {
            return;
        }
        i0Var.setListSelectionHidden(false);
        i0Var.setSelection(i10);
        if (i0Var.getChoiceMode() != 0) {
            i0Var.setItemChecked(i10, true);
        }
    }

    public void P(int i10) {
        this.f1662e = i10;
    }

    @Override // j.e
    public boolean a() {
        return this.F.isShowing();
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f1663f;
    }

    @Override // j.e
    public void dismiss() {
        this.F.dismiss();
        B();
        this.F.setContentView(null);
        this.f1660c = null;
        this.B.removeCallbacks(this.f1680w);
    }

    public void e(int i10) {
        this.f1663f = i10;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    public void i(int i10) {
        this.f1664g = i10;
        this.f1666i = true;
    }

    public int l() {
        if (this.f1666i) {
            return this.f1664g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1675r;
        if (dataSetObserver == null) {
            this.f1675r = new d();
        } else {
            ListAdapter listAdapter2 = this.f1659b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1659b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1675r);
        }
        i0 i0Var = this.f1660c;
        if (i0Var != null) {
            i0Var.setAdapter(this.f1659b);
        }
    }

    @Override // j.e
    public ListView o() {
        return this.f1660c;
    }

    public void q() {
        i0 i0Var = this.f1660c;
        if (i0Var != null) {
            i0Var.setListSelectionHidden(true);
            i0Var.requestLayout();
        }
    }

    i0 r(Context context, boolean z10) {
        return new i0(context, z10);
    }

    public View s() {
        return this.f1676s;
    }

    @Override // j.e
    public void show() {
        int p10 = p();
        boolean z10 = z();
        androidx.core.widget.i.b(this.F, this.f1665h);
        boolean z11 = true;
        if (this.F.isShowing()) {
            if (androidx.core.view.a0.T(s())) {
                int i10 = this.f1662e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = s().getWidth();
                }
                int i11 = this.f1661d;
                if (i11 == -1) {
                    if (!z10) {
                        p10 = -1;
                    }
                    if (z10) {
                        this.F.setWidth(this.f1662e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f1662e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    p10 = i11;
                }
                PopupWindow popupWindow = this.F;
                if (this.f1671n || this.f1670m) {
                    z11 = false;
                }
                popupWindow.setOutsideTouchable(z11);
                this.F.update(s(), this.f1663f, this.f1664g, i10 < 0 ? -1 : i10, p10 < 0 ? -1 : p10);
                return;
            }
            return;
        }
        int i12 = this.f1662e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = s().getWidth();
        }
        int i13 = this.f1661d;
        if (i13 == -1) {
            p10 = -1;
        } else if (i13 != -2) {
            p10 = i13;
        }
        this.F.setWidth(i12);
        this.F.setHeight(p10);
        M(true);
        this.F.setOutsideTouchable((this.f1671n || this.f1670m) ? false : true);
        this.F.setTouchInterceptor(this.f1681x);
        if (this.f1668k) {
            androidx.core.widget.i.a(this.F, this.f1667j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        androidx.core.widget.i.c(this.F, s(), this.f1663f, this.f1664g, this.f1669l);
        this.f1660c.setSelection(-1);
        if (!this.E || this.f1660c.isInTouchMode()) {
            q();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f1683z);
    }

    public Object u() {
        if (a()) {
            return this.f1660c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f1660c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f1660c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f1660c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f1662e;
    }

    public boolean z() {
        return this.F.getInputMethodMode() == 2;
    }

    public m0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public m0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1661d = -2;
        this.f1662e = -2;
        this.f1665h = 1002;
        this.f1669l = 0;
        this.f1670m = false;
        this.f1671n = false;
        this.f1672o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1674q = 0;
        this.f1680w = new g();
        this.f1681x = new f();
        this.f1682y = new e();
        this.f1683z = new c();
        this.C = new Rect();
        this.f1658a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f24735l1, i10, i11);
        this.f1663f = obtainStyledAttributes.getDimensionPixelOffset(e.j.f24740m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(e.j.f24745n1, 0);
        this.f1664g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1666i = true;
        }
        obtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i10, i11);
        this.F = tVar;
        tVar.setInputMethodMode(1);
    }
}

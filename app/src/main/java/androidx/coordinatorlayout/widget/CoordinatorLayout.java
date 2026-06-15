package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.t;
import androidx.core.view.u;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {

    /* renamed from: u  reason: collision with root package name */
    static final String f2380u;

    /* renamed from: v  reason: collision with root package name */
    static final Class<?>[] f2381v;

    /* renamed from: w  reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f2382w;

    /* renamed from: x  reason: collision with root package name */
    static final Comparator<View> f2383x;

    /* renamed from: y  reason: collision with root package name */
    private static final androidx.core.util.f<Rect> f2384y;

    /* renamed from: a  reason: collision with root package name */
    private final List<View> f2385a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f2386b;

    /* renamed from: c  reason: collision with root package name */
    private final List<View> f2387c;

    /* renamed from: d  reason: collision with root package name */
    private final List<View> f2388d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f2389e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f2390f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f2391g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2392h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2393i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f2394j;

    /* renamed from: k  reason: collision with root package name */
    private View f2395k;

    /* renamed from: l  reason: collision with root package name */
    private View f2396l;

    /* renamed from: m  reason: collision with root package name */
    private g f2397m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2398n;

    /* renamed from: o  reason: collision with root package name */
    private l0 f2399o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2400p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f2401q;

    /* renamed from: r  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f2402r;

    /* renamed from: s  reason: collision with root package name */
    private u f2403s;

    /* renamed from: t  reason: collision with root package name */
    private final t f2404t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements u {
        a() {
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            return CoordinatorLayout.this.W(l0Var);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, v10, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v10) {
            return d(coordinatorLayout, v10) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public l0 f(CoordinatorLayout coordinatorLayout, V v10, l0 l0Var) {
            return l0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2402r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2402r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class h implements Comparator<View> {
        h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float O = a0.O(view);
            float O2 = a0.O(view2);
            if (O > O2) {
                return -1;
            }
            return O < O2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2380u = r02 != null ? r02.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f2383x = new h();
        } else {
            f2383x = null;
        }
        f2381v = new Class[]{Context.class, AttributeSet.class};
        f2382w = new ThreadLocal<>();
        f2384y = new androidx.core.util.h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u.a.f31251a);
    }

    private boolean A(View view) {
        return this.f2386b.j(view);
    }

    private void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect a10 = a();
        a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f2399o != null && a0.B(this) && !a0.B(view)) {
            a10.left += this.f2399o.i();
            a10.top += this.f2399o.k();
            a10.right -= this.f2399o.j();
            a10.bottom -= this.f2399o.h();
        }
        Rect a11 = a();
        androidx.core.view.e.a(S(fVar.f2410c), view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
        view.layout(a11.left, a11.top, a11.right, a11.bottom);
        O(a10);
        O(a11);
    }

    private void D(View view, View view2, int i10) {
        Rect a10 = a();
        Rect a11 = a();
        try {
            t(view2, a10);
            u(view, i10, a10, a11);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
        } finally {
            O(a10);
            O(a11);
        }
    }

    private void E(View view, int i10, int i11) {
        f fVar = (f) view.getLayoutParams();
        int b10 = androidx.core.view.e.b(T(fVar.f2410c), i11);
        int i12 = b10 & 7;
        int i13 = b10 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int w10 = w(i10) - measuredWidth;
        int i14 = 0;
        if (i12 == 1) {
            w10 += measuredWidth / 2;
        } else if (i12 == 5) {
            w10 += measuredWidth;
        }
        if (i13 == 16) {
            i14 = 0 + (measuredHeight / 2);
        } else if (i13 == 80) {
            i14 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(w10, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (a0.U(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            Rect a10 = a();
            Rect a11 = a();
            a11.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f10 != null && f10.b(this, view, a10)) {
                if (!a11.contains(a10)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a10.toShortString() + " | Bounds:" + a11.toShortString());
                }
            } else {
                a10.set(a11);
            }
            O(a11);
            if (a10.isEmpty()) {
                O(a10);
                return;
            }
            int b10 = androidx.core.view.e.b(fVar.f2415h, i10);
            boolean z12 = true;
            if ((b10 & 48) != 48 || (i15 = (a10.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f2417j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((b10 & 80) == 80 && (height = ((getHeight() - a10.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f2417j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((b10 & 3) != 3 || (i12 = (a10.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f2416i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((b10 & 5) != 5 || (width = ((getWidth() - a10.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f2416i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(a10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2380u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f2382w;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2381v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e8) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e8);
        }
    }

    private boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2387c;
        z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c f10 = fVar.f();
            if (!(z10 || z11) || actionMasked == 0) {
                if (!z10 && f10 != null) {
                    if (i10 == 0) {
                        z10 = f10.k(this, view, motionEvent);
                    } else if (i10 == 1) {
                        z10 = f10.D(this, view, motionEvent);
                    }
                    if (z10) {
                        this.f2395k = view;
                    }
                }
                boolean c10 = fVar.c();
                boolean i12 = fVar.i(this, view);
                z11 = i12 && !c10;
                if (i12 && !z11) {
                    break;
                }
            } else if (f10 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    f10.k(this, view, motionEvent2);
                } else if (i10 == 1) {
                    f10.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z10;
    }

    private void M() {
        this.f2385a.clear();
        this.f2386b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f y10 = y(childAt);
            y10.d(this, childAt);
            this.f2386b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (y10.b(this, childAt, childAt2)) {
                        if (!this.f2386b.d(childAt2)) {
                            this.f2386b.b(childAt2);
                        }
                        this.f2386b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2385a.addAll(this.f2386b.i());
        Collections.reverse(this.f2385a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        f2384y.a(rect);
    }

    private void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (f10 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    f10.k(this, childAt, obtain);
                } else {
                    f10.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f2395k = null;
        this.f2392h = false;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2416i;
        if (i11 != i10) {
            a0.a0(view, i10 - i11);
            fVar.f2416i = i10;
        }
    }

    private void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2417j;
        if (i11 != i10) {
            a0.b0(view, i10 - i11);
            fVar.f2417j = i10;
        }
    }

    private void X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (a0.B(this)) {
            if (this.f2403s == null) {
                this.f2403s = new a();
            }
            a0.C0(this, this.f2403s);
            setSystemUiVisibility(1280);
            return;
        }
        a0.C0(this, null);
    }

    private static Rect a() {
        Rect b10 = f2384y.b();
        return b10 == null ? new Rect() : b10;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    private l0 e(l0 l0Var) {
        c f10;
        if (l0Var.n()) {
            return l0Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (a0.B(childAt) && (f10 = ((f) childAt.getLayoutParams()).f()) != null) {
                l0Var = f10.f(this, childAt, l0Var);
                if (l0Var.n()) {
                    break;
                }
            }
        }
        return l0Var;
    }

    private void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int b10 = androidx.core.view.e.b(R(fVar.f2410c), i10);
        int b11 = androidx.core.view.e.b(S(fVar.f2411d), i10);
        int i13 = b10 & 7;
        int i14 = b10 & 112;
        int i15 = b11 & 7;
        int i16 = b11 & 112;
        if (i15 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i15 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i16 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i16 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i13 == 1) {
            width -= i11 / 2;
        } else if (i13 != 5) {
            width -= i11;
        }
        if (i14 == 16) {
            height -= i12 / 2;
        } else if (i14 != 80) {
            height -= i12;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    private int w(int i10) {
        int[] iArr = this.f2394j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    private void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f2383x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i10, int i11) {
        Rect a10 = a();
        t(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            O(a10);
        }
    }

    void G(View view, int i10) {
        c f10;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f2418k != null) {
            Rect a10 = a();
            Rect a11 = a();
            Rect a12 = a();
            t(fVar.f2418k, a10);
            boolean z10 = false;
            q(view, false, a11);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, a10, a12, fVar, measuredWidth, measuredHeight);
            z10 = (a12.left == a11.left && a12.top == a11.top) ? true : true;
            d(fVar, a12, measuredWidth, measuredHeight);
            int i11 = a12.left - a11.left;
            int i12 = a12.top - a11.top;
            if (i11 != 0) {
                a0.a0(view, i11);
            }
            if (i12 != 0) {
                a0.b0(view, i12);
            }
            if (z10 && (f10 = fVar.f()) != null) {
                f10.h(this, view, fVar.f2418k);
            }
            O(a10);
            O(a11);
            O(a12);
        }
    }

    final void H(int i10) {
        boolean z10;
        int E = a0.E(this);
        int size = this.f2385a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f2385a.get(i11);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (fVar.f2419l == this.f2385a.get(i12)) {
                        G(view, E);
                    }
                }
                q(view, true, a11);
                if (fVar.f2414g != 0 && !a11.isEmpty()) {
                    int b10 = androidx.core.view.e.b(fVar.f2414g, E);
                    int i13 = b10 & 112;
                    if (i13 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i13 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i14 = b10 & 7;
                    if (i14 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i14 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar.f2415h != 0 && view.getVisibility() == 0) {
                    F(view, a10, E);
                }
                if (i10 != 2) {
                    x(view, a12);
                    if (!a12.equals(a11)) {
                        N(view, a11);
                    }
                }
                for (int i15 = i11 + 1; i15 < size; i15++) {
                    View view2 = this.f2385a.get(i15);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f10 = fVar2.f();
                    if (f10 != null && f10.e(this, view2, view)) {
                        if (i10 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i10 != 2) {
                                z10 = f10.h(this, view2, view);
                            } else {
                                f10.i(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar2.p(z10);
                            }
                        }
                    }
                }
            }
        }
        O(a10);
        O(a11);
        O(a12);
    }

    public void I(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f2418k;
            if (view2 != null) {
                D(view, view2, i10);
                return;
            }
            int i11 = fVar.f2412e;
            if (i11 >= 0) {
                E(view, i11, i10);
                return;
            } else {
                C(view, i10);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.f2393i && this.f2397m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2397m);
        }
        this.f2398n = false;
    }

    final l0 W(l0 l0Var) {
        if (androidx.core.util.d.a(this.f2399o, l0Var)) {
            return l0Var;
        }
        this.f2399o = l0Var;
        boolean z10 = true;
        boolean z11 = l0Var != null && l0Var.k() > 0;
        this.f2400p = z11;
        if (z11 || getBackground() != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        l0 e8 = e(l0Var);
        requestLayout();
        return e8;
    }

    void b() {
        if (this.f2393i) {
            if (this.f2397m == null) {
                this.f2397m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2397m);
        }
        this.f2398n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f2408a;
        if (cVar != null) {
            float d10 = cVar.d(this, view);
            if (d10 > 0.0f) {
                if (this.f2389e == null) {
                    this.f2389e = new Paint();
                }
                this.f2389e.setColor(fVar.f2408a.c(this, view));
                this.f2389e.setAlpha(c(Math.round(d10 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f2389e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2401q;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public void f(View view) {
        List g10 = this.f2386b.g(view);
        if (g10 == null || g10.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < g10.size(); i10++) {
            View view2 = (View) g10.get(i10);
            c f10 = ((f) view2.getLayoutParams()).f();
            if (f10 != null) {
                f10.h(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (A(getChildAt(i10))) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10 != this.f2398n) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f2385a);
    }

    public final l0 getLastWindowInsets() {
        return this.f2399o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2404t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2401q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.q
    public void i(View view, View view2, int i10, int i11) {
        c f10;
        this.f2404t.c(view, view2, i10, i11);
        this.f2396l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (f10 = fVar.f()) != null) {
                f10.v(this, childAt, view, view2, i10, i11);
            }
        }
    }

    @Override // androidx.core.view.q
    public void j(View view, int i10) {
        this.f2404t.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c f10 = fVar.f();
                if (f10 != null) {
                    f10.C(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f2396l = null;
    }

    @Override // androidx.core.view.q
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c f10;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f2390f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2390f;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f2390f;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.r
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c f10;
        boolean z10;
        int min;
        int childCount = getChildCount();
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (f10 = fVar.f()) != null) {
                    int[] iArr2 = this.f2390f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f10.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f2390f;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    if (i13 > 0) {
                        z10 = true;
                        min = Math.max(i16, this.f2390f[1]);
                    } else {
                        z10 = true;
                        min = Math.min(i16, this.f2390f[1]);
                    }
                    i16 = min;
                    z11 = z10;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z11) {
            H(1);
        }
    }

    @Override // androidx.core.view.q
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f2391g);
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f10 = fVar.f();
                if (f10 != null) {
                    boolean A = f10.A(this, childAt, view, view2, i10, i11);
                    z10 |= A;
                    fVar.r(i11, A);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f2398n) {
            if (this.f2397m == null) {
                this.f2397m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2397m);
        }
        if (this.f2399o == null && a0.B(this)) {
            a0.n0(this);
        }
        this.f2393i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f2398n && this.f2397m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2397m);
        }
        View view = this.f2396l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2393i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2400p || this.f2401q == null) {
            return;
        }
        l0 l0Var = this.f2399o;
        int k10 = l0Var != null ? l0Var.k() : 0;
        if (k10 > 0) {
            this.f2401q.setBounds(0, 0, getWidth(), k10);
            this.f2401q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c f10;
        int E = a0.E(this);
        int size = this.f2385a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f2385a.get(i14);
            if (view.getVisibility() != 8 && ((f10 = ((f) view.getLayoutParams()).f()) == null || !f10.l(this, view, E))) {
                I(view, E);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c f12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z11 |= f12.n(this, childAt, view, f10, f11, z10);
                }
            }
        }
        if (z11) {
            H(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c f12;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f12 = fVar.f()) != null) {
                    z10 |= f12.o(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f2405c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c f10 = y(childAt).f();
            if (id != -1 && f10 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f10.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c f10 = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && f10 != null && (y10 = f10.y(this, childAt)) != null) {
                sparseArray.append(id, y10);
            }
        }
        savedState.f2405c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2395k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f2395k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f2395k
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.f2395k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h10 = this.f2386b.h(view);
        this.f2388d.clear();
        if (h10 != null) {
            this.f2388d.addAll(h10);
        }
        return this.f2388d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c f10 = ((f) view.getLayoutParams()).f();
        if (f10 == null || !f10.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f2392h) {
            return;
        }
        Q(false);
        this.f2392h = true;
    }

    public List<View> s(View view) {
        List g10 = this.f2386b.g(view);
        this.f2388d.clear();
        if (g10 != null) {
            this.f2388d.addAll(g10);
        }
        return this.f2388d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2402r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2401q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2401q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f2401q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f2401q, a0.E(this));
                this.f2401q.setVisible(getVisibility() == 0, false);
                this.f2401q.setCallback(this);
            }
            a0.h0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.a.f(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2401q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f2401q.setVisible(z10, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2401q;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f2409b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f2409b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e8) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e8);
                    }
                }
                fVar.f2409b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f2385a = new ArrayList();
        this.f2386b = new androidx.coordinatorlayout.widget.a<>();
        this.f2387c = new ArrayList();
        this.f2388d = new ArrayList();
        this.f2390f = new int[2];
        this.f2391g = new int[2];
        this.f2404t = new t(this);
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.c.f31254b, 0, u.b.f31252a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.c.f31254b, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, u.c.f31254b, attributeSet, obtainStyledAttributes, 0, u.b.f31252a);
            } else {
                saveAttributeDataForStyleable(context, u.c.f31254b, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(u.c.f31255c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2394j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f2394j.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.f2394j;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        this.f2401q = obtainStyledAttributes.getDrawable(u.c.f31256d);
        obtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (a0.C(this) == 0) {
            a0.A0(this, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        SparseArray<Parcelable> f2405c;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2405c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f2405c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f2405c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f2405c.keyAt(i11);
                parcelableArr[i11] = this.f2405c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f2408a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2409b;

        /* renamed from: c  reason: collision with root package name */
        public int f2410c;

        /* renamed from: d  reason: collision with root package name */
        public int f2411d;

        /* renamed from: e  reason: collision with root package name */
        public int f2412e;

        /* renamed from: f  reason: collision with root package name */
        int f2413f;

        /* renamed from: g  reason: collision with root package name */
        public int f2414g;

        /* renamed from: h  reason: collision with root package name */
        public int f2415h;

        /* renamed from: i  reason: collision with root package name */
        int f2416i;

        /* renamed from: j  reason: collision with root package name */
        int f2417j;

        /* renamed from: k  reason: collision with root package name */
        View f2418k;

        /* renamed from: l  reason: collision with root package name */
        View f2419l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f2420m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f2421n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f2422o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f2423p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f2424q;

        /* renamed from: r  reason: collision with root package name */
        Object f2425r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f2409b = false;
            this.f2410c = 0;
            this.f2411d = 0;
            this.f2412e = -1;
            this.f2413f = -1;
            this.f2414g = 0;
            this.f2415h = 0;
            this.f2424q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2413f);
            this.f2418k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2419l = null;
                    this.f2418k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2413f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f2419l = null;
                    this.f2418k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f2419l = null;
                            this.f2418k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f2419l = findViewById;
            }
        }

        private boolean s(View view, int i10) {
            int b10 = androidx.core.view.e.b(((f) view.getLayoutParams()).f2414g, i10);
            return b10 != 0 && (androidx.core.view.e.b(this.f2415h, i10) & b10) == b10;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2418k.getId() != this.f2413f) {
                return false;
            }
            View view2 = this.f2418k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f2419l = null;
                    this.f2418k = null;
                    return false;
                }
            }
            this.f2419l = view2;
            return true;
        }

        boolean a() {
            return this.f2418k == null && this.f2413f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f2419l || s(view2, a0.E(coordinatorLayout)) || ((cVar = this.f2408a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f2408a == null) {
                this.f2420m = false;
            }
            return this.f2420m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2413f == -1) {
                this.f2419l = null;
                this.f2418k = null;
                return null;
            }
            if (this.f2418k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f2418k;
        }

        public int e() {
            return this.f2413f;
        }

        public c f() {
            return this.f2408a;
        }

        boolean g() {
            return this.f2423p;
        }

        Rect h() {
            return this.f2424q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f2420m;
            if (z10) {
                return true;
            }
            c cVar = this.f2408a;
            boolean a10 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f2420m = a10;
            return a10;
        }

        boolean j(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f2422o;
            }
            return this.f2421n;
        }

        void k() {
            this.f2423p = false;
        }

        void l(int i10) {
            r(i10, false);
        }

        void m() {
            this.f2420m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f2408a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f2408a = cVar;
                this.f2425r = null;
                this.f2409b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z10) {
            this.f2423p = z10;
        }

        void q(Rect rect) {
            this.f2424q.set(rect);
        }

        void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f2421n = z10;
            } else if (i10 != 1) {
            } else {
                this.f2422o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2409b = false;
            this.f2410c = 0;
            this.f2411d = 0;
            this.f2412e = -1;
            this.f2413f = -1;
            this.f2414g = 0;
            this.f2415h = 0;
            this.f2424q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.c.f31257e);
            this.f2410c = obtainStyledAttributes.getInteger(u.c.f31258f, 0);
            this.f2413f = obtainStyledAttributes.getResourceId(u.c.f31259g, -1);
            this.f2411d = obtainStyledAttributes.getInteger(u.c.f31260h, 0);
            this.f2412e = obtainStyledAttributes.getInteger(u.c.f31264l, -1);
            this.f2414g = obtainStyledAttributes.getInt(u.c.f31263k, 0);
            this.f2415h = obtainStyledAttributes.getInt(u.c.f31262j, 0);
            int i10 = u.c.f31261i;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2409b = hasValue;
            if (hasValue) {
                this.f2408a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(i10));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f2408a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2409b = false;
            this.f2410c = 0;
            this.f2411d = 0;
            this.f2412e = -1;
            this.f2413f = -1;
            this.f2414g = 0;
            this.f2415h = 0;
            this.f2424q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2409b = false;
            this.f2410c = 0;
            this.f2411d = 0;
            this.f2412e = -1;
            this.f2413f = -1;
            this.f2414g = 0;
            this.f2415h = 0;
            this.f2424q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2409b = false;
            this.f2410c = 0;
            this.f2411d = 0;
            this.f2412e = -1;
            this.f2413f = -1;
            this.f2414g = 0;
            this.f2415h = 0;
            this.f2424q = new Rect();
        }
    }
}

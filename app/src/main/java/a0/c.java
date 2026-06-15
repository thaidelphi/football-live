package a0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.a0;
import java.util.Arrays;
/* compiled from: ViewDragHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: x  reason: collision with root package name */
    private static final Interpolator f21x = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f22a;

    /* renamed from: b  reason: collision with root package name */
    private int f23b;

    /* renamed from: d  reason: collision with root package name */
    private float[] f25d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f26e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f27f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f28g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f29h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f30i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f31j;

    /* renamed from: k  reason: collision with root package name */
    private int f32k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f33l;

    /* renamed from: m  reason: collision with root package name */
    private float f34m;

    /* renamed from: n  reason: collision with root package name */
    private float f35n;

    /* renamed from: o  reason: collision with root package name */
    private int f36o;

    /* renamed from: p  reason: collision with root package name */
    private final int f37p;

    /* renamed from: q  reason: collision with root package name */
    private int f38q;

    /* renamed from: r  reason: collision with root package name */
    private OverScroller f39r;

    /* renamed from: s  reason: collision with root package name */
    private final AbstractC0002c f40s;

    /* renamed from: t  reason: collision with root package name */
    private View f41t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f42u;

    /* renamed from: v  reason: collision with root package name */
    private final ViewGroup f43v;

    /* renamed from: c  reason: collision with root package name */
    private int f24c = -1;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f44w = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: a0.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class AbstractC0002c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0002c abstractC0002c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0002c != null) {
            this.f43v = viewGroup;
            this.f40s = abstractC0002c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f37p = i10;
            this.f36o = i10;
            this.f23b = viewConfiguration.getScaledTouchSlop();
            this.f34m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f35n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f39r = new OverScroller(context, f21x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private void A() {
        this.f33l.computeCurrentVelocity(1000, this.f34m);
        n(e(this.f33l.getXVelocity(this.f24c), this.f35n, this.f34m), e(this.f33l.getYVelocity(this.f24c), this.f35n, this.f34m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a0.c$c] */
    private void B(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = c10 | true;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f30i;
            iArr[i10] = iArr[i10] | r02;
            this.f40s.f(r02, i10);
        }
    }

    private void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f25d;
        this.f27f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f26e;
        this.f28g[i10] = f11;
        fArr2[i10] = f11;
        this.f29h[i10] = t((int) f10, (int) f11);
        this.f32k |= 1 << i10;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f27f[pointerId] = x10;
                this.f28g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f29h[i10] & i11) != i11 || (this.f38q & i11) == 0 || (this.f31j[i10] & i11) == i11 || (this.f30i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f23b;
        if (abs > i12 || abs2 > i12) {
            if (abs >= abs2 * 0.5f || !this.f40s.g(i11)) {
                return (this.f30i[i10] & i11) == 0 && abs > ((float) this.f23b);
            }
            int[] iArr = this.f31j;
            iArr[i10] = iArr[i10] | i11;
            return false;
        }
        return false;
    }

    private boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f40s.d(view) > 0;
        boolean z11 = this.f40s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f23b) : z11 && Math.abs(f11) > ((float) this.f23b);
        }
        int i10 = this.f23b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    private float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void g() {
        float[] fArr = this.f25d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f26e, 0.0f);
        Arrays.fill(this.f27f, 0.0f);
        Arrays.fill(this.f28g, 0.0f);
        Arrays.fill(this.f29h, 0);
        Arrays.fill(this.f30i, 0);
        Arrays.fill(this.f31j, 0);
        this.f32k = 0;
    }

    private void h(int i10) {
        if (this.f25d == null || !w(i10)) {
            return;
        }
        this.f25d[i10] = 0.0f;
        this.f26e[i10] = 0.0f;
        this.f27f[i10] = 0.0f;
        this.f28g[i10] = 0.0f;
        this.f29h[i10] = 0;
        this.f30i[i10] = 0;
        this.f31j[i10] = 0;
        this.f32k = (~(1 << i10)) & this.f32k;
    }

    private int i(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f43v.getWidth();
        float f10 = width / 2;
        float o10 = f10 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(o10 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int f14 = f(i12, (int) this.f35n, (int) this.f34m);
        int f15 = f(i13, (int) this.f35n, (int) this.f34m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(f14);
        int abs4 = Math.abs(f15);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (f14 != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f16 = f10 / f11;
        if (f15 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((i(i10, f14, this.f40s.d(view)) * f16) + (i(i11, f15, this.f40s.e(view)) * (f12 / f13)));
    }

    public static c l(ViewGroup viewGroup, float f10, AbstractC0002c abstractC0002c) {
        c m7 = m(viewGroup, abstractC0002c);
        m7.f23b = (int) (m7.f23b * (1.0f / f10));
        return m7;
    }

    public static c m(ViewGroup viewGroup, AbstractC0002c abstractC0002c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0002c);
    }

    private void n(float f10, float f11) {
        this.f42u = true;
        this.f40s.l(this.f41t, f10, f11);
        this.f42u = false;
        if (this.f22a == 1) {
            E(0);
        }
    }

    private float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void p(int i10, int i11, int i12, int i13) {
        int left = this.f41t.getLeft();
        int top = this.f41t.getTop();
        if (i12 != 0) {
            i10 = this.f40s.a(this.f41t, i10, i12);
            a0.a0(this.f41t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f40s.b(this.f41t, i11, i13);
            a0.b0(this.f41t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f40s.k(this.f41t, i14, i15, i14 - left, i15 - top);
    }

    private void q(int i10) {
        float[] fArr = this.f25d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f26e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f27f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f28g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f29h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f30i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f31j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f25d = fArr2;
            this.f26e = fArr3;
            this.f27f = fArr4;
            this.f28g = fArr5;
            this.f29h = iArr;
            this.f30i = iArr2;
            this.f31j = iArr3;
        }
    }

    private boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f41t.getLeft();
        int top = this.f41t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f39r.abortAnimation();
            E(0);
            return false;
        }
        this.f39r.startScroll(left, top, i14, i15, j(this.f41t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    private int t(int i10, int i11) {
        int i12 = i10 < this.f43v.getLeft() + this.f36o ? 1 : 0;
        if (i11 < this.f43v.getTop() + this.f36o) {
            i12 |= 4;
        }
        if (i10 > this.f43v.getRight() - this.f36o) {
            i12 |= 2;
        }
        return i11 > this.f43v.getBottom() - this.f36o ? i12 | 8 : i12;
    }

    private boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i10) {
        this.f43v.removeCallbacks(this.f44w);
        if (this.f22a != i10) {
            this.f22a = i10;
            this.f40s.j(i10);
            if (this.f22a == 0) {
                this.f41t = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f42u) {
            return s(i10, i11, (int) this.f33l.getXVelocity(this.f24c), (int) this.f33l.getYVelocity(this.f24c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i10, int i11) {
        this.f41t = view;
        this.f24c = -1;
        boolean s10 = s(i10, i11, 0, 0);
        if (!s10 && this.f22a == 0 && this.f41t != null) {
            this.f41t = null;
        }
        return s10;
    }

    boolean I(View view, int i10) {
        if (view == this.f41t && this.f24c == i10) {
            return true;
        }
        if (view == null || !this.f40s.m(view, i10)) {
            return false;
        }
        this.f24c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f24c = -1;
        g();
        VelocityTracker velocityTracker = this.f33l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f33l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f43v) {
            this.f41t = view;
            this.f24c = i10;
            this.f40s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f43v + ")");
    }

    public boolean k(boolean z10) {
        if (this.f22a == 2) {
            boolean computeScrollOffset = this.f39r.computeScrollOffset();
            int currX = this.f39r.getCurrX();
            int currY = this.f39r.getCurrY();
            int left = currX - this.f41t.getLeft();
            int top = currY - this.f41t.getTop();
            if (left != 0) {
                a0.a0(this.f41t, left);
            }
            if (top != 0) {
                a0.b0(this.f41t, top);
            }
            if (left != 0 || top != 0) {
                this.f40s.k(this.f41t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f39r.getFinalX() && currY == this.f39r.getFinalY()) {
                this.f39r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f43v.post(this.f44w);
                } else {
                    E(0);
                }
            }
        }
        return this.f22a == 2;
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f43v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f43v.getChildAt(this.f40s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f23b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f41t, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f32k) != 0;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f33l == null) {
            this.f33l = VelocityTracker.obtain();
        }
        this.f33l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r10 = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(r10, pointerId);
            int i12 = this.f29h[pointerId];
            int i13 = this.f38q;
            if ((i12 & i13) != 0) {
                this.f40s.h(i12 & i13, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f22a == 1) {
                A();
            }
            a();
        } else if (actionMasked == 2) {
            if (this.f22a == 1) {
                if (x(this.f24c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f24c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f27f;
                    int i14 = this.f24c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f28g[i14]);
                    p(this.f41t.getLeft() + i15, this.f41t.getTop() + i16, i15, i16);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f25d[pointerId2];
                    float f11 = y12 - this.f26e[pointerId2];
                    B(f10, f11, pointerId2);
                    if (this.f22a != 1) {
                        View r11 = r((int) x12, (int) y12);
                        if (d(r11, f10, f11) && I(r11, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            D(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f22a == 1) {
                n(0.0f, 0.0f);
            }
            a();
        } else if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            C(x13, y13, pointerId3);
            if (this.f22a == 0) {
                I(r((int) x13, (int) y13), pointerId3);
                int i17 = this.f29h[pointerId3];
                int i18 = this.f38q;
                if ((i17 & i18) != 0) {
                    this.f40s.h(i17 & i18, pointerId3);
                }
            } else if (v((int) x13, (int) y13)) {
                I(this.f41t, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            if (this.f22a == 1 && pointerId4 == this.f24c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i11 >= pointerCount2) {
                        i10 = -1;
                        break;
                    }
                    int pointerId5 = motionEvent.getPointerId(i11);
                    if (pointerId5 != this.f24c) {
                        View r12 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                        View view = this.f41t;
                        if (r12 == view && I(view, pointerId5)) {
                            i10 = this.f24c;
                            break;
                        }
                    }
                    i11++;
                }
                if (i10 == -1) {
                    A();
                }
            }
            h(pointerId4);
        }
    }
}

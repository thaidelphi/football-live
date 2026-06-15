package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* compiled from: ForwardingListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class k0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f1625a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1626b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1627c;

    /* renamed from: d  reason: collision with root package name */
    final View f1628d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f1629e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1630f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1631g;

    /* renamed from: h  reason: collision with root package name */
    private int f1632h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f1633i = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = k0.this.f1628d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.e();
        }
    }

    public k0(View view) {
        this.f1628d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1625a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1626b = tapTimeout;
        this.f1627c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1630f;
        if (runnable != null) {
            this.f1628d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1629e;
        if (runnable2 != null) {
            this.f1628d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        i0 i0Var;
        View view = this.f1628d;
        j.e b10 = b();
        if (b10 == null || !b10.a() || (i0Var = (i0) b10.o()) == null || !i0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(i0Var, obtainNoHistory);
        boolean e8 = i0Var.e(obtainNoHistory, this.f1632h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e8 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1628d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1632h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1625a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1632h = r6
            java.lang.Runnable r6 = r5.f1629e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.k0$a r6 = new androidx.appcompat.widget.k0$a
            r6.<init>()
            r5.f1629e = r6
        L52:
            java.lang.Runnable r6 = r5.f1629e
            int r1 = r5.f1626b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1630f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.k0$b r6 = new androidx.appcompat.widget.k0$b
            r6.<init>()
            r5.f1630f = r6
        L65:
            java.lang.Runnable r6 = r5.f1630f
            int r1 = r5.f1627c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1633i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1633i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract j.e b();

    protected abstract boolean c();

    protected boolean d() {
        j.e b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1628d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1631g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1631g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1628d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1631g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1631g = false;
        this.f1632h = -1;
        Runnable runnable = this.f1629e;
        if (runnable != null) {
            this.f1628d.removeCallbacks(runnable);
        }
    }
}

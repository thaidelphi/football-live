package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderBehavior.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f13862d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f13863e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13864f;

    /* renamed from: g  reason: collision with root package name */
    private int f13865g;

    /* renamed from: h  reason: collision with root package name */
    private int f13866h;

    /* renamed from: i  reason: collision with root package name */
    private int f13867i;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f13868j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeaderBehavior.java */
    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class RunnableC0184a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f13869a;

        /* renamed from: b  reason: collision with root package name */
        private final V f13870b;

        RunnableC0184a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f13869a = coordinatorLayout;
            this.f13870b = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f13870b == null || (overScroller = a.this.f13863e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                a aVar = a.this;
                aVar.P(this.f13869a, this.f13870b, aVar.f13863e.getCurrY());
                a0.i0(this.f13870b, this);
                return;
            }
            a.this.N(this.f13869a, this.f13870b);
        }
    }

    public a() {
        this.f13865g = -1;
        this.f13867i = -1;
    }

    private void I() {
        if (this.f13868j == null) {
            this.f13868j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f13865g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f13866h = r12
            goto L4c
        L2d:
            int r0 = r11.f13865g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f13866h
            int r7 = r1 - r0
            r11.f13866h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f13868j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f13868j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f13868j
            int r4 = r11.f13865g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f13864f = r3
            r11.f13865g = r1
            android.view.VelocityTracker r13 = r11.f13868j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f13868j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f13868j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f13864f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean H(V v10) {
        return false;
    }

    final boolean J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f13862d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f13862d = null;
        }
        if (this.f13863e == null) {
            this.f13863e = new OverScroller(v10.getContext());
        }
        this.f13863e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f13863e.computeScrollOffset()) {
            RunnableC0184a runnableC0184a = new RunnableC0184a(coordinatorLayout, v10);
            this.f13862d = runnableC0184a;
            a0.i0(v10, runnableC0184a);
            return true;
        }
        N(coordinatorLayout, v10);
        return false;
    }

    int K(V v10) {
        return -v10.getHeight();
    }

    int L(V v10) {
        return v10.getHeight();
    }

    int M() {
        return E();
    }

    void N(CoordinatorLayout coordinatorLayout, V v10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return Q(coordinatorLayout, v10, M() - i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return Q(coordinatorLayout, v10, i10, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    int Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int b10;
        int E = E();
        if (i11 == 0 || E < i11 || E > i12 || E == (b10 = x.a.b(i10, i11, i12))) {
            return 0;
        }
        G(b10);
        return E - b10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f13867i < 0) {
            this.f13867i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f13864f) {
            int i10 = this.f13865g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f13866h) > this.f13867i) {
                this.f13866h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f13865g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(v10) && coordinatorLayout.B(v10, x10, y11);
            this.f13864f = z10;
            if (z10) {
                this.f13866h = y11;
                this.f13865g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f13863e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f13863e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f13868j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13865g = -1;
        this.f13867i = -1;
    }
}

package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w7 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f9531a;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f9535e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f9536f;

    /* renamed from: g  reason: collision with root package name */
    private final WeakReference f9537g;

    /* renamed from: h  reason: collision with root package name */
    private final long f9538h;

    /* renamed from: k  reason: collision with root package name */
    private int f9541k;

    /* renamed from: l  reason: collision with root package name */
    private float f9542l;

    /* renamed from: m  reason: collision with root package name */
    private float f9543m;

    /* renamed from: n  reason: collision with root package name */
    private long f9544n;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9532b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f9533c = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private WeakReference f9539i = new WeakReference(null);

    /* renamed from: j  reason: collision with root package name */
    private WeakReference f9540j = new WeakReference(null);

    /* renamed from: o  reason: collision with root package name */
    private long f9545o = Long.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f9534d = new Handler(Looper.getMainLooper());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public w7(final View view, com.applovin.impl.sdk.j jVar, a aVar) {
        this.f9531a = jVar.I();
        this.f9538h = ((Long) jVar.a(o4.E1)).longValue();
        this.f9537g = new WeakReference(view);
        final WeakReference weakReference = new WeakReference(aVar);
        this.f9535e = new Runnable() { // from class: com.applovin.impl.mf
            @Override // java.lang.Runnable
            public final void run() {
                w7.this.a(weakReference);
            }
        };
        this.f9536f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.lf
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean a10;
                a10 = w7.this.a(view);
                return a10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f9537g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f9540j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (a(viewGroup, view2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9531a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
            }
            b();
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.onLogVisibilityImpression();
                return;
            }
            return;
        }
        a();
    }

    private void c(View view) {
        View b10 = u7.b((View) this.f9537g.get());
        if (b10 == null) {
            b10 = u7.b(view);
        }
        if (b10 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9531a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9531a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
                return;
            }
            return;
        }
        this.f9539i = new WeakReference(viewTreeObserver);
        viewTreeObserver.addOnPreDrawListener(this.f9536f);
    }

    public void b() {
        synchronized (this.f9532b) {
            this.f9534d.removeMessages(0);
            b((View) this.f9537g.get());
            this.f9545o = Long.MIN_VALUE;
            this.f9540j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f9533c)) {
            return false;
        }
        long pxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f9533c.width()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f9533c.height());
        if (pxToDp < this.f9541k) {
            return false;
        }
        if ((((float) pxToDp) / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()))) * 100.0f < this.f9542l) {
            return false;
        }
        return (((float) ((long) (this.f9533c.width() * this.f9533c.height()))) / ((float) ((long) (view2.getWidth() * view2.getHeight())))) * 100.0f >= this.f9543m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(b3 b3Var) {
        View s02;
        if (b3Var instanceof v2) {
            s02 = b3Var.y();
        } else if (!(b3Var instanceof x2)) {
            return;
        } else {
            s02 = ((x2) b3Var).s0();
        }
        a(b3Var.k0(), b3Var.m0(), b3Var.n0(), b3Var.o0(), s02);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f9539i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f9536f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f9536f);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f9531a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f9531a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f9539i.clear();
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f9532b) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9531a;
                nVar.a("VisibilityTracker", "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.f9540j = weakReference;
            this.f9541k = i10;
            this.f9542l = f10;
            this.f9543m = f11;
            this.f9544n = j10;
            c((View) weakReference.get());
        }
    }

    private void a() {
        this.f9534d.postDelayed(this.f9535e, this.f9538h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f9545o == Long.MIN_VALUE) {
                this.f9545o = SystemClock.uptimeMillis();
            }
            return SystemClock.uptimeMillis() - this.f9545o >= this.f9544n;
        }
        return false;
    }
}

package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v4 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap f9458a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f9459b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f9460c = new Handler();

    /* renamed from: d  reason: collision with root package name */
    private boolean f9461d = false;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f9462e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f9463f;

    /* renamed from: g  reason: collision with root package name */
    private a f9464g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(int i10, int i11);
    }

    public v4(View view) {
        this.f9462e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.gf
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    boolean b10;
                    b10 = v4.this.b();
                    return b10;
                }
            };
            this.f9463f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f9463f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f9459b) {
            this.f9461d = false;
            int i10 = -1;
            int i11 = -1;
            for (Map.Entry entry : this.f9458a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (i10 == -1 && i11 == -1) {
                        i10 = num.intValue();
                        i11 = num.intValue();
                    } else {
                        i10 = Math.min(i10, ((Integer) entry.getValue()).intValue());
                        i11 = Math.max(i11, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.f9464g;
            if (aVar != null) {
                aVar.a(i10, i11);
            }
        }
    }

    private void d() {
        if (this.f9461d) {
            return;
        }
        this.f9461d = true;
        this.f9460c.postDelayed(new Runnable() { // from class: com.applovin.impl.hf
            @Override // java.lang.Runnable
            public final void run() {
                v4.this.c();
            }
        }, 100L);
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f9464g = null;
        View view = (View) this.f9462e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f9463f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f9462e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f9459b) {
            this.f9458a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f9464g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f9459b) {
            this.f9458a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}

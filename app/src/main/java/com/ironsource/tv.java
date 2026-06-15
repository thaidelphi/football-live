package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class tv {

    /* renamed from: a  reason: collision with root package name */
    private final ro f20884a;

    /* renamed from: b  reason: collision with root package name */
    private View f20885b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20886c;

    /* renamed from: d  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f20887d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewTreeObserver.OnWindowFocusChangeListener f20888e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f20889f;

    public tv(ro onVisibilityChangeListener) {
        kotlin.jvm.internal.n.f(onVisibilityChangeListener, "onVisibilityChangeListener");
        this.f20884a = onVisibilityChangeListener;
        this.f20887d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.b10
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                tv.a(tv.this);
            }
        };
        this.f20888e = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.ironsource.c10
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                tv.a(tv.this, z10);
            }
        };
        this.f20889f = new Rect();
    }

    private final void a() {
        boolean c10 = c();
        if (this.f20886c != c10) {
            this.f20886c = c10;
            this.f20884a.a(c10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tv this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tv this$0, boolean z10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.a();
    }

    public final void a(View view) {
        kotlin.jvm.internal.n.f(view, "view");
        this.f20885b = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f20887d);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f20888e);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View view = this.f20885b;
        if (view != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.f20887d);
        }
        View view2 = this.f20885b;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.f20888e);
        }
        this.f20885b = null;
    }

    public final boolean c() {
        View view = this.f20885b;
        if (view != null && view.isShown()) {
            View view2 = this.f20885b;
            if (view2 != null && view2.hasWindowFocus()) {
                View view3 = this.f20885b;
                return view3 != null && view3.getGlobalVisibleRect(this.f20889f);
            }
            return false;
        }
        return false;
    }
}

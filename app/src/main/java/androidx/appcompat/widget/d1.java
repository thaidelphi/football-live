package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api;
/* compiled from: TooltipCompatHandler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j  reason: collision with root package name */
    private static d1 f1542j;

    /* renamed from: k  reason: collision with root package name */
    private static d1 f1543k;

    /* renamed from: a  reason: collision with root package name */
    private final View f1544a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1545b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1546c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f1547d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f1548e = new b();

    /* renamed from: f  reason: collision with root package name */
    private int f1549f;

    /* renamed from: g  reason: collision with root package name */
    private int f1550g;

    /* renamed from: h  reason: collision with root package name */
    private e1 f1551h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1552i;

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.c();
        }
    }

    private d1(View view, CharSequence charSequence) {
        this.f1544a = view;
        this.f1545b = charSequence;
        this.f1546c = androidx.core.view.c0.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1544a.removeCallbacks(this.f1547d);
    }

    private void b() {
        this.f1549f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1550g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private void d() {
        this.f1544a.postDelayed(this.f1547d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(d1 d1Var) {
        d1 d1Var2 = f1542j;
        if (d1Var2 != null) {
            d1Var2.a();
        }
        f1542j = d1Var;
        if (d1Var != null) {
            d1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        d1 d1Var = f1542j;
        if (d1Var != null && d1Var.f1544a == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            d1 d1Var2 = f1543k;
            if (d1Var2 != null && d1Var2.f1544a == view) {
                d1Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new d1(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1549f) > this.f1546c || Math.abs(y10 - this.f1550g) > this.f1546c) {
            this.f1549f = x10;
            this.f1550g = y10;
            return true;
        }
        return false;
    }

    void c() {
        if (f1543k == this) {
            f1543k = null;
            e1 e1Var = this.f1551h;
            if (e1Var != null) {
                e1Var.c();
                this.f1551h = null;
                b();
                this.f1544a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1542j == this) {
            e(null);
        }
        this.f1544a.removeCallbacks(this.f1548e);
    }

    void g(boolean z10) {
        long j10;
        int longPressTimeout;
        long j11;
        if (androidx.core.view.a0.T(this.f1544a)) {
            e(null);
            d1 d1Var = f1543k;
            if (d1Var != null) {
                d1Var.c();
            }
            f1543k = this;
            this.f1552i = z10;
            e1 e1Var = new e1(this.f1544a.getContext());
            this.f1551h = e1Var;
            e1Var.e(this.f1544a, this.f1549f, this.f1550g, this.f1552i, this.f1545b);
            this.f1544a.addOnAttachStateChangeListener(this);
            if (this.f1552i) {
                j11 = 2500;
            } else {
                if ((androidx.core.view.a0.N(this.f1544a) & 1) == 1) {
                    j10 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j10 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1544a.removeCallbacks(this.f1548e);
            this.f1544a.postDelayed(this.f1548e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1551h == null || !this.f1552i) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1544a.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.f1544a.isEnabled() && this.f1551h == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1549f = view.getWidth() / 2;
        this.f1550g = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}

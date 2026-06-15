package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.ironsource.b9;
import com.ironsource.ug;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u extends EditText {

    /* renamed from: a  reason: collision with root package name */
    private int f6285a;

    /* renamed from: b  reason: collision with root package name */
    private int f6286b;

    /* renamed from: c  reason: collision with root package name */
    private int f6287c;

    /* renamed from: d  reason: collision with root package name */
    private int f6288d;

    /* renamed from: e  reason: collision with root package name */
    private int f6289e;

    /* renamed from: f  reason: collision with root package name */
    private int f6290f;

    /* renamed from: g  reason: collision with root package name */
    private int f6291g;

    /* renamed from: h  reason: collision with root package name */
    private int f6292h;

    /* renamed from: i  reason: collision with root package name */
    private int f6293i;

    /* renamed from: j  reason: collision with root package name */
    private int f6294j;

    /* renamed from: k  reason: collision with root package name */
    private String f6295k;

    /* renamed from: l  reason: collision with root package name */
    private String f6296l;

    /* renamed from: m  reason: collision with root package name */
    private String f6297m;

    /* renamed from: n  reason: collision with root package name */
    private String f6298n;

    /* renamed from: o  reason: collision with root package name */
    private com.adcolony.sdk.c f6299o;

    /* renamed from: p  reason: collision with root package name */
    private h0 f6300p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.a(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {
        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.k(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j0 {
        c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.e(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements j0 {
        d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.f(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j0 {
        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.d(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements j0 {
        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.j(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements j0 {
        g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.g(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements j0 {
        h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.h(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements j0 {
        i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.b(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements j0 {
        j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.i(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Context context, h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        super(context);
        this.f6285a = i10;
        this.f6300p = h0Var;
        this.f6299o = cVar;
    }

    int a(boolean z10, int i10) {
        if (i10 == 0) {
            return z10 ? 1 : 16;
        } else if (i10 == 1) {
            return z10 ? 8388611 : 48;
        } else if (i10 != 2) {
            return 17;
        } else {
            return z10 ? 8388613 : 80;
        }
    }

    void a(h0 h0Var) {
        f1 a10 = h0Var.a();
        this.f6293i = c0.d(a10, "x");
        this.f6294j = c0.d(a10, "y");
        setGravity(a(true, this.f6293i) | a(false, this.f6294j));
    }

    void b(h0 h0Var) {
        f1 b10 = c0.b();
        c0.a(b10, b9.h.K0, getText().toString());
        h0Var.a(b10).c();
    }

    boolean c(h0 h0Var) {
        f1 a10 = h0Var.a();
        return c0.d(a10, ug.f21009x) == this.f6285a && c0.d(a10, "container_id") == this.f6299o.c() && c0.h(a10, "ad_session_id").equals(this.f6299o.a());
    }

    void d(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "background_color");
        this.f6296l = h10;
        setBackgroundColor(z0.f(h10));
    }

    void e(h0 h0Var) {
        f1 a10 = h0Var.a();
        this.f6286b = c0.d(a10, "x");
        this.f6287c = c0.d(a10, "y");
        this.f6288d = c0.d(a10, "width");
        this.f6289e = c0.d(a10, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f6286b, this.f6287c, 0, 0);
        layoutParams.width = this.f6288d;
        layoutParams.height = this.f6289e;
        setLayoutParams(layoutParams);
    }

    void f(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "font_color");
        this.f6297m = h10;
        setTextColor(z0.f(h10));
    }

    void g(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), "font_size");
        this.f6292h = d10;
        setTextSize(d10);
    }

    void h(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), "font_style");
        this.f6290f = d10;
        if (d10 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (d10 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (d10 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (d10 != 3) {
        } else {
            setTypeface(getTypeface(), 3);
        }
    }

    void i(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), b9.h.K0);
        this.f6298n = h10;
        setText(h10);
    }

    void j(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), "font_family");
        this.f6291g = d10;
        if (d10 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (d10 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (d10 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (d10 != 3) {
        } else {
            setTypeface(Typeface.MONOSPACE);
        }
    }

    void k(h0 h0Var) {
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k b10 = com.adcolony.sdk.a.b();
        com.adcolony.sdk.d c10 = b10.c();
        int action = motionEvent.getAction() & 255;
        if (action == 0 || action == 1 || action == 3 || action == 2 || action == 5 || action == 6) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            f1 b11 = c0.b();
            c0.b(b11, "view_id", this.f6285a);
            c0.a(b11, "ad_session_id", this.f6295k);
            c0.b(b11, "container_x", this.f6286b + x10);
            c0.b(b11, "container_y", this.f6287c + y10);
            c0.b(b11, "view_x", x10);
            c0.b(b11, "view_y", y10);
            c0.b(b11, ug.f21009x, this.f6299o.c());
            if (action == 0) {
                new h0("AdContainer.on_touch_began", this.f6299o.k(), b11).c();
            } else if (action == 1) {
                if (!this.f6299o.p()) {
                    b10.a(c10.d().get(this.f6295k));
                }
                new h0("AdContainer.on_touch_ended", this.f6299o.k(), b11).c();
            } else if (action == 2) {
                new h0("AdContainer.on_touch_moved", this.f6299o.k(), b11).c();
            } else if (action == 3) {
                new h0("AdContainer.on_touch_cancelled", this.f6299o.k(), b11).c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", ((int) motionEvent.getX(action2)) + this.f6286b);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action2)) + this.f6287c);
                c0.b(b11, "view_x", (int) motionEvent.getX(action2));
                c0.b(b11, "view_y", (int) motionEvent.getY(action2));
                new h0("AdContainer.on_touch_began", this.f6299o.k(), b11).c();
            } else if (action == 6) {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", ((int) motionEvent.getX(action3)) + this.f6286b);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action3)) + this.f6287c);
                c0.b(b11, "view_x", (int) motionEvent.getX(action3));
                c0.b(b11, "view_y", (int) motionEvent.getY(action3));
                if (!this.f6299o.p()) {
                    b10.a(c10.d().get(this.f6295k));
                }
                new h0("AdContainer.on_touch_ended", this.f6299o.k(), b11).c();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        f1 a10 = this.f6300p.a();
        this.f6295k = c0.h(a10, "ad_session_id");
        this.f6286b = c0.d(a10, "x");
        this.f6287c = c0.d(a10, "y");
        this.f6288d = c0.d(a10, "width");
        this.f6289e = c0.d(a10, "height");
        this.f6291g = c0.d(a10, "font_family");
        this.f6290f = c0.d(a10, "font_style");
        this.f6292h = c0.d(a10, "font_size");
        this.f6296l = c0.h(a10, "background_color");
        this.f6297m = c0.h(a10, "font_color");
        this.f6298n = c0.h(a10, b9.h.K0);
        this.f6293i = c0.d(a10, "align_x");
        this.f6294j = c0.d(a10, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f6288d, this.f6289e);
        layoutParams.setMargins(this.f6286b, this.f6287c, 0, 0);
        layoutParams.gravity = 0;
        this.f6299o.addView(this, layoutParams);
        int i10 = this.f6291g;
        if (i10 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i10 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i10 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i10 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i11 = this.f6290f;
        if (i11 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i11 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i11 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i11 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setText(this.f6298n);
        setTextSize(this.f6292h);
        setGravity(a(true, this.f6293i) | a(false, this.f6294j));
        if (!this.f6296l.equals("")) {
            setBackgroundColor(z0.f(this.f6296l));
        }
        if (!this.f6297m.equals("")) {
            setTextColor(z0.f(this.f6297m));
        }
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_visible", (j0) new b(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_bounds", (j0) new c(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_font_color", (j0) new d(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_background_color", (j0) new e(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_typeface", (j0) new f(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_font_size", (j0) new g(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_font_style", (j0) new h(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.get_text", (j0) new i(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.set_text", (j0) new j(), true));
        this.f6299o.i().add(com.adcolony.sdk.a.a("TextView.align", (j0) new a(), true));
        this.f6299o.j().add("TextView.set_visible");
        this.f6299o.j().add("TextView.set_bounds");
        this.f6299o.j().add("TextView.set_font_color");
        this.f6299o.j().add("TextView.set_background_color");
        this.f6299o.j().add("TextView.set_typeface");
        this.f6299o.j().add("TextView.set_font_size");
        this.f6299o.j().add("TextView.set_font_style");
        this.f6299o.j().add("TextView.get_text");
        this.f6299o.j().add("TextView.set_text");
        this.f6299o.j().add("TextView.align");
    }
}

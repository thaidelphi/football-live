package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import com.ironsource.b9;
import com.ironsource.ug;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y0 extends Button {

    /* renamed from: a  reason: collision with root package name */
    private int f6384a;

    /* renamed from: b  reason: collision with root package name */
    private int f6385b;

    /* renamed from: c  reason: collision with root package name */
    private int f6386c;

    /* renamed from: d  reason: collision with root package name */
    private int f6387d;

    /* renamed from: e  reason: collision with root package name */
    private int f6388e;

    /* renamed from: f  reason: collision with root package name */
    private int f6389f;

    /* renamed from: g  reason: collision with root package name */
    private int f6390g;

    /* renamed from: h  reason: collision with root package name */
    private int f6391h;

    /* renamed from: i  reason: collision with root package name */
    private int f6392i;

    /* renamed from: j  reason: collision with root package name */
    private int f6393j;

    /* renamed from: k  reason: collision with root package name */
    private String f6394k;

    /* renamed from: l  reason: collision with root package name */
    private String f6395l;

    /* renamed from: m  reason: collision with root package name */
    private String f6396m;

    /* renamed from: n  reason: collision with root package name */
    private String f6397n;

    /* renamed from: o  reason: collision with root package name */
    private com.adcolony.sdk.c f6398o;

    /* renamed from: p  reason: collision with root package name */
    private h0 f6399p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.a(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.k(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.e(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.f(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.d(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.j(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.g(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.h(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.b(h0Var);
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
            if (y0.this.c(h0Var)) {
                y0.this.i(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(Context context, h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        super(context);
        this.f6384a = i10;
        this.f6399p = h0Var;
        this.f6398o = cVar;
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
        this.f6392i = c0.d(a10, "x");
        this.f6393j = c0.d(a10, "y");
        setGravity(a(true, this.f6392i) | a(false, this.f6393j));
    }

    void b(h0 h0Var) {
        f1 b10 = c0.b();
        c0.a(b10, b9.h.K0, getText().toString());
        h0Var.a(b10).c();
    }

    boolean c(h0 h0Var) {
        f1 a10 = h0Var.a();
        return c0.d(a10, ug.f21009x) == this.f6384a && c0.d(a10, "container_id") == this.f6398o.c() && c0.h(a10, "ad_session_id").equals(this.f6398o.a());
    }

    void d(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "background_color");
        this.f6394k = h10;
        setBackgroundColor(z0.f(h10));
    }

    void e(h0 h0Var) {
        f1 a10 = h0Var.a();
        this.f6385b = c0.d(a10, "x");
        this.f6386c = c0.d(a10, "y");
        this.f6387d = c0.d(a10, "width");
        this.f6388e = c0.d(a10, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f6385b, this.f6386c, 0, 0);
        layoutParams.width = this.f6387d;
        layoutParams.height = this.f6388e;
        setLayoutParams(layoutParams);
    }

    void f(h0 h0Var) {
        String h10 = c0.h(h0Var.a(), "font_color");
        this.f6395l = h10;
        setTextColor(z0.f(h10));
    }

    void g(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), "font_size");
        this.f6391h = d10;
        setTextSize(d10);
    }

    void h(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), "font_style");
        this.f6389f = d10;
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
        this.f6396m = h10;
        setText(h10);
    }

    void j(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), "font_family");
        this.f6390g = d10;
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
            c0.b(b11, "view_id", this.f6384a);
            c0.a(b11, "ad_session_id", this.f6397n);
            c0.b(b11, "container_x", this.f6385b + x10);
            c0.b(b11, "container_y", this.f6386c + y10);
            c0.b(b11, "view_x", x10);
            c0.b(b11, "view_y", y10);
            c0.b(b11, ug.f21009x, this.f6398o.getId());
            if (action == 0) {
                new h0("AdContainer.on_touch_began", this.f6398o.k(), b11).c();
            } else if (action == 1) {
                if (!this.f6398o.p()) {
                    b10.a(c10.d().get(this.f6397n));
                }
                if (x10 > 0 && x10 < getWidth() && y10 > 0 && y10 < getHeight()) {
                    new h0("AdContainer.on_touch_ended", this.f6398o.k(), b11).c();
                } else {
                    new h0("AdContainer.on_touch_cancelled", this.f6398o.k(), b11).c();
                }
            } else if (action == 2) {
                new h0("AdContainer.on_touch_moved", this.f6398o.k(), b11).c();
            } else if (action == 3) {
                new h0("AdContainer.on_touch_cancelled", this.f6398o.k(), b11).c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", ((int) motionEvent.getX(action2)) + this.f6385b);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action2)) + this.f6386c);
                c0.b(b11, "view_x", (int) motionEvent.getX(action2));
                c0.b(b11, "view_y", (int) motionEvent.getY(action2));
                new h0("AdContainer.on_touch_began", this.f6398o.k(), b11).c();
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x11 = (int) motionEvent.getX(action3);
                int y11 = (int) motionEvent.getY(action3);
                c0.b(b11, "container_x", ((int) motionEvent.getX(action3)) + this.f6385b);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action3)) + this.f6386c);
                c0.b(b11, "view_x", (int) motionEvent.getX(action3));
                c0.b(b11, "view_y", (int) motionEvent.getY(action3));
                if (!this.f6398o.p()) {
                    b10.a(c10.d().get(this.f6397n));
                }
                if (x11 > 0 && x11 < getWidth() && y11 > 0 && y11 < getHeight()) {
                    new h0("AdContainer.on_touch_ended", this.f6398o.k(), b11).c();
                } else {
                    new h0("AdContainer.on_touch_cancelled", this.f6398o.k(), b11).c();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(Context context, int i10, h0 h0Var, int i11, com.adcolony.sdk.c cVar) {
        super(context, null, i10);
        this.f6384a = i11;
        this.f6399p = h0Var;
        this.f6398o = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        FrameLayout.LayoutParams layoutParams;
        int i10;
        int i11;
        f1 a10 = this.f6399p.a();
        this.f6397n = c0.h(a10, "ad_session_id");
        this.f6385b = c0.d(a10, "x");
        this.f6386c = c0.d(a10, "y");
        this.f6387d = c0.d(a10, "width");
        this.f6388e = c0.d(a10, "height");
        this.f6390g = c0.d(a10, "font_family");
        this.f6389f = c0.d(a10, "font_style");
        this.f6391h = c0.d(a10, "font_size");
        this.f6394k = c0.h(a10, "background_color");
        this.f6395l = c0.h(a10, "font_color");
        this.f6396m = c0.h(a10, b9.h.K0);
        this.f6392i = c0.d(a10, "align_x");
        this.f6393j = c0.d(a10, "align_y");
        k b10 = com.adcolony.sdk.a.b();
        if (this.f6396m.equals("")) {
            this.f6396m = "Learn More";
        }
        setVisibility(4);
        if (c0.b(a10, "wrap_content")) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f6387d, this.f6388e);
        }
        layoutParams.gravity = 0;
        setText(this.f6396m);
        setTextSize(this.f6391h);
        if (c0.b(a10, "overlay")) {
            this.f6385b = 0;
            this.f6386c = 0;
            i10 = (int) (b10.n().s() * 6.0f);
            i11 = (int) (b10.n().s() * 6.0f);
            int s10 = (int) (b10.n().s() * 4.0f);
            setPadding(s10, s10, s10, s10);
            layoutParams.gravity = 8388693;
        } else {
            i10 = 0;
            i11 = 0;
        }
        layoutParams.setMargins(this.f6385b, this.f6386c, i10, i11);
        this.f6398o.addView(this, layoutParams);
        int i12 = this.f6390g;
        if (i12 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i12 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i12 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i12 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i13 = this.f6389f;
        if (i13 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i13 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i13 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i13 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(a(true, this.f6392i) | a(false, this.f6393j));
        if (!this.f6394k.equals("")) {
            setBackgroundColor(z0.f(this.f6394k));
        }
        if (!this.f6395l.equals("")) {
            setTextColor(z0.f(this.f6395l));
        }
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_visible", (j0) new b(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_bounds", (j0) new c(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_font_color", (j0) new d(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_background_color", (j0) new e(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_typeface", (j0) new f(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_font_size", (j0) new g(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_font_style", (j0) new h(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.get_text", (j0) new i(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.set_text", (j0) new j(), true));
        this.f6398o.i().add(com.adcolony.sdk.a.a("TextView.align", (j0) new a(), true));
        this.f6398o.j().add("TextView.set_visible");
        this.f6398o.j().add("TextView.set_bounds");
        this.f6398o.j().add("TextView.set_font_color");
        this.f6398o.j().add("TextView.set_background_color");
        this.f6398o.j().add("TextView.set_typeface");
        this.f6398o.j().add("TextView.set_font_size");
        this.f6398o.j().add("TextView.set_font_style");
        this.f6398o.j().add("TextView.get_text");
        this.f6398o.j().add("TextView.set_text");
        this.f6398o.j().add("TextView.align");
    }
}

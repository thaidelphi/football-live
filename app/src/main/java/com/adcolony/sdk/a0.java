package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.ug;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a0 extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f5753a;

    /* renamed from: b  reason: collision with root package name */
    private int f5754b;

    /* renamed from: c  reason: collision with root package name */
    private int f5755c;

    /* renamed from: d  reason: collision with root package name */
    private int f5756d;

    /* renamed from: e  reason: collision with root package name */
    private int f5757e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5758f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5759g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5760h;

    /* renamed from: i  reason: collision with root package name */
    private String f5761i;

    /* renamed from: j  reason: collision with root package name */
    private String f5762j;

    /* renamed from: k  reason: collision with root package name */
    private h0 f5763k;

    /* renamed from: l  reason: collision with root package name */
    private com.adcolony.sdk.c f5764l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a0.this.a(h0Var)) {
                a0.this.d(h0Var);
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
            if (a0.this.a(h0Var)) {
                a0.this.b(h0Var);
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
            if (a0.this.a(h0Var)) {
                a0.this.c(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Context context, h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        super(context);
        this.f5753a = i10;
        this.f5763k = h0Var;
        this.f5764l = cVar;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k b10 = com.adcolony.sdk.a.b();
        d c10 = b10.c();
        int action = motionEvent.getAction() & 255;
        if (action == 0 || action == 1 || action == 3 || action == 2 || action == 5 || action == 6) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            f1 b11 = c0.b();
            c0.b(b11, "view_id", this.f5753a);
            c0.a(b11, "ad_session_id", this.f5762j);
            c0.b(b11, "container_x", this.f5754b + x10);
            c0.b(b11, "container_y", this.f5755c + y10);
            c0.b(b11, "view_x", x10);
            c0.b(b11, "view_y", y10);
            c0.b(b11, ug.f21009x, this.f5764l.getId());
            if (action == 0) {
                new h0("AdContainer.on_touch_began", this.f5764l.k(), b11).c();
            } else if (action == 1) {
                if (!this.f5764l.p()) {
                    b10.a(c10.d().get(this.f5762j));
                }
                if (x10 > 0 && x10 < this.f5756d && y10 > 0 && y10 < this.f5757e) {
                    new h0("AdContainer.on_touch_ended", this.f5764l.k(), b11).c();
                } else {
                    new h0("AdContainer.on_touch_cancelled", this.f5764l.k(), b11).c();
                }
            } else if (action == 2) {
                new h0("AdContainer.on_touch_moved", this.f5764l.k(), b11).c();
            } else if (action == 3) {
                new h0("AdContainer.on_touch_cancelled", this.f5764l.k(), b11).c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", ((int) motionEvent.getX(action2)) + this.f5754b);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action2)) + this.f5755c);
                c0.b(b11, "view_x", (int) motionEvent.getX(action2));
                c0.b(b11, "view_y", (int) motionEvent.getY(action2));
                new h0("AdContainer.on_touch_began", this.f5764l.k(), b11).c();
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x11 = (int) motionEvent.getX(action3);
                int y11 = (int) motionEvent.getY(action3);
                c0.b(b11, "container_x", ((int) motionEvent.getX(action3)) + this.f5754b);
                c0.b(b11, "container_y", ((int) motionEvent.getY(action3)) + this.f5755c);
                c0.b(b11, "view_x", (int) motionEvent.getX(action3));
                c0.b(b11, "view_y", (int) motionEvent.getY(action3));
                if (!this.f5764l.p()) {
                    b10.a(c10.d().get(this.f5762j));
                }
                if (x11 > 0 && x11 < this.f5756d && y11 > 0 && y11 < this.f5757e) {
                    new h0("AdContainer.on_touch_ended", this.f5764l.k(), b11).c();
                } else {
                    new h0("AdContainer.on_touch_cancelled", this.f5764l.k(), b11).c();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        f1 a10 = h0Var.a();
        return c0.d(a10, ug.f21009x) == this.f5753a && c0.d(a10, "container_id") == this.f5764l.c() && c0.h(a10, "ad_session_id").equals(this.f5764l.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h0 h0Var) {
        f1 a10 = h0Var.a();
        this.f5754b = c0.d(a10, "x");
        this.f5755c = c0.d(a10, "y");
        this.f5756d = c0.d(a10, "width");
        this.f5757e = c0.d(a10, "height");
        if (this.f5758f) {
            float s10 = (this.f5757e * com.adcolony.sdk.a.b().n().s()) / getDrawable().getIntrinsicHeight();
            this.f5757e = (int) (getDrawable().getIntrinsicHeight() * s10);
            int intrinsicWidth = (int) (getDrawable().getIntrinsicWidth() * s10);
            this.f5756d = intrinsicWidth;
            this.f5754b -= intrinsicWidth;
            this.f5755c -= this.f5757e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f5754b, this.f5755c, 0, 0);
        layoutParams.width = this.f5756d;
        layoutParams.height = this.f5757e;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(h0 h0Var) {
        this.f5761i = c0.h(h0Var.a(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f5761i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(h0 h0Var) {
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        FrameLayout.LayoutParams layoutParams;
        int i10;
        f1 a10 = this.f5763k.a();
        this.f5762j = c0.h(a10, "ad_session_id");
        this.f5754b = c0.d(a10, "x");
        this.f5755c = c0.d(a10, "y");
        this.f5756d = c0.d(a10, "width");
        this.f5757e = c0.d(a10, "height");
        this.f5761i = c0.h(a10, "filepath");
        this.f5758f = c0.b(a10, "dpi");
        this.f5759g = c0.b(a10, "invert_y");
        this.f5760h = c0.b(a10, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f5761i)));
        if (this.f5758f) {
            float s10 = (this.f5757e * com.adcolony.sdk.a.b().n().s()) / getDrawable().getIntrinsicHeight();
            this.f5757e = (int) (getDrawable().getIntrinsicHeight() * s10);
            int intrinsicWidth = (int) (getDrawable().getIntrinsicWidth() * s10);
            this.f5756d = intrinsicWidth;
            this.f5754b -= intrinsicWidth;
            if (this.f5759g) {
                i10 = this.f5755c + this.f5757e;
            } else {
                i10 = this.f5755c - this.f5757e;
            }
            this.f5755c = i10;
        }
        setVisibility(4);
        if (this.f5760h) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f5756d, this.f5757e);
        }
        layoutParams.setMargins(this.f5754b, this.f5755c, 0, 0);
        layoutParams.gravity = 0;
        this.f5764l.addView(this, layoutParams);
        this.f5764l.i().add(com.adcolony.sdk.a.a("ImageView.set_visible", (j0) new a(), true));
        this.f5764l.i().add(com.adcolony.sdk.a.a("ImageView.set_bounds", (j0) new b(), true));
        this.f5764l.i().add(com.adcolony.sdk.a.a("ImageView.set_image", (j0) new c(), true));
        this.f5764l.j().add("ImageView.set_visible");
        this.f5764l.j().add("ImageView.set_bounds");
        this.f5764l.j().add("ImageView.set_image");
    }
}

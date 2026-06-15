package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.adcolony.sdk.e0;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.ironsource.b9;
import com.ironsource.ug;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, a1> f5859a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<Integer, y0> f5860b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, b1> f5861c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<Integer, u> f5862d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<Integer, a0> f5863e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<Integer, Boolean> f5864f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<Integer, View> f5865g;

    /* renamed from: h  reason: collision with root package name */
    private int f5866h;

    /* renamed from: i  reason: collision with root package name */
    private int f5867i;

    /* renamed from: j  reason: collision with root package name */
    private int f5868j;

    /* renamed from: k  reason: collision with root package name */
    private int f5869k;

    /* renamed from: l  reason: collision with root package name */
    private String f5870l;

    /* renamed from: m  reason: collision with root package name */
    boolean f5871m;

    /* renamed from: n  reason: collision with root package name */
    boolean f5872n;

    /* renamed from: o  reason: collision with root package name */
    private float f5873o;

    /* renamed from: p  reason: collision with root package name */
    private double f5874p;

    /* renamed from: q  reason: collision with root package name */
    private int f5875q;

    /* renamed from: r  reason: collision with root package name */
    private int f5876r;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<j0> f5877s;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<String> f5878t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f5879u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5880v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f5881w;

    /* renamed from: x  reason: collision with root package name */
    private AdSession f5882x;

    /* renamed from: y  reason: collision with root package name */
    Context f5883y;

    /* renamed from: z  reason: collision with root package name */
    VideoView f5884z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a(cVar.c(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements j0 {
        b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class C0113c implements j0 {

        /* renamed from: com.adcolony.sdk.c$c$a */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f5888a;

            a(h0 h0Var) {
                this.f5888a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.d(this.f5888a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C0113c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                z0.b(new a(h0Var));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f5891a;

            a(h0 h0Var) {
                this.f5891a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.h(this.f5891a);
            }
        }

        d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                z0.b(new a(h0Var));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e implements j0 {
        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a(cVar.b(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f implements j0 {
        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.f(h0Var);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g implements j0 {
        g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a(cVar.a(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class h implements j0 {
        h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.e(h0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f5897a;

        i(boolean z10) {
            this.f5897a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            if (cVar.f5871m) {
                return;
            }
            cVar.a(this.f5897a);
            c.this.b(this.f5897a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, String str) {
        super(context);
        this.f5873o = 0.0f;
        this.f5874p = 0.0d;
        this.f5875q = 0;
        this.f5876r = 0;
        this.f5883y = context;
        this.f5870l = str;
        setBackgroundColor(-16777216);
    }

    a1 c(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), ug.f21009x);
        a1 a1Var = new a1(this.f5883y, h0Var, d10, this);
        a1Var.d();
        this.f5859a.put(Integer.valueOf(d10), a1Var);
        this.f5865g.put(Integer.valueOf(d10), a1Var);
        return a1Var;
    }

    b1 d(h0 h0Var) {
        c1 a10;
        f1 a11 = h0Var.a();
        int d10 = c0.d(a11, ug.f21009x);
        boolean b10 = c0.b(a11, "is_module");
        k b11 = com.adcolony.sdk.a.b();
        if (b10) {
            a10 = b11.B().get(Integer.valueOf(c0.d(a11, "module_id")));
            if (a10 == null) {
                new e0.a().a("Module WebView created with invalid id").a(e0.f5980h);
                return null;
            }
            a10.b(h0Var, d10, this);
        } else {
            try {
                a10 = b1.a(this.f5883y, h0Var, d10, this);
            } catch (RuntimeException e8) {
                e0.a aVar = new e0.a();
                aVar.a(e8.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f5980h);
                AdColony.disable();
                return null;
            }
        }
        this.f5861c.put(Integer.valueOf(d10), a10);
        this.f5865g.put(Integer.valueOf(d10), a10);
        f1 b12 = c0.b();
        c0.b(b12, "module_id", a10.getWebViewModuleId());
        if (a10 instanceof l0) {
            c0.b(b12, "mraid_module_id", ((l0) a10).getAdcModuleId());
        }
        h0Var.a(b12).c();
        return a10;
    }

    boolean e(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), ug.f21009x);
        View remove = this.f5865g.remove(Integer.valueOf(d10));
        a0 remove2 = this.f5863e.remove(Integer.valueOf(d10));
        if (remove != null && remove2 != null) {
            removeView(remove2);
            return true;
        }
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        String b10 = h0Var.b();
        c10.a(b10, "" + d10);
        return false;
    }

    boolean f(h0 h0Var) {
        y0 remove;
        int d10 = c0.d(h0Var.a(), ug.f21009x);
        View remove2 = this.f5865g.remove(Integer.valueOf(d10));
        if (this.f5864f.remove(Integer.valueOf(d10)).booleanValue()) {
            remove = this.f5862d.remove(Integer.valueOf(d10));
        } else {
            remove = this.f5860b.remove(Integer.valueOf(d10));
        }
        if (remove2 != null && remove != null) {
            removeView(remove);
            return true;
        }
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        String b10 = h0Var.b();
        c10.a(b10, "" + d10);
        return false;
    }

    boolean g(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), ug.f21009x);
        View remove = this.f5865g.remove(Integer.valueOf(d10));
        a1 remove2 = this.f5859a.remove(Integer.valueOf(d10));
        if (remove != null && remove2 != null) {
            if (remove2.c()) {
                remove2.j();
            }
            remove2.a();
            removeView(remove2);
            return true;
        }
        com.adcolony.sdk.d c10 = com.adcolony.sdk.a.b().c();
        String b10 = h0Var.b();
        c10.a(b10, "" + d10);
        return false;
    }

    boolean h(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), ug.f21009x);
        k b10 = com.adcolony.sdk.a.b();
        View remove = this.f5865g.remove(Integer.valueOf(d10));
        b1 remove2 = this.f5861c.remove(Integer.valueOf(d10));
        if (remove2 != null && remove != null) {
            if (remove2 instanceof k0) {
                b10.r().b((k0) remove2);
            }
            removeView(remove2);
            return true;
        }
        com.adcolony.sdk.d c10 = b10.c();
        String b11 = h0Var.b();
        c10.a(b11, "" + d10);
        return false;
    }

    boolean i(h0 h0Var) {
        f1 a10 = h0Var.a();
        return c0.d(a10, "container_id") == this.f5868j && c0.h(a10, "ad_session_id").equals(this.f5870l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(h0 h0Var) {
        this.f5859a = new HashMap<>();
        this.f5860b = new HashMap<>();
        this.f5861c = new HashMap<>();
        this.f5862d = new HashMap<>();
        this.f5863e = new HashMap<>();
        this.f5864f = new HashMap<>();
        this.f5865g = new HashMap<>();
        this.f5877s = new ArrayList<>();
        this.f5878t = new ArrayList<>();
        f1 a10 = h0Var.a();
        if (c0.b(a10, b9.h.T)) {
            setBackgroundColor(0);
        }
        this.f5868j = c0.d(a10, ug.f21009x);
        this.f5866h = c0.d(a10, "width");
        this.f5867i = c0.d(a10, "height");
        this.f5869k = c0.d(a10, "module_id");
        this.f5872n = c0.b(a10, "viewability_enabled");
        this.f5879u = this.f5868j == 1;
        k b10 = com.adcolony.sdk.a.b();
        if (this.f5866h == 0 && this.f5867i == 0) {
            Rect x10 = this.f5881w ? b10.n().x() : b10.n().w();
            this.f5866h = x10.width();
            this.f5867i = x10.height();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f5866h, this.f5867i));
        }
        this.f5877s.add(com.adcolony.sdk.a.a("VideoView.create", (j0) new a(), true));
        this.f5877s.add(com.adcolony.sdk.a.a("VideoView.destroy", (j0) new b(), true));
        this.f5877s.add(com.adcolony.sdk.a.a("WebView.create", (j0) new C0113c(), true));
        this.f5877s.add(com.adcolony.sdk.a.a("WebView.destroy", (j0) new d(), true));
        this.f5877s.add(com.adcolony.sdk.a.a("TextView.create", (j0) new e(), true));
        this.f5877s.add(com.adcolony.sdk.a.a("TextView.destroy", (j0) new f(), true));
        this.f5877s.add(com.adcolony.sdk.a.a("ImageView.create", (j0) new g(), true));
        this.f5877s.add(com.adcolony.sdk.a.a("ImageView.destroy", (j0) new h(), true));
        this.f5878t.add("VideoView.create");
        this.f5878t.add("VideoView.destroy");
        this.f5878t.add("WebView.create");
        this.f5878t.add("WebView.destroy");
        this.f5878t.add("TextView.create");
        this.f5878t.add("TextView.destroy");
        this.f5878t.add("ImageView.create");
        this.f5878t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.f5883y);
        this.f5884z = videoView;
        videoView.setVisibility(8);
        addView(this.f5884z);
        setClipToPadding(false);
        if (this.f5872n) {
            b(c0.b(h0Var.a(), "advanced_viewability"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f5869k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, y0> l() {
        return this.f5860b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, a1> m() {
        return this.f5859a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, b1> n() {
        return this.f5861c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f5880v;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0 || action == 1 || action == 3 || action == 2 || action == 5 || action == 6) {
            k b10 = com.adcolony.sdk.a.b();
            com.adcolony.sdk.d c10 = b10.c();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            f1 b11 = c0.b();
            c0.b(b11, "view_id", -1);
            c0.a(b11, "ad_session_id", this.f5870l);
            c0.b(b11, "container_x", x10);
            c0.b(b11, "container_y", y10);
            c0.b(b11, "view_x", x10);
            c0.b(b11, "view_y", y10);
            c0.b(b11, ug.f21009x, this.f5868j);
            if (action == 0) {
                new h0("AdContainer.on_touch_began", this.f5869k, b11).c();
            } else if (action == 1) {
                if (!this.f5879u) {
                    b10.a(c10.d().get(this.f5870l));
                }
                new h0("AdContainer.on_touch_ended", this.f5869k, b11).c();
            } else if (action == 2) {
                new h0("AdContainer.on_touch_moved", this.f5869k, b11).c();
            } else if (action == 3) {
                new h0("AdContainer.on_touch_cancelled", this.f5869k, b11).c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", (int) motionEvent.getX(action2));
                c0.b(b11, "container_y", (int) motionEvent.getY(action2));
                c0.b(b11, "view_x", (int) motionEvent.getX(action2));
                c0.b(b11, "view_y", (int) motionEvent.getY(action2));
                new h0("AdContainer.on_touch_began", this.f5869k, b11).c();
            } else if (action == 6) {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b11, "container_x", (int) motionEvent.getX(action3));
                c0.b(b11, "container_y", (int) motionEvent.getY(action3));
                c0.b(b11, "view_x", (int) motionEvent.getX(action3));
                c0.b(b11, "view_y", (int) motionEvent.getY(action3));
                c0.b(b11, "x", (int) motionEvent.getX(action3));
                c0.b(b11, "y", (int) motionEvent.getY(action3));
                if (!this.f5879u) {
                    b10.a(c10.d().get(this.f5870l));
                }
                new h0("AdContainer.on_touch_ended", this.f5869k, b11).c();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f5879u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.f5881w;
    }

    a0 a(h0 h0Var) {
        int d10 = c0.d(h0Var.a(), ug.f21009x);
        a0 a0Var = new a0(this.f5883y, h0Var, d10, this);
        a0Var.a();
        this.f5863e.put(Integer.valueOf(d10), a0Var);
        this.f5865g.put(Integer.valueOf(d10), a0Var);
        return a0Var;
    }

    @SuppressLint({"InlinedApi"})
    View b(h0 h0Var) {
        f1 a10 = h0Var.a();
        int d10 = c0.d(a10, ug.f21009x);
        if (c0.b(a10, "editable")) {
            u uVar = new u(this.f5883y, h0Var, d10, this);
            uVar.a();
            this.f5862d.put(Integer.valueOf(d10), uVar);
            this.f5865g.put(Integer.valueOf(d10), uVar);
            this.f5864f.put(Integer.valueOf(d10), Boolean.TRUE);
            return uVar;
        } else if (!c0.b(a10, "button")) {
            y0 y0Var = new y0(this.f5883y, h0Var, d10, this);
            y0Var.a();
            this.f5860b.put(Integer.valueOf(d10), y0Var);
            this.f5865g.put(Integer.valueOf(d10), y0Var);
            this.f5864f.put(Integer.valueOf(d10), Boolean.FALSE);
            return y0Var;
        } else {
            y0 y0Var2 = new y0(this.f5883y, 16974145, h0Var, d10, this);
            y0Var2.a();
            this.f5860b.put(Integer.valueOf(d10), y0Var2);
            this.f5865g.put(Integer.valueOf(d10), y0Var2);
            this.f5864f.put(Integer.valueOf(d10), Boolean.FALSE);
            return y0Var2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<j0> i() {
        return this.f5877s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f5868j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, View> e() {
        return this.f5865g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        View view = (View) getParent();
        AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(this.f5870l);
        b1 webView = adColonyAdView == null ? null : adColonyAdView.getWebView();
        Context a10 = com.adcolony.sdk.a.a();
        boolean z11 = true;
        float a11 = g1.a(view, a10, true, z10, true, adColonyAdView != null);
        double a12 = a10 == null ? 0.0d : z0.a(z0.a(a10));
        int a13 = z0.a(webView);
        int b10 = z0.b(webView);
        if (a13 == this.f5875q && b10 == this.f5876r) {
            z11 = false;
        }
        if (z11) {
            this.f5875q = a13;
            this.f5876r = b10;
            a(a13, b10, webView);
        }
        if (this.f5873o != a11 || this.f5874p != a12 || z11) {
            a(a11, a12);
        }
        this.f5873o = a11;
        this.f5874p = a12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.f5879u = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.f5880v = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, u> f() {
        return this.f5862d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, Boolean> g() {
        return this.f5864f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, a0> h() {
        return this.f5863e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        z0.a(new i(z10), 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f5867i;
    }

    private void a(int i10, int i11, b1 b1Var) {
        float s10 = com.adcolony.sdk.a.b().n().s();
        if (b1Var != null) {
            f1 b10 = c0.b();
            c0.b(b10, "app_orientation", z0.d(z0.f()));
            c0.b(b10, "width", (int) (b1Var.getCurrentWidth() / s10));
            c0.b(b10, "height", (int) (b1Var.getCurrentHeight() / s10));
            c0.b(b10, "x", i10);
            c0.b(b10, "y", i11);
            c0.a(b10, "ad_session_id", this.f5870l);
            new h0("MRAID.on_size_change", this.f5869k, b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i10) {
        this.f5866h = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f5866h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f5881w = z10;
    }

    private void a(float f10, double d10) {
        f1 b10 = c0.b();
        c0.b(b10, ug.f21009x, this.f5868j);
        c0.a(b10, "ad_session_id", this.f5870l);
        c0.a(b10, "exposure", f10);
        c0.a(b10, "volume", d10);
        new h0("AdContainer.on_exposure_change", this.f5869k, b10).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f5870l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10) {
        this.f5867i = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdSession adSession) {
        this.f5882x = adSession;
        a(this.f5865g);
    }

    void a(Map map) {
        if (this.f5882x == null || map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            a((View) entry.getValue(), FriendlyObstructionPurpose.OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f5882x;
        if (adSession == null || view == null) {
            return;
        }
        try {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        AdSession adSession = this.f5882x;
        if (adSession == null || view == null) {
            return;
        }
        try {
            adSession.removeFriendlyObstruction(view);
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> j() {
        return this.f5878t;
    }
}

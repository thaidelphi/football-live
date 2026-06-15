package u4;

import android.text.Layout;
/* compiled from: TtmlStyle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f31426a;

    /* renamed from: b  reason: collision with root package name */
    private int f31427b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31428c;

    /* renamed from: d  reason: collision with root package name */
    private int f31429d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31430e;

    /* renamed from: k  reason: collision with root package name */
    private float f31436k;

    /* renamed from: l  reason: collision with root package name */
    private String f31437l;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f31440o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f31441p;

    /* renamed from: r  reason: collision with root package name */
    private b f31443r;

    /* renamed from: f  reason: collision with root package name */
    private int f31431f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f31432g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f31433h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f31434i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f31435j = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f31438m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f31439n = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f31442q = -1;

    /* renamed from: s  reason: collision with root package name */
    private float f31444s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f31428c && gVar.f31428c) {
                w(gVar.f31427b);
            }
            if (this.f31433h == -1) {
                this.f31433h = gVar.f31433h;
            }
            if (this.f31434i == -1) {
                this.f31434i = gVar.f31434i;
            }
            if (this.f31426a == null && (str = gVar.f31426a) != null) {
                this.f31426a = str;
            }
            if (this.f31431f == -1) {
                this.f31431f = gVar.f31431f;
            }
            if (this.f31432g == -1) {
                this.f31432g = gVar.f31432g;
            }
            if (this.f31439n == -1) {
                this.f31439n = gVar.f31439n;
            }
            if (this.f31440o == null && (alignment2 = gVar.f31440o) != null) {
                this.f31440o = alignment2;
            }
            if (this.f31441p == null && (alignment = gVar.f31441p) != null) {
                this.f31441p = alignment;
            }
            if (this.f31442q == -1) {
                this.f31442q = gVar.f31442q;
            }
            if (this.f31435j == -1) {
                this.f31435j = gVar.f31435j;
                this.f31436k = gVar.f31436k;
            }
            if (this.f31443r == null) {
                this.f31443r = gVar.f31443r;
            }
            if (this.f31444s == Float.MAX_VALUE) {
                this.f31444s = gVar.f31444s;
            }
            if (z10 && !this.f31430e && gVar.f31430e) {
                u(gVar.f31429d);
            }
            if (z10 && this.f31438m == -1 && (i10 = gVar.f31438m) != -1) {
                this.f31438m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f31437l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f31434i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f31431f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f31441p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f31439n = i10;
        return this;
    }

    public g F(int i10) {
        this.f31438m = i10;
        return this;
    }

    public g G(float f10) {
        this.f31444s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f31440o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f31442q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f31443r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f31432g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f31430e) {
            return this.f31429d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f31428c) {
            return this.f31427b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f31426a;
    }

    public float e() {
        return this.f31436k;
    }

    public int f() {
        return this.f31435j;
    }

    public String g() {
        return this.f31437l;
    }

    public Layout.Alignment h() {
        return this.f31441p;
    }

    public int i() {
        return this.f31439n;
    }

    public int j() {
        return this.f31438m;
    }

    public float k() {
        return this.f31444s;
    }

    public int l() {
        int i10 = this.f31433h;
        if (i10 == -1 && this.f31434i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f31434i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f31440o;
    }

    public boolean n() {
        return this.f31442q == 1;
    }

    public b o() {
        return this.f31443r;
    }

    public boolean p() {
        return this.f31430e;
    }

    public boolean q() {
        return this.f31428c;
    }

    public boolean s() {
        return this.f31431f == 1;
    }

    public boolean t() {
        return this.f31432g == 1;
    }

    public g u(int i10) {
        this.f31429d = i10;
        this.f31430e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f31433h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f31427b = i10;
        this.f31428c = true;
        return this;
    }

    public g x(String str) {
        this.f31426a = str;
        return this;
    }

    public g y(float f10) {
        this.f31436k = f10;
        return this;
    }

    public g z(int i10) {
        this.f31435j = i10;
        return this;
    }
}

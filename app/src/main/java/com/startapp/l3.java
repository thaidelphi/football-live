package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l3 {

    /* renamed from: a  reason: collision with root package name */
    public final m3 f22225a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22226b;

    /* renamed from: c  reason: collision with root package name */
    public String f22227c;

    /* renamed from: d  reason: collision with root package name */
    public String f22228d;

    /* renamed from: e  reason: collision with root package name */
    public String f22229e;

    /* renamed from: f  reason: collision with root package name */
    public Object f22230f;

    /* renamed from: g  reason: collision with root package name */
    public String f22231g;

    /* renamed from: h  reason: collision with root package name */
    public Long f22232h;

    /* renamed from: i  reason: collision with root package name */
    public String f22233i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22234j;

    /* renamed from: k  reason: collision with root package name */
    public String f22235k;

    public l3(m3 m3Var) {
        if (m3Var != m3.f22276f) {
            this.f22225a = m3Var;
        } else {
            this.f22225a = m3.f22275e;
        }
        m3 m3Var2 = this.f22225a;
        if (m3Var2 == m3.f22275e || m3Var2 == m3.f22274d) {
            this.f22233i = o9.a(o9.a(0));
        }
        this.f22226b = 0L;
    }

    public final l3 a(String str) {
        this.f22229e = str;
        return this;
    }

    public final l3 b() {
        this.f22228d = "TPC.rst";
        return this;
    }

    public final String toString() {
        return super.toString();
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.R.f22411a;
            if (aVar != null) {
                aVar.f23240p.a().a(this);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th) {
        try {
            new l3(th).a();
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, m3 m3Var) {
        try {
            new l3(th, m3Var).a();
        } catch (Throwable unused) {
        }
    }

    public l3(Throwable th) {
        this.f22225a = m3.f22276f;
        this.f22229e = o9.b(th);
        this.f22228d = o9.a(o9.a(th));
        this.f22233i = o9.a(o9.a(1));
        this.f22226b = 0L;
    }

    public l3(Throwable th, m3 m3Var) {
        boolean z10 = m3Var == m3.f22277g;
        this.f22225a = m3Var;
        this.f22229e = o9.b(th);
        this.f22228d = o9.a(o9.a(th));
        this.f22233i = z10 ? th.getClass().getName() : o9.a(o9.a(1));
        this.f22226b = 0L;
    }

    public l3(m3 m3Var, long j10) {
        this.f22225a = m3Var;
        this.f22226b = j10;
    }
}

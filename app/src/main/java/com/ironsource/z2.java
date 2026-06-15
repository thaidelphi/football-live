package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class z2 extends fr {

    /* renamed from: h  reason: collision with root package name */
    private static String f21610h = "type";

    /* renamed from: i  reason: collision with root package name */
    private static String f21611i = "numOfAdUnits";

    /* renamed from: j  reason: collision with root package name */
    private static String f21612j = "firstCampaignCredits";

    /* renamed from: k  reason: collision with root package name */
    private static String f21613k = "totalNumberCredits";

    /* renamed from: l  reason: collision with root package name */
    private static String f21614l = "productType";

    /* renamed from: b  reason: collision with root package name */
    private String f21615b;

    /* renamed from: c  reason: collision with root package name */
    private String f21616c;

    /* renamed from: d  reason: collision with root package name */
    private String f21617d;

    /* renamed from: e  reason: collision with root package name */
    private String f21618e;

    /* renamed from: f  reason: collision with root package name */
    private String f21619f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21620g;

    public z2(String str) {
        super(str);
        boolean z10;
        if (a(f21610h)) {
            k(d(f21610h));
        }
        if (a(f21611i)) {
            h(d(f21611i));
            z10 = true;
        } else {
            z10 = false;
        }
        a(z10);
        if (a(f21612j)) {
            g(d(f21612j));
        }
        if (a(f21613k)) {
            j(d(f21613k));
        }
        if (a(f21614l)) {
            i(d(f21614l));
        }
    }

    private void a(boolean z10) {
        this.f21620g = z10;
    }

    public String b() {
        return this.f21618e;
    }

    public String c() {
        return this.f21617d;
    }

    public String d() {
        return this.f21616c;
    }

    public String e() {
        return this.f21619f;
    }

    public String f() {
        return this.f21615b;
    }

    public void g(String str) {
        this.f21618e = str;
    }

    public boolean g() {
        return this.f21620g;
    }

    public void h(String str) {
        this.f21617d = str;
    }

    public void i(String str) {
        this.f21616c = str;
    }

    public void j(String str) {
        this.f21619f = str;
    }

    public void k(String str) {
        this.f21615b = str;
    }
}

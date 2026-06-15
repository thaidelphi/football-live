package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class lp {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18248a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f18249b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18250c;

    /* renamed from: d  reason: collision with root package name */
    private pp f18251d;

    /* renamed from: e  reason: collision with root package name */
    private int f18252e;

    /* renamed from: f  reason: collision with root package name */
    private int f18253f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f18254a = true;

        /* renamed from: b  reason: collision with root package name */
        private boolean f18255b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f18256c = false;

        /* renamed from: d  reason: collision with root package name */
        private pp f18257d = null;

        /* renamed from: e  reason: collision with root package name */
        private int f18258e = 0;

        /* renamed from: f  reason: collision with root package name */
        private int f18259f = 0;

        public b a(boolean z10) {
            this.f18254a = z10;
            return this;
        }

        public b a(boolean z10, int i10) {
            this.f18256c = z10;
            this.f18259f = i10;
            return this;
        }

        public b a(boolean z10, pp ppVar, int i10) {
            this.f18255b = z10;
            if (ppVar == null) {
                ppVar = pp.PER_DAY;
            }
            this.f18257d = ppVar;
            this.f18258e = i10;
            return this;
        }

        public lp a() {
            return new lp(this.f18254a, this.f18255b, this.f18256c, this.f18257d, this.f18258e, this.f18259f);
        }
    }

    private lp(boolean z10, boolean z11, boolean z12, pp ppVar, int i10, int i11) {
        this.f18248a = z10;
        this.f18249b = z11;
        this.f18250c = z12;
        this.f18251d = ppVar;
        this.f18252e = i10;
        this.f18253f = i11;
    }

    public pp a() {
        return this.f18251d;
    }

    public int b() {
        return this.f18252e;
    }

    public int c() {
        return this.f18253f;
    }

    public boolean d() {
        return this.f18249b;
    }

    public boolean e() {
        return this.f18248a;
    }

    public boolean f() {
        return this.f18250c;
    }
}

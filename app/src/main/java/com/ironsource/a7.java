package com.ironsource;

import com.ironsource.a7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o2;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a7 {

    /* renamed from: a  reason: collision with root package name */
    private final o2 f16264a;

    /* renamed from: b  reason: collision with root package name */
    private final i2 f16265b;

    /* renamed from: c  reason: collision with root package name */
    private final f6 f16266c;

    /* renamed from: d  reason: collision with root package name */
    private final i8.g f16267d;

    /* renamed from: e  reason: collision with root package name */
    private final i8.g f16268e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16269f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16270g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f16271h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<wl> {
        a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a7 this$0) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            this$0.f16266c.e();
        }

        @Override // t8.a
        /* renamed from: a */
        public final wl invoke() {
            final a7 a7Var = a7.this;
            return new wl(new Runnable() { // from class: com.ironsource.qw
                @Override // java.lang.Runnable
                public final void run() {
                    a7.a.a(a7.this);
                }
            }, com.ironsource.lifecycle.b.d(), new yu());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends kotlin.jvm.internal.o implements t8.a<wl> {
        b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a7 this$0) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            this$0.f16266c.f();
        }

        @Override // t8.a
        /* renamed from: a */
        public final wl invoke() {
            final a7 a7Var = a7.this;
            return new wl(new Runnable() { // from class: com.ironsource.rw
                @Override // java.lang.Runnable
                public final void run() {
                    a7.b.a(a7.this);
                }
            }, com.ironsource.lifecycle.b.d(), new yu());
        }
    }

    public a7(o2 loadingData, i2 interactionData, f6 mListener) {
        i8.g b10;
        i8.g b11;
        kotlin.jvm.internal.n.f(loadingData, "loadingData");
        kotlin.jvm.internal.n.f(interactionData, "interactionData");
        kotlin.jvm.internal.n.f(mListener, "mListener");
        this.f16264a = loadingData;
        this.f16265b = interactionData;
        this.f16266c = mListener;
        b10 = i8.i.b(new a());
        this.f16267d = b10;
        b11 = i8.i.b(new b());
        this.f16268e = b11;
        this.f16269f = loadingData.b() > 0;
        this.f16270g = interactionData.b() > 0;
        this.f16271h = loadingData.a() == o2.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final void a(long j10) {
        if (this.f16271h && this.f16269f) {
            c().a(j10);
        }
    }

    private final void b(long j10) {
        if (this.f16271h && this.f16270g) {
            d().a(j10);
        }
    }

    private final wl c() {
        return (wl) this.f16267d.getValue();
    }

    private final wl d() {
        return (wl) this.f16268e.getValue();
    }

    private final void f() {
        if (this.f16271h) {
            c().b();
        }
    }

    private final void g() {
        if (this.f16271h) {
            d().b();
        }
    }

    public final void a() {
        IronLog.INTERNAL.verbose();
        f();
    }

    public final void b() {
        IronLog.INTERNAL.verbose();
        g();
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(this.f16265b.b());
    }

    public final void h() {
        if (!this.f16269f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f16264a.b());
    }
}

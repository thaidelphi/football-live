package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class w3 extends gp {

    /* renamed from: f  reason: collision with root package name */
    public static final a f21249f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f21250g = "AppLifecycleTrigger";

    /* renamed from: d  reason: collision with root package name */
    private final com.ironsource.lifecycle.b f21251d;

    /* renamed from: e  reason: collision with root package name */
    private final nk f21252e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements nk {
        b() {
        }

        @Override // com.ironsource.nk
        public void a() {
            w3.this.a(false);
        }

        @Override // com.ironsource.nk
        public void b() {
        }

        @Override // com.ironsource.nk
        public void c() {
        }

        @Override // com.ironsource.nk
        public void d() {
            w3.this.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.ironsource.lifecycle.b lifeCycleObserver) {
        super(false, 1, null);
        kotlin.jvm.internal.n.f(lifeCycleObserver, "lifeCycleObserver");
        this.f21251d = lifeCycleObserver;
        b bVar = new b();
        this.f21252e = bVar;
        lifeCycleObserver.a(bVar);
        a(lifeCycleObserver.e());
    }

    @Override // com.ironsource.gp
    public String b() {
        return f21250g;
    }

    public final void e() {
        this.f21251d.b(this.f21252e);
    }
}

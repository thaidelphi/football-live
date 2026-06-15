package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s0 implements lv {

    /* renamed from: a  reason: collision with root package name */
    private final String f20045a;

    /* renamed from: b  reason: collision with root package name */
    private final ui f20046b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20047c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20048a = new a();

        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.r();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f20049a = new b();

        b() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.o();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class c extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f20050a = new c();

        c() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.n();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class d extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f20051a = new d();

        d() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.q();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class e extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f20052a = new e();

        e() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.o();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class f extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f20053a = new f();

        f() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.g();
        }
    }

    public s0(String adm, ui uiVar, boolean z10) {
        kotlin.jvm.internal.n.f(adm, "adm");
        this.f20045a = adm;
        this.f20046b = uiVar;
        this.f20047c = z10;
    }

    @Override // com.ironsource.lv
    public void a() throws or {
        a(this.f20047c, a.f20048a);
        a(this.f20046b != null, b.f20049a);
        ui uiVar = this.f20046b;
        if (uiVar != null) {
            if (uiVar.c() == wi.NonBidder) {
                a(this.f20045a.length() == 0, c.f20050a);
            }
            if (uiVar.c() == wi.Bidder) {
                a(this.f20045a.length() > 0, d.f20051a);
            }
            a(uiVar.c() != wi.NotSupported, e.f20052a);
            a(uiVar.b().length() > 0, f.f20053a);
        }
    }

    @Override // com.ironsource.lv
    public /* synthetic */ void a(boolean z10, t8.a aVar) {
        oz.a(this, z10, aVar);
    }
}

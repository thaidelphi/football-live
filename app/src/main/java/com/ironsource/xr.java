package com.ironsource;

import android.content.Context;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.ip;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.xr;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class xr {

    /* renamed from: a  reason: collision with root package name */
    public static final xr f21433a = new xr();

    /* renamed from: b  reason: collision with root package name */
    private static os f21434b;

    /* renamed from: c  reason: collision with root package name */
    private static final i8.g f21435c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f21436d;

    /* renamed from: e  reason: collision with root package name */
    private static final bs f21437e;

    /* renamed from: f  reason: collision with root package name */
    private static final js f21438f;

    /* renamed from: g  reason: collision with root package name */
    private static final List<qr> f21439g;

    /* renamed from: h  reason: collision with root package name */
    private static kr f21440h;

    /* renamed from: i  reason: collision with root package name */
    private static mr f21441i;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f21442j;

    /* renamed from: k  reason: collision with root package name */
    private static long f21443k;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<bf> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21444a = new a();

        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final bf invoke() {
            return mm.f19249r.d().v();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements qr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f21445a;

        b(Context context) {
            this.f21445a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context applicationContext, kr sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
            xr xrVar = xr.f21433a;
            kotlin.jvm.internal.n.e(applicationContext, "applicationContext");
            xrVar.a(applicationContext, sdkConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(mr error) {
            kotlin.jvm.internal.n.f(error, "$error");
            xr.f21433a.a(error);
        }

        @Override // com.ironsource.qr
        public void a(final kr sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            bs bsVar = xr.f21437e;
            final Context context = this.f21445a;
            bsVar.a(new Runnable() { // from class: com.ironsource.c30
                @Override // java.lang.Runnable
                public final void run() {
                    xr.b.a(context, sdkConfig);
                }
            });
        }

        @Override // com.ironsource.qr
        public void a(final mr error) {
            kotlin.jvm.internal.n.f(error, "error");
            xr.f21437e.a(new Runnable() { // from class: com.ironsource.d30
                @Override // java.lang.Runnable
                public final void run() {
                    xr.b.b(mr.this);
                }
            });
        }
    }

    static {
        i8.g b10;
        b10 = i8.i.b(a.f21444a);
        f21435c = b10;
        f21436d = xr.class.getSimpleName();
        f21437e = new bs();
        f21438f = new js();
        f21439g = new ArrayList();
    }

    private xr() {
    }

    private final void a(Context context, ak akVar, ls lsVar) {
        akVar.i(lsVar.f().h());
        akVar.b(lsVar.f().d());
        a4 b10 = lsVar.c().b();
        kotlin.jvm.internal.n.c(b10);
        akVar.a(b10.a());
        akVar.c(b10.b().b());
        akVar.b(b10.j().b());
        akVar.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
        a4 b11 = lsVar.c().b();
        kotlin.jvm.internal.n.c(b11);
        akVar.b(b11.e().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, kr krVar) {
        b(krVar);
        k4 a10 = krVar.a();
        xa xaVar = xa.f21388a;
        xaVar.c(a10.g());
        mm.f19249r.a().x().a(a10.c());
        xaVar.a(a10.f());
        xaVar.a(a10.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a10.h());
        c().a(a10);
        bs bsVar = f21437e;
        a(context, bsVar.c(), krVar.d());
        bsVar.a(new Date().getTime() - f21443k, krVar.f());
        os osVar = new os();
        f21434b = osVar;
        osVar.a(c());
        IronSourceUtils.saveLastResponse(context, krVar.d().toString());
        oj.i().c(true);
        ar.i().c(true);
        ip.P.c(true);
        b(context, krVar);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(krVar.e().b());
        d4 b10 = krVar.b();
        if (b10.f()) {
            bsVar.a(b10);
        }
        a(krVar);
        new ip.a().a();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Context context, qr listener, rr initRequest, Context context2) {
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        j.f17882a.a(context);
        kr krVar = f21440h;
        if (krVar != null) {
            f21433a.a(listener, krVar);
            return;
        }
        f21439g.add(listener);
        if (f21442j) {
            return;
        }
        f21441i = null;
        f21433a.a(true);
        f21443k = new Date().getTime();
        f21438f.a(context, initRequest, f21437e, new b(context2));
    }

    private final void a(h4 h4Var, Context context, ls lsVar) {
        oj.i().a(h4Var.c(), context);
        oj.i().b(h4Var.d(), context);
        oj.i().b(h4Var.f());
        oj.i().a(h4Var.e());
        oj.i().c(h4Var.a());
        oj.i().c(h4Var.i(), context);
        oj.i().a(h4Var.h(), context);
        oj.i().b(h4Var.j(), context);
        oj.i().d(h4Var.g(), context);
        oj i10 = oj.i();
        a4 b10 = lsVar.c().b();
        kotlin.jvm.internal.n.c(b10);
        i10.a(b10.i());
        oj.i().a(h4Var.k());
        oj.i().d(h4Var.b());
    }

    private final void a(kr krVar) {
        for (qr qrVar : f21439g) {
            a(qrVar, krVar);
        }
        f21439g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(mr mrVar) {
        f21441i = mrVar;
        a(false);
        for (qr qrVar : f21439g) {
            a(qrVar, mrVar);
        }
        f21439g.clear();
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "Mediation availability false reason: " + mrVar, 1);
    }

    private final void a(final qr qrVar, final kr krVar) {
        f21437e.e(new Runnable() { // from class: com.ironsource.y20
            @Override // java.lang.Runnable
            public final void run() {
                xr.b(qr.this, krVar);
            }
        });
    }

    private final void a(final qr qrVar, final mr mrVar) {
        f21437e.e(new Runnable() { // from class: com.ironsource.z20
            @Override // java.lang.Runnable
            public final void run() {
                xr.b(qr.this, mrVar);
            }
        });
    }

    private final void a(boolean z10) {
        f21442j = z10;
        f21437e.a(b());
    }

    private final zr b() {
        return f21440h != null ? zr.INITIATED : f21441i != null ? zr.INIT_FAILED : f21442j ? zr.INIT_IN_PROGRESS : zr.NOT_INIT;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(android.content.Context r8, com.ironsource.kr r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.xr.b(android.content.Context, com.ironsource.kr):void");
    }

    private final void b(h4 h4Var, Context context, ls lsVar) {
        ar.i().a(h4Var.c(), context);
        ar.i().b(h4Var.d(), context);
        ar.i().b(h4Var.f());
        ar.i().a(h4Var.e());
        ar.i().c(h4Var.a());
        ar.i().c(h4Var.i(), context);
        ar.i().a(h4Var.h(), context);
        ar.i().b(h4Var.j(), context);
        ar.i().d(h4Var.g(), context);
        ar i10 = ar.i();
        a4 b10 = lsVar.c().b();
        kotlin.jvm.internal.n.c(b10);
        i10.a(b10.i());
        ar.i().a(h4Var.k());
        ar.i().d(h4Var.b());
    }

    private final void b(kr krVar) {
        f21440h = krVar;
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(qr listener, kr sdkConfig) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(qr listener, mr error) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(error, "$error");
        listener.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(sr serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "$serverResponse");
        kr krVar = new kr(serverResponse);
        xr xrVar = f21433a;
        xrVar.b(krVar);
        xrVar.a(krVar);
    }

    private final bf c() {
        return (bf) f21435c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(mr error) {
        kotlin.jvm.internal.n.f(error, "$error");
        f21433a.a(error);
    }

    private final void d() {
        if (mm.f19249r.d().d().f()) {
            ar.i().a(new zb(IronSourceConstants.EP_CONFIG_RECEIVED, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f21433a.a(true);
    }

    public final void a(final Context context, final rr initRequest, final qr listener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        f21437e.c(new Runnable() { // from class: com.ironsource.w20
            @Override // java.lang.Runnable
            public final void run() {
                xr.a(context, listener, initRequest, applicationContext);
            }
        });
    }

    public final void a(final sr serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        f21437e.c(new Runnable() { // from class: com.ironsource.a30
            @Override // java.lang.Runnable
            public final void run() {
                xr.b(sr.this);
            }
        });
    }

    public final void b(final mr error) {
        kotlin.jvm.internal.n.f(error, "error");
        f21437e.c(new Runnable() { // from class: com.ironsource.x20
            @Override // java.lang.Runnable
            public final void run() {
                xr.c(mr.this);
            }
        });
    }

    public final void e() {
        f21437e.c(new Runnable() { // from class: com.ironsource.b30
            @Override // java.lang.Runnable
            public final void run() {
                xr.f();
            }
        });
    }
}

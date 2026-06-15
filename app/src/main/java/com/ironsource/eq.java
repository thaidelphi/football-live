package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class eq {

    /* renamed from: a  reason: collision with root package name */
    private final rf f17287a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.a<Long> f17288b;

    /* renamed from: c  reason: collision with root package name */
    private final xf f17289c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f17290d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.l implements t8.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17291a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements OutcomeReceiver<Object, Exception> {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception error) {
            kotlin.jvm.internal.n.f(error, "error");
            eq.this.a(error.getMessage());
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            eq.this.c();
        }
    }

    public eq() {
        this(null, null, null, null, 15, null);
    }

    public eq(rf eventManager, t8.a<Long> getTimeFunction, xf serviceProvider, Executor executor) {
        kotlin.jvm.internal.n.f(eventManager, "eventManager");
        kotlin.jvm.internal.n.f(getTimeFunction, "getTimeFunction");
        kotlin.jvm.internal.n.f(serviceProvider, "serviceProvider");
        kotlin.jvm.internal.n.f(executor, "executor");
        this.f17287a = eventManager;
        this.f17288b = getTimeFunction;
        this.f17289c = serviceProvider;
        this.f17290d = executor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ eq(com.ironsource.rf r1, t8.a r2, com.ironsource.xf r3, java.util.concurrent.Executor r4, int r5, kotlin.jvm.internal.h r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto Ld
            com.ironsource.ar r1 = com.ironsource.ar.i()
            java.lang.String r6 = "getInstance()"
            kotlin.jvm.internal.n.e(r1, r6)
        Ld:
            r6 = r5 & 2
            if (r6 == 0) goto L13
            com.ironsource.eq$a r2 = com.ironsource.eq.a.f17291a
        L13:
            r6 = r5 & 4
            if (r6 == 0) goto L1d
            com.ironsource.mm$b r3 = com.ironsource.mm.f19249r
            com.ironsource.xf r3 = r3.d()
        L1d:
            r5 = r5 & 8
            if (r5 == 0) goto L2a
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r5 = "newSingleThreadExecutor()"
            kotlin.jvm.internal.n.e(r4, r5)
        L2a:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.eq.<init>(com.ironsource.rf, t8.a, com.ironsource.xf, java.util.concurrent.Executor, int, kotlin.jvm.internal.h):void");
    }

    private final Uri a(Context context) {
        boolean l10;
        nf f10 = this.f17289c.f();
        String connectionType = IronSourceUtils.getConnectionType(context);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter(b9.i.f16712l, Build.MODEL).appendQueryParameter("sdkVersion", IronSourceUtils.getSDKVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(fe.Q0, f10.p(context)).appendQueryParameter(fe.G0, f10.G(context)).appendQueryParameter("auid", f10.t(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(fe.f17408e0, String.valueOf(k1.a())).appendQueryParameter(cc.f16874p, "1").appendQueryParameter(da.a.f16995d, String.valueOf(this.f17288b.invoke().longValue())).appendQueryParameter(b9.i.f16731x, f10.b(context)).appendQueryParameter("deviceCarrier", f10.j(context)).appendQueryParameter(b9.i.f16727t, connectionType);
        l10 = b9.o.l(connectionType, x8.f21379b, true);
        Uri build = appendQueryParameter.appendQueryParameter(x8.f21379b, String.valueOf(l10)).build();
        kotlin.jvm.internal.n.e(build, "Builder()\n        .schem…arameter\n        .build()");
        return build;
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver<Object, Exception> a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f17287a.a(new zb(56, new JSONObject().put("reason", str)));
    }

    private final String b() {
        Object v10;
        ConcurrentHashMap<String, List<String>> c10 = qk.b().c();
        String str = null;
        List<String> list = c10 != null ? c10.get(com.ironsource.mediationsdk.metadata.a.f18919b) : null;
        if (list != null) {
            v10 = j8.y.v(list);
            str = (String) v10;
        }
        return str == null ? "" : str;
    }

    private final boolean b(Context context) {
        return IronSourceUtils.getFirstSession(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f17287a.a(new zb(55, null));
    }

    private final void d() {
        this.f17287a.a(new zb(54, null));
    }

    @SuppressLint({"NewApi"})
    public final void c(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        d();
        try {
            MeasurementManager a10 = k1.a(context);
            if (a10 == null) {
                a("could not obtain measurement manager");
            } else {
                a10.registerTrigger(a(context), this.f17290d, a());
            }
        } catch (Exception e8) {
            a(e8.getMessage());
            o9.d().a(e8);
        }
    }
}

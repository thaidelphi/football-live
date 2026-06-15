package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.ls;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class bs {

    /* renamed from: a  reason: collision with root package name */
    private final ak f16772a = new ak();

    /* renamed from: b  reason: collision with root package name */
    private final xi f16773b = new xi(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* renamed from: c  reason: collision with root package name */
    private final nf f16774c = mm.f19249r.d().f();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f16775a;

        a(Runnable runnable) {
            this.f16775a = runnable;
        }

        @Override // com.ironsource.hr
        public void a() {
            this.f16775a.run();
        }
    }

    public static /* synthetic */ void a(bs bsVar, hr hrVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        bsVar.a(hrVar, j10);
    }

    public static /* synthetic */ void a(bs bsVar, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        bsVar.a(runnable, j10);
    }

    public final ls a(Context context, String appKey) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(appKey, "appKey");
        return com.ironsource.mediationsdk.p.m().a(context, appKey);
    }

    public final String a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        String b10 = com.ironsource.mediationsdk.p.m().b(context);
        kotlin.jvm.internal.n.e(b10, "getInstance().getAdvertiserId(context)");
        return b10;
    }

    public final void a() {
        cq.c().a();
    }

    public final void a(long j10, ls.a responseOrigin) {
        kotlin.jvm.internal.n.f(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.p.m().a(j10, responseOrigin);
    }

    public final void a(d4 reporterSettings) {
        kotlin.jvm.internal.n.f(reporterSettings, "reporterSettings");
        o9.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.getSessionId(), reporterSettings.a(), reporterSettings.g());
    }

    public final void a(hr safeRunnable) {
        kotlin.jvm.internal.n.f(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void a(hr safeRunnable, long j10) {
        kotlin.jvm.internal.n.f(safeRunnable, "safeRunnable");
        this.f16773b.a(safeRunnable, j10);
    }

    public final void a(zr initStatus) {
        kotlin.jvm.internal.n.f(initStatus, "initStatus");
        as.f16400a.a(initStatus);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f16773b.a(callback);
    }

    public final void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j10);
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        ce.a().a(key, value);
    }

    public final nf b() {
        return this.f16774c;
    }

    public final String b(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        String M = this.f16774c.M(context);
        kotlin.jvm.internal.n.e(M, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return M;
    }

    public final void b(hr safeRunnable) {
        kotlin.jvm.internal.n.f(safeRunnable, "safeRunnable");
        this.f16773b.a(safeRunnable);
    }

    public final void b(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final ak c() {
        return this.f16772a;
    }

    public final void c(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        this.f16773b.b(runnable);
    }

    public final boolean c(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        return IronSourceUtils.isNetworkConnected(context);
    }

    public final IronSourceSegment d() {
        return com.ironsource.mediationsdk.p.m().t();
    }

    public final void d(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final void e(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    public final boolean e() {
        return IronSourceUtils.isEncryptedResponse();
    }

    public final void f() {
        com.ironsource.mediationsdk.p.m().U();
    }

    public final void g() {
        ar.i().a(new zb(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
    }
}

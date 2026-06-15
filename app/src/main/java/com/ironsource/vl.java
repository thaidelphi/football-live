package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.ls;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class vl {

    /* renamed from: a  reason: collision with root package name */
    private final xi f21183a = new xi(null, 1, null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f21184a;

        a(Runnable runnable) {
            this.f21184a = runnable;
        }

        @Override // com.ironsource.hr
        public void a() {
            this.f21184a.run();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.a<i8.w> f21185a;

        b(t8.a<i8.w> aVar) {
            this.f21185a = aVar;
        }

        @Override // com.ironsource.hr
        public void a() {
            this.f21185a.invoke();
        }
    }

    private final String a(String str, long j10) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j10;
    }

    public static /* synthetic */ void a(vl vlVar, hr hrVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        vlVar.a(hrVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vl this$0, Runnable runnable) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(runnable, "$runnable");
        this$0.f21183a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vl this$0, Runnable runnable, long j10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(runnable, "$runnable");
        this$0.b(runnable);
    }

    public static /* synthetic */ void a(vl vlVar, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        vlVar.a(runnable, j10);
    }

    public static /* synthetic */ void a(vl vlVar, t8.a aVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        vlVar.a(aVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final vl this$0, final Runnable runnable) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.z10
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                vl.a(vl.this, runnable, j10);
            }
        });
    }

    public final Handler a() {
        return this.f21183a.a();
    }

    public final IronSource.AD_UNIT a(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final void a(long j10, ls.a responseOrigin, long j11) {
        kotlin.jvm.internal.n.f(responseOrigin, "responseOrigin");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
        String a10 = responseOrigin.a();
        kotlin.jvm.internal.n.e(a10, "responseOrigin.value");
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(a10, j11));
        vt.a((int) IronSourceConstants.SDK_INIT_SUCCESS, jSONObject);
    }

    public final void a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        IntegrationHelper.validateIntegration(context.getApplicationContext());
    }

    public final void a(hr safeRunnable) {
        kotlin.jvm.internal.n.f(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void a(hr safeRunnable, long j10) {
        kotlin.jvm.internal.n.f(safeRunnable, "safeRunnable");
        this.f21183a.a(safeRunnable, j10);
    }

    public final void a(mr error, long j10) {
        kotlin.jvm.internal.n.f(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
        jSONObject.put("reason", error.d());
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
        vt.a((int) IronSourceConstants.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f21183a.a(callback);
    }

    public final void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j10);
    }

    public final void a(String adUnitId, int i10, String str) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        vt.a((int) IronSourceConstants.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(String placementName, LevelPlay.AdFormat adFormat, int i10, String str) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(fl.f17487f, adFormat.getValue());
        jSONObject.put("adf", vt.b(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        vt.a((int) IronSourceConstants.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(t8.a<i8.w> action, long j10) {
        kotlin.jvm.internal.n.f(action, "action");
        a((hr) new b(action), j10);
    }

    public final boolean a(AdapterBaseInterface networkAdapter, IronSource.AD_UNIT adFormat, String providerName) {
        kotlin.jvm.internal.n.f(networkAdapter, "networkAdapter");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(providerName, "providerName");
        return vt.a(networkAdapter, adFormat, providerName);
    }

    public final IronSource.AD_UNIT[] a(LevelPlay.AdFormat... adFormats) {
        kotlin.jvm.internal.n.f(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }

    public final void b(hr safeRunnable) {
        kotlin.jvm.internal.n.f(safeRunnable, "safeRunnable");
        this.f21183a.a(safeRunnable);
    }

    public final void b(final Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.a20
            @Override // java.lang.Runnable
            public final void run() {
                vl.a(vl.this, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void b(String adUnitId, int i10, String str) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        vt.a((int) IronSourceConstants.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void c(final Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.b20
            @Override // java.lang.Runnable
            public final void run() {
                vl.b(vl.this, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void d(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        this.f21183a.b(runnable);
    }

    public final void e(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }
}

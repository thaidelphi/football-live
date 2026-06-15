package com.ironsource;

import android.content.Context;
import com.ironsource.ls;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.v0;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class uj {

    /* renamed from: a  reason: collision with root package name */
    public static final uj f21030a = new uj();

    /* renamed from: b  reason: collision with root package name */
    private static final ti f21031b = new ti();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            kotlin.jvm.internal.n.f(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements qr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f21032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ib f21033b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InitListener f21034c;

        b(Context context, ib ibVar, InitListener initListener) {
            this.f21032a = context;
            this.f21033b = ibVar;
            this.f21034c = initListener;
        }

        @Override // com.ironsource.qr
        public void a(kr sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            uj.f21030a.a(this.f21032a, sdkConfig.d(), this.f21033b, this.f21034c);
        }

        @Override // com.ironsource.qr
        public void a(mr error) {
            kotlin.jvm.internal.n.f(error, "error");
            uj.f21030a.a(this.f21034c, this.f21033b, error);
        }
    }

    private uj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, ls lsVar, ib ibVar, InitListener initListener) {
        String u10 = com.ironsource.mediationsdk.p.m().u();
        li f10 = lsVar.f();
        kotlin.jvm.internal.n.e(f10, "serverResponse.initialConfiguration");
        NetworkSettings b10 = lsVar.k().b("IronSource");
        kotlin.jvm.internal.n.e(b10, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = b10.getInterstitialSettings();
        kotlin.jvm.internal.n.e(interstitialSettings, "networkSettings.interstitialSettings");
        f10.a(new v0.a(interstitialSettings));
        f10.a(ConfigFile.getConfigFile().getPluginType());
        f10.b(u10);
        new x0(new rn()).a(context, f10, new a());
        a(lsVar, ibVar, initListener);
    }

    private final void a(ls lsVar, ib ibVar, final InitListener initListener) {
        j4 d10;
        a4 b10 = lsVar.c().b();
        new nm().a((b10 == null || (d10 = b10.d()) == null) ? null : d10.b(), true);
        String sessionId = com.ironsource.mediationsdk.p.m().u();
        kn a10 = kn.f18097e.a();
        a10.a(lsVar.k());
        a10.a(lsVar.c());
        kotlin.jvm.internal.n.e(sessionId, "sessionId");
        a10.a(sessionId);
        a10.g();
        long a11 = ib.a(ibVar);
        ti tiVar = f21031b;
        ls.a h10 = lsVar.h();
        kotlin.jvm.internal.n.e(h10, "serverResponse.origin");
        tiVar.a(a11, h10);
        tiVar.b(new Runnable() { // from class: com.ironsource.f10
            @Override // java.lang.Runnable
            public final void run() {
                uj.a(InitListener.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, ib ibVar, final mr mrVar) {
        long a10 = ib.a(ibVar);
        ti tiVar = f21031b;
        tiVar.a(mrVar, a10);
        tiVar.b(new Runnable() { // from class: com.ironsource.g10
            @Override // java.lang.Runnable
            public final void run() {
                uj.a(InitListener.this, mrVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener, mr error) {
        kotlin.jvm.internal.n.f(error, "$error");
        if (initListener != null) {
            initListener.onInitFailed(f21031b.a(error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        List v10;
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initializationListener, "$initializationListener");
        ib ibVar = new ib();
        String appKey = initRequest.getAppKey();
        v10 = j8.m.v(f21031b.a(initRequest.getLegacyAdFormats()));
        yr.f21582a.c(context, new rr(appKey, null, v10, 2, null), new b(context, ibVar, initializationListener));
    }

    public final void a(final Context context, final InitRequest initRequest, final InitListener initializationListener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(initializationListener, "initializationListener");
        f21031b.a(new Runnable() { // from class: com.ironsource.h10
            @Override // java.lang.Runnable
            public final void run() {
                uj.a(InitRequest.this, context, initializationListener);
            }
        });
    }
}

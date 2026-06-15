package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    private final qn f21346a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements no {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ li f21347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InitListener f21348b;

        a(li liVar, InitListener initListener) {
            this.f21347a = liVar;
            this.f21348b = initListener;
        }

        @Override // com.ironsource.no
        public void onFail(fh error) {
            kotlin.jvm.internal.n.f(error, "error");
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f21348b.onInitFailed(wb.f21282a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.no
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            StringBuilder sb = new StringBuilder();
            sb.append("controllerURL = ");
            v0 e8 = this.f21347a.e();
            sb.append(e8 != null ? e8.c() : null);
            ironLog.verbose(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("controllerConfig = ");
            v0 e10 = this.f21347a.e();
            sb2.append(e10 != null ? e10.a() : null);
            ironLog.verbose(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("debugMode = ");
            v0 e11 = this.f21347a.e();
            sb3.append(e11 != null ? Integer.valueOf(e11.b()) : null);
            ironLog.verbose(sb3.toString());
            ironLog.verbose("applicationKey = " + this.f21347a.d());
            ironLog.verbose("userId = " + this.f21347a.h());
            this.f21348b.onInitSuccess();
        }
    }

    public x0(qn networkInitApi) {
        kotlin.jvm.internal.n.f(networkInitApi, "networkInitApi");
        this.f21346a = networkInitApi;
    }

    @Override // com.ironsource.w0
    public void a(Context context, li initConfig, InitListener initListener) {
        JSONObject a10;
        String c10;
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initConfig, "initConfig");
        kotlin.jvm.internal.n.f(initListener, "initListener");
        qn qnVar = this.f21346a;
        v0 e8 = initConfig.e();
        qnVar.a(e8 != null ? e8.b() : 0);
        v0 e10 = initConfig.e();
        if (e10 != null && (c10 = e10.c()) != null) {
            this.f21346a.b(c10);
        }
        v0 e11 = initConfig.e();
        if (e11 != null && (a10 = e11.a()) != null) {
            qn qnVar2 = this.f21346a;
            String jSONObject = a10.toString();
            kotlin.jvm.internal.n.e(jSONObject, "applicationConfig.toString()");
            qnVar2.a(jSONObject);
        }
        Map<String, String> a11 = new on().a();
        this.f21346a.a(new a(initConfig, initListener));
        this.f21346a.a(context, initConfig.d(), initConfig.h(), a11);
    }
}

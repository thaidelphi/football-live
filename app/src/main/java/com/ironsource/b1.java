package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b1 implements a1 {

    /* renamed from: a  reason: collision with root package name */
    private final bo f16436a;

    public b1(bo networkShowApi) {
        kotlin.jvm.internal.n.f(networkShowApi, "networkShowApi");
        this.f16436a = networkShowApi;
    }

    @Override // com.ironsource.a1
    public void a(Activity activity, rj adInstance) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f16436a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.a1
    public boolean a(rj adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        return this.f16436a.a(adInstance);
    }
}

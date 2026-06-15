package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class os {

    /* renamed from: a  reason: collision with root package name */
    private zc f19633a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private final class a extends ns {
        public a() {
        }

        @Override // com.ironsource.ns, java.lang.Runnable
        public void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
            ip.P.a(new zb(44, mediationAdditionalData));
        }
    }

    public final void a(bf applicationLifecycleService) {
        kotlin.jvm.internal.n.f(applicationLifecycleService, "applicationLifecycleService");
        this.f19633a = new zc(applicationLifecycleService, new a());
    }
}

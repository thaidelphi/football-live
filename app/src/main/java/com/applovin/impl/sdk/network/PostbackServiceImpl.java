package com.applovin.impl.sdk.network;

import com.applovin.impl.h5;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.j;
import com.applovin.impl.u5;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a  reason: collision with root package name */
    private final j f9035a;

    public PostbackServiceImpl(j jVar) {
        this.f9035a = jVar;
    }

    private boolean a(e eVar) {
        Map i10 = eVar.i();
        if (i10 == null) {
            return false;
        }
        Object obj = i10.get("event");
        if ("postinstall".equals(obj)) {
            obj = i10.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.f9035a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, u5.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, u5.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        h5 h5Var = new h5(eVar, bVar, this.f9035a, appLovinPostbackListener);
        h5Var.a(a(eVar));
        this.f9035a.i0().a((z4) h5Var, bVar);
    }
}

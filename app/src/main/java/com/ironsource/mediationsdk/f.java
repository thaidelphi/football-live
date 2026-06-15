package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.h5;
import com.ironsource.mediationsdk.e;
import com.ironsource.o5;
import com.ironsource.s4;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final o5 f18813a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18814b;

    public f(o5 settings, String sessionId) {
        kotlin.jvm.internal.n.f(settings, "settings");
        kotlin.jvm.internal.n.f(sessionId, "sessionId");
        this.f18813a = settings;
        this.f18814b = sessionId;
    }

    private final JSONObject a(Context context, i iVar) throws JSONException {
        JSONObject a10 = d.b().a(iVar);
        kotlin.jvm.internal.n.e(a10, "getInstance().enrichToke…low(auctionRequestParams)");
        return a10;
    }

    @Override // com.ironsource.mediationsdk.g
    public e.a a(Context context, i auctionRequestParams, s4 auctionListener) throws JSONException {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(auctionRequestParams, "auctionRequestParams");
        kotlin.jvm.internal.n.f(auctionListener, "auctionListener");
        JSONObject a10 = a(context, auctionRequestParams);
        String a11 = this.f18813a.a(auctionRequestParams.r());
        return auctionRequestParams.r() ? new h5(auctionListener, new URL(a11), a10, auctionRequestParams.s(), this.f18813a.g(), this.f18813a.m(), this.f18813a.n(), this.f18813a.o(), this.f18813a.d()) : new e.a(auctionListener, new URL(a11), a10, auctionRequestParams.s(), this.f18813a.g(), this.f18813a.m(), this.f18813a.n(), this.f18813a.o(), this.f18813a.d());
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f18813a.g() > 0;
    }
}

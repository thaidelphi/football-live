package com.ironsource;

import com.ironsource.b9;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ss {

    /* renamed from: a  reason: collision with root package name */
    private ts f20728a;

    public ss(JSONObject config) {
        kotlin.jvm.internal.n.f(config, "config");
        this.f20728a = ts.f20869b.a(config.optInt(b9.a.f16549t, ts.CurrentlyLoadedAds.b()));
    }

    public final ts a() {
        return this.f20728a;
    }
}

package com.applovin.impl;

import com.applovin.impl.s4;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class u4 extends d3 {
    public u4(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(map, jSONObject, jSONObject2, jVar);
    }

    public s4.b t() {
        return s4.b.values()[a("signal_cache_level", ((Integer) this.f6792a.a(j3.f7303e7)).intValue())];
    }

    @Override // com.applovin.impl.d3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + '}';
    }

    public long u() {
        return a("signal_expiration_ms", ((Long) this.f6792a.a(j3.f7302d7)).longValue());
    }

    public boolean v() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean w() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean x() {
        return a("fail_collection_for_empty_signal", (Boolean) this.f6792a.a(j3.I7)).booleanValue();
    }

    public boolean y() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }

    public boolean z() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }
}

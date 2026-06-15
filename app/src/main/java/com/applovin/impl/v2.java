package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v2 extends b3 {
    public v2(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i10, map, jSONObject, jSONObject2, null, jVar);
    }

    @Override // com.applovin.impl.u2
    public u2 a(com.applovin.impl.mediation.g gVar) {
        return new v2(this, gVar);
    }

    public long r0() {
        long a10 = a("ad_refresh_ms", -1L);
        return a10 >= 0 ? a10 : b("ad_refresh_ms", ((Long) this.f6792a.a(j3.N6)).longValue());
    }

    public long s0() {
        return d7.d(a("bg_color", (String) null));
    }

    public int t0() {
        int a10 = a("ad_view_height", -2);
        if (a10 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getHeight();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return a10;
    }

    public long u0() {
        return a("viewability_imp_delay_ms", ((Long) this.f6792a.a(o4.f8220t1)).longValue());
    }

    public int v0() {
        int a10 = a("ad_view_width", -2);
        if (a10 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getWidth();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return a10;
    }

    public boolean w0() {
        return r0() >= 0;
    }

    public boolean x0() {
        return a("proe", (Boolean) this.f6792a.a(j3.f7312o7)).booleanValue();
    }

    private v2(v2 v2Var, com.applovin.impl.mediation.g gVar) {
        super(v2Var.K(), v2Var.i(), v2Var.a(), v2Var.g(), gVar, v2Var.f6792a);
    }
}

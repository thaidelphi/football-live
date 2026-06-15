package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b3 extends u2 {
    /* JADX INFO: Access modifiers changed from: protected */
    public b3(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.j jVar) {
        super(i10, map, jSONObject, jSONObject2, gVar, jVar);
    }

    public float j0() {
        return b("viewability_min_alpha", ((Float) this.f6792a.a(o4.C1)).floatValue() / 100.0f);
    }

    public int k0() {
        return a("viewability_min_pixels", -1);
    }

    public int l0() {
        o4 o4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            o4Var = o4.f8236v1;
        } else if (format == MaxAdFormat.MREC) {
            o4Var = o4.f8252x1;
        } else if (format == MaxAdFormat.LEADER) {
            o4Var = o4.f8268z1;
        } else {
            o4Var = format == MaxAdFormat.NATIVE ? o4.B1 : null;
        }
        if (o4Var != null) {
            return a("viewability_min_height", ((Integer) this.f6792a.a(o4Var)).intValue());
        }
        return 0;
    }

    public float m0() {
        return b("viewability_min_percentage_dp", -1.0f);
    }

    public float n0() {
        return b("viewability_min_percentage_pixels", -1.0f);
    }

    public long o0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f6792a.a(o4.D1)).longValue());
    }

    public int p0() {
        o4 o4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            o4Var = o4.f8228u1;
        } else if (format == MaxAdFormat.MREC) {
            o4Var = o4.f8244w1;
        } else if (format == MaxAdFormat.LEADER) {
            o4Var = o4.f8260y1;
        } else {
            o4Var = format == MaxAdFormat.NATIVE ? o4.A1 : null;
        }
        if (o4Var != null) {
            return a("viewability_min_width", ((Integer) this.f6792a.a(o4Var)).intValue());
        }
        return 0;
    }

    public boolean q0() {
        return k0() >= 0 || m0() >= 0.0f || n0() >= 0.0f;
    }
}

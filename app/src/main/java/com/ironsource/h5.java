package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class h5 extends e.a {
    public h5(s4 s4Var, URL url, JSONObject jSONObject, boolean z10, int i10, long j10, boolean z11, boolean z12, int i11) {
        super(s4Var, url, jSONObject, z10, i10, j10, z11, z12, i11);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z10, s4 s4Var, long j10) {
        try {
            if (z10) {
                ((a5) s4Var).a(this.f18797b, this.f18801f + 1, j10, this.f18805j, this.f18804i);
            } else {
                s4Var.a(this.f18798c, this.f18799d, this.f18801f + 1, this.f18802g, j10);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            s4Var.a(1009, e8.getMessage(), this.f18801f + 1, this.f18802g, j10);
        }
    }
}

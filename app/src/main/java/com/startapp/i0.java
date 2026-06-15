package com.startapp;

import android.content.Context;
import com.startapp.d8;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i0 extends GetAdRequest {
    public boolean W0;
    public int X0;

    @Override // com.startapp.sdk.adsbase.model.GetAdRequest, com.startapp.u0
    public final void a(w6 w6Var) throws SDKException {
        super.a(w6Var);
        w6Var.a("fixedSize", Boolean.valueOf(this.W0), false, true);
        w6Var.a("bnrt", Integer.valueOf(this.X0), false, true);
    }

    @Override // com.startapp.sdk.adsbase.model.GetAdRequest
    public final void d(Context context) {
        d8 a10 = com.startapp.sdk.components.a.a(context).f23235k.a();
        AdPreferences.Placement placement = this.f23117j0;
        this.f23133z0 = placement == null ? null : (String) a10.f21892a.get(new d8.a(placement, this.X0));
    }
}

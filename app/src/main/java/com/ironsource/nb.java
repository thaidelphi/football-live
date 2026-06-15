package com.ironsource;

import com.ironsource.mediationsdk.d;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class nb implements lm<String, d.a> {
    @Override // com.ironsource.lm
    public d.a a(String input) {
        kotlin.jvm.internal.n.f(input, "input");
        d.a a10 = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        kotlin.jvm.internal.n.e(a10, "getInstance().getAuction…sponse(JSONObject(input))");
        return a10;
    }
}

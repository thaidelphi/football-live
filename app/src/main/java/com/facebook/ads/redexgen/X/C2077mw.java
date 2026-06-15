package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.mw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2077mw extends BY {
    public final /* synthetic */ C2076mv A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C2077mw(C2076mv c2076mv, Map map, Map map2) {
        this.A00 = c2076mv;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C2063mi c2063mi;
        C1900k1 c1900k1;
        C2063mi c2063mi2;
        c2063mi = this.A00.A01;
        if (!TextUtils.isEmpty(c2063mi.A7E())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1900k1 = this.A00.A0A;
            A7 A0A = c1900k1.A0A();
            c2063mi2 = this.A00.A01;
            A0A.ABO(c2063mi2.A7E(), hashMap);
        }
    }
}

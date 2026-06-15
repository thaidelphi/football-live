package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class z implements af {

    /* renamed from: a  reason: collision with root package name */
    private final ai f21602a;

    public z(ai sessionDepthService) {
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        this.f21602a = sessionDepthService;
    }

    @Override // com.ironsource.af
    public void a(Map<String, Object> output) {
        kotlin.jvm.internal.n.f(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(fe.E0, Integer.valueOf(this.f21602a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(fe.E0, Integer.valueOf(this.f21602a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(fe.B0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(fe.E0, Integer.valueOf(this.f21602a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(fe.E0, Integer.valueOf(this.f21602a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}

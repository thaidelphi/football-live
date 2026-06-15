package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, s2> f19805a = new HashMap<>();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final s2 a(String adUnitId, List<? extends NetworkSettings> providers, int i10) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(providers, "providers");
        s2 s2Var = this.f19805a.get(adUnitId);
        if (s2Var == null) {
            s2 s2Var2 = new s2(providers, i10);
            this.f19805a.put(adUnitId, s2Var2);
            return s2Var2;
        }
        return s2Var;
    }
}

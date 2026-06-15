package com.ironsource;

import com.unity3d.mediation.LevelPlay;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class rp {

    /* renamed from: a  reason: collision with root package name */
    private final String f20009a;

    /* renamed from: b  reason: collision with root package name */
    private final LevelPlay.AdFormat f20010b;

    public rp(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f20009a = placementName;
        this.f20010b = adFormat;
    }

    public final String a() {
        return this.f20009a + '_' + this.f20010b;
    }
}

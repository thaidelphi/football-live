package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f19801a;

    public q(JSONObject adFormatAuctionSettings) {
        kotlin.jvm.internal.n.f(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f19801a = adFormatAuctionSettings.has("isLoadWhileShow") ? Boolean.valueOf(adFormatAuctionSettings.optBoolean("isLoadWhileShow")) : null;
    }

    public final Boolean a() {
        return this.f19801a;
    }
}

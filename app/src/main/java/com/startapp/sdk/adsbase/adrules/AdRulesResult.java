package com.startapp.sdk.adsbase.adrules;

import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdRulesResult implements Serializable {
    private static final long serialVersionUID = 6038458956238784052L;
    private String reason;
    private boolean shouldDisplayAd;

    public AdRulesResult() {
        throw null;
    }

    public AdRulesResult(String str, boolean z10) {
        this.shouldDisplayAd = z10;
        this.reason = str;
    }

    public final String a() {
        String str = this.reason;
        return str != null ? str.split(" ")[0] : "";
    }

    public final boolean b() {
        return this.shouldDisplayAd;
    }
}

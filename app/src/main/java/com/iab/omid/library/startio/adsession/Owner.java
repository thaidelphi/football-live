package com.iab.omid.library.startio.adsession;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum Owner {
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}

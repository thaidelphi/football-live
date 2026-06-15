package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class CustomEventExtras {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f11643a = new HashMap();

    public Object getExtra(String str) {
        return this.f11643a.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.f11643a.put(str, obj);
    }
}

package com.startapp;

import com.ironsource.b9;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements Comparable<e> {

    /* renamed from: a  reason: collision with root package name */
    public final long f21897a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public final AdPreferences.Placement f21898b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21899c;

    public e(AdPreferences.Placement placement, String str) {
        this.f21898b = placement;
        this.f21899c = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        int i10 = ((this.f21897a - eVar.f21897a) > 0L ? 1 : ((this.f21897a - eVar.f21897a) == 0L ? 0 : -1));
        if (i10 > 0) {
            return 1;
        }
        return i10 == 0 ? 0 : -1;
    }

    public final String toString() {
        return "AdDisplayEvent [displayTime=" + this.f21897a + ", placement=" + this.f21898b + ", adTag=" + this.f21899c + b9.i.f16698e;
    }
}

package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class HashAccumulator {
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    static int f11906b = 31;

    /* renamed from: a  reason: collision with root package name */
    private int f11907a = 1;

    @KeepForSdk
    public HashAccumulator a(Object obj) {
        this.f11907a = (f11906b * this.f11907a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @KeepForSdk
    public int b() {
        return this.f11907a;
    }

    public final HashAccumulator c(boolean z10) {
        this.f11907a = (f11906b * this.f11907a) + (z10 ? 1 : 0);
        return this;
    }
}

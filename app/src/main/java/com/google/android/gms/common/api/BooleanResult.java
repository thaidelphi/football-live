package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BooleanResult implements Result {

    /* renamed from: a  reason: collision with root package name */
    private final Status f12051a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12052b;

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public Status a() {
        return this.f12051a;
    }

    @KeepForSdk
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof BooleanResult) {
            BooleanResult booleanResult = (BooleanResult) obj;
            return this.f12051a.equals(booleanResult.f12051a) && this.f12052b == booleanResult.f12052b;
        }
        return false;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f12051a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f12052b ? 1 : 0);
    }
}

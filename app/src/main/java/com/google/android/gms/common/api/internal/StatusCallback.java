package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StatusCallback extends IStatusCallback.Stub {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    private final BaseImplementation.ResultHolder<Status> f12159a;

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @KeepForSdk
    public void P(Status status) {
        this.f12159a.a(status);
    }
}

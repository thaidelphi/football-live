package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class DataHolderResult implements Result, Releasable {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    protected final Status f12106a;
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    protected final DataHolder f12107b;

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public Status a() {
        return this.f12106a;
    }

    @Override // com.google.android.gms.common.api.Releasable
    @KeepForSdk
    public void release() {
        DataHolder dataHolder = this.f12107b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}

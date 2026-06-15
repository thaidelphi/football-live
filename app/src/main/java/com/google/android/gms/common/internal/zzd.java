package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzd extends zzac {

    /* renamed from: a  reason: collision with root package name */
    private BaseGmsClient f12612a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12613b;

    public zzd(BaseGmsClient baseGmsClient, int i10) {
        this.f12612a = baseGmsClient;
        this.f12613b = i10;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void Q(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void k(int i10, IBinder iBinder, Bundle bundle) {
        Preconditions.n(this.f12612a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f12612a.onPostInitHandler(i10, iBinder, bundle, this.f12613b);
        this.f12612a = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void o0(int i10, IBinder iBinder, zzk zzkVar) {
        BaseGmsClient baseGmsClient = this.f12612a;
        Preconditions.n(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.m(zzkVar);
        BaseGmsClient.zzj(baseGmsClient, zzkVar);
        k(i10, iBinder, zzkVar.f12619a);
    }
}

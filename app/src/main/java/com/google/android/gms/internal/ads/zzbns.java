package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbns extends zzcfl {
    private final AppMeasurementSdk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbns(AppMeasurementSdk appMeasurementSdk) {
        this.zza = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final int zzb(String str) throws RemoteException {
        return this.zza.l(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final long zzc() throws RemoteException {
        return this.zza.d();
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final Bundle zzd(Bundle bundle) throws RemoteException {
        return this.zza.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final String zze() throws RemoteException {
        return this.zza.e();
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final String zzf() throws RemoteException {
        return this.zza.f();
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final String zzg() throws RemoteException {
        return this.zza.h();
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final String zzh() throws RemoteException {
        return this.zza.i();
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final String zzi() throws RemoteException {
        return this.zza.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final List zzj(String str, String str2) throws RemoteException {
        return this.zza.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final Map zzk(String str, String str2, boolean z10) throws RemoteException {
        return this.zza.m(str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzl(String str) throws RemoteException {
        this.zza.a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzm(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzn(String str) throws RemoteException {
        this.zza.c(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzo(String str, String str2, Bundle bundle) throws RemoteException {
        this.zza.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zza.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzq(Bundle bundle) throws RemoteException {
        this.zza.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zza.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzs(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.zza.s(iObjectWrapper != null ? (Activity) ObjectWrapper.t0(iObjectWrapper) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfm
    public final void zzt(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.t(str, str2, iObjectWrapper != null ? ObjectWrapper.t0(iObjectWrapper) : null);
    }
}

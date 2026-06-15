package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbph extends zzboi {
    private final Adapter zza;
    private final zzbva zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbph(Adapter adapter, zzbva zzbvaVar) {
        this.zza = adapter;
        this.zzb = zzbvaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zze() throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zze(ObjectWrapper.u0(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzf() throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzf(ObjectWrapper.u0(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzg(int i10) throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzg(ObjectWrapper.u0(this.zza), i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzi(int i10, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzj(int i10) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzo() throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzi(ObjectWrapper.u0(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzp() throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzj(ObjectWrapper.u0(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzr(zzbfs zzbfsVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzs(zzbvb zzbvbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzt(zzbvf zzbvfVar) throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzm(ObjectWrapper.u0(this.zza), new zzbvb(zzbvfVar.zzf(), zzbvfVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzu() throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzn(ObjectWrapper.u0(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzv() throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzo(ObjectWrapper.u0(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzz() throws RemoteException {
        zzbva zzbvaVar = this.zzb;
        if (zzbvaVar != null) {
            zzbvaVar.zzp(ObjectWrapper.u0(this.zza));
        }
    }
}

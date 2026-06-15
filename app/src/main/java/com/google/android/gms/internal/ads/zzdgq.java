package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdgq extends com.google.android.gms.ads.internal.client.zzdz {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzea zzb;
    private final zzbos zzc;

    public zzdgq(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbos zzbosVar) {
        this.zzb = zzeaVar;
        this.zzc = zzbosVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzf() throws RemoteException {
        zzbos zzbosVar = this.zzc;
        if (zzbosVar != null) {
            return zzbosVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzg() throws RemoteException {
        zzbos zzbosVar = this.zzc;
        if (zzbosVar != null) {
            return zzbosVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzed zzi() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar != null) {
                return zzeaVar.zzi();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzj(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzm(com.google.android.gms.ads.internal.client.zzed zzedVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar != null) {
                zzeaVar.zzm(zzedVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}

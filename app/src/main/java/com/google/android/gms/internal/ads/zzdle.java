package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdle extends zzbgr {
    private final String zza;
    private final zzdgm zzb;
    private final zzdgr zzc;
    private final zzdqf zzd;

    public zzdle(String str, zzdgm zzdgmVar, zzdgr zzdgrVar, zzdqf zzdqfVar) {
        this.zza = str;
        this.zzb = zzdgmVar;
        this.zzc = zzdgrVar;
        this.zzd = zzdqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzB(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmP)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzC(Bundle bundle) throws RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzE(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        this.zzb.zzP(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzF(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        try {
            if (!zzdqVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.zzb.zzQ(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzG(zzbgp zzbgpVar) throws RemoteException {
        this.zzb.zzR(zzbgpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzI() throws RemoteException {
        return (this.zzc.zzH().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgD)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzber zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbev zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final zzbey zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.u0(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final List zzv() throws RemoteException {
        if (zzI()) {
            return this.zzc.zzH();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzw() throws RemoteException {
        this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzy(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        this.zzb.zzC(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }
}

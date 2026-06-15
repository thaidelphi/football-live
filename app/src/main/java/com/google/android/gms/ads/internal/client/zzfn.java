package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbvw;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfn extends zzbvh {
    private static void Z(final zzbvp zzbvpVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfm
            @Override // java.lang.Runnable
            public final void run() {
                zzbvp zzbvpVar2 = zzbvp.this;
                if (zzbvpVar2 != null) {
                    try {
                        zzbvpVar2.zze(1);
                    } catch (RemoteException e8) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzdx zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvf zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf(zzm zzmVar, zzbvp zzbvpVar) throws RemoteException {
        Z(zzbvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzg(zzm zzmVar, zzbvp zzbvpVar) throws RemoteException {
        Z(zzbvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi(zzdn zzdnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk(zzbvl zzbvlVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl(zzbvw zzbvwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp(zzbvq zzbvqVar) throws RemoteException {
    }
}

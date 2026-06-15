package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbod;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfj extends zzcx {

    /* renamed from: a  reason: collision with root package name */
    private zzbkt f11291a;

    public static /* synthetic */ void zzb(zzfj zzfjVar) {
        zzbkt zzbktVar = zzfjVar.f11291a;
        if (zzbktVar != null) {
            try {
                zzbktVar.zzb(Collections.emptyList());
            } catch (RemoteException e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onComplete event.", e8);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfi
            @Override // java.lang.Runnable
            public final void run() {
                zzfj.zzb(zzfj.this);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzm(zzdk zzdkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbod zzbodVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzq(float f10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs(zzbkt zzbktVar) throws RemoteException {
        this.f11291a = zzbktVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(zzfs zzfsVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzv() throws RemoteException {
        return false;
    }
}

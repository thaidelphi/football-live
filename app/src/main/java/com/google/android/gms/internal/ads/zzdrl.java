package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.nu;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdrl {
    private final zzbjn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrl(zzbjn zzbjnVar) {
        this.zza = zzbjnVar;
    }

    private final void zzs(zzdrj zzdrjVar) throws RemoteException {
        String zza = zzdrj.zza(zzdrjVar);
        String concat = "Dispatching AFMA event on publisher webview: ".concat(zza);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdrj(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("interstitial", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = nu.f19443f;
        this.zza.zzb(zzdrj.zza(zzdrjVar));
    }

    public final void zzc(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("interstitial", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = nu.f19444g;
        zzs(zzdrjVar);
    }

    public final void zzd(long j10, int i10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("interstitial", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onAdFailedToLoad";
        zzdrjVar.zzd = Integer.valueOf(i10);
        zzs(zzdrjVar);
    }

    public final void zze(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("interstitial", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = nu.f19447j;
        zzs(zzdrjVar);
    }

    public final void zzf(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("interstitial", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdrjVar);
    }

    public final void zzg(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("interstitial", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = nu.f19440c;
        zzs(zzdrjVar);
    }

    public final void zzh(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("creation", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "nativeObjectCreated";
        zzs(zzdrjVar);
    }

    public final void zzi(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("creation", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "nativeObjectNotCreated";
        zzs(zzdrjVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = nu.f19443f;
        zzs(zzdrjVar);
    }

    public final void zzk(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onRewardedAdClosed";
        zzs(zzdrjVar);
    }

    public final void zzl(long j10, zzbvf zzbvfVar) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onUserEarnedReward";
        zzdrjVar.zze = zzbvfVar.zzf();
        zzdrjVar.zzf = Integer.valueOf(zzbvfVar.zze());
        zzs(zzdrjVar);
    }

    public final void zzm(long j10, int i10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onRewardedAdFailedToLoad";
        zzdrjVar.zzd = Integer.valueOf(i10);
        zzs(zzdrjVar);
    }

    public final void zzn(long j10, int i10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onRewardedAdFailedToShow";
        zzdrjVar.zzd = Integer.valueOf(i10);
        zzs(zzdrjVar);
    }

    public final void zzo(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onAdImpression";
        zzs(zzdrjVar);
    }

    public final void zzp(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onRewardedAdLoaded";
        zzs(zzdrjVar);
    }

    public final void zzq(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdrjVar);
    }

    public final void zzr(long j10) throws RemoteException {
        zzdrj zzdrjVar = new zzdrj("rewarded", null);
        zzdrjVar.zza = Long.valueOf(j10);
        zzdrjVar.zzc = "onRewardedAdOpened";
        zzs(zzdrjVar);
    }
}

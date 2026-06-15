package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzegp extends zzboi {
    private final zzcud zza;
    private final zzdcc zzb;
    private final zzcux zzc;
    private final zzcvm zzd;
    private final zzcvr zze;
    private final zzczb zzf;
    private final zzcwl zzg;
    private final zzdcz zzh;
    private final zzcyx zzi;
    private final zzcus zzj;

    public zzegp(zzcud zzcudVar, zzdcc zzdccVar, zzcux zzcuxVar, zzcvm zzcvmVar, zzcvr zzcvrVar, zzczb zzczbVar, zzcwl zzcwlVar, zzdcz zzdczVar, zzcyx zzcyxVar, zzcus zzcusVar) {
        this.zza = zzcudVar;
        this.zzb = zzdccVar;
        this.zzc = zzcuxVar;
        this.zzd = zzcvmVar;
        this.zze = zzcvrVar;
        this.zzf = zzczbVar;
        this.zzg = zzcwlVar;
        this.zzh = zzdczVar;
        this.zzi = zzcyxVar;
        this.zzj = zzcusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdd();
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzf() {
        this.zzg.zzds(4);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzg(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzi(int i10, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    @Deprecated
    public final void zzj(int i10) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i10, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfbq.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzp() {
        this.zzg.zzdp();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzr(zzbfs zzbfsVar, String str) {
    }

    public void zzs(zzbvb zzbvbVar) {
    }

    public void zzt(zzbvf zzbvfVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() throws RemoteException {
    }

    public void zzw() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzx() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboj
    public final void zzy() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzz() {
        this.zzh.zzd();
    }
}

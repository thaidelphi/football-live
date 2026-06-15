package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzblh;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface zzbt extends IInterface {
    zzbq zze() throws RemoteException;

    void zzf(zzbfw zzbfwVar) throws RemoteException;

    void zzg(zzbfz zzbfzVar) throws RemoteException;

    void zzh(String str, zzbgf zzbgfVar, zzbgc zzbgcVar) throws RemoteException;

    void zzi(zzblh zzblhVar) throws RemoteException;

    void zzj(zzbgj zzbgjVar, zzr zzrVar) throws RemoteException;

    void zzk(zzbgm zzbgmVar) throws RemoteException;

    void zzl(zzbk zzbkVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbky zzbkyVar) throws RemoteException;

    void zzo(zzben zzbenVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcp zzcpVar) throws RemoteException;
}

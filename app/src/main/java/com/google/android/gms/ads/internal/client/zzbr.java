package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
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
public final class zzbr extends zzaxb implements zzbt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final zzbq zze() throws RemoteException {
        zzbq zzboVar;
        Parcel zzcZ = zzcZ(1, zza());
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzcZ.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(zzbfw zzbfwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbfz zzbfzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(String str, zzbgf zzbgfVar, zzbgc zzbgcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxd.zzf(zza, zzbgfVar);
        zzaxd.zzf(zza, zzbgcVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(zzblh zzblhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbgj zzbgjVar, zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbgjVar);
        zzaxd.zzd(zza, zzrVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbgm zzbgmVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbgmVar);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbkVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, adManagerAdViewOptions);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzbky zzbkyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzben zzbenVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzbenVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(zzcp zzcpVar) throws RemoteException {
        throw null;
    }
}

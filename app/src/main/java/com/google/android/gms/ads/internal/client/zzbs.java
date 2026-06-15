package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzblh;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzbs extends zzaxc implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbk zzbkVar = null;
        zzcp zzcpVar = null;
        switch (i10) {
            case 1:
                zzbq zze = zze();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbkVar = queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(readStrongBinder);
                }
                zzaxd.zzc(parcel);
                zzl(zzbkVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbfw zzb = zzbfv.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbfz zzb2 = zzbfy.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbgf zzb3 = zzbge.zzb(parcel.readStrongBinder());
                zzbgc zzb4 = zzbgb.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzaxd.zzc(parcel);
                zzo((zzben) zzaxd.zza(parcel, zzben.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface2 instanceof zzcp ? (zzcp) queryLocalInterface2 : new zzcp(readStrongBinder2);
                }
                zzaxd.zzc(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzaxd.zzc(parcel);
                zzj(zzbgi.zzb(parcel.readStrongBinder()), (zzr) zzaxd.zza(parcel, zzr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zzaxd.zzc(parcel);
                zzp((PublisherAdViewOptions) zzaxd.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zzbgm zzb5 = zzbgl.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzk(zzb5);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzaxd.zzc(parcel);
                zzn((zzbky) zzaxd.zza(parcel, zzbky.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzblh zzb6 = zzblg.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzi(zzb6);
                parcel2.writeNoException();
                return true;
            case 15:
                zzaxd.zzc(parcel);
                zzm((AdManagerAdViewOptions) zzaxd.zza(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}

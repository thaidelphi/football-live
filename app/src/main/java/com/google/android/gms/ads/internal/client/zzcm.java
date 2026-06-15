package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxm;
import com.google.android.gms.internal.ads.zzbxn;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzcm extends zzaxb implements zzco {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbt zzb(IObjectWrapper iObjectWrapper, String str, zzbod zzbodVar, int i10) throws RemoteException {
        zzbt zzbrVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(3, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbrVar = queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zzc(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbod zzbodVar, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzrVar);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(13, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zzd(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbod zzbodVar, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzrVar);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zze(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbod zzbodVar, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzrVar);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx zzf(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzd(zza, zzrVar);
        zza.writeString(str);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(10, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzg(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) throws RemoteException {
        zzch zzcfVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(18, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzh(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzcy zzcwVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(9, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzi(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) throws RemoteException {
        zzdt zzdrVar;
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(17, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbfc zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, iObjectWrapper2);
        Parcel zzcZ = zzcZ(5, zza);
        zzbfc zzdy = zzbfb.zzdy(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzdy;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbfi zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, iObjectWrapper2);
        zzaxd.zzf(zza, iObjectWrapper3);
        Parcel zzcZ = zzcZ(11, zza);
        zzbfi zze = zzbfh.zze(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbjq zzl(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10, zzbjn zzbjnVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        zzaxd.zzf(zza, zzbjnVar);
        Parcel zzcZ = zzcZ(16, zza);
        zzbjq zzb = zzbjp.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbrw zzm(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(15, zza);
        zzbrw zzb = zzbrv.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbsd zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(8, zza);
        zzbsd zzI = zzbsc.zzI(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbus zzo(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbvi zzp(IObjectWrapper iObjectWrapper, String str, zzbod zzbodVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(12, zza);
        zzbvi zzq = zzbvh.zzq(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbxn zzq(IObjectWrapper iObjectWrapper, zzbod zzbodVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zzaxd.zzf(zza, zzbodVar);
        zza.writeInt(250505300);
        Parcel zzcZ = zzcZ(14, zza);
        zzbxn zzb = zzbxm.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }
}

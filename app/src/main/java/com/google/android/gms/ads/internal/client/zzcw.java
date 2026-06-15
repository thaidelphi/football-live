package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbod;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzcw extends zzaxb implements zzcy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zze() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        ArrayList createTypedArrayList = zzcZ.createTypedArrayList(zzbkm.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzk() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzaxd.zzf(zza, iObjectWrapper);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzm(zzdk zzdkVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzdkVar);
        zzda(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbod zzbodVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbodVar);
        zzda(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(boolean z10) throws RemoteException {
        Parcel zza = zza();
        int i10 = zzaxd.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzq(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs(zzbkt zzbktVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzf(zza, zzbktVar);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(18, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(zzfs zzfsVar) throws RemoteException {
        Parcel zza = zza();
        zzaxd.zzd(zza, zzfsVar);
        zzda(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zzg = zzaxd.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}

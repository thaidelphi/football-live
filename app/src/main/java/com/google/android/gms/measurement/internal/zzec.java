package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzec extends com.google.android.gms.internal.measurement.zzbm implements zzee {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void D(zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void E(Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List F(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, z10);
        Parcel zzb = zzb(15, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzlc.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final byte[] J(zzaw zzawVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzawVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final String K(zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List N(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzac.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List c0(String str, String str2, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        Parcel zzb = zzb(16, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzac.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void i(zzaw zzawVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzawVar);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void j(zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void l(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j10);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void l0(zzac zzacVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzacVar);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void m(zzlc zzlcVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzlcVar);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void o(zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List p(String str, String str2, boolean z10, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, z10);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        Parcel zzb = zzb(14, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzlc.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void s(zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzqVar);
        zzc(18, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbtq extends zzaxc implements zzbtr {
    public zzbtq() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbtv zzbtvVar = null;
        zzbtw zzbtwVar = null;
        zzbtv zzbtvVar2 = null;
        zzbtv zzbtvVar3 = null;
        zzbtv zzbtvVar4 = null;
        switch (i10) {
            case 1:
                zzbtj zzbtjVar = (zzbtj) zzaxd.zza(parcel, zzbtj.CREATOR);
                zzaxd.zzc(parcel);
                parcel2.writeNoException();
                zzaxd.zze(parcel2, null);
                return true;
            case 2:
                zzbtj zzbtjVar2 = (zzbtj) zzaxd.zza(parcel, zzbtj.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzbts) {
                        zzbts zzbtsVar = (zzbts) queryLocalInterface;
                    }
                }
                zzaxd.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbud zzbudVar = (zzbud) zzaxd.zza(parcel, zzbud.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtvVar = queryLocalInterface2 instanceof zzbtv ? (zzbtv) queryLocalInterface2 : new zzbtt(readStrongBinder2);
                }
                zzaxd.zzc(parcel);
                zzg(zzbudVar, zzbtvVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbud zzbudVar2 = (zzbud) zzaxd.zza(parcel, zzbud.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtvVar4 = queryLocalInterface3 instanceof zzbtv ? (zzbtv) queryLocalInterface3 : new zzbtt(readStrongBinder3);
                }
                zzaxd.zzc(parcel);
                zzf(zzbudVar2, zzbtvVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbud zzbudVar3 = (zzbud) zzaxd.zza(parcel, zzbud.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtvVar3 = queryLocalInterface4 instanceof zzbtv ? (zzbtv) queryLocalInterface4 : new zzbtt(readStrongBinder4);
                }
                zzaxd.zzc(parcel);
                zze(zzbudVar3, zzbtvVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbtvVar2 = queryLocalInterface5 instanceof zzbtv ? (zzbtv) queryLocalInterface5 : new zzbtt(readStrongBinder5);
                }
                zzaxd.zzc(parcel);
                zzh(readString, zzbtvVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbtn zzbtnVar = (zzbtn) zzaxd.zza(parcel, zzbtn.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbtwVar = queryLocalInterface6 instanceof zzbtw ? (zzbtw) queryLocalInterface6 : new zzbtw(readStrongBinder6);
                }
                zzaxd.zzc(parcel);
                zzi(zzbtnVar, zzbtwVar);
                parcel2.writeNoException();
                return true;
        }
    }
}

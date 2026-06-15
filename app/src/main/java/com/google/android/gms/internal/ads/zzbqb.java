package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbqb extends zzaxc implements zzbqc {
    public zzbqb() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbqc ? (zzbqc) queryLocalInterface : new zzbqa(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbqf zzbqfVar = null;
        zzbpn zzbplVar = null;
        zzbpw zzbpuVar = null;
        zzbpq zzbpoVar = null;
        zzbpz zzbpxVar = null;
        zzbpw zzbpuVar2 = null;
        zzbpz zzbpxVar2 = null;
        zzbpt zzbprVar = null;
        zzbpq zzbpoVar2 = null;
        if (i10 == 1) {
            IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzaxd.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzaxd.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqfVar = queryLocalInterface instanceof zzbqf ? (zzbqf) queryLocalInterface : new zzbqd(readStrongBinder);
            }
            zzbqf zzbqfVar2 = zzbqfVar;
            zzaxd.zzc(parcel);
            zzh(Z, readString, bundle, bundle2, zzrVar, zzbqfVar2);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            zzbqr zzf = zzf();
            parcel2.writeNoException();
            zzaxd.zze(parcel2, zzf);
        } else if (i10 == 3) {
            zzbqr zzg = zzg();
            parcel2.writeNoException();
            zzaxd.zze(parcel2, zzg);
        } else if (i10 == 5) {
            com.google.android.gms.ads.internal.client.zzea zze = zze();
            parcel2.writeNoException();
            zzaxd.zzf(parcel2, zze);
        } else if (i10 == 10) {
            IObjectWrapper.Stub.Z(parcel.readStrongBinder());
            zzaxd.zzc(parcel);
            parcel2.writeNoException();
        } else if (i10 != 11) {
            switch (i10) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpoVar2 = queryLocalInterface2 instanceof zzbpq ? (zzbpq) queryLocalInterface2 : new zzbpo(readStrongBinder2);
                    }
                    zzbpq zzbpqVar = zzbpoVar2;
                    zzaxd.zzc(parcel);
                    zzj(readString2, readString3, zzmVar, Z2, zzbpqVar, zzboi.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzr) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z3 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbprVar = queryLocalInterface3 instanceof zzbpt ? (zzbpt) queryLocalInterface3 : new zzbpr(readStrongBinder3);
                    }
                    zzbpt zzbptVar = zzbprVar;
                    zzboj zzb = zzboi.zzb(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    zzl(readString4, readString5, zzmVar2, Z3, zzbptVar, zzb);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper Z4 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    boolean zzs = zzs(Z4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzs ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z5 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbpxVar2 = queryLocalInterface4 instanceof zzbpz ? (zzbpz) queryLocalInterface4 : new zzbpx(readStrongBinder4);
                    }
                    zzbpz zzbpzVar = zzbpxVar2;
                    zzboj zzb2 = zzboi.zzb(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    zzp(readString6, readString7, zzmVar3, Z5, zzbpzVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper Z6 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    boolean zzt = zzt(Z6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z7 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbpuVar2 = queryLocalInterface5 instanceof zzbpw ? (zzbpw) queryLocalInterface5 : new zzbpu(readStrongBinder5);
                    }
                    zzbpw zzbpwVar = zzbpuVar2;
                    zzboj zzb3 = zzboi.zzb(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    zzm(readString8, readString9, zzmVar4, Z7, zzbpwVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzaxd.zzc(parcel);
                    zzq(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z8 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbpxVar = queryLocalInterface6 instanceof zzbpz ? (zzbpz) queryLocalInterface6 : new zzbpx(readStrongBinder6);
                    }
                    zzbpz zzbpzVar2 = zzbpxVar;
                    zzboj zzb4 = zzboi.zzb(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    zzo(readString11, readString12, zzmVar5, Z8, zzbpzVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z9 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbpoVar = queryLocalInterface7 instanceof zzbpq ? (zzbpq) queryLocalInterface7 : new zzbpo(readStrongBinder7);
                    }
                    zzbpq zzbpqVar2 = zzbpoVar;
                    zzaxd.zzc(parcel);
                    zzk(readString13, readString14, zzmVar6, Z9, zzbpqVar2, zzboi.zzb(parcel.readStrongBinder()), (com.google.android.gms.ads.internal.client.zzr) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z10 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbpuVar = queryLocalInterface8 instanceof zzbpw ? (zzbpw) queryLocalInterface8 : new zzbpu(readStrongBinder8);
                    }
                    zzbpw zzbpwVar2 = zzbpuVar;
                    zzaxd.zzc(parcel);
                    zzn(readString15, readString16, zzmVar7, Z10, zzbpwVar2, zzboi.zzb(parcel.readStrongBinder()), (zzben) zzaxd.zza(parcel, zzben.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper Z11 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbplVar = queryLocalInterface9 instanceof zzbpn ? (zzbpn) queryLocalInterface9 : new zzbpl(readStrongBinder9);
                    }
                    zzbpn zzbpnVar = zzbplVar;
                    zzboj zzb5 = zzboi.zzb(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    zzi(readString17, readString18, zzmVar8, Z11, zzbpnVar, zzb5);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper Z12 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                    zzaxd.zzc(parcel);
                    boolean zzr = zzr(Z12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            Bundle[] bundleArr = (Bundle[]) parcel.createTypedArray(Bundle.CREATOR);
            zzaxd.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}

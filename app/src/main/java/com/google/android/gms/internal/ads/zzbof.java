package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzbof extends zzaxc implements zzbog {
    public zzbof() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzboj zzbojVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface instanceof zzboj ? (zzboj) queryLocalInterface : new zzboh(readStrongBinder);
                }
                zzboj zzbojVar2 = zzbojVar;
                zzaxd.zzc(parcel);
                zzu(Z, zzrVar, zzmVar, readString, zzbojVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzn);
                return true;
            case 3:
                IObjectWrapper Z2 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface2 instanceof zzboj ? (zzboj) queryLocalInterface2 : new zzboh(readStrongBinder2);
                }
                zzaxd.zzc(parcel);
                zzx(Z2, zzmVar2, readString2, zzbojVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper Z3 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface3 instanceof zzboj ? (zzboj) queryLocalInterface3 : new zzboh(readStrongBinder3);
                }
                zzboj zzbojVar3 = zzbojVar;
                zzaxd.zzc(parcel);
                zzv(Z3, zzrVar2, zzmVar3, readString3, readString4, zzbojVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper Z4 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface4 instanceof zzboj ? (zzboj) queryLocalInterface4 : new zzboh(readStrongBinder4);
                }
                zzboj zzbojVar4 = zzbojVar;
                zzaxd.zzc(parcel);
                zzy(Z4, zzmVar4, readString5, readString6, zzbojVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper Z5 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString7 = parcel.readString();
                zzbva zzb = zzbuz.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzaxd.zzc(parcel);
                zzp(Z5, zzmVar5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzaxd.zzc(parcel);
                zzs((com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzN = zzN();
                parcel2.writeNoException();
                int i12 = zzaxd.zza;
                parcel2.writeInt(zzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper Z6 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface5 instanceof zzboj ? (zzboj) queryLocalInterface5 : new zzboh(readStrongBinder5);
                }
                zzboj zzbojVar5 = zzbojVar;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzaxd.zzc(parcel);
                zzz(Z6, zzmVar6, readString10, readString11, zzbojVar5, (zzben) zzaxd.zza(parcel, zzben.CREATOR), createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, null);
                return true;
            case 17:
                Bundle zze = zze();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zze);
                return true;
            case 18:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzf);
                return true;
            case 19:
                Bundle zzg = zzg();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzg);
                return true;
            case 20:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzaxd.zzc(parcel);
                zzB((com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR), readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper Z7 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzD(Z7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i13 = zzaxd.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper Z8 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbva zzb2 = zzbuz.zzb(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzaxd.zzc(parcel);
                zzr(Z8, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbfs zzi = zzi();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzi);
                return true;
            case 25:
                boolean zzg2 = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzG(zzg2);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzh = zzh();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzh);
                return true;
            case 27:
                zzbos zzk = zzk();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzk);
                return true;
            case 28:
                IObjectWrapper Z9 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface6 instanceof zzboj ? (zzboj) queryLocalInterface6 : new zzboh(readStrongBinder6);
                }
                zzaxd.zzc(parcel);
                zzA(Z9, zzmVar7, readString14, zzbojVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper Z10 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzK(Z10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper Z11 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzbkq zzb3 = zzbkp.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbkw.CREATOR);
                zzaxd.zzc(parcel);
                zzq(Z11, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper Z12 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface7 instanceof zzboj ? (zzboj) queryLocalInterface7 : new zzboh(readStrongBinder7);
                }
                zzaxd.zzc(parcel);
                zzC(Z12, zzmVar8, readString15, zzbojVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbqr zzl = zzl();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzl);
                return true;
            case 34:
                zzbqr zzm = zzm();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzm);
                return true;
            case 35:
                IObjectWrapper Z13 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface8 instanceof zzboj ? (zzboj) queryLocalInterface8 : new zzboh(readStrongBinder8);
                }
                zzboj zzbojVar6 = zzbojVar;
                zzaxd.zzc(parcel);
                zzw(Z13, zzrVar3, zzmVar9, readString16, readString17, zzbojVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbom zzj = zzj();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzj);
                return true;
            case 37:
                IObjectWrapper Z14 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzJ(Z14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper Z15 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzaxd.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbojVar = queryLocalInterface9 instanceof zzboj ? (zzboj) queryLocalInterface9 : new zzboh(readStrongBinder9);
                }
                zzaxd.zzc(parcel);
                zzt(Z15, zzmVar10, readString18, zzbojVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper Z16 = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzH(Z16);
                parcel2.writeNoException();
                return true;
        }
    }
}

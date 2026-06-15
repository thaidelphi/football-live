package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzazg;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbuv;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class zzbw extends zzaxc implements zzbx {
    public zzbw() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbx zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    protected final boolean zzdD(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbk zzbkVar = null;
        zzcs zzcsVar = null;
        zzbn zzbnVar = null;
        zzdq zzdqVar = null;
        zzcb zzcbVar = null;
        zzcp zzcpVar = null;
        zzbh zzbhVar = null;
        zzcl zzclVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzaa = zzaa();
                parcel2.writeNoException();
                int i12 = zzaxd.zza;
                parcel2.writeInt(zzaa ? 1 : 0);
                return true;
            case 4:
                zzaxd.zzc(parcel);
                boolean zzab = zzab((zzm) zzaxd.zza(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbkVar = queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(readStrongBinder);
                }
                zzaxd.zzc(parcel);
                zzD(zzbkVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzclVar = queryLocalInterface2 instanceof zzcl ? (zzcl) queryLocalInterface2 : new zzcj(readStrongBinder2);
                }
                zzaxd.zzc(parcel);
                zzG(zzclVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzg = zzg();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzg);
                return true;
            case 13:
                zzaxd.zzc(parcel);
                zzF((zzr) zzaxd.zza(parcel, zzr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsm zzb = zzbsl.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbsp zzb2 = zzbso.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzaxd.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbch zzb3 = zzbcg.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbhVar = queryLocalInterface3 instanceof zzbh ? (zzbh) queryLocalInterface3 : new zzbf(readStrongBinder3);
                }
                zzaxd.zzc(parcel);
                zzC(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface4 instanceof zzcp ? (zzcp) queryLocalInterface4 : new zzcp(readStrongBinder4);
                }
                zzaxd.zzc(parcel);
                zzac(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzg2 = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzN(zzg2);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                int i13 = zzaxd.zza;
                parcel2.writeInt(zzZ ? 1 : 0);
                return true;
            case 24:
                zzbuv zzb4 = zzbuu.zzb(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzaxd.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea zzl = zzl();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzl);
                return true;
            case 29:
                zzaxd.zzc(parcel);
                zzU((zzfx) zzaxd.zza(parcel, zzfx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zzaxd.zzc(parcel);
                zzK((zzee) zzaxd.zza(parcel, zzee.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzcl zzj = zzj();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzj);
                return true;
            case 33:
                zzbk zzi = zzi();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzi);
                return true;
            case 34:
                boolean zzg3 = zzaxd.zzg(parcel);
                zzaxd.zzc(parcel);
                zzL(zzg3);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzcbVar = queryLocalInterface5 instanceof zzcb ? (zzcb) queryLocalInterface5 : new zzbz(readStrongBinder5);
                }
                zzaxd.zzc(parcel);
                zzE(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzaxd.zze(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzaxd.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzaxd.zzc(parcel);
                zzI((zzx) zzaxd.zza(parcel, zzx.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zzazh zze = zzazg.zze(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzk = zzk();
                parcel2.writeNoException();
                zzaxd.zzf(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdqVar = queryLocalInterface6 instanceof zzdq ? (zzdq) queryLocalInterface6 : new zzdo(readStrongBinder6);
                }
                zzaxd.zzc(parcel);
                zzP(zzdqVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar = (zzm) zzaxd.zza(parcel, zzm.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbnVar = queryLocalInterface7 instanceof zzbn ? (zzbn) queryLocalInterface7 : new zzbl(readStrongBinder7);
                }
                zzaxd.zzc(parcel);
                zzy(zzmVar, zzbnVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper Z = IObjectWrapper.Stub.Z(parcel.readStrongBinder());
                zzaxd.zzc(parcel);
                zzW(Z);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcsVar = queryLocalInterface8 instanceof zzcs ? (zzcs) queryLocalInterface8 : new zzcq(readStrongBinder8);
                }
                zzaxd.zzc(parcel);
                zzJ(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zzY = zzY();
                parcel2.writeNoException();
                int i14 = zzaxd.zza;
                parcel2.writeInt(zzY ? 1 : 0);
                return true;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbar;
import com.ironsource.b9;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdyy extends zzdyz {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcti zzd;
    private final TelephonyManager zze;
    private final zzdyq zzf;
    private zzbar.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbar.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbar.zzaf.zzd zzdVar = zzbar.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbar.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbar.zzaf.zzd zzdVar2 = zzbar.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbar.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyy(Context context, zzcti zzctiVar, zzdyq zzdyqVar, zzdym zzdymVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzdymVar, zzgVar);
        this.zzc = context;
        this.zzd = zzctiVar;
        this.zzf = zzdyqVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzbar.zzab zza(zzdyy zzdyyVar, Bundle bundle) {
        zzbar.zzab.zzb zzbVar;
        zzbar.zzab.zza zza = zzbar.zzab.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            zzdyyVar.zzg = zzbar.zzq.ENUM_TRUE;
        } else {
            zzdyyVar.zzg = zzbar.zzq.ENUM_FALSE;
            if (i10 == 0) {
                zza.zzd(zzbar.zzab.zzc.CELL);
            } else if (i10 != 1) {
                zza.zzd(zzbar.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zza.zzd(zzbar.zzab.zzc.WIFI);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbar.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbar.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbar.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbar.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zza.zzc(zzbVar);
        }
        return zza.zzbr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzbar.zzaf.zzd zzb(zzdyy zzdyyVar, Bundle bundle) {
        return (zzbar.zzaf.zzd) zzb.get(zzfbd.zza(zzfbd.zza(bundle, b9.h.G), "network").getInt("active_network_state", -1), zzbar.zzaf.zzd.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ byte[] zze(zzdyy zzdyyVar, boolean z10, ArrayList arrayList, zzbar.zzab zzabVar, zzbar.zzaf.zzd zzdVar) {
        zzbar.zzaf.zza.C0180zza zzn = zzbar.zzaf.zza.zzn();
        zzn.zzn(arrayList);
        zzn.zzD(zzg(Settings.Global.getInt(zzdyyVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzn.zzE(com.google.android.gms.ads.internal.zzv.zzr().zzg(zzdyyVar.zzc, zzdyyVar.zze));
        zzn.zzM(zzdyyVar.zzf.zze());
        zzn.zzL(zzdyyVar.zzf.zzb());
        zzn.zzG(zzdyyVar.zzf.zza());
        zzn.zzH(zzdVar);
        zzn.zzJ(zzabVar);
        zzn.zzK(zzdyyVar.zzg);
        zzn.zzN(zzg(z10));
        zzn.zzP(zzdyyVar.zzf.zzd());
        zzn.zzO(com.google.android.gms.ads.internal.zzv.zzC().a());
        zzn.zzQ(zzg(Settings.Global.getInt(zzdyyVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return zzn.zzbr().zzaV();
    }

    private static final zzbar.zzq zzg(boolean z10) {
        return z10 ? zzbar.zzq.ENUM_TRUE : zzbar.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z10) {
        zzgap.zzr(this.zzd.zzb(new Bundle()), new zzdyx(this, z10), zzbyp.zzg);
    }
}

package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzdpz;
import com.google.android.gms.internal.ads.zzdqk;
import com.google.android.gms.internal.ads.zzfap;
import com.google.android.gms.internal.ads.zzffs;
import com.ironsource.ho;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(zzdqk zzdqkVar, zzdpz zzdpzVar, String str, Pair... pairArr) {
        ConcurrentHashMap zzc = zzdqkVar.zzc();
        b(zzc, "action", str);
        for (Pair pair : pairArr) {
            b(zzc, (String) pair.first, (String) pair.second);
        }
        zzdqkVar.zzg(zzc);
    }

    private static void b(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzffs zza(Bundle bundle) {
        char c10;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzffs.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return zzffs.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return zzffs.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return zzffs.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return zzffs.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return zzffs.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return zzffs.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return zzffs.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return zzffs.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return zzffs.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzffs.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzb(String str) {
        char c10;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return ho.f17693e;
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzd(final zzdqk zzdqkVar, zzdpz zzdpzVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgN)).booleanValue()) {
            zzbyp.zza.execute(new Runnable(null, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                public final /* synthetic */ String zzb;
                public final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaa.a(zzdqk.this, null, this.zzb, this.zzc);
                }
            });
        }
    }

    public static int zzf(zzfap zzfapVar) {
        if (zzfapVar.zzr) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfapVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}

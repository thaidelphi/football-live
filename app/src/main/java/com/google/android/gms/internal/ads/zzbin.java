package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.b9;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbin {
    public static final zzbio zza = new zzbio() { // from class: com.google.android.gms.internal.ads.zzbhl
        @Override // com.google.android.gms.internal.ads.zzbio
        public final void zza(Object obj, Map map) {
            zzcex zzcexVar = (zzcex) obj;
            zzbio zzbioVar = zzbin.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcexVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzblj) zzcexVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbio zzb = new zzbio() { // from class: com.google.android.gms.internal.ads.zzbhn
        @Override // com.google.android.gms.internal.ads.zzbio
        public final void zza(Object obj, Map map) {
            zzcex zzcexVar = (zzcex) obj;
            zzbio zzbioVar = zzbin.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzig)).booleanValue()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get(b9.h.V);
            if (TextUtils.isEmpty(str)) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcexVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzblj) zzcexVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbio zzc = new zzbio() { // from class: com.google.android.gms.internal.ads.zzbhq
        @Override // com.google.android.gms.internal.ads.zzbio
        public final void zza(Object obj, Map map) {
            zzbin.zzb((zzcex) obj, map);
        }
    };
    public static final zzbio zzd = new zzbif();
    public static final zzbio zze = new zzbig();
    public static final zzbio zzf = new zzbio() { // from class: com.google.android.gms.internal.ads.zzbhr
        @Override // com.google.android.gms.internal.ads.zzbio
        public final void zza(Object obj, Map map) {
            zzcex zzcexVar = (zzcex) obj;
            zzbio zzbioVar = zzbin.zza;
            String str = (String) map.get("u");
            if (str == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                return;
            }
            zzcdh zzcdhVar = (zzcdh) zzcexVar;
            new com.google.android.gms.ads.internal.util.zzbw(zzcexVar.getContext(), ((zzcfe) zzcexVar).zzm().afmaVersion, str, null, zzcdhVar.zzD() != null ? zzcdhVar.zzD().zzax : null).zzb();
        }
    };
    public static final zzbio zzg = new zzbih();
    public static final zzbio zzh = new zzbii();
    public static final zzbio zzi = new zzbio() { // from class: com.google.android.gms.internal.ads.zzbho
        @Override // com.google.android.gms.internal.ads.zzbio
        public final void zza(Object obj, Map map) {
            zzcfd zzcfdVar = (zzcfd) obj;
            zzbio zzbioVar = zzbin.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzauc zzI = zzcfdVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbio zzj = new zzbij();
    public static final zzbio zzk = new zzbik();
    public static final zzbio zzl = new zzcbl();
    public static final zzbio zzm = new zzcbm();
    public static final zzbio zzn = new zzbhh();
    public static final zzbje zzo = new zzbje();
    public static final zzbio zzp = new zzbil();
    public static final zzbio zzq = new zzbim();
    public static final zzbio zzr = new zzbhs();
    public static final zzbio zzs = new zzbht();
    public static final zzbio zzt = new zzbhu();
    public static final zzbio zzu = new zzbhv();
    public static final zzbio zzv = new zzbhw();
    public static final zzbio zzw = new zzbhx();
    public static final zzbio zzx = new zzbhy();
    public static final zzbio zzy = new zzbhz();
    public static final zzbio zzz = new zzbia();
    public static final zzbio zzA = new zzbib();
    public static final zzbio zzB = new zzbid();
    public static final zzbio zzC = new zzbie();

    public static b6.a zza(zzcdq zzcdqVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzauc zzI = zzcdqVar.zzI();
            zzfat zzS = zzcdqVar.zzS();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlT)).booleanValue() && zzS != null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzS.zza(parse, zzcdqVar.getContext(), zzcdqVar.zzF(), zzcdqVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzcdqVar.getContext(), zzcdqVar.zzF(), zzcdqVar.zzi());
            }
        } catch (zzaud unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(concat);
        }
        Map hashMap = new HashMap();
        if (zzcdqVar.zzD() != null) {
            hashMap = zzcdqVar.zzD().zzaw;
        }
        final String zzb2 = zzbxd.zzb(parse, zzcdqVar.getContext(), hashMap);
        long longValue = ((Long) zzbdl.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 250505301) {
            zzgag zzu2 = zzgag.zzu(zzcdqVar.zzT());
            zzfsk zzfskVar = new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbhi
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbio zzbioVar = zzbin.zza;
                    if (((Boolean) zzbdl.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzgba zzgbaVar = zzbyp.zzg;
            return (zzgag) zzgap.zze((zzgag) zzgap.zzm((zzgag) zzgap.zze(zzu2, Throwable.class, zzfskVar, zzgbaVar), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbhj
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    zzbio zzbioVar = zzbin.zza;
                    String str3 = zzb2;
                    if (str2 != null) {
                        if (((Boolean) zzbdl.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str3).getHost();
                            for (int i11 = 0; i11 < 3; i11++) {
                                if (!host.endsWith(strArr[i11])) {
                                }
                            }
                        }
                        String str4 = (String) zzbdl.zza.zze();
                        String str5 = (String) zzbdl.zzb.zze();
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str3.replace(str4, str2);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str3);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                            }
                        }
                    }
                    return str3;
                }
            }, zzgbaVar), Throwable.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbhk
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbio zzbioVar = zzbin.zza;
                    if (((Boolean) zzbdl.zzi.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation2");
                    }
                    return zzb2;
                }
            }, zzgbaVar);
        }
        return zzgap.zzh(zzb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        r0 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcex r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbin.zzb(com.google.android.gms.internal.ads.zzcex, java.util.Map):void");
    }

    public static void zzc(Map map, zzdce zzdceVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkG)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdceVar != null) {
            zzdceVar.zzdd();
        }
    }
}

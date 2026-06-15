package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzerc implements zzerw {
    public static final /* synthetic */ int zzb = 0;
    private static final zzerd zzc = new zzerd(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgba zzd;
    private final ScheduledExecutorService zze;
    private final zzeho zzf;
    private final Context zzg;
    private final zzfap zzh;
    private final zzehk zzi;
    private final zzdnv zzj;
    private final zzdsl zzk;
    private final int zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerc(zzgba zzgbaVar, ScheduledExecutorService scheduledExecutorService, String str, zzeho zzehoVar, Context context, zzfap zzfapVar, zzehk zzehkVar, zzdnv zzdnvVar, zzdsl zzdslVar, int i10) {
        this.zzd = zzgbaVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzehoVar;
        this.zzg = context;
        this.zzh = zzfapVar;
        this.zzi = zzehkVar;
        this.zzj = zzdnvVar;
        this.zzk = zzdslVar;
        this.zzl = i10;
    }

    public static /* synthetic */ b6.a zzc(zzerc zzercVar) {
        String str;
        final Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkP)).booleanValue()) {
            str = zzercVar.zzh.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzercVar.zzh.zzf;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbL)).booleanValue()) {
            bundle = zzercVar.zzk.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbU)).booleanValue()) {
            for (Map.Entry entry : ((zzfvy) zzercVar.zzf.zzb(zzercVar.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzercVar.zzg(str2, (List) entry.getValue(), zzercVar.zzf(str2), true, true));
            }
            zzercVar.zzi(arrayList, zzercVar.zzf.zzc());
        } else {
            zzercVar.zzi(arrayList, zzercVar.zzf.zza(zzercVar.zza, str));
        }
        return zzgap.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = zzerc.zzb;
                JSONArray jSONArray = new JSONArray();
                for (b6.a aVar : arrayList) {
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzerd(jSONArray.toString(), bundle);
            }
        }, zzercVar.zzd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ b6.a zzd(final com.google.android.gms.internal.ads.zzerc r8, java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            com.google.android.gms.internal.ads.zzbyu r7 = new com.google.android.gms.internal.ads.zzbyu
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbbd r13 = com.google.android.gms.internal.ads.zzbbm.zzbM
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r13 = r1.zzb(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzehk r13 = r8.zzi
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzehk r13 = r8.zzi
            com.google.android.gms.internal.ads.zzbqc r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdnv r13 = r8.zzj     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbqc r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbbd r8 = com.google.android.gms.internal.ads.zzbbm.zzbC
            com.google.android.gms.internal.ads.zzbbk r10 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r10.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L4d
            com.google.android.gms.internal.ads.zzehr.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzehr r6 = new com.google.android.gms.internal.ads.zzehr
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()
            long r4 = r0.b()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbbd r9 = com.google.android.gms.internal.ads.zzbbm.zzbH
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r0.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zze
            com.google.android.gms.internal.ads.zzerb r0 = new com.google.android.gms.internal.ads.zzerb
            r0.<init>()
            com.google.android.gms.internal.ads.zzbbd r1 = com.google.android.gms.internal.ads.zzbbm.zzbA
            com.google.android.gms.internal.ads.zzbbk r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbbd r9 = com.google.android.gms.internal.ads.zzbbm.zzbO
            com.google.android.gms.internal.ads.zzbbk r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r12.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgba r9 = r8.zzd
            com.google.android.gms.internal.ads.zzeqy r12 = new com.google.android.gms.internal.ads.zzeqy
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.zzh(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerc.zzd(com.google.android.gms.internal.ads.zzerc, java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):b6.a");
    }

    public static /* synthetic */ void zze(zzerc zzercVar, zzbqc zzbqcVar, Bundle bundle, List list, zzehr zzehrVar, zzbyu zzbyuVar) {
        try {
            zzercVar.zzh(zzbqcVar, bundle, list, zzehrVar);
        } catch (RemoteException e8) {
            zzbyuVar.zzd(e8);
        }
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgag zzg(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgag zzu = zzgag.zzu(zzgap.zzk(new zzfzv() { // from class: com.google.android.gms.internal.ads.zzeqz
            @Override // com.google.android.gms.internal.ads.zzfzv
            public final b6.a zza() {
                return zzerc.zzd(zzerc.this, str, list, bundle, z10, z11);
            }
        }, this.zzd));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbH)).booleanValue()) {
            zzu = (zzgag) zzgap.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbA)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgag) zzgap.zze(zzu, Throwable.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i10 = zzerc.zzb;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmS)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.zzd);
    }

    private final void zzh(zzbqc zzbqcVar, Bundle bundle, List list, zzehr zzehrVar) throws RemoteException {
        zzbqcVar.zzh(ObjectWrapper.u0(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzehrVar);
    }

    private final void zzi(List list, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzehs zzehsVar = (zzehs) entry.getValue();
            String str = zzehsVar.zza;
            list.add(zzg(str, Collections.singletonList(zzehsVar.zze), zzf(str), zzehsVar.zzb, zzehsVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        if (this.zzl == 2) {
            return zzgap.zzh(zzc);
        }
        zzfap zzfapVar = this.zzh;
        if (zzfapVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbN)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfapVar.zzd)))) {
                return zzgap.zzh(zzc);
            }
        }
        return zzgap.zzk(new zzfzv() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // com.google.android.gms.internal.ads.zzfzv
            public final b6.a zza() {
                return zzerc.zzc(zzerc.this);
            }
        }, this.zzd);
    }
}

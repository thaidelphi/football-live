package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwi implements zzbwn {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhag zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbwk zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbwi(Context context, VersionInfoParcel versionInfoParcel, zzbwk zzbwkVar, String str, zzbwj zzbwjVar) {
        Preconditions.n(zzbwkVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbwkVar;
        for (String str2 : zzbwkVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhag zzc2 = zzhcf.zzc();
        zzc2.zzn(9);
        zzc2.zzj(str);
        zzc2.zzh(str);
        zzhah zzc3 = zzhai.zzc();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        zzc2.zzg((zzhai) zzc3.zzbr());
        zzhbw zzc4 = zzhbx.zzc();
        zzc4.zzc(Wrappers.a(this.zzh).g());
        String str4 = versionInfoParcel.afmaVersion;
        if (str4 != null) {
            zzc4.zza(str4);
        }
        long b10 = GoogleApiAvailabilityLight.h().b(this.zzh);
        if (b10 > 0) {
            zzc4.zzb(b10);
        }
        zzc2.zzf((zzhbx) zzc4.zzbr());
        this.zzd = zzc2;
    }

    public static /* synthetic */ b6.a zzb(zzbwi zzbwiVar, Map map) {
        zzhbu zzhbuVar;
        b6.a zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (zzbwiVar.zzj) {
                            int length = optJSONArray.length();
                            synchronized (zzbwiVar.zzj) {
                                zzhbuVar = (zzhbu) zzbwiVar.zze.get(str);
                            }
                            if (zzhbuVar == null) {
                                zzbwm.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i10 = 0; i10 < length; i10++) {
                                    zzhbuVar.zza(optJSONArray.getJSONObject(i10).getString("threat_type"));
                                }
                                zzbwiVar.zza = (length > 0) | zzbwiVar.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e8) {
                if (((Boolean) zzbdu.zza.zze()).booleanValue()) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get SafeBrowsing metadata", e8);
                }
                return zzgap.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (zzbwiVar.zza) {
            synchronized (zzbwiVar.zzj) {
                zzbwiVar.zzd.zzn(10);
            }
        }
        boolean z10 = zzbwiVar.zza;
        if ((z10 && zzbwiVar.zzi.zzg) || ((zzbwiVar.zzm && zzbwiVar.zzi.zzf) || (!z10 && zzbwiVar.zzi.zzd))) {
            synchronized (zzbwiVar.zzj) {
                for (zzhbu zzhbuVar2 : zzbwiVar.zze.values()) {
                    zzbwiVar.zzd.zzc((zzhbv) zzhbuVar2.zzbr());
                }
                zzbwiVar.zzd.zza(zzbwiVar.zzf);
                zzbwiVar.zzd.zzb(zzbwiVar.zzg);
                if (zzbwm.zzb()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzbwiVar.zzd.zzl() + "\n  clickUrl: " + zzbwiVar.zzd.zzk() + "\n  resources: \n");
                    for (zzhbv zzhbvVar : zzbwiVar.zzd.zzm()) {
                        sb.append("    [");
                        sb.append(zzhbvVar.zzc());
                        sb.append("] ");
                        sb.append(zzhbvVar.zzg());
                    }
                    zzbwm.zza(sb.toString());
                }
                b6.a zzb2 = new com.google.android.gms.ads.internal.util.zzbo(zzbwiVar.zzh).zzb(1, zzbwiVar.zzi.zzb, null, ((zzhcf) zzbwiVar.zzd.zzbr()).zzaV());
                if (zzbwm.zzb()) {
                    zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwf
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = zzbwi.zzb;
                            zzbwm.zza("Pinged SB successfully.");
                        }
                    }, zzbyp.zza);
                }
                zzm = zzgap.zzm(zzb2, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbwg
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        String str2 = (String) obj;
                        int i12 = zzbwi.zzb;
                        return null;
                    }
                }, zzbyp.zzg);
            }
            return zzm;
        }
        return zzgap.zzh(null);
    }

    public static /* synthetic */ void zzd(zzbwi zzbwiVar, Bitmap bitmap) {
        zzgva zzt = zzgvc.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (zzbwiVar.zzj) {
            zzhag zzhagVar = zzbwiVar.zzd;
            zzhbo zzc2 = zzhbq.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhagVar.zzi((zzhbq) zzc2.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final zzbwk zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zze(String str, Map map, int i10) {
        synchronized (this.zzj) {
            if (i10 == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i10 == 3) {
                    ((zzhbu) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhbu zzd = zzhbv.zzd();
            int zza = zzhbt.zza(i10);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zzb(this.zze.size());
            zzd.zzd(str);
            zzhat zzc2 = zzhaw.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhar zzc3 = zzhas.zzc();
                        zzc3.zza(zzgvc.zzw(str2));
                        zzc3.zzb(zzgvc.zzw(str3));
                        zzc2.zza((zzhas) zzc3.zzbr());
                    }
                }
            }
            zzd.zzc((zzhaw) zzc2.zzbr());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            b6.a zzh = zzgap.zzh(Collections.emptyMap());
            zzfzw zzfzwVar = new zzfzw() { // from class: com.google.android.gms.internal.ads.zzbwd
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    return zzbwi.zzb(zzbwi.this, (Map) obj);
                }
            };
            zzgba zzgbaVar = zzbyp.zzg;
            b6.a zzn = zzgap.zzn(zzh, zzfzwVar, zzgbaVar);
            b6.a zzo = zzgap.zzo(zzn, 10L, TimeUnit.SECONDS, zzbyp.zzd);
            zzgap.zzr(zzn, new zzbwh(this, zzo), zzgbaVar);
            zzc.add(zzo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbwk r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L85
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L85
            com.google.android.gms.ads.internal.zzv.zzq()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L73
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L36
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r4, r2)
        L36:
            if (r3 != 0) goto L72
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            if (r2 == 0) goto L61
            if (r3 != 0) goto L45
            goto L61
        L45:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L69
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L69
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L69
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L69
            r1 = r4
            goto L73
        L61:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.RuntimeException -> L69
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r8)     // Catch: java.lang.RuntimeException -> L69
            goto L73
        L69:
            r8 = move-exception
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r8)
            goto L73
        L72:
            r1 = r3
        L73:
            if (r1 != 0) goto L7b
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbwm.zza(r8)
            return
        L7b:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbwe r8 = new com.google.android.gms.internal.ads.zzbwe
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzh(r8)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwi.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final boolean zzi() {
        return PlatformVersion.d() && this.zzi.zzc && !this.zzl;
    }
}

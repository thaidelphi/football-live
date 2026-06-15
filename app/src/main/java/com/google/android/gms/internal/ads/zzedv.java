package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.ironsource.ls;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzedv implements zzedp {
    private final zzdfc zza;
    private final zzgba zzb;
    private final zzdjj zzc;
    private final zzfbo zzd;
    private final zzdma zze;
    private final zzdpz zzf;

    public zzedv(zzdfc zzdfcVar, zzgba zzgbaVar, zzdjj zzdjjVar, zzfbo zzfboVar, zzdma zzdmaVar, zzdpz zzdpzVar) {
        this.zza = zzdfcVar;
        this.zzb = zzgbaVar;
        this.zzc = zzdjjVar;
        this.zzd = zzfboVar;
        this.zze = zzdmaVar;
        this.zzf = zzdpzVar;
    }

    public static /* synthetic */ zzdgm zzc(zzedv zzedvVar, b6.a aVar, b6.a aVar2, zzfag zzfagVar, zzezu zzezuVar, JSONObject jSONObject) {
        zzdgr zzdgrVar = (zzdgr) aVar.get();
        zzdlu zzdluVar = (zzdlu) aVar2.get();
        zzbbd zzbbdVar = zzbbm.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzedvVar.zzf.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zzdgs zzd = zzedvVar.zza.zzd(new zzcqb(zzfagVar, zzezuVar, null), new zzdhd(zzdgrVar), new zzdfp(jSONObject, zzdluVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
            zzedvVar.zzf.zza().putLong(zzdpn.RENDERING_AD_COMPONENT_CREATION_END.zza(), a10);
            zzedvVar.zzf.zza().putLong(zzdpn.RENDERING_CONFIGURE_WEBVIEW_START.zza(), a10);
        }
        zzd.zzh().zzb();
        zzd.zzi().zza(zzdluVar);
        zzd.zzg().zzc(zzdgrVar.zzs());
        zzd.zzl().zza(zzedvVar.zze, zzdgrVar.zzq());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzedvVar.zzf.zza().putLong(zzdpn.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        return zzd.zza();
    }

    public static /* synthetic */ b6.a zzd(zzedv zzedvVar, zzfag zzfagVar, zzezu zzezuVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgap.zzg(new zzduh(3));
        }
        if (zzfagVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcn)).booleanValue()) {
                zzedvVar.zzf.zzc("nsl", String.valueOf(length));
            }
            zzedvVar.zzd.zzc(Math.min(length, zzfagVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfagVar.zza.zza.zzk);
            for (int i10 = 0; i10 < zzfagVar.zza.zza.zzk; i10++) {
                if (i10 < length) {
                    arrayList.add(zzedvVar.zzg(zzfagVar, zzezuVar, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(zzgap.zzg(new zzduh(3)));
                }
            }
            return zzgap.zzh(arrayList);
        }
        return zzgap.zzm(zzedvVar.zzg(zzfagVar, zzezuVar, jSONArray.getJSONObject(0)), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return Collections.singletonList(zzgap.zzh((zzdgm) obj));
            }
        }, zzedvVar.zzb);
    }

    public static /* synthetic */ b6.a zze(final zzedv zzedvVar, zzezu zzezuVar, final zzdlu zzdluVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziD)).booleanValue() && PlatformVersion.l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ls.f18303n, zzezuVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgap.zzn(zzdluVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzedr
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzedv.zzf(zzedv.this, zzdluVar, (JSONObject) obj);
            }
        }, zzedvVar.zzb);
    }

    public static /* synthetic */ b6.a zzf(zzedv zzedvVar, zzdlu zzdluVar, JSONObject jSONObject) {
        zzedvVar.zzd.zzb(zzgap.zzh(zzdluVar));
        if (jSONObject.optBoolean("success")) {
            return zzgap.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbmu("process json failed");
    }

    private final b6.a zzg(final zzfag zzfagVar, final zzezu zzezuVar, final JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcm)).booleanValue()) {
            this.zzf.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zzfbo zzfboVar = this.zzd;
        zzdjj zzdjjVar = this.zzc;
        final b6.a zza = zzfboVar.zza();
        final b6.a zzb = zzdjjVar.zzb(zzfagVar, zzezuVar, jSONObject);
        return zzgap.zzc(zza, zzb).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedv.zzc(zzedv.this, zzb, zza, zzfagVar, zzezuVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(final zzfag zzfagVar, final zzezu zzezuVar) {
        return zzgap.zzn(zzgap.zzn(this.zzd.zza(), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzedv.zze(zzedv.this, zzezuVar, (zzdlu) obj);
            }
        }, this.zzb), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzedt
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzedv.zzd(zzedv.this, zzfagVar, zzezuVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        zzezz zzezzVar = zzezuVar.zzs;
        return (zzezzVar == null || zzezzVar.zzc == null) ? false : true;
    }
}

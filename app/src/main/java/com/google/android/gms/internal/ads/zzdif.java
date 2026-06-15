package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.ironsource.ug;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdif {
    private final zzdnf zza;
    private final zzdlu zzb;
    private final zzcmj zzc;
    private final zzdgz zzd;

    public zzdif(zzdnf zzdnfVar, zzdlu zzdluVar, zzcmj zzcmjVar, zzdgz zzdgzVar) {
        this.zza = zzdnfVar;
        this.zzb = zzdluVar;
        this.zzc = zzcmjVar;
        this.zzd = zzdgzVar;
    }

    public static /* synthetic */ void zzb(zzdif zzdifVar, zzcdq zzcdqVar, Map map) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Hiding native ads overlay.");
        zzcdqVar.zzF().setVisibility(8);
        zzdifVar.zzc.zze(false);
    }

    public static /* synthetic */ void zzd(zzdif zzdifVar, zzcdq zzcdqVar, Map map) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Showing native ads overlay.");
        zzcdqVar.zzF().setVisibility(0);
        zzdifVar.zzc.zze(true);
    }

    public static /* synthetic */ void zze(zzdif zzdifVar, Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(ug.f21009x, (String) map.get(ug.f21009x));
        zzdifVar.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    public final View zza() throws zzcec {
        zzcdq zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzc(), null, null);
        zza.zzF().setVisibility(8);
        zza.zzag("/sendMessageToSdk", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdhz
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzcdq zzcdqVar = (zzcdq) obj;
                zzdif.this.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zza.zzag("/adMuted", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdia
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzcdq zzcdqVar = (zzcdq) obj;
                zzdif.this.zzd.zzh();
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/loadHtml", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdib
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, final Map map) {
                zzcdq zzcdqVar = (zzcdq) obj;
                zzcfi zzN = zzcdqVar.zzN();
                final zzdif zzdifVar = zzdif.this;
                zzN.zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzdie
                    @Override // com.google.android.gms.internal.ads.zzcfg
                    public final void zza(boolean z10, int i10, String str, String str2) {
                        zzdif.zze(zzdif.this, map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcdqVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcdqVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showOverlay", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdic
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzdif.zzd(zzdif.this, (zzcdq) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/hideOverlay", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdid
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzdif.zzb(zzdif.this, (zzcdq) obj, map);
            }
        });
        return zza.zzF();
    }
}

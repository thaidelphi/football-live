package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzblu implements zzblm, zzbll {
    private final zzcdq zza;

    public zzblu(Context context, VersionInfoParcel versionInfoParcel, zzauc zzaucVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcec {
        com.google.android.gms.ads.internal.zzv.zzA();
        zzcdq zza = zzced.zza(context, zzcfk.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbak.zza(), null, null, null, null);
        this.zza = zza;
        zza.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblq
            @Override // java.lang.Runnable
            public final void run() {
                zzblu.this.zza.zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblk.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblk.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblk.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblr
            @Override // java.lang.Runnable
            public final void run() {
                zzblu.this.zza.loadData(str, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblo
            @Override // java.lang.Runnable
            public final void run() {
                zzblu.this.zza.loadUrl(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbls
            @Override // java.lang.Runnable
            public final void run() {
                zzblu.this.zza.loadData(format, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final zzbmt zzj() {
        return new zzbmt(this);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzk(final zzblx zzblxVar) {
        zzcfi zzN = this.zza.zzN();
        Objects.requireNonNull(zzblxVar);
        zzN.zzJ(new zzcfh() { // from class: com.google.android.gms.internal.ads.zzblp
            @Override // com.google.android.gms.internal.ads.zzcfh
            public final void zza() {
                long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
                zzblx zzblxVar2 = zzblx.this;
                final long j10 = zzblxVar2.zzc;
                final ArrayList arrayList = zzblxVar2.zzb;
                arrayList.add(Long.valueOf(a10 - j10));
                String valueOf = String.valueOf(arrayList.get(0));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
                zzfpe zzfpeVar = com.google.android.gms.ads.internal.util.zzs.zza;
                final zzbmr zzbmrVar = zzblxVar2.zza;
                final zzbmq zzbmqVar = zzblxVar2.zzd;
                final zzblm zzblmVar = zzblxVar2.zze;
                zzfpeVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbly
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmr.zzi(zzbmr.this, zzbmqVar, zzblmVar, arrayList, j10);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzb)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzblk.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzq(String str, zzbio zzbioVar) {
        this.zza.zzag(str, new zzblt(this, zzbioVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final void zzr(String str, final zzbio zzbioVar) {
        this.zza.zzaA(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbln
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbio zzbioVar2;
                zzbio zzbioVar3 = (zzbio) obj;
                if (zzbioVar3 instanceof zzblt) {
                    zzbio zzbioVar4 = zzbio.this;
                    zzbioVar2 = ((zzblt) zzbioVar3).zzb;
                    return zzbioVar2.equals(zzbioVar4);
                }
                return false;
            }
        });
    }
}

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzfql;
import com.google.android.gms.internal.ads.zzfqm;
import com.google.android.gms.internal.ads.zzfqn;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfri;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzfrk;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzfry;
import com.ironsource.xn;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzz {

    /* renamed from: f  reason: collision with root package name */
    private zzfrj f11370f;

    /* renamed from: c  reason: collision with root package name */
    private zzcdq f11367c = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11369e = false;

    /* renamed from: a  reason: collision with root package name */
    private String f11365a = null;

    /* renamed from: d  reason: collision with root package name */
    private zzfqm f11368d = null;

    /* renamed from: b  reason: collision with root package name */
    private String f11366b = null;

    private final zzfrl e() {
        zzfrk zzc = zzfrl.zzc();
        if (!((Boolean) zzbd.zzc().zzb(zzbbm.zzlt)).booleanValue() || TextUtils.isEmpty(this.f11366b)) {
            String str = this.f11365a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.f11366b);
        }
        return zzc.zzc();
    }

    private final void f() {
        if (this.f11370f == null) {
            this.f11370f = new zzy(this);
        }
    }

    public static /* synthetic */ void zza(zzz zzzVar, String str, Map map) {
        zzcdq zzcdqVar = zzzVar.f11367c;
        if (zzcdqVar != null) {
            zzcdqVar.zzd(str, map);
        }
    }

    final void a(String str) {
        b(str, new HashMap());
    }

    final void b(final String str, final Map map) {
        zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzz.zza(zzz.this, str, map);
            }
        });
    }

    final void c(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.f11367c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            b("onError", hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(zzfri zzfriVar) {
        if (!TextUtils.isEmpty(zzfriVar.zzb())) {
            if (!((Boolean) zzbd.zzc().zzb(zzbbm.zzlt)).booleanValue()) {
                this.f11365a = zzfriVar.zzb();
            }
        }
        switch (zzfriVar.zza()) {
            case 8152:
                a("onLMDOverlayOpened");
                return;
            case 8153:
                a("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                a("onLMDOverlayClose");
                return;
            case 8157:
                this.f11365a = null;
                this.f11366b = null;
                this.f11369e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put(xn.a.f21422g, String.valueOf(zzfriVar.zza()));
                b("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final synchronized void zzb(zzcdq zzcdqVar, Context context) {
        this.f11367c = zzcdqVar;
        if (!zzk(context)) {
            c("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        b("on_play_store_bind", hashMap);
    }

    public final void zzc() {
        zzfqm zzfqmVar;
        if (this.f11369e && (zzfqmVar = this.f11368d) != null) {
            zzfqmVar.zza(e(), this.f11370f);
            a("onLMDOverlayCollapse");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzd() {
        zzfqm zzfqmVar;
        if (this.f11369e && (zzfqmVar = this.f11368d) != null) {
            zzfqk zzc = zzfql.zzc();
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzlt)).booleanValue() && !TextUtils.isEmpty(this.f11366b)) {
                zzc.zza(this.f11366b);
            } else {
                String str = this.f11365a;
                if (str != null) {
                    zzc.zzb(str);
                } else {
                    c("Missing session token and/or appId", "onLMDupdate");
                }
            }
            zzfqmVar.zzb(zzc.zzc(), this.f11370f);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzh() {
        zzfqm zzfqmVar;
        if (this.f11369e && (zzfqmVar = this.f11368d) != null) {
            zzfqmVar.zzc(e(), this.f11370f);
            a("onLMDOverlayExpand");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzj(zzcdq zzcdqVar, zzfrg zzfrgVar) {
        if (zzcdqVar == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.f11367c = zzcdqVar;
        if (!this.f11369e && !zzk(zzcdqVar.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzlt)).booleanValue()) {
            this.f11366b = zzfrgVar.zzh();
        }
        f();
        zzfqm zzfqmVar = this.f11368d;
        if (zzfqmVar != null) {
            zzfqmVar.zzd(zzfrgVar, this.f11370f);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (zzfry.zza(context)) {
            try {
                this.f11368d = zzfqn.zza(context);
            } catch (NullPointerException e8) {
                com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
            }
            if (this.f11368d == null) {
                this.f11369e = false;
                return false;
            }
            f();
            this.f11369e = true;
            return true;
        }
        return false;
    }
}

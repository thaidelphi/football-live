package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.ironsource.ug;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdin {
    private final zzdnf zza;
    private final zzdlu zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdin(zzdnf zzdnfVar, zzdlu zzdluVar) {
        this.zza = zzdnfVar;
        this.zzb = zzdluVar;
    }

    public static /* synthetic */ void zzb(zzdin zzdinVar, WindowManager windowManager, View view, zzcdq zzcdqVar, Map map) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Hide native ad policy validator overlay.");
        zzcdqVar.zzF().setVisibility(8);
        if (zzcdqVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcdqVar.zzF());
        }
        zzcdqVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (zzdinVar.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(zzdinVar.zzc);
    }

    public static /* synthetic */ void zzc(final zzdin zzdinVar, final View view, final WindowManager windowManager, final zzcdq zzcdqVar, final Map map) {
        int i10;
        zzcdqVar.zzN().zzC(new zzcfg() { // from class: com.google.android.gms.internal.ads.zzdil
            @Override // com.google.android.gms.internal.ads.zzcfg
            public final void zza(boolean z10, int i11, String str, String str2) {
                zzdin.zzd(zzdin.this, map, z10, i11, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhY)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhZ)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcdqVar.zzaj(zzcfk.zzb(zzf, zzf2));
        try {
            zzcdqVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzia)).booleanValue());
            zzcdqVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzib)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbv.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzcdqVar.zzF(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (!"1".equals(str) && !CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str)) {
                i10 = rect.top;
            } else {
                i10 = rect.bottom;
            }
            final int i11 = i10 - zzf4;
            zzdinVar.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdim
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcdq zzcdqVar2 = zzcdqVar;
                        if (zzcdqVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i12 = i11;
                        WindowManager.LayoutParams layoutParams = zzb;
                        String str2 = str;
                        if (!"1".equals(str2) && !CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str2)) {
                            layoutParams.y = rect2.top - i12;
                        } else {
                            layoutParams.y = rect2.bottom - i12;
                        }
                        windowManager.updateViewLayout(zzcdqVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(zzdinVar.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcdqVar.loadUrl(str2);
    }

    public static /* synthetic */ void zzd(zzdin zzdinVar, Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(ug.f21009x, (String) map.get(ug.f21009x));
        zzdinVar.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(context, i10);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcec {
        zzcdq zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzc(), null, null);
        zza.zzF().setVisibility(4);
        zza.zzF().setContentDescription("policy_validator");
        zza.zzag("/sendMessageToSdk", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdih
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzcdq zzcdqVar = (zzcdq) obj;
                zzdin.this.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zza.zzag("/hideValidatorOverlay", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdii
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzdin.zzb(zzdin.this, windowManager, view, (zzcdq) obj, map);
            }
        });
        zza.zzag("/open", new zzbja(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdij
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                zzdin.zzc(zzdin.this, view, windowManager, (zzcdq) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zza), "/showValidatorOverlay", new zzbio() { // from class: com.google.android.gms.internal.ads.zzdik
            @Override // com.google.android.gms.internal.ads.zzbio
            public final void zza(Object obj, Map map) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Show native ad policy validator overlay.");
                ((zzcdq) obj).zzF().setVisibility(0);
            }
        });
        return zza.zzF();
    }
}

package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.ironsource.dp;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfre {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfrw zzc = new zzfrw("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage(dp.f17077b);
    final zzfrv zza;
    private final String zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfra] */
    public zzfre(Context context) {
        if (zzfry.zza(context)) {
            this.zza = new zzfrv(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new Object() { // from class: com.google.android.gms.internal.ads.zzfra
            });
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    public static /* synthetic */ void zza(zzfre zzfreVar, zzfrl zzfrlVar, int i10, zzfrj zzfrjVar) {
        try {
            zzfrv zzfrvVar = zzfreVar.zza;
            Objects.requireNonNull(zzfrvVar);
            zzfpv zzfpvVar = (zzfpv) zzfrvVar.zzc();
            if (zzfpvVar == null) {
                return;
            }
            String str = zzfreVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i10);
            zzi(zzfrlVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqp
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i11 = zzfre.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfrlVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i11 = zzfre.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfpvVar.zzg(bundle, new zzfrd(zzfreVar, zzfrjVar));
        } catch (RemoteException e8) {
            zzc.zzb(e8, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), zzfreVar.zze);
        }
    }

    public static /* synthetic */ void zzb(zzfre zzfreVar, zzfql zzfqlVar, zzfrj zzfrjVar) {
        try {
            zzfrv zzfrvVar = zzfreVar.zza;
            Objects.requireNonNull(zzfrvVar);
            zzfpv zzfpvVar = (zzfpv) zzfrvVar.zzc();
            if (zzfpvVar == null) {
                return;
            }
            String str = zzfreVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzfqlVar.zzb(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqx
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfre.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfqlVar.zza(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqy
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfre.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzfpvVar.zze(bundle, new zzfrd(zzfreVar, zzfrjVar));
        } catch (RemoteException e8) {
            zzc.zzb(e8, "dismiss overlay display from: %s", zzfreVar.zze);
        }
    }

    public static /* synthetic */ void zzc(zzfre zzfreVar, zzfrg zzfrgVar, zzfrj zzfrjVar) {
        try {
            zzfrv zzfrvVar = zzfreVar.zza;
            Objects.requireNonNull(zzfrvVar);
            zzfpv zzfpvVar = (zzfpv) zzfrvVar.zzc();
            if (zzfpvVar == null) {
                return;
            }
            String str = zzfreVar.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzfrgVar.zzf());
            zzi(zzfrgVar.zzg(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfrc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfre.zzb;
                    bundle.putString("adFieldEnifd", (String) obj);
                }
            });
            bundle.putInt("layoutGravity", zzfrgVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzfrgVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzfrgVar.zze());
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfre.zzb;
                    bundle.putString("deeplinkUrl", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqr
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfre.zzb;
                    bundle.putString("sessionToken", (String) obj);
                }
            });
            zzi(zzfrgVar.zzh(), new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqs
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfre.zzb;
                    bundle.putString("appId", (String) obj);
                }
            });
            zzi(null, new Consumer() { // from class: com.google.android.gms.internal.ads.zzfqt
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i10 = zzfre.zzb;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzfpvVar.zzf(str, bundle, new zzfrd(zzfreVar, zzfrjVar));
        } catch (RemoteException e8) {
            zzc.zzb(e8, "show overlay display from: %s", zzfreVar.zze);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzh(String str) {
        return !zzk(str);
    }

    private static void zzi(String str, Consumer consumer) {
        if (zzk(str)) {
            return;
        }
        Objects.requireNonNull(str);
        consumer.accept(str.trim());
    }

    private static boolean zzj(zzfrj zzfrjVar, String str, List list) {
        if (list.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzfrb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zzfre.zzh((String) obj);
            }
        })) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzfrh zzc2 = zzfri.zzc();
        zzc2.zzb(8160);
        zzfrjVar.zza(zzc2.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzftm.zzc(str).trim().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd() {
        if (this.zza == null) {
            return;
        }
        zzc.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(final zzfql zzfqlVar, final zzfrj zzfrjVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfrjVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzfqlVar.zzb(), zzfqlVar.zza()))) {
            this.zza.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqu
                @Override // java.lang.Runnable
                public final void run() {
                    zzfre.zzb(zzfre.this, zzfqlVar, zzfrjVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(final zzfrg zzfrgVar, final zzfrj zzfrjVar) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfrjVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzfrgVar.zzh()))) {
            this.zza.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfre.zzc(zzfre.this, zzfrgVar, zzfrjVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(final zzfrl zzfrlVar, final zzfrj zzfrjVar, final int i10) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzfrjVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzfrlVar.zzb(), zzfrlVar.zza()))) {
            this.zza.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqw
                @Override // java.lang.Runnable
                public final void run() {
                    zzfre.zza(zzfre.this, zzfrlVar, i10, zzfrjVar);
                }
            });
        }
    }
}

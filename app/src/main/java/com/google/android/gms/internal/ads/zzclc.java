package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.Api;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclc {
    zzbtc zza;
    zzbtc zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzebc zze;
    private final zzdnk zzf;
    private final zzgba zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclc(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzebc zzebcVar, zzdnk zzdnkVar, zzgba zzgbaVar, zzgba zzgbaVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzebcVar;
        this.zzf = zzdnkVar;
        this.zzg = zzgbaVar;
        this.zzh = zzgbaVar2;
        this.zzi = scheduledExecutorService;
    }

    public static /* synthetic */ b6.a zzb(zzclc zzclcVar, final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkg), "1");
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkf), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkh))) {
                buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzki));
            }
            return (zzgag) zzgap.zzn(zzgag.zzu(zzclcVar.zze.zzb(buildUpon.build(), inputEvent)), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzcky
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    zzbbd zzbbdVar = zzbbm.zzkf;
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar), "12");
                    return zzgap.zzh(builder2.toString());
                }
            }, zzclcVar.zzh);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkf), "10");
        return zzgap.zzh(builder.toString());
    }

    public static /* synthetic */ b6.a zzc(final zzclc zzclcVar, String str, final Throwable th) {
        zzclcVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckv
            @Override // java.lang.Runnable
            public final void run() {
                zzclc.zzg(zzclc.this, th);
            }
        });
        return zzgap.zzh(str);
    }

    public static /* synthetic */ b6.a zzd(final zzclc zzclcVar, Uri.Builder builder, final Throwable th) {
        zzclcVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcku
            @Override // java.lang.Runnable
            public final void run() {
                zzclc.zzh(zzclc.this, th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkf), "9");
        return zzgap.zzh(builder.toString());
    }

    public static /* synthetic */ void zzg(zzclc zzclcVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkk)).booleanValue()) {
            zzbtc zzc = zzbta.zzc(zzclcVar.zzc);
            zzclcVar.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        zzbtc zza = zzbta.zza(zzclcVar.zzc);
        zzclcVar.zza = zza;
        zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    public static /* synthetic */ void zzh(zzclc zzclcVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkk)).booleanValue()) {
            zzbtc zzc = zzbta.zzc(zzclcVar.zzc);
            zzclcVar.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
            return;
        }
        zzbtc zza = zzbta.zza(zzclcVar.zzc);
        zzclcVar.zza = zza;
        zza.zzh(th, "AttributionReportingSampled");
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkd));
    }

    private final b6.a zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkd)) && !this.zzd.zzN()) {
                final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzke), String.valueOf(random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
                if (inputEvent == null) {
                    buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkf), "11");
                    return zzgap.zzh(buildUpon.toString());
                }
                return (zzgag) zzgap.zzf((zzgag) zzgap.zzn(zzgag.zzu(this.zze.zza()), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzckw
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        return zzclc.zzb(zzclc.this, buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzckx
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        return zzclc.zzd(zzclc.this, buildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            return zzgap.zzh(str);
        } catch (Exception e8) {
            return zzgap.zzg(e8);
        }
    }

    public final b6.a zze(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgap.zzh(str);
        }
        return zzgap.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzckt
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzclc.zzc(zzclc.this, str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final void zzi(String str, zzfhp zzfhpVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b6.a zzk = zzk(str, this.zzf.zza(), random);
        zzbbd zzbbdVar = zzbbm.zzkj;
        zzgap.zzr(zzgap.zzo(zzk, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzclb(this, zzfhpVar, str, zzvVar), this.zzg);
    }
}

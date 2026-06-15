package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbcl extends e {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdqf zzd;
    private f zze;
    private c zzf;

    public static /* synthetic */ void zzb(zzbcl zzbclVar, int i10) {
        zzdqf zzdqfVar = zzbclVar.zzd;
        if (zzdqfVar != null) {
            zzdqe zza2 = zzdqfVar.zza();
            zza2.zzb("action", "cct_nav");
            zza2.zzb("cct_navs", String.valueOf(i10));
            zza2.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Context context) {
        String c10;
        if (this.zzf != null || context == null || (c10 = c.c(context, null)) == null) {
            return;
        }
        c.a(context, c10, this);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        this.zzf = cVar;
        cVar.g(0L);
        this.zze = cVar.e(new zzbck(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final f zza() {
        if (this.zze == null) {
            zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcj
                @Override // java.lang.Runnable
                public final void run() {
                    r0.zzf(zzbcl.this.zzc);
                }
            });
        }
        return this.zze;
    }

    public final void zzd(Context context, zzdqf zzdqfVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdqfVar;
        zzf(context);
    }

    public final void zze(final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeG)).booleanValue() || this.zzd == null) {
            return;
        }
        zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbci
            @Override // java.lang.Runnable
            public final void run() {
                zzbcl.zzb(zzbcl.this, i10);
            }
        });
    }
}

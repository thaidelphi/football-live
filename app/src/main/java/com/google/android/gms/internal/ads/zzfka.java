package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfka {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfka zza = new zzfka();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfka zza() {
        return zza;
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        zzd(this.zzc, isDeviceLocked);
        this.zzd = isDeviceLocked;
    }

    public final void zzd(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.zzd || this.zzc)) {
            return;
        }
        for (zzfiz zzfizVar : zzfjq.zza().zzc()) {
            zzfizVar.zzg().zzm(z11 || z10);
        }
    }

    public final void zze(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfjz(this), intentFilter);
    }
}

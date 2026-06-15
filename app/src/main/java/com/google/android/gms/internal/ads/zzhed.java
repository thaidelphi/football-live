package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzhed extends e {
    private final WeakReference zza;

    public zzhed(zzbcn zzbcnVar) {
        this.zza = new WeakReference(zzbcnVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        zzbcn zzbcnVar = (zzbcn) this.zza.get();
        if (zzbcnVar != null) {
            zzbcnVar.zzc(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbcn zzbcnVar = (zzbcn) this.zza.get();
        if (zzbcnVar != null) {
            zzbcnVar.zzd();
        }
    }
}

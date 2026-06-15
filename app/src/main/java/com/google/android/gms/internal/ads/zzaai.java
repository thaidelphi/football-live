package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaai implements DisplayManager.DisplayListener {
    final /* synthetic */ zzaak zza;
    private final DisplayManager zzb;

    public zzaai(zzaak zzaakVar, DisplayManager displayManager) {
        this.zza = zzaakVar;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            zzaak.zzb(this.zza, zzc());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzeh.zzy(null));
        zzaak.zzb(this.zza, zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}

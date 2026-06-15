package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzzt extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzzr zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzt(zzzr zzzrVar, SurfaceTexture surfaceTexture, boolean z10, zzzs zzzsVar) {
        super(surfaceTexture);
        this.zzd = zzzrVar;
        this.zza = z10;
    }

    public static zzzt zza(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzcv.zzf(z11);
        return new zzzr().zza(z10 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        int i11;
        synchronized (zzzt.class) {
            if (!zzc) {
                if (zzde.zzb(context)) {
                    i11 = zzde.zzc() ? 1 : 2;
                } else {
                    i11 = 0;
                }
                zzb = i11;
                zzc = true;
            }
            i10 = zzb;
        }
        return i10 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}

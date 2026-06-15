package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzpe extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzz zzc;

    public zzpe(int i10, zzz zzzVar, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzzVar;
    }
}

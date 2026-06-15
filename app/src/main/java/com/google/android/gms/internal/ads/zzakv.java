package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzakv implements Comparable {
    public final int zza;
    public final zzakq zzb;

    public zzakv(int i10, zzakq zzakqVar) {
        this.zza = i10;
        this.zzb = zzakqVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzakv) obj).zza);
    }
}

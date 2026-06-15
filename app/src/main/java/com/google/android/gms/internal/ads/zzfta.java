package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfta extends zzfst {
    private final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfta(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfta) {
            return this.zza.equals(((zzfta) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "Optional.of(" + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final zzfst zza(zzfsk zzfskVar) {
        Object apply = zzfskVar.apply(this.zza);
        zzfsv.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfta(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final Object zzb(Object obj) {
        return this.zza;
    }
}

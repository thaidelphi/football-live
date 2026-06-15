package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgxz implements zzgyo {
    private final zzgxv zza;
    private final zzgza zzb;
    private final boolean zzc;
    private final zzgvv zzd;

    private zzgxz(zzgza zzgzaVar, zzgvv zzgvvVar, zzgxv zzgxvVar) {
        this.zzb = zzgzaVar;
        this.zzc = zzgxvVar instanceof zzgwg;
        this.zzd = zzgvvVar;
        this.zza = zzgxvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgxz zzc(zzgza zzgzaVar, zzgvv zzgvvVar, zzgxv zzgxvVar) {
        return new zzgxz(zzgzaVar, zzgvvVar, zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final int zza(Object obj) {
        int zzb = ((zzgwk) obj).zzt.zzb();
        return this.zzc ? zzb + ((zzgwg) obj).zza.zzd() : zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final int zzb(Object obj) {
        int hashCode = ((zzgwk) obj).zzt.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzgwg) obj).zza.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final Object zze() {
        zzgxv zzgxvVar = this.zza;
        return zzgxvVar instanceof zzgwk ? ((zzgwk) zzgxvVar).zzbj() : zzgxvVar.zzcX().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzg(Object obj, Object obj2) {
        zzgyq.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgyq.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzh(Object obj, zzgyi zzgyiVar, zzgvu zzgvuVar) throws IOException {
        this.zzb.zza(obj);
        zzgwg zzgwgVar = (zzgwg) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzguq zzguqVar) throws IOException {
        zzgwk zzgwkVar = (zzgwk) obj;
        if (zzgwkVar.zzt == zzgzb.zzc()) {
            zzgwkVar.zzt = zzgzb.zzf();
        }
        zzgwg zzgwgVar = (zzgwg) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final void zzj(Object obj, zzgzp zzgzpVar) throws IOException {
        Iterator zzf = ((zzgwg) obj).zza.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgvy zzgvyVar = (zzgvy) entry.getKey();
            if (zzgvyVar.zzc() == zzgzo.MESSAGE && !zzgvyVar.zze() && !zzgvyVar.zzd()) {
                if (entry instanceof zzgxc) {
                    zzgzpVar.zzw(zzgvyVar.zza(), ((zzgxc) entry).zza().zzb());
                } else {
                    zzgzpVar.zzw(zzgvyVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        ((zzgwk) obj).zzt.zzk(zzgzpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final boolean zzk(Object obj, Object obj2) {
        if (((zzgwk) obj).zzt.equals(((zzgwk) obj2).zzt)) {
            if (this.zzc) {
                return ((zzgwg) obj).zza.equals(((zzgwg) obj2).zza);
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyo
    public final boolean zzl(Object obj) {
        return ((zzgwg) obj).zza.zzi();
    }
}

package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzguw extends zzguz {
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzguw(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgvc.zzq(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzguz, com.google.android.gms.internal.ads.zzgvc
    public final byte zza(int i10) {
        zzgvc.zzy(i10, this.zzd);
        return ((zzguz) this).zza[this.zzc + i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzguz, com.google.android.gms.internal.ads.zzgvc
    public final byte zzb(int i10) {
        return ((zzguz) this).zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzguz
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzguz, com.google.android.gms.internal.ads.zzgvc
    public final int zzd() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzguz, com.google.android.gms.internal.ads.zzgvc
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(((zzguz) this).zza, this.zzc + i10, bArr, i11, i12);
    }
}

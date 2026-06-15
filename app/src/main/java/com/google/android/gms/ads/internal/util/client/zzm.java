package com.google.android.gms.ads.internal.util.client;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzm extends zzw {

    /* renamed from: a  reason: collision with root package name */
    private final int f11387a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11388b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11389c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(int i10, int i11, boolean z10) {
        this.f11387a = i10;
        this.f11388b = i11;
        this.f11389c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.f11387a == zzwVar.zzb() && this.f11388b == zzwVar.zza() && this.f11389c == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f11389c ? 1237 : 1231) ^ ((((this.f11387a ^ 1000003) * 1000003) ^ this.f11388b) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f11387a + ", clickPrerequisite=" + this.f11388b + ", notificationFlowEnabled=" + this.f11389c + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.f11388b;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.f11387a;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.f11389c;
    }
}

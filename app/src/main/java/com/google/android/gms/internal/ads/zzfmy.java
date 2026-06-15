package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfmy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfmy> CREATOR = new zzfmz();
    @SafeParcelable.VersionField
    public final int zza;
    @SafeParcelable.Field
    private zzasa zzb = null;
    private byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfmy(@SafeParcelable.Param int i10, @SafeParcelable.Param byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzasa zzasaVar = this.zzb;
        if (zzasaVar != null || this.zzc == null) {
            if (zzasaVar == null || this.zzc != null) {
                if (zzasaVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzasaVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaV();
        }
        SafeParcelWriter.f(parcel, 2, bArr, false);
        SafeParcelWriter.b(parcel, a10);
    }

    public final zzasa zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzasa.zzd(this.zzc, zzgvu.zza());
                this.zzc = null;
            } catch (zzgwz | NullPointerException e8) {
                throw new IllegalStateException(e8);
            }
        }
        zzb();
        return this.zzb;
    }
}

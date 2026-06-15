package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzs implements Comparator<zzr>, Parcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzp();
    public final String zza;
    public final int zzb;
    private final zzr[] zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(Parcel parcel) {
        this.zza = parcel.readString();
        zzr[] zzrVarArr = (zzr[]) parcel.createTypedArray(zzr.CREATOR);
        int i10 = zzeh.zza;
        this.zzc = zzrVarArr;
        this.zzb = zzrVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzr zzrVar, zzr zzrVar2) {
        zzr zzrVar3 = zzrVar;
        zzr zzrVar4 = zzrVar2;
        UUID uuid = zzh.zza;
        if (uuid.equals(zzrVar3.zza)) {
            return !uuid.equals(zzrVar4.zza) ? 1 : 0;
        }
        return zzrVar3.zza.compareTo(zzrVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzsVar = (zzs) obj;
            String str = this.zza;
            String str2 = zzsVar.zza;
            int i10 = zzeh.zza;
            if (Objects.equals(str, str2) && Arrays.equals(this.zzc, zzsVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzr zza(int i10) {
        return this.zzc[i10];
    }

    public final zzs zzb(String str) {
        int i10 = zzeh.zza;
        return Objects.equals(this.zza, str) ? this : new zzs(str, false, this.zzc);
    }

    private zzs(String str, boolean z10, zzr... zzrVarArr) {
        this.zza = str;
        zzrVarArr = z10 ? (zzr[]) zzrVarArr.clone() : zzrVarArr;
        this.zzc = zzrVarArr;
        this.zzb = zzrVarArr.length;
        Arrays.sort(zzrVarArr, this);
    }

    public zzs(String str, zzr... zzrVarArr) {
        this(null, true, zzrVarArr);
    }

    public zzs(List list) {
        this(null, false, (zzr[]) list.toArray(new zzr[0]));
    }
}

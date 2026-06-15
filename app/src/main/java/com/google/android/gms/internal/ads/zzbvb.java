package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvb> CREATOR = new zzbvc();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbvb(@SafeParcelable.Param String str, @SafeParcelable.Param int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public static zzbvb zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbvb(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvb)) {
            zzbvb zzbvbVar = (zzbvb) obj;
            if (Objects.a(this.zza, zzbvbVar.zza)) {
                if (Objects.a(Integer.valueOf(this.zzb), Integer.valueOf(zzbvbVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, str, false);
        SafeParcelWriter.k(parcel, 3, this.zzb);
        SafeParcelWriter.b(parcel, a10);
    }
}

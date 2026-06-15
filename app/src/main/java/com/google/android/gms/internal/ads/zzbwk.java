package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwk> CREATOR = new zzbwl();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    public final boolean zzc;
    @SafeParcelable.Field
    public final boolean zzd;
    @SafeParcelable.Field
    public final List zze;
    @SafeParcelable.Field
    public final boolean zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public final List zzh;

    @SafeParcelable.Constructor
    public zzbwk(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param List list, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13, @SafeParcelable.Param List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = list;
        this.zzf = z12;
        this.zzg = z13;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzbwk zza(JSONObject jSONObject) throws JSONException {
        return new zzbwk(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbs.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbs.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, str, false);
        SafeParcelWriter.r(parcel, 3, this.zzb, false);
        SafeParcelWriter.c(parcel, 4, this.zzc);
        SafeParcelWriter.c(parcel, 5, this.zzd);
        SafeParcelWriter.t(parcel, 6, this.zze, false);
        SafeParcelWriter.c(parcel, 7, this.zzf);
        SafeParcelWriter.c(parcel, 8, this.zzg);
        SafeParcelWriter.t(parcel, 9, this.zzh, false);
        SafeParcelWriter.b(parcel, a10);
    }
}

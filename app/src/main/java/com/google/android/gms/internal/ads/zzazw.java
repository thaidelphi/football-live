package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzazw> CREATOR = new zzazx();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final long zzb;
    @SafeParcelable.Field
    public final String zzc;
    @SafeParcelable.Field
    public final String zzd;
    @SafeParcelable.Field
    public final String zze;
    @SafeParcelable.Field
    public final Bundle zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public long zzh;
    @SafeParcelable.Field
    public String zzi;
    @SafeParcelable.Field
    public int zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzazw(@SafeParcelable.Param String str, @SafeParcelable.Param long j10, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param boolean z10, @SafeParcelable.Param long j11, @SafeParcelable.Param String str5, @SafeParcelable.Param int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z10;
        this.zzh = j11;
        this.zzi = str5;
        this.zzj = i10;
    }

    public static zzazw zza(Uri uri) {
        try {
            if ("gcache".equals(uri.getScheme())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 2) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                    return null;
                }
                String str = pathSegments.get(0);
                String str2 = pathSegments.get(1);
                String host = uri.getHost();
                String queryParameter = uri.getQueryParameter("url");
                boolean equals = "1".equals(uri.getQueryParameter("read_only"));
                String queryParameter2 = uri.getQueryParameter("expiration");
                long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
                Bundle bundle = new Bundle();
                for (String str3 : uri.getQueryParameterNames()) {
                    if (str3.startsWith("tag.")) {
                        bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                    }
                }
                return new zzazw(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
            }
            return null;
        } catch (NullPointerException | NumberFormatException e8) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse Uri into cache offering.", e8);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, str, false);
        SafeParcelWriter.n(parcel, 3, this.zzb);
        SafeParcelWriter.r(parcel, 4, this.zzc, false);
        SafeParcelWriter.r(parcel, 5, this.zzd, false);
        SafeParcelWriter.r(parcel, 6, this.zze, false);
        SafeParcelWriter.e(parcel, 7, this.zzf, false);
        SafeParcelWriter.c(parcel, 8, this.zzg);
        SafeParcelWriter.n(parcel, 9, this.zzh);
        SafeParcelWriter.r(parcel, 10, this.zzi, false);
        SafeParcelWriter.k(parcel, 11, this.zzj);
        SafeParcelWriter.b(parcel, a10);
    }
}

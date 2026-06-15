package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.nu;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfcj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfcj> CREATOR = new zzfck();
    public final Context zza;
    public final zzfcg zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final int zzd;
    @SafeParcelable.Field
    public final int zze;
    @SafeParcelable.Field
    public final String zzf;
    public final int zzg;
    private final zzfcg[] zzh;
    @SafeParcelable.Field
    private final int zzi;
    @SafeParcelable.Field
    private final int zzj;
    @SafeParcelable.Field
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfcj(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param int i13, @SafeParcelable.Param String str, @SafeParcelable.Param int i14, @SafeParcelable.Param int i15) {
        zzfcg[] values = zzfcg.values();
        this.zzh = values;
        int[] zza = zzfch.zza();
        this.zzl = zza;
        int[] zza2 = zzfci.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = values[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = zza[i14];
        this.zzk = i15;
        int i16 = zza2[i15];
    }

    public static zzfcj zza(zzfcg zzfcgVar, Context context) {
        if (zzfcgVar == zzfcg.Rewarded) {
            return new zzfcj(context, zzfcgVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgj)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgp)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgr)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgt), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgl), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgn));
        } else if (zzfcgVar == zzfcg.Interstitial) {
            return new zzfcj(context, zzfcgVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgk)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgq)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgs)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgu), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgm), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgo));
        } else if (zzfcgVar == zzfcg.AppOpen) {
            return new zzfcj(context, zzfcgVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgx)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgz)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgA)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgv), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgw), (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgy));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.k(parcel, 2, this.zzc);
        SafeParcelWriter.k(parcel, 3, this.zzd);
        SafeParcelWriter.k(parcel, 4, this.zze);
        SafeParcelWriter.r(parcel, 5, this.zzf, false);
        SafeParcelWriter.k(parcel, 6, this.zzj);
        SafeParcelWriter.k(parcel, 7, this.zzk);
        SafeParcelWriter.b(parcel, a10);
    }

    private zzfcj(Context context, zzfcg zzfcgVar, int i10, int i11, int i12, String str, String str2, String str3) {
        this.zzh = zzfcg.values();
        this.zzl = zzfch.zza();
        this.zzm = zzfci.zza();
        this.zza = context;
        this.zzi = zzfcgVar.ordinal();
        this.zzb = zzfcgVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        int i13 = 2;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i13 = 3;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        nu.f19444g.equals(str3);
        this.zzk = 0;
    }
}

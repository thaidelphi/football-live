package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzben extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzben> CREATOR = new zzbeo();
    @SafeParcelable.Field
    public final int zza;
    @SafeParcelable.Field
    public final boolean zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final boolean zzd;
    @SafeParcelable.Field
    public final int zze;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzfx zzf;
    @SafeParcelable.Field
    public final boolean zzg;
    @SafeParcelable.Field
    public final int zzh;
    @SafeParcelable.Field
    public final int zzi;
    @SafeParcelable.Field
    public final boolean zzj;
    @SafeParcelable.Field
    public final int zzk;

    @SafeParcelable.Constructor
    public zzben(@SafeParcelable.Param int i10, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z11, @SafeParcelable.Param int i12, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzfx zzfxVar, @SafeParcelable.Param boolean z12, @SafeParcelable.Param int i13, @SafeParcelable.Param int i14, @SafeParcelable.Param boolean z13, @SafeParcelable.Param int i15) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = i11;
        this.zzd = z11;
        this.zze = i12;
        this.zzf = zzfxVar;
        this.zzg = z12;
        this.zzh = i13;
        this.zzj = z13;
        this.zzi = i14;
        this.zzk = i15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1 == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(com.google.android.gms.internal.ads.zzben r5) {
        /*
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.zzg
            r0.setRequestCustomMuteThisAd(r1)
            int r1 = r5.zzh
            r0.setMediaAspectRatio(r1)
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.enableCustomClickGestureDirection(r1, r4)
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.zzi(r2)
        L39:
            com.google.android.gms.ads.internal.client.zzfx r1 = r5.zzf
            if (r1 == 0) goto L45
            com.google.android.gms.ads.VideoOptions r2 = new com.google.android.gms.ads.VideoOptions
            r2.<init>(r1)
            r0.setVideoOptions(r2)
        L45:
            int r1 = r5.zze
            r0.setAdChoicesPlacement(r1)
        L4a:
            boolean r1 = r5.zzb
            r0.setReturnUrlsForImageAssets(r1)
            boolean r5 = r5.zzd
            r0.setRequestMultipleImages(r5)
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzben.zza(com.google.android.gms.internal.ads.zzben):com.google.android.gms.ads.nativead.NativeAdOptions");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, i11);
        SafeParcelWriter.c(parcel, 2, this.zzb);
        SafeParcelWriter.k(parcel, 3, this.zzc);
        SafeParcelWriter.c(parcel, 4, this.zzd);
        SafeParcelWriter.k(parcel, 5, this.zze);
        SafeParcelWriter.q(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.c(parcel, 7, this.zzg);
        SafeParcelWriter.k(parcel, 8, this.zzh);
        SafeParcelWriter.k(parcel, 9, this.zzi);
        SafeParcelWriter.c(parcel, 10, this.zzj);
        SafeParcelWriter.k(parcel, 11, this.zzk);
        SafeParcelWriter.b(parcel, a10);
    }

    @Deprecated
    public zzben(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfx(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}

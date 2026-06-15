package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
@SafeParcelable.Class
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11129a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final zzcl f11130b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f11131c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class Builder {
        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param boolean z10, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2) {
        this.f11129a = z10;
        this.f11130b = iBinder != null ? zzck.zzd(iBinder) : null;
        this.f11131c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f11129a);
        zzcl zzclVar = this.f11130b;
        SafeParcelWriter.j(parcel, 2, zzclVar == null ? null : zzclVar.asBinder(), false);
        SafeParcelWriter.j(parcel, 3, this.f11131c, false);
        SafeParcelWriter.b(parcel, a10);
    }

    public final zzcl zza() {
        return this.f11130b;
    }

    public final boolean zzb() {
        return this.f11129a;
    }
}

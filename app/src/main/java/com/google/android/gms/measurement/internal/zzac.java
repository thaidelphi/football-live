package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public String f13273a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public String f13274b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public zzlc f13275c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public long f13276d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public boolean f13277e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public String f13278f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final zzaw f13279g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public long f13280h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public zzaw f13281i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final long f13282j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final zzaw f13283k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzac zzacVar) {
        Preconditions.m(zzacVar);
        this.f13273a = zzacVar.f13273a;
        this.f13274b = zzacVar.f13274b;
        this.f13275c = zzacVar.f13275c;
        this.f13276d = zzacVar.f13276d;
        this.f13277e = zzacVar.f13277e;
        this.f13278f = zzacVar.f13278f;
        this.f13279g = zzacVar.f13279g;
        this.f13280h = zzacVar.f13280h;
        this.f13281i = zzacVar.f13281i;
        this.f13282j = zzacVar.f13282j;
        this.f13283k = zzacVar.f13283k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, this.f13273a, false);
        SafeParcelWriter.r(parcel, 3, this.f13274b, false);
        SafeParcelWriter.q(parcel, 4, this.f13275c, i10, false);
        SafeParcelWriter.n(parcel, 5, this.f13276d);
        SafeParcelWriter.c(parcel, 6, this.f13277e);
        SafeParcelWriter.r(parcel, 7, this.f13278f, false);
        SafeParcelWriter.q(parcel, 8, this.f13279g, i10, false);
        SafeParcelWriter.n(parcel, 9, this.f13280h);
        SafeParcelWriter.q(parcel, 10, this.f13281i, i10, false);
        SafeParcelWriter.n(parcel, 11, this.f13282j);
        SafeParcelWriter.q(parcel, 12, this.f13283k, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zzlc zzlcVar, @SafeParcelable.Param long j10, @SafeParcelable.Param boolean z10, @SafeParcelable.Param String str3, @SafeParcelable.Param zzaw zzawVar, @SafeParcelable.Param long j11, @SafeParcelable.Param zzaw zzawVar2, @SafeParcelable.Param long j12, @SafeParcelable.Param zzaw zzawVar3) {
        this.f13273a = str;
        this.f13274b = str2;
        this.f13275c = zzlcVar;
        this.f13276d = j10;
        this.f13277e = z10;
        this.f13278f = str3;
        this.f13279g = zzawVar;
        this.f13280h = j11;
        this.f13281i = zzawVar2;
        this.f13282j = j12;
        this.f13283k = zzawVar3;
    }
}

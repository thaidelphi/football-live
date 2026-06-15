package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f13720a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f13721b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f13722c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f13723d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final long f13724e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final long f13725f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final String f13726g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13727h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13728i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final long f13729j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final String f13730k;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public final long f13731l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    public final long f13732m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    public final int f13733n;
    @SafeParcelable.Field

    /* renamed from: o  reason: collision with root package name */
    public final boolean f13734o;
    @SafeParcelable.Field

    /* renamed from: p  reason: collision with root package name */
    public final boolean f13735p;
    @SafeParcelable.Field

    /* renamed from: q  reason: collision with root package name */
    public final String f13736q;
    @SafeParcelable.Field

    /* renamed from: r  reason: collision with root package name */
    public final Boolean f13737r;
    @SafeParcelable.Field

    /* renamed from: s  reason: collision with root package name */
    public final long f13738s;
    @SafeParcelable.Field

    /* renamed from: t  reason: collision with root package name */
    public final List f13739t;
    @SafeParcelable.Field

    /* renamed from: u  reason: collision with root package name */
    public final String f13740u;
    @SafeParcelable.Field

    /* renamed from: v  reason: collision with root package name */
    public final String f13741v;
    @SafeParcelable.Field

    /* renamed from: w  reason: collision with root package name */
    public final String f13742w;
    @SafeParcelable.Field

    /* renamed from: x  reason: collision with root package name */
    public final String f13743x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11) {
        Preconditions.g(str);
        this.f13720a = str;
        this.f13721b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f13722c = str3;
        this.f13729j = j10;
        this.f13723d = str4;
        this.f13724e = j11;
        this.f13725f = j12;
        this.f13726g = str5;
        this.f13727h = z10;
        this.f13728i = z11;
        this.f13730k = str6;
        this.f13731l = 0L;
        this.f13732m = j14;
        this.f13733n = i10;
        this.f13734o = z12;
        this.f13735p = z13;
        this.f13736q = str7;
        this.f13737r = bool;
        this.f13738s = j15;
        this.f13739t = list;
        this.f13740u = null;
        this.f13741v = str9;
        this.f13742w = str10;
        this.f13743x = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 2, this.f13720a, false);
        SafeParcelWriter.r(parcel, 3, this.f13721b, false);
        SafeParcelWriter.r(parcel, 4, this.f13722c, false);
        SafeParcelWriter.r(parcel, 5, this.f13723d, false);
        SafeParcelWriter.n(parcel, 6, this.f13724e);
        SafeParcelWriter.n(parcel, 7, this.f13725f);
        SafeParcelWriter.r(parcel, 8, this.f13726g, false);
        SafeParcelWriter.c(parcel, 9, this.f13727h);
        SafeParcelWriter.c(parcel, 10, this.f13728i);
        SafeParcelWriter.n(parcel, 11, this.f13729j);
        SafeParcelWriter.r(parcel, 12, this.f13730k, false);
        SafeParcelWriter.n(parcel, 13, this.f13731l);
        SafeParcelWriter.n(parcel, 14, this.f13732m);
        SafeParcelWriter.k(parcel, 15, this.f13733n);
        SafeParcelWriter.c(parcel, 16, this.f13734o);
        SafeParcelWriter.c(parcel, 18, this.f13735p);
        SafeParcelWriter.r(parcel, 19, this.f13736q, false);
        SafeParcelWriter.d(parcel, 21, this.f13737r, false);
        SafeParcelWriter.n(parcel, 22, this.f13738s);
        SafeParcelWriter.t(parcel, 23, this.f13739t, false);
        SafeParcelWriter.r(parcel, 24, this.f13740u, false);
        SafeParcelWriter.r(parcel, 25, this.f13741v, false);
        SafeParcelWriter.r(parcel, 26, this.f13742w, false);
        SafeParcelWriter.r(parcel, 27, this.f13743x, false);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param long j12, @SafeParcelable.Param String str6, @SafeParcelable.Param long j13, @SafeParcelable.Param long j14, @SafeParcelable.Param int i10, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13, @SafeParcelable.Param String str7, @SafeParcelable.Param Boolean bool, @SafeParcelable.Param long j15, @SafeParcelable.Param List list, @SafeParcelable.Param String str8, @SafeParcelable.Param String str9, @SafeParcelable.Param String str10, @SafeParcelable.Param String str11) {
        this.f13720a = str;
        this.f13721b = str2;
        this.f13722c = str3;
        this.f13729j = j12;
        this.f13723d = str4;
        this.f13724e = j10;
        this.f13725f = j11;
        this.f13726g = str5;
        this.f13727h = z10;
        this.f13728i = z11;
        this.f13730k = str6;
        this.f13731l = j13;
        this.f13732m = j14;
        this.f13733n = i10;
        this.f13734o = z12;
        this.f13735p = z13;
        this.f13736q = str7;
        this.f13737r = bool;
        this.f13738s = j15;
        this.f13739t = list;
        this.f13740u = str8;
        this.f13741v = str9;
        this.f13742w = str10;
        this.f13743x = str11;
    }
}

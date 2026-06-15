package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12715a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final long f12716b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final int f12717c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final String f12718d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final String f12719e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final String f12720f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    private final int f12721g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    private final List f12722h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    private final String f12723i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    private final long f12724j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    private final int f12725k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    private final String f12726l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    private final float f12727m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    private final long f12728n;
    @SafeParcelable.Field

    /* renamed from: o  reason: collision with root package name */
    private final boolean f12729o;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param int i10, @SafeParcelable.Param long j10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str, @SafeParcelable.Param int i12, @SafeParcelable.Param List list, @SafeParcelable.Param String str2, @SafeParcelable.Param long j11, @SafeParcelable.Param int i13, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param float f10, @SafeParcelable.Param long j12, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z10) {
        this.f12715a = i10;
        this.f12716b = j10;
        this.f12717c = i11;
        this.f12718d = str;
        this.f12719e = str3;
        this.f12720f = str5;
        this.f12721g = i12;
        this.f12722h = list;
        this.f12723i = str2;
        this.f12724j = j11;
        this.f12725k = i13;
        this.f12726l = str4;
        this.f12727m = f10;
        this.f12728n = j12;
        this.f12729o = z10;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String X() {
        List list = this.f12722h;
        String join = list == null ? "" : TextUtils.join(",", list);
        int i10 = this.f12725k;
        String str = this.f12719e;
        String str2 = this.f12726l;
        float f10 = this.f12727m;
        String str3 = this.f12720f;
        int i11 = this.f12721g;
        String str4 = this.f12718d;
        boolean z10 = this.f12729o;
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(i11);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i10);
        sb.append("\t");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("\t");
        sb.append(f10);
        sb.append("\t");
        sb.append(str3 != null ? str3 : "");
        sb.append("\t");
        sb.append(z10);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12715a);
        SafeParcelWriter.n(parcel, 2, this.f12716b);
        SafeParcelWriter.r(parcel, 4, this.f12718d, false);
        SafeParcelWriter.k(parcel, 5, this.f12721g);
        SafeParcelWriter.t(parcel, 6, this.f12722h, false);
        SafeParcelWriter.n(parcel, 8, this.f12724j);
        SafeParcelWriter.r(parcel, 10, this.f12719e, false);
        SafeParcelWriter.k(parcel, 11, this.f12717c);
        SafeParcelWriter.r(parcel, 12, this.f12723i, false);
        SafeParcelWriter.r(parcel, 13, this.f12726l, false);
        SafeParcelWriter.k(parcel, 14, this.f12725k);
        SafeParcelWriter.h(parcel, 15, this.f12727m);
        SafeParcelWriter.n(parcel, 16, this.f12728n);
        SafeParcelWriter.r(parcel, 17, this.f12720f, false);
        SafeParcelWriter.c(parcel, 18, this.f12729o);
        SafeParcelWriter.b(parcel, a10);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.f12717c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.f12716b;
    }
}

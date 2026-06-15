package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f13312a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final zzau f13313b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f13314c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final long f13315d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(zzaw zzawVar, long j10) {
        Preconditions.m(zzawVar);
        this.f13312a = zzawVar.f13312a;
        this.f13313b = zzawVar.f13313b;
        this.f13314c = zzawVar.f13314c;
        this.f13315d = j10;
    }

    public final String toString() {
        String str = this.f13314c;
        String str2 = this.f13312a;
        String valueOf = String.valueOf(this.f13313b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzax.a(this, parcel, i10);
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param String str, @SafeParcelable.Param zzau zzauVar, @SafeParcelable.Param String str2, @SafeParcelable.Param long j10) {
        this.f13312a = str;
        this.f13313b = zzauVar;
        this.f13314c = str2;
        this.f13315d = j10;
    }
}

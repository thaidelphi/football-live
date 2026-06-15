package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlc> CREATOR = new zzld();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f13707a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f13708b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final long f13709c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final Long f13710d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f13711e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f13712f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final Double f13713g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzlc(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param long j10, @SafeParcelable.Param Long l10, @SafeParcelable.Param Float f10, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param Double d10) {
        this.f13707a = i10;
        this.f13708b = str;
        this.f13709c = j10;
        this.f13710d = l10;
        if (i10 == 1) {
            this.f13713g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f13713g = d10;
        }
        this.f13711e = str2;
        this.f13712f = str3;
    }

    public final Object X() {
        Long l10 = this.f13710d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f13713g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f13711e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzld.a(this, parcel, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlc(b4 b4Var) {
        this(b4Var.f12886c, b4Var.f12887d, b4Var.f12888e, b4Var.f12885b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlc(String str, long j10, Object obj, String str2) {
        Preconditions.g(str);
        this.f13707a = 2;
        this.f13708b = str;
        this.f13709c = j10;
        this.f13712f = str2;
        if (obj == null) {
            this.f13710d = null;
            this.f13713g = null;
            this.f13711e = null;
        } else if (obj instanceof Long) {
            this.f13710d = (Long) obj;
            this.f13713g = null;
            this.f13711e = null;
        } else if (obj instanceof String) {
            this.f13710d = null;
            this.f13713g = null;
            this.f13711e = (String) obj;
        } else if (obj instanceof Double) {
            this.f13710d = null;
            this.f13713g = (Double) obj;
            this.f13711e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12658a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final StringToIntConverter f12659b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param int i10, @SafeParcelable.Param StringToIntConverter stringToIntConverter) {
        this.f12658a = i10;
        this.f12659b = stringToIntConverter;
    }

    public static zaa X(FastJsonResponse.FieldConverter<?, ?> fieldConverter) {
        if (fieldConverter instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) fieldConverter);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.FieldConverter<?, ?> n0() {
        StringToIntConverter stringToIntConverter = this.f12659b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12658a);
        SafeParcelWriter.q(parcel, 2, this.f12659b, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f12658a = 1;
        this.f12659b = stringToIntConverter;
    }
}

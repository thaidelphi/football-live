package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f12704a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    final String f12705b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    final FastJsonResponse.Field<?, ?> f12706c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zam(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param FastJsonResponse.Field<?, ?> field) {
        this.f12704a = i10;
        this.f12705b = str;
        this.f12706c = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f12704a);
        SafeParcelWriter.r(parcel, 2, this.f12705b, false);
        SafeParcelWriter.q(parcel, 3, this.f12706c, i10, false);
        SafeParcelWriter.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f12704a = 1;
        this.f12705b = str;
        this.f12706c = field;
    }
}

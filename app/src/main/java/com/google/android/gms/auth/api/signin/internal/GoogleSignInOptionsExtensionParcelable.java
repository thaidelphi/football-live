package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    final int f11903a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private int f11904b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private Bundle f11905c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param Bundle bundle) {
        this.f11903a = i10;
        this.f11904b = i11;
        this.f11905c = bundle;
    }

    @KeepForSdk
    public int X() {
        return this.f11904b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.k(parcel, 1, this.f11903a);
        SafeParcelWriter.k(parcel, 2, X());
        SafeParcelWriter.e(parcel, 3, this.f11905c, false);
        SafeParcelWriter.b(parcel, a10);
    }
}

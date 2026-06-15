package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@KeepName
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f12458a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.f12458a);
    }
}

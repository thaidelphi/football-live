package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f12422c = {"data"};

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable.Creator<T> f12423b;

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    /* renamed from: a */
    public T get(int i10) {
        DataHolder dataHolder = (DataHolder) Preconditions.m(this.f12409a);
        byte[] X = dataHolder.X("data", i10, dataHolder.z0(i10));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(X, 0, X.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.f12423b.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}

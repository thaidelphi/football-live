package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.b9;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e8 extends b2 {
    public static final Parcelable.Creator<e8> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final float f21914f;

    /* renamed from: g  reason: collision with root package name */
    public final float f21915g;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Parcelable.Creator<e8> {
        @Override // android.os.Parcelable.Creator
        public final e8 createFromParcel(Parcel parcel) {
            return new e8(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e8[] newArray(int i10) {
            return new e8[i10];
        }
    }

    public e8() {
        this.f21914f = 0.9f;
        this.f21915g = 0.6f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.startapp.b2
    public final String toString() {
        return super.toString() + ", Friction: [" + this.f21914f + "], Snap:[" + this.f21915g + b9.i.f16698e;
    }

    @Override // com.startapp.b2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f21914f);
        parcel.writeFloat(this.f21915g);
    }

    public e8(Parcel parcel) {
        super(parcel);
        this.f21914f = parcel.readFloat();
        this.f21915g = parcel.readFloat();
    }
}

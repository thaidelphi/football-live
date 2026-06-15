package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;
import com.ironsource.b9;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b2 implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public float f21782a;

    /* renamed from: b  reason: collision with root package name */
    public float f21783b;

    /* renamed from: c  reason: collision with root package name */
    public float f21784c;

    /* renamed from: d  reason: collision with root package name */
    public float f21785d;

    /* renamed from: e  reason: collision with root package name */
    public long f21786e;

    public b2() {
        this.f21784c = Float.MAX_VALUE;
        this.f21785d = -3.4028235E38f;
        this.f21786e = 0L;
    }

    public String toString() {
        return "Position: [" + this.f21782a + "], Velocity:[" + this.f21783b + "], MaxPos: [" + this.f21784c + "], mMinPos: [" + this.f21785d + "] LastTime:[" + this.f21786e + b9.i.f16698e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f21782a);
        parcel.writeFloat(this.f21783b);
        parcel.writeFloat(this.f21784c);
        parcel.writeFloat(this.f21785d);
    }

    public b2(Parcel parcel) {
        this.f21784c = Float.MAX_VALUE;
        this.f21785d = -3.4028235E38f;
        this.f21786e = 0L;
        this.f21782a = parcel.readFloat();
        this.f21783b = parcel.readFloat();
        this.f21784c = parcel.readFloat();
        this.f21785d = parcel.readFloat();
        this.f21786e = AnimationUtils.currentAnimationTimeMillis();
    }
}

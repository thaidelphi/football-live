package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.material.timepicker.a f14711a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.material.timepicker.a f14712b;

    /* renamed from: c  reason: collision with root package name */
    final int f14713c;

    /* renamed from: d  reason: collision with root package name */
    int f14714d;

    /* renamed from: e  reason: collision with root package name */
    int f14715e;

    /* renamed from: f  reason: collision with root package name */
    int f14716f;

    /* renamed from: g  reason: collision with root package name */
    int f14717g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Parcelable.Creator<TimeModel> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeModel) {
            TimeModel timeModel = (TimeModel) obj;
            return this.f14714d == timeModel.f14714d && this.f14715e == timeModel.f14715e && this.f14713c == timeModel.f14713c && this.f14716f == timeModel.f14716f;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14713c), Integer.valueOf(this.f14714d), Integer.valueOf(this.f14715e), Integer.valueOf(this.f14716f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14714d);
        parcel.writeInt(this.f14715e);
        parcel.writeInt(this.f14716f);
        parcel.writeInt(this.f14713c);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f14714d = i10;
        this.f14715e = i11;
        this.f14716f = i12;
        this.f14713c = i13;
        this.f14717g = c(i10);
        this.f14711a = new com.google.android.material.timepicker.a(59);
        this.f14712b = new com.google.android.material.timepicker.a(i13 == 1 ? 24 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

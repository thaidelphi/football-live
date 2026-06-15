package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f10650a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10651b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10652c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final int f10653d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<StreamKey> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f10650a = i10;
        this.f10651b = i11;
        this.f10652c = i12;
        this.f10653d = i12;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(StreamKey streamKey) {
        int i10 = this.f10650a - streamKey.f10650a;
        if (i10 == 0) {
            int i11 = this.f10651b - streamKey.f10651b;
            return i11 == 0 ? this.f10652c - streamKey.f10652c : i11;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f10650a == streamKey.f10650a && this.f10651b == streamKey.f10651b && this.f10652c == streamKey.f10652c;
    }

    public int hashCode() {
        return (((this.f10650a * 31) + this.f10651b) * 31) + this.f10652c;
    }

    public String toString() {
        return this.f10650a + "." + this.f10651b + "." + this.f10652c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10650a);
        parcel.writeInt(this.f10651b);
        parcel.writeInt(this.f10652c);
    }

    StreamKey(Parcel parcel) {
        this.f10650a = parcel.readInt();
        this.f10651b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f10652c = readInt;
        this.f10653d = readInt;
    }
}

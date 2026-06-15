package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import n3.m1;
import n3.z1;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10571a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10572b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10573c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<IcyInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f10571a = bArr;
        this.f10572b = str;
        this.f10573c = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ m1 E() {
        return y3.a.b(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void J(z1.b bVar) {
        String str = this.f10572b;
        if (str != null) {
            bVar.i0(str);
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] R() {
        return y3.a.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10571a, ((IcyInfo) obj).f10571a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10571a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f10572b, this.f10573c, Integer.valueOf(this.f10571a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f10571a);
        parcel.writeString(this.f10572b);
        parcel.writeString(this.f10573c);
    }

    IcyInfo(Parcel parcel) {
        this.f10571a = (byte[]) a5.a.e(parcel.createByteArray());
        this.f10572b = parcel.readString();
        this.f10573c = parcel.readString();
    }
}

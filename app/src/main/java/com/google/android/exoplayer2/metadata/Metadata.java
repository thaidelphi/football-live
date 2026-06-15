package com.google.android.exoplayer2.metadata;

import a5.p0;
import a6.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import n3.m1;
import n3.z1;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Entry[] f10548a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10549b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface Entry extends Parcelable {
        m1 E();

        void J(z1.b bVar);

        byte[] R();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<Metadata> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.f10549b, (Entry[]) p0.G0(this.f10548a, entryArr));
    }

    public Metadata b(Metadata metadata) {
        return metadata == null ? this : a(metadata.f10548a);
    }

    public Metadata c(long j10) {
        return this.f10549b == j10 ? this : new Metadata(j10, this.f10548a);
    }

    public Entry d(int i10) {
        return this.f10548a[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f10548a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.f10548a, metadata.f10548a) && this.f10549b == metadata.f10549b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f10548a) * 31) + d.a(this.f10549b);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f10548a));
        if (this.f10549b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f10549b;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10548a.length);
        for (Entry entry : this.f10548a) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f10549b);
    }

    public Metadata(long j10, Entry... entryArr) {
        this.f10549b = j10;
        this.f10548a = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j10, List<? extends Entry> list) {
        this(j10, (Entry[]) list.toArray(new Entry[0]));
    }

    Metadata(Parcel parcel) {
        this.f10548a = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f10548a;
            if (i10 < entryArr.length) {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            } else {
                this.f10549b = parcel.readLong();
                return;
            }
        }
    }
}

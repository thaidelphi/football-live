package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n3.m1;
import n3.z1;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f10804a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10805b;

    /* renamed from: c  reason: collision with root package name */
    public final List<VariantInfo> f10806c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<VariantInfo> list) {
        this.f10804a = str;
        this.f10805b = str2;
        this.f10806c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ m1 E() {
        return y3.a.b(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void J(z1.b bVar) {
        y3.a.c(this, bVar);
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
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f10804a, hlsTrackMetadataEntry.f10804a) && TextUtils.equals(this.f10805b, hlsTrackMetadataEntry.f10805b) && this.f10806c.equals(hlsTrackMetadataEntry.f10806c);
    }

    public int hashCode() {
        String str = this.f10804a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10805b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f10806c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f10804a != null) {
            str = " [" + this.f10804a + ", " + this.f10805b + b9.i.f16698e;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10804a);
        parcel.writeString(this.f10805b);
        int size = this.f10806c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f10806c.get(i11), 0);
        }
    }

    HlsTrackMetadataEntry(Parcel parcel) {
        this.f10804a = parcel.readString();
        this.f10805b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f10806c = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f10807a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10808b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10809c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10810d;

        /* renamed from: e  reason: collision with root package name */
        public final String f10811e;

        /* renamed from: f  reason: collision with root package name */
        public final String f10812f;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.Creator<VariantInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f10807a = i10;
            this.f10808b = i11;
            this.f10809c = str;
            this.f10810d = str2;
            this.f10811e = str3;
            this.f10812f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f10807a == variantInfo.f10807a && this.f10808b == variantInfo.f10808b && TextUtils.equals(this.f10809c, variantInfo.f10809c) && TextUtils.equals(this.f10810d, variantInfo.f10810d) && TextUtils.equals(this.f10811e, variantInfo.f10811e) && TextUtils.equals(this.f10812f, variantInfo.f10812f);
        }

        public int hashCode() {
            int i10 = ((this.f10807a * 31) + this.f10808b) * 31;
            String str = this.f10809c;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f10810d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f10811e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f10812f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f10807a);
            parcel.writeInt(this.f10808b);
            parcel.writeString(this.f10809c);
            parcel.writeString(this.f10810d);
            parcel.writeString(this.f10811e);
            parcel.writeString(this.f10812f);
        }

        VariantInfo(Parcel parcel) {
            this.f10807a = parcel.readInt();
            this.f10808b = parcel.readInt();
            this.f10809c = parcel.readString();
            this.f10810d = parcel.readString();
            this.f10811e = parcel.readString();
            this.f10812f = parcel.readString();
        }
    }
}

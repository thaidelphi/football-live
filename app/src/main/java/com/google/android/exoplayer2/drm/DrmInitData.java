package com.google.android.exoplayer2.drm;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final SchemeData[] f10431a;

    /* renamed from: b  reason: collision with root package name */
    private int f10432b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10433c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10434d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f10435a;

        /* renamed from: b  reason: collision with root package name */
        public final UUID f10436b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10437c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10438d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f10439e;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.Creator<SchemeData> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(SchemeData schemeData) {
            return c() && !schemeData.c() && d(schemeData.f10436b);
        }

        public SchemeData b(byte[] bArr) {
            return new SchemeData(this.f10436b, this.f10437c, this.f10438d, bArr);
        }

        public boolean c() {
            return this.f10439e != null;
        }

        public boolean d(UUID uuid) {
            return n3.i.f28004a.equals(this.f10436b) || uuid.equals(this.f10436b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SchemeData) {
                if (obj == this) {
                    return true;
                }
                SchemeData schemeData = (SchemeData) obj;
                return p0.c(this.f10437c, schemeData.f10437c) && p0.c(this.f10438d, schemeData.f10438d) && p0.c(this.f10436b, schemeData.f10436b) && Arrays.equals(this.f10439e, schemeData.f10439e);
            }
            return false;
        }

        public int hashCode() {
            if (this.f10435a == 0) {
                int hashCode = this.f10436b.hashCode() * 31;
                String str = this.f10437c;
                this.f10435a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f10438d.hashCode()) * 31) + Arrays.hashCode(this.f10439e);
            }
            return this.f10435a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f10436b.getMostSignificantBits());
            parcel.writeLong(this.f10436b.getLeastSignificantBits());
            parcel.writeString(this.f10437c);
            parcel.writeString(this.f10438d);
            parcel.writeByteArray(this.f10439e);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f10436b = (UUID) a5.a.e(uuid);
            this.f10437c = str;
            this.f10438d = (String) a5.a.e(str2);
            this.f10439e = bArr;
        }

        SchemeData(Parcel parcel) {
            this.f10436b = new UUID(parcel.readLong(), parcel.readLong());
            this.f10437c = parcel.readString();
            this.f10438d = (String) p0.j(parcel.readString());
            this.f10439e = parcel.createByteArray();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<DrmInitData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    private static boolean b(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f10436b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData d(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        SchemeData[] schemeDataArr;
        SchemeData[] schemeDataArr2;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f10433c;
            for (SchemeData schemeData : drmInitData.f10431a) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f10433c;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f10431a) {
                if (schemeData2.c() && !b(arrayList, size, schemeData2.f10436b)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = n3.i.f28004a;
        if (uuid.equals(schemeData.f10436b)) {
            return uuid.equals(schemeData2.f10436b) ? 0 : 1;
        }
        return schemeData.f10436b.compareTo(schemeData2.f10436b);
    }

    public DrmInitData c(String str) {
        return p0.c(this.f10433c, str) ? this : new DrmInitData(str, false, this.f10431a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SchemeData e(int i10) {
        return this.f10431a[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return p0.c(this.f10433c, drmInitData.f10433c) && Arrays.equals(this.f10431a, drmInitData.f10431a);
    }

    public DrmInitData g(DrmInitData drmInitData) {
        String str;
        String str2 = this.f10433c;
        a5.a.f(str2 == null || (str = drmInitData.f10433c) == null || TextUtils.equals(str2, str));
        String str3 = this.f10433c;
        if (str3 == null) {
            str3 = drmInitData.f10433c;
        }
        return new DrmInitData(str3, (SchemeData[]) p0.G0(this.f10431a, drmInitData.f10431a));
    }

    public int hashCode() {
        if (this.f10432b == 0) {
            String str = this.f10433c;
            this.f10432b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f10431a);
        }
        return this.f10432b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10433c);
        parcel.writeTypedArray(this.f10431a, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f10433c = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f10431a = schemeDataArr;
        this.f10434d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.f10433c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) p0.j((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f10431a = schemeDataArr;
        this.f10434d = schemeDataArr.length;
    }
}

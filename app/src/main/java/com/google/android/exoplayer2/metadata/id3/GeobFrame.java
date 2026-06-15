package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10593b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10594c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10595d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f10596e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<GeobFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f10593b = str;
        this.f10594c = str2;
        this.f10595d = str3;
        this.f10596e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return p0.c(this.f10593b, geobFrame.f10593b) && p0.c(this.f10594c, geobFrame.f10594c) && p0.c(this.f10595d, geobFrame.f10595d) && Arrays.equals(this.f10596e, geobFrame.f10596e);
    }

    public int hashCode() {
        String str = this.f10593b;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10594c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10595d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f10596e);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f10597a + ": mimeType=" + this.f10593b + ", filename=" + this.f10594c + ", description=" + this.f10595d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10593b);
        parcel.writeString(this.f10594c);
        parcel.writeString(this.f10595d);
        parcel.writeByteArray(this.f10596e);
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f10593b = (String) p0.j(parcel.readString());
        this.f10594c = (String) p0.j(parcel.readString());
        this.f10595d = (String) p0.j(parcel.readString());
        this.f10596e = (byte[]) p0.j(parcel.createByteArray());
    }
}

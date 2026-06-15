package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import n3.z1;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10574b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10575c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10576d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f10577e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<ApicFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f10574b = str;
        this.f10575c = str2;
        this.f10576d = i10;
        this.f10577e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void J(z1.b bVar) {
        bVar.G(this.f10577e, this.f10576d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f10576d == apicFrame.f10576d && p0.c(this.f10574b, apicFrame.f10574b) && p0.c(this.f10575c, apicFrame.f10575c) && Arrays.equals(this.f10577e, apicFrame.f10577e);
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f10576d) * 31;
        String str = this.f10574b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10575c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f10577e);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f10597a + ": mimeType=" + this.f10574b + ", description=" + this.f10575c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10574b);
        parcel.writeString(this.f10575c);
        parcel.writeInt(this.f10576d);
        parcel.writeByteArray(this.f10577e);
    }

    ApicFrame(Parcel parcel) {
        super("APIC");
        this.f10574b = (String) p0.j(parcel.readString());
        this.f10575c = parcel.readString();
        this.f10576d = parcel.readInt();
        this.f10577e = (byte[]) p0.j(parcel.createByteArray());
    }
}

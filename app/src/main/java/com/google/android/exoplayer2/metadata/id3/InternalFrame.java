package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10598b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10599c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10600d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<InternalFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    InternalFrame(Parcel parcel) {
        super("----");
        this.f10598b = (String) p0.j(parcel.readString());
        this.f10599c = (String) p0.j(parcel.readString());
        this.f10600d = (String) p0.j(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return p0.c(this.f10599c, internalFrame.f10599c) && p0.c(this.f10598b, internalFrame.f10598b) && p0.c(this.f10600d, internalFrame.f10600d);
    }

    public int hashCode() {
        String str = this.f10598b;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10599c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10600d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f10597a + ": domain=" + this.f10598b + ", description=" + this.f10599c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10597a);
        parcel.writeString(this.f10598b);
        parcel.writeString(this.f10600d);
    }
}

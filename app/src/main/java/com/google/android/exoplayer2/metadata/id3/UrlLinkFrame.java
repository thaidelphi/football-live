package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10610b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10611c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<UrlLinkFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f10610b = str2;
        this.f10611c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f10597a.equals(urlLinkFrame.f10597a) && p0.c(this.f10610b, urlLinkFrame.f10610b) && p0.c(this.f10611c, urlLinkFrame.f10611c);
    }

    public int hashCode() {
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f10597a.hashCode()) * 31;
        String str = this.f10610b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10611c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f10597a + ": url=" + this.f10611c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10597a);
        parcel.writeString(this.f10610b);
        parcel.writeString(this.f10611c);
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) p0.j(parcel.readString()));
        this.f10610b = parcel.readString();
        this.f10611c = (String) p0.j(parcel.readString());
    }
}

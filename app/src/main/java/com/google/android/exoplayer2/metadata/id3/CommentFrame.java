package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10590b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10591c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10592d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<CommentFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f10590b = str;
        this.f10591c = str2;
        this.f10592d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return p0.c(this.f10591c, commentFrame.f10591c) && p0.c(this.f10590b, commentFrame.f10590b) && p0.c(this.f10592d, commentFrame.f10592d);
    }

    public int hashCode() {
        String str = this.f10590b;
        int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10591c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10592d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f10597a + ": language=" + this.f10590b + ", description=" + this.f10591c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10597a);
        parcel.writeString(this.f10590b);
        parcel.writeString(this.f10592d);
    }

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.f10590b = (String) p0.j(parcel.readString());
        this.f10591c = (String) p0.j(parcel.readString());
        this.f10592d = (String) p0.j(parcel.readString());
    }
}

package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10585b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10586c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10587d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f10588e;

    /* renamed from: f  reason: collision with root package name */
    private final Id3Frame[] f10589f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<ChapterTocFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f10585b = str;
        this.f10586c = z10;
        this.f10587d = z11;
        this.f10588e = strArr;
        this.f10589f = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f10586c == chapterTocFrame.f10586c && this.f10587d == chapterTocFrame.f10587d && p0.c(this.f10585b, chapterTocFrame.f10585b) && Arrays.equals(this.f10588e, chapterTocFrame.f10588e) && Arrays.equals(this.f10589f, chapterTocFrame.f10589f);
    }

    public int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f10586c ? 1 : 0)) * 31) + (this.f10587d ? 1 : 0)) * 31;
        String str = this.f10585b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10585b);
        parcel.writeByte(this.f10586c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10587d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f10588e);
        parcel.writeInt(this.f10589f.length);
        for (Id3Frame id3Frame : this.f10589f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f10585b = (String) p0.j(parcel.readString());
        this.f10586c = parcel.readByte() != 0;
        this.f10587d = parcel.readByte() != 0;
        this.f10588e = (String[]) p0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f10589f = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f10589f[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

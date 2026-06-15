package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10579b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10580c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10581d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10582e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10583f;

    /* renamed from: g  reason: collision with root package name */
    private final Id3Frame[] f10584g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<ChapterFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f10579b = str;
        this.f10580c = i10;
        this.f10581d = i11;
        this.f10582e = j10;
        this.f10583f = j11;
        this.f10584g = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f10580c == chapterFrame.f10580c && this.f10581d == chapterFrame.f10581d && this.f10582e == chapterFrame.f10582e && this.f10583f == chapterFrame.f10583f && p0.c(this.f10579b, chapterFrame.f10579b) && Arrays.equals(this.f10584g, chapterFrame.f10584g);
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f10580c) * 31) + this.f10581d) * 31) + ((int) this.f10582e)) * 31) + ((int) this.f10583f)) * 31;
        String str = this.f10579b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10579b);
        parcel.writeInt(this.f10580c);
        parcel.writeInt(this.f10581d);
        parcel.writeLong(this.f10582e);
        parcel.writeLong(this.f10583f);
        parcel.writeInt(this.f10584g.length);
        for (Id3Frame id3Frame : this.f10584g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f10579b = (String) p0.j(parcel.readString());
        this.f10580c = parcel.readInt();
        this.f10581d = parcel.readInt();
        this.f10582e = parcel.readLong();
        this.f10583f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f10584g = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f10584g[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

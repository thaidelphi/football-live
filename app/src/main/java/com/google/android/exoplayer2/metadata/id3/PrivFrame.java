package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f10606b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f10607c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<PrivFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f10606b = str;
        this.f10607c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return p0.c(this.f10606b, privFrame.f10606b) && Arrays.equals(this.f10607c, privFrame.f10607c);
    }

    public int hashCode() {
        String str = this.f10606b;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f10607c);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f10597a + ": owner=" + this.f10606b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10606b);
        parcel.writeByteArray(this.f10607c);
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f10606b = (String) p0.j(parcel.readString());
        this.f10607c = (byte[]) p0.j(parcel.createByteArray());
    }
}

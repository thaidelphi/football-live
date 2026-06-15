package com.google.android.exoplayer2.metadata.id3;

import a5.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f10601b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10602c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10603d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f10604e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f10605f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<MlltFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f10601b = i10;
        this.f10602c = i11;
        this.f10603d = i12;
        this.f10604e = iArr;
        this.f10605f = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f10601b == mlltFrame.f10601b && this.f10602c == mlltFrame.f10602c && this.f10603d == mlltFrame.f10603d && Arrays.equals(this.f10604e, mlltFrame.f10604e) && Arrays.equals(this.f10605f, mlltFrame.f10605f);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f10601b) * 31) + this.f10602c) * 31) + this.f10603d) * 31) + Arrays.hashCode(this.f10604e)) * 31) + Arrays.hashCode(this.f10605f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10601b);
        parcel.writeInt(this.f10602c);
        parcel.writeInt(this.f10603d);
        parcel.writeIntArray(this.f10604e);
        parcel.writeIntArray(this.f10605f);
    }

    MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f10601b = parcel.readInt();
        this.f10602c = parcel.readInt();
        this.f10603d = parcel.readInt();
        this.f10604e = (int[]) p0.j(parcel.createIntArray());
        this.f10605f = (int[]) p0.j(parcel.createIntArray());
    }
}

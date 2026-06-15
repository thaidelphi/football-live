package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f664a;

    /* renamed from: b  reason: collision with root package name */
    public int f665b;

    /* renamed from: c  reason: collision with root package name */
    public int f666c;

    /* renamed from: d  reason: collision with root package name */
    public int f667d;

    /* renamed from: e  reason: collision with root package name */
    public int f668e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f664a = parcel.readInt();
        this.f666c = parcel.readInt();
        this.f667d = parcel.readInt();
        this.f668e = parcel.readInt();
        this.f665b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f664a);
        parcel.writeInt(this.f666c);
        parcel.writeInt(this.f667d);
        parcel.writeInt(this.f668e);
        parcel.writeInt(this.f665b);
    }
}

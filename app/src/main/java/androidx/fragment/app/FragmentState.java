package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final String f3267a;

    /* renamed from: b  reason: collision with root package name */
    final String f3268b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f3269c;

    /* renamed from: d  reason: collision with root package name */
    final int f3270d;

    /* renamed from: e  reason: collision with root package name */
    final int f3271e;

    /* renamed from: f  reason: collision with root package name */
    final String f3272f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f3273g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f3274h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f3275i;

    /* renamed from: j  reason: collision with root package name */
    final Bundle f3276j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f3277k;

    /* renamed from: l  reason: collision with root package name */
    final int f3278l;

    /* renamed from: m  reason: collision with root package name */
    Bundle f3279m;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f3267a = fragment.getClass().getName();
        this.f3268b = fragment.f3147f;
        this.f3269c = fragment.f3155n;
        this.f3270d = fragment.f3164w;
        this.f3271e = fragment.f3165x;
        this.f3272f = fragment.f3166y;
        this.f3273g = fragment.B;
        this.f3274h = fragment.f3154m;
        this.f3275i = fragment.A;
        this.f3276j = fragment.f3148g;
        this.f3277k = fragment.f3167z;
        this.f3278l = fragment.R.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3267a);
        sb.append(" (");
        sb.append(this.f3268b);
        sb.append(")}:");
        if (this.f3269c) {
            sb.append(" fromLayout");
        }
        if (this.f3271e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3271e));
        }
        String str = this.f3272f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3272f);
        }
        if (this.f3273g) {
            sb.append(" retainInstance");
        }
        if (this.f3274h) {
            sb.append(" removing");
        }
        if (this.f3275i) {
            sb.append(" detached");
        }
        if (this.f3277k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3267a);
        parcel.writeString(this.f3268b);
        parcel.writeInt(this.f3269c ? 1 : 0);
        parcel.writeInt(this.f3270d);
        parcel.writeInt(this.f3271e);
        parcel.writeString(this.f3272f);
        parcel.writeInt(this.f3273g ? 1 : 0);
        parcel.writeInt(this.f3274h ? 1 : 0);
        parcel.writeInt(this.f3275i ? 1 : 0);
        parcel.writeBundle(this.f3276j);
        parcel.writeInt(this.f3277k ? 1 : 0);
        parcel.writeBundle(this.f3279m);
        parcel.writeInt(this.f3278l);
    }

    FragmentState(Parcel parcel) {
        this.f3267a = parcel.readString();
        this.f3268b = parcel.readString();
        this.f3269c = parcel.readInt() != 0;
        this.f3270d = parcel.readInt();
        this.f3271e = parcel.readInt();
        this.f3272f = parcel.readString();
        this.f3273g = parcel.readInt() != 0;
        this.f3274h = parcel.readInt() != 0;
        this.f3275i = parcel.readInt() != 0;
        this.f3276j = parcel.readBundle();
        this.f3277k = parcel.readInt() != 0;
        this.f3279m = parcel.readBundle();
        this.f3278l = parcel.readInt();
    }
}

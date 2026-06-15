package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<FragmentState> f3259a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<String> f3260b;

    /* renamed from: c  reason: collision with root package name */
    BackStackState[] f3261c;

    /* renamed from: d  reason: collision with root package name */
    int f3262d;

    /* renamed from: e  reason: collision with root package name */
    String f3263e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f3264f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<Bundle> f3265g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f3266h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f3263e = null;
        this.f3264f = new ArrayList<>();
        this.f3265g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f3259a);
        parcel.writeStringList(this.f3260b);
        parcel.writeTypedArray(this.f3261c, i10);
        parcel.writeInt(this.f3262d);
        parcel.writeString(this.f3263e);
        parcel.writeStringList(this.f3264f);
        parcel.writeTypedList(this.f3265g);
        parcel.writeTypedList(this.f3266h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3263e = null;
        this.f3264f = new ArrayList<>();
        this.f3265g = new ArrayList<>();
        this.f3259a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3260b = parcel.createStringArrayList();
        this.f3261c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3262d = parcel.readInt();
        this.f3263e = parcel.readString();
        this.f3264f = parcel.createStringArrayList();
        this.f3265g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3266h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.q;
import androidx.lifecycle.i;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f3127a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<String> f3128b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f3129c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f3130d;

    /* renamed from: e  reason: collision with root package name */
    final int f3131e;

    /* renamed from: f  reason: collision with root package name */
    final String f3132f;

    /* renamed from: g  reason: collision with root package name */
    final int f3133g;

    /* renamed from: h  reason: collision with root package name */
    final int f3134h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f3135i;

    /* renamed from: j  reason: collision with root package name */
    final int f3136j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f3137k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList<String> f3138l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f3139m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f3140n;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(androidx.fragment.app.a aVar) {
        int size = aVar.f3400c.size();
        this.f3127a = new int[size * 5];
        if (aVar.f3406i) {
            this.f3128b = new ArrayList<>(size);
            this.f3129c = new int[size];
            this.f3130d = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                q.a aVar2 = aVar.f3400c.get(i10);
                int i12 = i11 + 1;
                this.f3127a[i11] = aVar2.f3417a;
                ArrayList<String> arrayList = this.f3128b;
                Fragment fragment = aVar2.f3418b;
                arrayList.add(fragment != null ? fragment.f3147f : null);
                int[] iArr = this.f3127a;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f3419c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f3420d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f3421e;
                iArr[i15] = aVar2.f3422f;
                this.f3129c[i10] = aVar2.f3423g.ordinal();
                this.f3130d[i10] = aVar2.f3424h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.f3131e = aVar.f3405h;
            this.f3132f = aVar.f3408k;
            this.f3133g = aVar.f3282v;
            this.f3134h = aVar.f3409l;
            this.f3135i = aVar.f3410m;
            this.f3136j = aVar.f3411n;
            this.f3137k = aVar.f3412o;
            this.f3138l = aVar.f3413p;
            this.f3139m = aVar.f3414q;
            this.f3140n = aVar.f3415r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public androidx.fragment.app.a a(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f3127a.length) {
            q.a aVar2 = new q.a();
            int i12 = i10 + 1;
            aVar2.f3417a = this.f3127a[i10];
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f3127a[i12]);
            }
            String str = this.f3128b.get(i11);
            if (str != null) {
                aVar2.f3418b = fragmentManager.g0(str);
            } else {
                aVar2.f3418b = null;
            }
            aVar2.f3423g = i.b.values()[this.f3129c[i11]];
            aVar2.f3424h = i.b.values()[this.f3130d[i11]];
            int[] iArr = this.f3127a;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f3419c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f3420d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f3421e = i18;
            int i19 = iArr[i17];
            aVar2.f3422f = i19;
            aVar.f3401d = i14;
            aVar.f3402e = i16;
            aVar.f3403f = i18;
            aVar.f3404g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f3405h = this.f3131e;
        aVar.f3408k = this.f3132f;
        aVar.f3282v = this.f3133g;
        aVar.f3406i = true;
        aVar.f3409l = this.f3134h;
        aVar.f3410m = this.f3135i;
        aVar.f3411n = this.f3136j;
        aVar.f3412o = this.f3137k;
        aVar.f3413p = this.f3138l;
        aVar.f3414q = this.f3139m;
        aVar.f3415r = this.f3140n;
        aVar.p(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f3127a);
        parcel.writeStringList(this.f3128b);
        parcel.writeIntArray(this.f3129c);
        parcel.writeIntArray(this.f3130d);
        parcel.writeInt(this.f3131e);
        parcel.writeString(this.f3132f);
        parcel.writeInt(this.f3133g);
        parcel.writeInt(this.f3134h);
        TextUtils.writeToParcel(this.f3135i, parcel, 0);
        parcel.writeInt(this.f3136j);
        TextUtils.writeToParcel(this.f3137k, parcel, 0);
        parcel.writeStringList(this.f3138l);
        parcel.writeStringList(this.f3139m);
        parcel.writeInt(this.f3140n ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f3127a = parcel.createIntArray();
        this.f3128b = parcel.createStringArrayList();
        this.f3129c = parcel.createIntArray();
        this.f3130d = parcel.createIntArray();
        this.f3131e = parcel.readInt();
        this.f3132f = parcel.readString();
        this.f3133g = parcel.readInt();
        this.f3134h = parcel.readInt();
        this.f3135i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3136j = parcel.readInt();
        this.f3137k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3138l = parcel.createStringArrayList();
        this.f3139m = parcel.createStringArrayList();
        this.f3140n = parcel.readInt() != 0;
    }
}

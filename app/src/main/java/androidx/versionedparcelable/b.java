package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* compiled from: VersionedParcelParcel.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f4552d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f4553e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4554f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4555g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4556h;

    /* renamed from: i  reason: collision with root package name */
    private int f4557i;

    /* renamed from: j  reason: collision with root package name */
    private int f4558j;

    /* renamed from: k  reason: collision with root package name */
    private int f4559k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f4553e.writeInt(bArr.length);
            this.f4553e.writeByteArray(bArr);
            return;
        }
        this.f4553e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4553e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f4553e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f4553e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f4553e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f4557i;
        if (i10 >= 0) {
            int i11 = this.f4552d.get(i10);
            int dataPosition = this.f4553e.dataPosition();
            this.f4553e.setDataPosition(i11);
            this.f4553e.writeInt(dataPosition - i11);
            this.f4553e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f4553e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f4558j;
        if (i10 == this.f4554f) {
            i10 = this.f4555g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f4556h + "  ", this.f4549a, this.f4550b, this.f4551c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f4553e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f4553e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4553e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4553e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f4558j < this.f4555g) {
            int i11 = this.f4559k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f4553e.setDataPosition(this.f4558j);
            int readInt = this.f4553e.readInt();
            this.f4559k = this.f4553e.readInt();
            this.f4558j += readInt;
        }
        return this.f4559k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f4553e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f4553e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f4553e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f4557i = i10;
        this.f4552d.put(i10, this.f4553e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f4553e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4552d = new SparseIntArray();
        this.f4557i = -1;
        this.f4558j = 0;
        this.f4559k = -1;
        this.f4553e = parcel;
        this.f4554f = i10;
        this.f4555g = i11;
        this.f4558j = i10;
        this.f4556h = str;
    }
}

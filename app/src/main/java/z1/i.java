package z1;
/* compiled from: IntegerArrayAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements a<int[]> {
    @Override // z1.a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // z1.a
    public int b() {
        return 4;
    }

    @Override // z1.a
    /* renamed from: d */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // z1.a
    /* renamed from: e */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}

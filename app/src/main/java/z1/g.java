package z1;
/* compiled from: ByteArrayAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements a<byte[]> {
    @Override // z1.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // z1.a
    public int b() {
        return 1;
    }

    @Override // z1.a
    /* renamed from: d */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // z1.a
    /* renamed from: e */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}

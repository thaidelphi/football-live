package g2;

import s2.j;
import y1.v;
/* compiled from: BytesResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements v<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f25706a;

    public b(byte[] bArr) {
        this.f25706a = (byte[]) j.d(bArr);
    }

    @Override // y1.v
    public void a() {
    }

    @Override // y1.v
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // y1.v
    /* renamed from: c */
    public byte[] get() {
        return this.f25706a;
    }

    @Override // y1.v
    public int getSize() {
        return this.f25706a.length;
    }
}

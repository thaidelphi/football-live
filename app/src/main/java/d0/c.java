package d0;

import java.nio.ByteBuffer;
/* compiled from: Table.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f23872a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f23873b;

    /* renamed from: c  reason: collision with root package name */
    private int f23874c;

    /* renamed from: d  reason: collision with root package name */
    private int f23875d;

    /* renamed from: e  reason: collision with root package name */
    d f23876e = d.a();

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f23873b.getInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f23875d) {
            return this.f23873b.getShort(this.f23874c + i10);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        this.f23873b = byteBuffer;
        if (byteBuffer != null) {
            this.f23872a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f23874c = i11;
            this.f23875d = this.f23873b.getShort(i11);
            return;
        }
        this.f23872a = 0;
        this.f23874c = 0;
        this.f23875d = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f23872a;
        return i11 + this.f23873b.getInt(i11) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f23872a;
        return this.f23873b.getInt(i11 + this.f23873b.getInt(i11));
    }
}

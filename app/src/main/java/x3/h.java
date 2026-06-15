package x3;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
/* compiled from: BatchBuffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h extends q3.g {

    /* renamed from: i  reason: collision with root package name */
    private long f32468i;

    /* renamed from: j  reason: collision with root package name */
    private int f32469j;

    /* renamed from: k  reason: collision with root package name */
    private int f32470k;

    public h() {
        super(2);
        this.f32470k = 32;
    }

    private boolean w(q3.g gVar) {
        ByteBuffer byteBuffer;
        if (A()) {
            if (this.f32469j < this.f32470k && gVar.k() == k()) {
                ByteBuffer byteBuffer2 = gVar.f30091c;
                return byteBuffer2 == null || (byteBuffer = this.f30091c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }

    public boolean A() {
        return this.f32469j > 0;
    }

    public void B(int i10) {
        a5.a.a(i10 > 0);
        this.f32470k = i10;
    }

    @Override // q3.g, q3.a
    public void g() {
        super.g();
        this.f32469j = 0;
    }

    public boolean v(q3.g gVar) {
        a5.a.a(!gVar.s());
        a5.a.a(!gVar.j());
        a5.a.a(!gVar.l());
        if (w(gVar)) {
            int i10 = this.f32469j;
            this.f32469j = i10 + 1;
            if (i10 == 0) {
                this.f30093e = gVar.f30093e;
                if (gVar.n()) {
                    o(1);
                }
            }
            if (gVar.k()) {
                o(RecyclerView.UNDEFINED_DURATION);
            }
            ByteBuffer byteBuffer = gVar.f30091c;
            if (byteBuffer != null) {
                q(byteBuffer.remaining());
                this.f30091c.put(byteBuffer);
            }
            this.f32468i = gVar.f30093e;
            return true;
        }
        return false;
    }

    public long x() {
        return this.f30093e;
    }

    public long y() {
        return this.f32468i;
    }

    public int z() {
        return this.f32469j;
    }
}

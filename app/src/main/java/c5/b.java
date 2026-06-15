package c5;

import a5.c0;
import a5.p0;
import java.nio.ByteBuffer;
import n3.m1;
import n3.q;
import n3.z2;
/* compiled from: CameraMotionRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends n3.f {

    /* renamed from: n  reason: collision with root package name */
    private final q3.g f5449n;

    /* renamed from: o  reason: collision with root package name */
    private final c0 f5450o;

    /* renamed from: p  reason: collision with root package name */
    private long f5451p;

    /* renamed from: q  reason: collision with root package name */
    private a f5452q;

    /* renamed from: r  reason: collision with root package name */
    private long f5453r;

    public b() {
        super(6);
        this.f5449n = new q3.g(1);
        this.f5450o = new c0();
    }

    private float[] P(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f5450o.I(byteBuffer.array(), byteBuffer.limit());
        this.f5450o.K(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f5450o.p());
        }
        return fArr;
    }

    private void Q() {
        a aVar = this.f5452q;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // n3.f
    protected void F() {
        Q();
    }

    @Override // n3.f
    protected void H(long j10, boolean z10) {
        this.f5453r = Long.MIN_VALUE;
        Q();
    }

    @Override // n3.f
    protected void L(m1[] m1VarArr, long j10, long j11) {
        this.f5451p = j11;
    }

    @Override // n3.a3
    public int a(m1 m1Var) {
        if ("application/x-camera-motion".equals(m1Var.f28185l)) {
            return z2.a(4);
        }
        return z2.a(0);
    }

    @Override // n3.y2
    public boolean c() {
        return g();
    }

    @Override // n3.y2, n3.a3
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // n3.y2
    public boolean isReady() {
        return true;
    }

    @Override // n3.f, n3.t2.b
    public void j(int i10, Object obj) throws q {
        if (i10 == 8) {
            this.f5452q = (a) obj;
        } else {
            super.j(i10, obj);
        }
    }

    @Override // n3.y2
    public void s(long j10, long j11) {
        while (!g() && this.f5453r < 100000 + j10) {
            this.f5449n.g();
            if (M(A(), this.f5449n, 0) != -4 || this.f5449n.l()) {
                return;
            }
            q3.g gVar = this.f5449n;
            this.f5453r = gVar.f30093e;
            if (this.f5452q != null && !gVar.k()) {
                this.f5449n.r();
                float[] P = P((ByteBuffer) p0.j(this.f5449n.f30091c));
                if (P != null) {
                    ((a) p0.j(this.f5452q)).b(this.f5453r - this.f5451p, P);
                }
            }
        }
    }
}

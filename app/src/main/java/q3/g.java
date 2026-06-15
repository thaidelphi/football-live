package q3;

import java.nio.ByteBuffer;
import n3.j1;
/* compiled from: DecoderInputBuffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends q3.a {

    /* renamed from: b  reason: collision with root package name */
    public final c f30090b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f30091c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30092d;

    /* renamed from: e  reason: collision with root package name */
    public long f30093e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f30094f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30095g;

    /* renamed from: h  reason: collision with root package name */
    private final int f30096h;

    /* compiled from: DecoderInputBuffer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends IllegalStateException {

        /* renamed from: a  reason: collision with root package name */
        public final int f30097a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30098b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f30097a = i10;
            this.f30098b = i11;
        }
    }

    static {
        j1.a("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    private ByteBuffer p(int i10) {
        int i11 = this.f30095g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f30091c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static g t() {
        return new g(0);
    }

    @Override // q3.a
    public void g() {
        super.g();
        ByteBuffer byteBuffer = this.f30091c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f30094f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f30092d = false;
    }

    public void q(int i10) {
        int i11 = i10 + this.f30096h;
        ByteBuffer byteBuffer = this.f30091c;
        if (byteBuffer == null) {
            this.f30091c = p(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f30091c = byteBuffer;
            return;
        }
        ByteBuffer p10 = p(i12);
        p10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            p10.put(byteBuffer);
        }
        this.f30091c = p10;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.f30091c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f30094f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean s() {
        return i(1073741824);
    }

    public void u(int i10) {
        ByteBuffer byteBuffer = this.f30094f;
        if (byteBuffer != null && byteBuffer.capacity() >= i10) {
            this.f30094f.clear();
        } else {
            this.f30094f = ByteBuffer.allocate(i10);
        }
    }

    public g(int i10, int i11) {
        this.f30090b = new c();
        this.f30095g = i10;
        this.f30096h = i11;
    }
}

package g2;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferRewinder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f25705a;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: g2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0280a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f25705a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c */
    public ByteBuffer a() {
        this.f25705a.position(0);
        return this.f25705a;
    }
}

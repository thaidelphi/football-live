package c2;

import c2.n;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ByteArrayLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0107b<Data> f5327a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: c2.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0106a implements InterfaceC0107b<ByteBuffer> {
            C0106a() {
            }

            @Override // c2.b.InterfaceC0107b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // c2.b.InterfaceC0107b
            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // c2.o
        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0106a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: c2.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0107b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ByteArrayLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f5329a;

        /* renamed from: b  reason: collision with root package name */
        private final InterfaceC0107b<Data> f5330b;

        c(byte[] bArr, InterfaceC0107b<Data> interfaceC0107b) {
            this.f5329a = bArr;
            this.f5330b = interfaceC0107b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f5330b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public w1.a d() {
            return w1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.f((Data) this.f5330b.b(this.f5329a));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements InterfaceC0107b<InputStream> {
            a() {
            }

            @Override // c2.b.InterfaceC0107b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // c2.b.InterfaceC0107b
            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // c2.o
        public n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0107b<Data> interfaceC0107b) {
        this.f5327a = interfaceC0107b;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<Data> b(byte[] bArr, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(bArr), new c(bArr, this.f5327a));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }
}

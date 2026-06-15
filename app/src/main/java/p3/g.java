package p3;

import a5.p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: AudioProcessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f29684a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: AudioProcessor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f29685e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f29686a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29687b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29688c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29689d;

        public a(int i10, int i11, int i12) {
            this.f29686a = i10;
            this.f29687b = i11;
            this.f29688c = i12;
            this.f29689d = p0.u0(i12) ? p0.c0(i12, i11) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f29686a == aVar.f29686a && this.f29687b == aVar.f29687b && this.f29688c == aVar.f29688c;
            }
            return false;
        }

        public int hashCode() {
            return x5.f.b(Integer.valueOf(this.f29686a), Integer.valueOf(this.f29687b), Integer.valueOf(this.f29688c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f29686a + ", channelCount=" + this.f29687b + ", encoding=" + this.f29688c + ']';
        }
    }

    /* compiled from: AudioProcessor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    ByteBuffer a();

    a b(a aVar) throws b;

    boolean c();

    void d(ByteBuffer byteBuffer);

    void e();

    void flush();

    boolean isActive();

    void reset();
}

package p3;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import n3.m1;
import n3.o2;
import o3.q1;
/* compiled from: AudioSink.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface v {

    /* compiled from: AudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f29791a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29792b;

        /* renamed from: c  reason: collision with root package name */
        public final m1 f29793c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(int r3, int r4, int r5, int r6, n3.m1 r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L32
                java.lang.String r4 = " (recoverable)"
                goto L34
            L32:
                java.lang.String r4 = ""
            L34:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f29791a = r3
                r2.f29792b = r8
                r2.f29793c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p3.v.b.<init>(int, int, int, int, n3.m1, boolean, java.lang.Exception):void");
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a(boolean z10);

        void b(Exception exc);

        void c(long j10);

        void d();

        void e(int i10, long j10, long j11);

        void f();

        void g();
    }

    /* compiled from: AudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final long f29794a;

        /* renamed from: b  reason: collision with root package name */
        public final long f29795b;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f29794a = j10;
            this.f29795b = j11;
        }
    }

    /* compiled from: AudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final int f29796a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29797b;

        /* renamed from: c  reason: collision with root package name */
        public final m1 f29798c;

        public e(int i10, m1 m1Var, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f29797b = z10;
            this.f29796a = i10;
            this.f29798c = m1Var;
        }
    }

    boolean a(m1 m1Var);

    o2 b();

    boolean c();

    void d(o2 o2Var);

    void e();

    void f(AudioDeviceInfo audioDeviceInfo);

    void flush();

    boolean g();

    void h(int i10);

    void i();

    void j(m1 m1Var, int i10, int[] iArr) throws a;

    boolean k(ByteBuffer byteBuffer, long j10, int i10) throws b, e;

    void l();

    void m(c cVar);

    int n(m1 m1Var);

    void o() throws e;

    long p(boolean z10);

    void pause();

    void q(long j10);

    void r(p3.e eVar);

    void reset();

    void s();

    void setVolume(float f10);

    void t();

    void u(q1 q1Var);

    void v(boolean z10);

    void w(y yVar);

    /* compiled from: AudioSink.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final m1 f29790a;

        public a(Throwable th, m1 m1Var) {
            super(th);
            this.f29790a = m1Var;
        }

        public a(String str, m1 m1Var) {
            super(str);
            this.f29790a = m1Var;
        }
    }
}

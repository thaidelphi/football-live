package e4;

import android.os.Handler;
import java.io.IOException;
import n3.l3;
import n3.u1;
import o3.q1;
import z4.s0;
/* compiled from: MediaSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface t {

    /* compiled from: MediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
    }

    /* compiled from: MediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends r {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(r rVar) {
            super(rVar);
        }
    }

    /* compiled from: MediaSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a(t tVar, l3 l3Var);
    }

    u1 a();

    void b(c cVar);

    void c(c cVar);

    q d(b bVar, z4.b bVar2, long j10);

    void e(Handler handler, a0 a0Var);

    void g(q qVar);

    void h(Handler handler, com.google.android.exoplayer2.drm.k kVar);

    void j(com.google.android.exoplayer2.drm.k kVar);

    void k() throws IOException;

    boolean l();

    void n(c cVar);

    l3 o();

    void p(c cVar, s0 s0Var, q1 q1Var);

    void q(a0 a0Var);
}

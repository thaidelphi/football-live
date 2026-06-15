package k4;

import android.net.Uri;
import e4.a0;
import java.io.IOException;
import z4.i0;
/* compiled from: HlsPlaylistTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface l {

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        l a(j4.g gVar, i0 i0Var, k kVar);
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a();

        boolean f(Uri uri, i0.c cVar, boolean z10);
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f27263a;

        public c(Uri uri) {
            this.f27263a = uri;
        }
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f27264a;

        public d(Uri uri) {
            this.f27264a = uri;
        }
    }

    /* compiled from: HlsPlaylistTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        void f(g gVar);
    }

    void a(Uri uri) throws IOException;

    void b(b bVar);

    void c(b bVar);

    long d();

    h e();

    void f(Uri uri);

    void g(Uri uri, a0.a aVar, e eVar);

    boolean h(Uri uri);

    boolean j();

    boolean k(Uri uri, long j10);

    void l() throws IOException;

    g n(Uri uri, boolean z10);

    void stop();
}

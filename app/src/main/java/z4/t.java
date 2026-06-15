package z4;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z4.l;
import z4.v;
/* compiled from: DefaultDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f33642a;

    /* renamed from: b  reason: collision with root package name */
    private final List<s0> f33643b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final l f33644c;

    /* renamed from: d  reason: collision with root package name */
    private l f33645d;

    /* renamed from: e  reason: collision with root package name */
    private l f33646e;

    /* renamed from: f  reason: collision with root package name */
    private l f33647f;

    /* renamed from: g  reason: collision with root package name */
    private l f33648g;

    /* renamed from: h  reason: collision with root package name */
    private l f33649h;

    /* renamed from: i  reason: collision with root package name */
    private l f33650i;

    /* renamed from: j  reason: collision with root package name */
    private l f33651j;

    /* renamed from: k  reason: collision with root package name */
    private l f33652k;

    /* compiled from: DefaultDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f33653a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f33654b;

        /* renamed from: c  reason: collision with root package name */
        private s0 f33655c;

        public a(Context context) {
            this(context, new v.b());
        }

        @Override // z4.l.a
        /* renamed from: c */
        public t a() {
            t tVar = new t(this.f33653a, this.f33654b.a());
            s0 s0Var = this.f33655c;
            if (s0Var != null) {
                tVar.i(s0Var);
            }
            return tVar;
        }

        public a(Context context, l.a aVar) {
            this.f33653a = context.getApplicationContext();
            this.f33654b = aVar;
        }
    }

    public t(Context context, l lVar) {
        this.f33642a = context.getApplicationContext();
        this.f33644c = (l) a5.a.e(lVar);
    }

    private void o(l lVar) {
        for (int i10 = 0; i10 < this.f33643b.size(); i10++) {
            lVar.i(this.f33643b.get(i10));
        }
    }

    private l p() {
        if (this.f33646e == null) {
            c cVar = new c(this.f33642a);
            this.f33646e = cVar;
            o(cVar);
        }
        return this.f33646e;
    }

    private l q() {
        if (this.f33647f == null) {
            h hVar = new h(this.f33642a);
            this.f33647f = hVar;
            o(hVar);
        }
        return this.f33647f;
    }

    private l r() {
        if (this.f33650i == null) {
            j jVar = new j();
            this.f33650i = jVar;
            o(jVar);
        }
        return this.f33650i;
    }

    private l s() {
        if (this.f33645d == null) {
            z zVar = new z();
            this.f33645d = zVar;
            o(zVar);
        }
        return this.f33645d;
    }

    private l t() {
        if (this.f33651j == null) {
            n0 n0Var = new n0(this.f33642a);
            this.f33651j = n0Var;
            o(n0Var);
        }
        return this.f33651j;
    }

    private l u() {
        if (this.f33648g == null) {
            try {
                l lVar = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f33648g = lVar;
                o(lVar);
            } catch (ClassNotFoundException unused) {
                a5.t.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e8) {
                throw new RuntimeException("Error instantiating RTMP extension", e8);
            }
            if (this.f33648g == null) {
                this.f33648g = this.f33644c;
            }
        }
        return this.f33648g;
    }

    private l v() {
        if (this.f33649h == null) {
            t0 t0Var = new t0();
            this.f33649h = t0Var;
            o(t0Var);
        }
        return this.f33649h;
    }

    private void w(l lVar, s0 s0Var) {
        if (lVar != null) {
            lVar.i(s0Var);
        }
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws IOException {
        return ((l) a5.a.e(this.f33652k)).b(bArr, i10, i11);
    }

    @Override // z4.l
    public void close() throws IOException {
        l lVar = this.f33652k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f33652k = null;
            }
        }
    }

    @Override // z4.l
    public Map<String, List<String>> d() {
        l lVar = this.f33652k;
        return lVar == null ? Collections.emptyMap() : lVar.d();
    }

    @Override // z4.l
    public void i(s0 s0Var) {
        a5.a.e(s0Var);
        this.f33644c.i(s0Var);
        this.f33643b.add(s0Var);
        w(this.f33645d, s0Var);
        w(this.f33646e, s0Var);
        w(this.f33647f, s0Var);
        w(this.f33648g, s0Var);
        w(this.f33649h, s0Var);
        w(this.f33650i, s0Var);
        w(this.f33651j, s0Var);
    }

    @Override // z4.l
    public long l(p pVar) throws IOException {
        a5.a.f(this.f33652k == null);
        String scheme = pVar.f33569a.getScheme();
        if (a5.p0.w0(pVar.f33569a)) {
            String path = pVar.f33569a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f33652k = p();
            } else {
                this.f33652k = s();
            }
        } else if ("asset".equals(scheme)) {
            this.f33652k = p();
        } else if ("content".equals(scheme)) {
            this.f33652k = q();
        } else if ("rtmp".equals(scheme)) {
            this.f33652k = u();
        } else if ("udp".equals(scheme)) {
            this.f33652k = v();
        } else if ("data".equals(scheme)) {
            this.f33652k = r();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f33652k = this.f33644c;
        } else {
            this.f33652k = t();
        }
        return this.f33652k.l(pVar);
    }

    @Override // z4.l
    public Uri m() {
        l lVar = this.f33652k;
        if (lVar == null) {
            return null;
        }
        return lVar.m();
    }
}

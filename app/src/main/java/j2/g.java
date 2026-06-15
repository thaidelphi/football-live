package j2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w1.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GifFrameLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final v1.a f26811a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f26812b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f26813c;

    /* renamed from: d  reason: collision with root package name */
    final k f26814d;

    /* renamed from: e  reason: collision with root package name */
    private final z1.e f26815e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26816f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26817g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26818h;

    /* renamed from: i  reason: collision with root package name */
    private com.bumptech.glide.j<Bitmap> f26819i;

    /* renamed from: j  reason: collision with root package name */
    private a f26820j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f26821k;

    /* renamed from: l  reason: collision with root package name */
    private a f26822l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f26823m;

    /* renamed from: n  reason: collision with root package name */
    private l<Bitmap> f26824n;

    /* renamed from: o  reason: collision with root package name */
    private a f26825o;

    /* renamed from: p  reason: collision with root package name */
    private d f26826p;

    /* renamed from: q  reason: collision with root package name */
    private int f26827q;

    /* renamed from: r  reason: collision with root package name */
    private int f26828r;

    /* renamed from: s  reason: collision with root package name */
    private int f26829s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifFrameLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends p2.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f26830d;

        /* renamed from: e  reason: collision with root package name */
        final int f26831e;

        /* renamed from: f  reason: collision with root package name */
        private final long f26832f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap f26833g;

        a(Handler handler, int i10, long j10) {
            this.f26830d = handler;
            this.f26831e = i10;
            this.f26832f = j10;
        }

        @Override // p2.h
        public void f(Drawable drawable) {
            this.f26833g = null;
        }

        Bitmap i() {
            return this.f26833g;
        }

        @Override // p2.h
        /* renamed from: j */
        public void a(Bitmap bitmap, q2.b<? super Bitmap> bVar) {
            this.f26833g = bitmap;
            this.f26830d.sendMessageAtTime(this.f26830d.obtainMessage(1, this), this.f26832f);
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            } else if (i10 == 2) {
                g.this.f26814d.m((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifFrameLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.bumptech.glide.b bVar, v1.a aVar, int i10, int i11, l<Bitmap> lVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i10, i11), lVar, bitmap);
    }

    private static w1.f g() {
        return new r2.d(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i10, int i11) {
        return kVar.j().c(o2.f.i0(y1.j.f32925b).g0(true).b0(true).S(i10, i11));
    }

    private void l() {
        if (!this.f26816f || this.f26817g) {
            return;
        }
        if (this.f26818h) {
            s2.j.a(this.f26825o == null, "Pending target must be null when starting from the first frame");
            this.f26811a.f();
            this.f26818h = false;
        }
        a aVar = this.f26825o;
        if (aVar != null) {
            this.f26825o = null;
            m(aVar);
            return;
        }
        this.f26817g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f26811a.e();
        this.f26811a.b();
        this.f26822l = new a(this.f26812b, this.f26811a.g(), uptimeMillis);
        this.f26819i.c(o2.f.j0(g())).v0(this.f26811a).p0(this.f26822l);
    }

    private void n() {
        Bitmap bitmap = this.f26823m;
        if (bitmap != null) {
            this.f26815e.c(bitmap);
            this.f26823m = null;
        }
    }

    private void p() {
        if (this.f26816f) {
            return;
        }
        this.f26816f = true;
        this.f26821k = false;
        l();
    }

    private void q() {
        this.f26816f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f26813c.clear();
        n();
        q();
        a aVar = this.f26820j;
        if (aVar != null) {
            this.f26814d.m(aVar);
            this.f26820j = null;
        }
        a aVar2 = this.f26822l;
        if (aVar2 != null) {
            this.f26814d.m(aVar2);
            this.f26822l = null;
        }
        a aVar3 = this.f26825o;
        if (aVar3 != null) {
            this.f26814d.m(aVar3);
            this.f26825o = null;
        }
        this.f26811a.clear();
        this.f26821k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f26811a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f26820j;
        return aVar != null ? aVar.i() : this.f26823m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f26820j;
        if (aVar != null) {
            return aVar.f26831e;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f26823m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f26811a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f26829s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f26811a.h() + this.f26827q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f26828r;
    }

    void m(a aVar) {
        d dVar = this.f26826p;
        if (dVar != null) {
            dVar.a();
        }
        this.f26817g = false;
        if (this.f26821k) {
            this.f26812b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f26816f) {
            if (this.f26818h) {
                this.f26812b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.f26825o = aVar;
            }
        } else {
            if (aVar.i() != null) {
                n();
                a aVar2 = this.f26820j;
                this.f26820j = aVar;
                for (int size = this.f26813c.size() - 1; size >= 0; size--) {
                    this.f26813c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f26812b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(l<Bitmap> lVar, Bitmap bitmap) {
        this.f26824n = (l) s2.j.d(lVar);
        this.f26823m = (Bitmap) s2.j.d(bitmap);
        this.f26819i = this.f26819i.c(new o2.f().e0(lVar));
        this.f26827q = s2.k.g(bitmap);
        this.f26828r = bitmap.getWidth();
        this.f26829s = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(b bVar) {
        if (!this.f26821k) {
            if (!this.f26813c.contains(bVar)) {
                boolean isEmpty = this.f26813c.isEmpty();
                this.f26813c.add(bVar);
                if (isEmpty) {
                    p();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(b bVar) {
        this.f26813c.remove(bVar);
        if (this.f26813c.isEmpty()) {
            q();
        }
    }

    g(z1.e eVar, k kVar, v1.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, l<Bitmap> lVar, Bitmap bitmap) {
        this.f26813c = new ArrayList();
        this.f26814d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f26815e = eVar;
        this.f26812b = handler;
        this.f26819i = jVar;
        this.f26811a = aVar;
        o(lVar, bitmap);
    }
}

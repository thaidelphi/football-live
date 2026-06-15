package y1;

import c2.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import y1.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceCacheGenerator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w implements f, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final f.a f33024a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f33025b;

    /* renamed from: c  reason: collision with root package name */
    private int f33026c;

    /* renamed from: d  reason: collision with root package name */
    private int f33027d = -1;

    /* renamed from: e  reason: collision with root package name */
    private w1.f f33028e;

    /* renamed from: f  reason: collision with root package name */
    private List<c2.n<File, ?>> f33029f;

    /* renamed from: g  reason: collision with root package name */
    private int f33030g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a<?> f33031h;

    /* renamed from: i  reason: collision with root package name */
    private File f33032i;

    /* renamed from: j  reason: collision with root package name */
    private x f33033j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(g<?> gVar, f.a aVar) {
        this.f33025b = gVar;
        this.f33024a = aVar;
    }

    private boolean a() {
        return this.f33030g < this.f33029f.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f33024a.a(this.f33033j, exc, this.f33031h.f5374c, w1.a.RESOURCE_DISK_CACHE);
    }

    @Override // y1.f
    public void cancel() {
        n.a<?> aVar = this.f33031h;
        if (aVar != null) {
            aVar.f5374c.cancel();
        }
    }

    @Override // y1.f
    public boolean d() {
        List<w1.f> c10 = this.f33025b.c();
        boolean z10 = false;
        if (c10.isEmpty()) {
            return false;
        }
        List<Class<?>> m7 = this.f33025b.m();
        if (m7.isEmpty()) {
            if (File.class.equals(this.f33025b.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f33025b.i() + " to " + this.f33025b.q());
        }
        while (true) {
            if (this.f33029f != null && a()) {
                this.f33031h = null;
                while (!z10 && a()) {
                    List<c2.n<File, ?>> list = this.f33029f;
                    int i10 = this.f33030g;
                    this.f33030g = i10 + 1;
                    this.f33031h = list.get(i10).b(this.f33032i, this.f33025b.s(), this.f33025b.f(), this.f33025b.k());
                    if (this.f33031h != null && this.f33025b.t(this.f33031h.f5374c.a())) {
                        this.f33031h.f5374c.e(this.f33025b.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f33027d + 1;
            this.f33027d = i11;
            if (i11 >= m7.size()) {
                int i12 = this.f33026c + 1;
                this.f33026c = i12;
                if (i12 >= c10.size()) {
                    return false;
                }
                this.f33027d = 0;
            }
            w1.f fVar = c10.get(this.f33026c);
            Class<?> cls = m7.get(this.f33027d);
            this.f33033j = new x(this.f33025b.b(), fVar, this.f33025b.o(), this.f33025b.s(), this.f33025b.f(), this.f33025b.r(cls), cls, this.f33025b.k());
            File b10 = this.f33025b.d().b(this.f33033j);
            this.f33032i = b10;
            if (b10 != null) {
                this.f33028e = fVar;
                this.f33029f = this.f33025b.j(b10);
                this.f33030g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f33024a.b(this.f33028e, obj, this.f33031h.f5374c, w1.a.RESOURCE_DISK_CACHE, this.f33033j);
    }
}

package y1;

import c2.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import y1.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataCacheGenerator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements f, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final List<w1.f> f32839a;

    /* renamed from: b  reason: collision with root package name */
    private final g<?> f32840b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f32841c;

    /* renamed from: d  reason: collision with root package name */
    private int f32842d;

    /* renamed from: e  reason: collision with root package name */
    private w1.f f32843e;

    /* renamed from: f  reason: collision with root package name */
    private List<c2.n<File, ?>> f32844f;

    /* renamed from: g  reason: collision with root package name */
    private int f32845g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a<?> f32846h;

    /* renamed from: i  reason: collision with root package name */
    private File f32847i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f32845g < this.f32844f.size();
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f32841c.a(this.f32843e, exc, this.f32846h.f5374c, w1.a.DATA_DISK_CACHE);
    }

    @Override // y1.f
    public void cancel() {
        n.a<?> aVar = this.f32846h;
        if (aVar != null) {
            aVar.f5374c.cancel();
        }
    }

    @Override // y1.f
    public boolean d() {
        while (true) {
            boolean z10 = false;
            if (this.f32844f != null && a()) {
                this.f32846h = null;
                while (!z10 && a()) {
                    List<c2.n<File, ?>> list = this.f32844f;
                    int i10 = this.f32845g;
                    this.f32845g = i10 + 1;
                    this.f32846h = list.get(i10).b(this.f32847i, this.f32840b.s(), this.f32840b.f(), this.f32840b.k());
                    if (this.f32846h != null && this.f32840b.t(this.f32846h.f5374c.a())) {
                        this.f32846h.f5374c.e(this.f32840b.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f32842d + 1;
            this.f32842d = i11;
            if (i11 >= this.f32839a.size()) {
                return false;
            }
            w1.f fVar = this.f32839a.get(this.f32842d);
            File b10 = this.f32840b.d().b(new d(fVar, this.f32840b.o()));
            this.f32847i = b10;
            if (b10 != null) {
                this.f32843e = fVar;
                this.f32844f = this.f32840b.j(b10);
                this.f32845g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f32841c.b(this.f32843e, obj, this.f32846h.f5374c, w1.a.DATA_DISK_CACHE, this.f32843e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<w1.f> list, g<?> gVar, f.a aVar) {
        this.f32842d = -1;
        this.f32839a = list;
        this.f32840b = gVar;
        this.f32841c = aVar;
    }
}

package c2;

import c2.n;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: MultiModelLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n<Model, Data>> f5379a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.core.util.f<List<Throwable>> f5380b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f5381a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.util.f<List<Throwable>> f5382b;

        /* renamed from: c  reason: collision with root package name */
        private int f5383c;

        /* renamed from: d  reason: collision with root package name */
        private com.bumptech.glide.g f5384d;

        /* renamed from: e  reason: collision with root package name */
        private d.a<? super Data> f5385e;

        /* renamed from: f  reason: collision with root package name */
        private List<Throwable> f5386f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f5387g;

        a(List<com.bumptech.glide.load.data.d<Data>> list, androidx.core.util.f<List<Throwable>> fVar) {
            this.f5382b = fVar;
            s2.j.c(list);
            this.f5381a = list;
            this.f5383c = 0;
        }

        private void g() {
            if (this.f5387g) {
                return;
            }
            if (this.f5383c < this.f5381a.size() - 1) {
                this.f5383c++;
                e(this.f5384d, this.f5385e);
                return;
            }
            s2.j.d(this.f5386f);
            this.f5385e.c(new y1.q("Fetch failed", new ArrayList(this.f5386f)));
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f5381a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f5386f;
            if (list != null) {
                this.f5382b.a(list);
            }
            this.f5386f = null;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f5381a) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) s2.j.d(this.f5386f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f5387g = true;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f5381a) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public w1.a d() {
            return this.f5381a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f5384d = gVar;
            this.f5385e = aVar;
            this.f5386f = this.f5382b.b();
            this.f5381a.get(this.f5383c).e(gVar, this);
            if (this.f5387g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.f5385e.f(data);
            } else {
                g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(List<n<Model, Data>> list, androidx.core.util.f<List<Throwable>> fVar) {
        this.f5379a = list;
        this.f5380b = fVar;
    }

    @Override // c2.n
    public boolean a(Model model) {
        for (n<Model, Data> nVar : this.f5379a) {
            if (nVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // c2.n
    public n.a<Data> b(Model model, int i10, int i11, w1.h hVar) {
        n.a<Data> b10;
        int size = this.f5379a.size();
        ArrayList arrayList = new ArrayList(size);
        w1.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n<Model, Data> nVar = this.f5379a.get(i12);
            if (nVar.a(model) && (b10 = nVar.b(model, i10, i11, hVar)) != null) {
                fVar = b10.f5372a;
                arrayList.add(b10.f5374c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f5380b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f5379a.toArray()) + '}';
    }
}

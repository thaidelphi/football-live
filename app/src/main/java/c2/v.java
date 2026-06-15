package c2;

import c2.n;
import com.bumptech.glide.load.data.d;
/* compiled from: UnitModelLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    private static final v<?> f5405a = new v<>();

    /* compiled from: UnitModelLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        private static final a<?> f5406a = new a<>();

        public static <T> a<T> a() {
            return (a<T>) f5406a;
        }

        @Override // c2.o
        public n<Model, Model> b(r rVar) {
            return v.c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a  reason: collision with root package name */
        private final Model f5407a;

        b(Model model) {
            this.f5407a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f5407a.getClass();
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
        public void e(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.f((Model) this.f5407a);
        }
    }

    public static <T> v<T> c() {
        return (v<T>) f5405a;
    }

    @Override // c2.n
    public boolean a(Model model) {
        return true;
    }

    @Override // c2.n
    public n.a<Model> b(Model model, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(model), new b(model));
    }
}

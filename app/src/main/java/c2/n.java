package c2;

import java.util.Collections;
import java.util.List;
/* compiled from: ModelLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final w1.f f5372a;

        /* renamed from: b  reason: collision with root package name */
        public final List<w1.f> f5373b;

        /* renamed from: c  reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f5374c;

        public a(w1.f fVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(w1.f fVar, List<w1.f> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f5372a = (w1.f) s2.j.d(fVar);
            this.f5373b = (List) s2.j.d(list);
            this.f5374c = (com.bumptech.glide.load.data.d) s2.j.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, w1.h hVar);
}

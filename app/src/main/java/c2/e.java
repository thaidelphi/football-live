package c2;

import android.util.Base64;
import c2.n;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DataUrlLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Data> f5333a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final String f5334a;

        /* renamed from: b  reason: collision with root package name */
        private final a<Data> f5335b;

        /* renamed from: c  reason: collision with root package name */
        private Data f5336c;

        b(String str, a<Data> aVar) {
            this.f5334a = str;
            this.f5335b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f5335b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f5335b.b(this.f5336c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public w1.a d() {
            return w1.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f5335b.c(this.f5334a);
                this.f5336c = c10;
                aVar.f(c10);
            } catch (IllegalArgumentException e8) {
                aVar.c(e8);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final a<InputStream> f5337a = new a();

        /* compiled from: DataUrlLoader.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements a<InputStream> {
            a() {
            }

            @Override // c2.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // c2.e.a
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // c2.e.a
            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // c2.o
        public n<Model, InputStream> b(r rVar) {
            return new e(this.f5337a);
        }
    }

    public e(a<Data> aVar) {
        this.f5333a = aVar;
    }

    @Override // c2.n
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // c2.n
    public n.a<Data> b(Model model, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(model), new b(model.toString(), this.f5333a));
    }
}

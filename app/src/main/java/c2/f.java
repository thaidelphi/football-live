package c2;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import c2.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: FileLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final d<Data> f5339a;

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final d<Data> f5340a;

        public a(d<Data> dVar) {
            this.f5340a = dVar;
        }

        @Override // c2.o
        public final n<File, Data> b(r rVar) {
            return new f(this.f5340a);
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // c2.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // c2.f.d
            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // c2.f.d
            /* renamed from: e */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final File f5341a;

        /* renamed from: b  reason: collision with root package name */
        private final d<Data> f5342b;

        /* renamed from: c  reason: collision with root package name */
        private Data f5343c;

        c(File file, d<Data> dVar) {
            this.f5341a = file;
            this.f5342b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f5342b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f5343c;
            if (data != null) {
                try {
                    this.f5342b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public w1.a d() {
            return w1.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f5342b.c(this.f5341a);
                this.f5343c = c10;
                aVar.f(c10);
            } catch (FileNotFoundException e8) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e8);
                }
                aVar.c(e8);
            }
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            @Override // c2.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // c2.f.d
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // c2.f.d
            /* renamed from: e */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f5339a = dVar;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<Data> b(File file, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(file), new c(file, this.f5339a));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}

package f2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: ImageReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
interface s {

    /* compiled from: ImageReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f25364a;

        /* renamed from: b  reason: collision with root package name */
        private final z1.b f25365b;

        /* renamed from: c  reason: collision with root package name */
        private final List<ImageHeaderParser> f25366c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(InputStream inputStream, List<ImageHeaderParser> list, z1.b bVar) {
            this.f25365b = (z1.b) s2.j.d(bVar);
            this.f25366c = (List) s2.j.d(list);
            this.f25364a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // f2.s
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f25364a.a(), null, options);
        }

        @Override // f2.s
        public void b() {
            this.f25364a.c();
        }

        @Override // f2.s
        public int c() throws IOException {
            return com.bumptech.glide.load.a.b(this.f25366c, this.f25364a.a(), this.f25365b);
        }

        @Override // f2.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.f25366c, this.f25364a.a(), this.f25365b);
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        private final z1.b f25367a;

        /* renamed from: b  reason: collision with root package name */
        private final List<ImageHeaderParser> f25368b;

        /* renamed from: c  reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f25369c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, z1.b bVar) {
            this.f25367a = (z1.b) s2.j.d(bVar);
            this.f25368b = (List) s2.j.d(list);
            this.f25369c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // f2.s
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f25369c.a().getFileDescriptor(), null, options);
        }

        @Override // f2.s
        public void b() {
        }

        @Override // f2.s
        public int c() throws IOException {
            return com.bumptech.glide.load.a.a(this.f25368b, this.f25369c, this.f25367a);
        }

        @Override // f2.s
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.d(this.f25368b, this.f25369c, this.f25367a);
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}

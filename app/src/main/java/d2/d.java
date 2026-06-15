package d2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import c2.n;
import c2.o;
import c2.r;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import w1.h;
/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23942a;

    /* renamed from: b  reason: collision with root package name */
    private final n<File, DataT> f23943b;

    /* renamed from: c  reason: collision with root package name */
    private final n<Uri, DataT> f23944c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<DataT> f23945d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f23946a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<DataT> f23947b;

        a(Context context, Class<DataT> cls) {
            this.f23946a = context;
            this.f23947b = cls;
        }

        @Override // c2.o
        public final n<Uri, DataT> b(r rVar) {
            return new d(this.f23946a, rVar.d(File.class, this.f23947b), rVar.d(Uri.class, this.f23947b), this.f23947b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: d2.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0262d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k  reason: collision with root package name */
        private static final String[] f23948k = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f23949a;

        /* renamed from: b  reason: collision with root package name */
        private final n<File, DataT> f23950b;

        /* renamed from: c  reason: collision with root package name */
        private final n<Uri, DataT> f23951c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f23952d;

        /* renamed from: e  reason: collision with root package name */
        private final int f23953e;

        /* renamed from: f  reason: collision with root package name */
        private final int f23954f;

        /* renamed from: g  reason: collision with root package name */
        private final h f23955g;

        /* renamed from: h  reason: collision with root package name */
        private final Class<DataT> f23956h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f23957i;

        /* renamed from: j  reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f23958j;

        C0262d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, h hVar, Class<DataT> cls) {
            this.f23949a = context.getApplicationContext();
            this.f23950b = nVar;
            this.f23951c = nVar2;
            this.f23952d = uri;
            this.f23953e = i10;
            this.f23954f = i11;
            this.f23955g = hVar;
            this.f23956h = cls;
        }

        private n.a<DataT> c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f23950b.b(h(this.f23952d), this.f23953e, this.f23954f, this.f23955g);
            }
            return this.f23951c.b(g() ? MediaStore.setRequireOriginal(this.f23952d) : this.f23952d, this.f23953e, this.f23954f, this.f23955g);
        }

        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            n.a<DataT> c10 = c();
            if (c10 != null) {
                return c10.f5374c;
            }
            return null;
        }

        private boolean g() {
            return this.f23949a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.f23949a.getContentResolver().query(uri, f23948k, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f23956h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f23958j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f23957i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f23958j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public w1.a d() {
            return w1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> f10 = f();
                if (f10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f23952d));
                    return;
                }
                this.f23958j = f10;
                if (this.f23957i) {
                    cancel();
                } else {
                    f10.e(gVar, aVar);
                }
            } catch (FileNotFoundException e8) {
                aVar.c(e8);
            }
        }
    }

    d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f23942a = context.getApplicationContext();
        this.f23943b = nVar;
        this.f23944c = nVar2;
        this.f23945d = cls;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<DataT> b(Uri uri, int i10, int i11, h hVar) {
        return new n.a<>(new r2.d(uri), new C0262d(this.f23942a, this.f23943b, this.f23944c, uri, i10, i11, hVar, this.f23945d));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && x1.b.b(uri);
    }
}

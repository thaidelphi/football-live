package c2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import c2.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: MediaStoreFileLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5361a;

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5362a;

        public a(Context context) {
            this.f5362a = context;
        }

        @Override // c2.o
        public n<Uri, File> b(r rVar) {
            return new k(this.f5362a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f5363c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        private final Context f5364a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f5365b;

        b(Context context, Uri uri) {
            this.f5364a = context;
            this.f5365b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
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
        public void e(com.bumptech.glide.g gVar, d.a<? super File> aVar) {
            Cursor query = this.f5364a.getContentResolver().query(this.f5365b, f5363c, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(r0)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f5365b));
                return;
            }
            aVar.f(new File(r0));
        }
    }

    public k(Context context) {
        this.f5361a = context;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<File> b(Uri uri, int i10, int i11, w1.h hVar) {
        return new n.a<>(new r2.d(uri), new b(this.f5361a, uri));
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return x1.b.b(uri);
    }
}

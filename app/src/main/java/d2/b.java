package d2;

import android.content.Context;
import android.net.Uri;
import c2.n;
import c2.o;
import c2.r;
import java.io.InputStream;
import w1.h;
/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23938a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f23939a;

        public a(Context context) {
            this.f23939a = context;
        }

        @Override // c2.o
        public n<Uri, InputStream> b(r rVar) {
            return new b(this.f23939a);
        }
    }

    public b(Context context) {
        this.f23938a = context.getApplicationContext();
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i10, int i11, h hVar) {
        if (x1.b.d(i10, i11)) {
            return new n.a<>(new r2.d(uri), x1.c.f(this.f23938a, uri));
        }
        return null;
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return x1.b.a(uri);
    }
}

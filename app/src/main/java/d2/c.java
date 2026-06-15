package d2;

import android.content.Context;
import android.net.Uri;
import c2.n;
import c2.o;
import c2.r;
import f2.c0;
import java.io.InputStream;
import w1.h;
/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23940a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f23941a;

        public a(Context context) {
            this.f23941a = context;
        }

        @Override // c2.o
        public n<Uri, InputStream> b(r rVar) {
            return new c(this.f23941a);
        }
    }

    public c(Context context) {
        this.f23940a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l10 = (Long) hVar.c(c0.f25301d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<InputStream> b(Uri uri, int i10, int i11, h hVar) {
        if (x1.b.d(i10, i11) && e(hVar)) {
            return new n.a<>(new r2.d(uri), x1.c.g(this.f23940a, uri));
        }
        return null;
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return x1.b.c(uri);
    }
}

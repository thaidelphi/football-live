package c2;

import android.net.Uri;
import c2.n;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UrlUriLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f5413b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));

    /* renamed from: a  reason: collision with root package name */
    private final n<g, Data> f5414a;

    /* compiled from: UrlUriLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // c2.o
        public n<Uri, InputStream> b(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f5414a = nVar;
    }

    @Override // c2.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i10, int i11, w1.h hVar) {
        return this.f5414a.b(new g(uri.toString()), i10, i11, hVar);
    }

    @Override // c2.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return f5413b.contains(uri.getScheme());
    }
}

package c1;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WebViewAssetLoader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f5312a;

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5313a;

        /* renamed from: b  reason: collision with root package name */
        private String f5314b = "appassets.androidplatform.net";

        /* renamed from: c  reason: collision with root package name */
        private final List<androidx.core.util.e<String, b>> f5315c = new ArrayList();

        public a a(String str, b bVar) {
            this.f5315c.add(androidx.core.util.e.a(str, bVar));
            return this;
        }

        public g b() {
            ArrayList arrayList = new ArrayList();
            for (androidx.core.util.e<String, b> eVar : this.f5315c) {
                arrayList.add(new c(this.f5314b, eVar.f2786a, this.f5313a, eVar.f2787b));
            }
            return new g(arrayList);
        }

        public a c(String str) {
            this.f5314b = str;
            return this;
        }
    }

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        WebResourceResponse a(String str);
    }

    /* compiled from: WebViewAssetLoader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        final boolean f5316a;

        /* renamed from: b  reason: collision with root package name */
        final String f5317b;

        /* renamed from: c  reason: collision with root package name */
        final String f5318c;

        /* renamed from: d  reason: collision with root package name */
        final b f5319d;

        c(String str, String str2, boolean z10, b bVar) {
            if (!str2.isEmpty() && str2.charAt(0) == '/') {
                if (str2.endsWith("/")) {
                    this.f5317b = str;
                    this.f5318c = str2;
                    this.f5316a = z10;
                    this.f5319d = bVar;
                    return;
                }
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }

        public String a(String str) {
            return str.replaceFirst(this.f5318c, "");
        }

        public b b(Uri uri) {
            if (!uri.getScheme().equals("http") || this.f5316a) {
                if ((uri.getScheme().equals("http") || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && uri.getAuthority().equals(this.f5317b) && uri.getPath().startsWith(this.f5318c)) {
                    return this.f5319d;
                }
                return null;
            }
            return null;
        }
    }

    g(List<c> list) {
        this.f5312a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse a10;
        for (c cVar : this.f5312a) {
            b b10 = cVar.b(uri);
            if (b10 != null && (a10 = b10.a(cVar.a(uri.getPath()))) != null) {
                return a10;
            }
        }
        return null;
    }
}

package c2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: GlideUrl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g implements w1.f {

    /* renamed from: b  reason: collision with root package name */
    private final h f5344b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f5345c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5346d;

    /* renamed from: e  reason: collision with root package name */
    private String f5347e;

    /* renamed from: f  reason: collision with root package name */
    private URL f5348f;

    /* renamed from: g  reason: collision with root package name */
    private volatile byte[] f5349g;

    /* renamed from: h  reason: collision with root package name */
    private int f5350h;

    public g(URL url) {
        this(url, h.f5352b);
    }

    private byte[] d() {
        if (this.f5349g == null) {
            this.f5349g = c().getBytes(w1.f.f31964a);
        }
        return this.f5349g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f5347e)) {
            String str = this.f5346d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) s2.j.d(this.f5345c)).toString();
            }
            this.f5347e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f5347e;
    }

    private URL g() throws MalformedURLException {
        if (this.f5348f == null) {
            this.f5348f = new URL(f());
        }
        return this.f5348f;
    }

    @Override // w1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f5346d;
        return str != null ? str : ((URL) s2.j.d(this.f5345c)).toString();
    }

    public Map<String, String> e() {
        return this.f5344b.a();
    }

    @Override // w1.f
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return c().equals(gVar.c()) && this.f5344b.equals(gVar.f5344b);
        }
        return false;
    }

    public URL h() throws MalformedURLException {
        return g();
    }

    @Override // w1.f
    public int hashCode() {
        if (this.f5350h == 0) {
            int hashCode = c().hashCode();
            this.f5350h = hashCode;
            this.f5350h = (hashCode * 31) + this.f5344b.hashCode();
        }
        return this.f5350h;
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f5352b);
    }

    public g(URL url, h hVar) {
        this.f5345c = (URL) s2.j.d(url);
        this.f5346d = null;
        this.f5344b = (h) s2.j.d(hVar);
    }

    public g(String str, h hVar) {
        this.f5345c = null;
        this.f5346d = s2.j.b(str);
        this.f5344b = (h) s2.j.d(hVar);
    }
}

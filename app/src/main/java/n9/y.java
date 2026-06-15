package n9;

import com.ironsource.in;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import n9.r;
/* compiled from: Request.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    final s f29007a;

    /* renamed from: b  reason: collision with root package name */
    final String f29008b;

    /* renamed from: c  reason: collision with root package name */
    final r f29009c;

    /* renamed from: d  reason: collision with root package name */
    final z f29010d;

    /* renamed from: e  reason: collision with root package name */
    final Map<Class<?>, Object> f29011e;

    /* renamed from: f  reason: collision with root package name */
    private volatile d f29012f;

    y(a aVar) {
        this.f29007a = aVar.f29013a;
        this.f29008b = aVar.f29014b;
        this.f29009c = aVar.f29015c.d();
        this.f29010d = aVar.f29016d;
        this.f29011e = o9.c.v(aVar.f29017e);
    }

    public z a() {
        return this.f29010d;
    }

    public d b() {
        d dVar = this.f29012f;
        if (dVar != null) {
            return dVar;
        }
        d k10 = d.k(this.f29009c);
        this.f29012f = k10;
        return k10;
    }

    public String c(String str) {
        return this.f29009c.c(str);
    }

    public List<String> d(String str) {
        return this.f29009c.j(str);
    }

    public r e() {
        return this.f29009c;
    }

    public boolean f() {
        return this.f29007a.m();
    }

    public String g() {
        return this.f29008b;
    }

    public a h() {
        return new a(this);
    }

    public s i() {
        return this.f29007a;
    }

    public String toString() {
        return "Request{method=" + this.f29008b + ", url=" + this.f29007a + ", tags=" + this.f29011e + '}';
    }

    /* compiled from: Request.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        s f29013a;

        /* renamed from: b  reason: collision with root package name */
        String f29014b;

        /* renamed from: c  reason: collision with root package name */
        r.a f29015c;

        /* renamed from: d  reason: collision with root package name */
        z f29016d;

        /* renamed from: e  reason: collision with root package name */
        Map<Class<?>, Object> f29017e;

        public a() {
            this.f29017e = Collections.emptyMap();
            this.f29014b = in.f17848a;
            this.f29015c = new r.a();
        }

        public a a(String str, String str2) {
            this.f29015c.a(str, str2);
            return this;
        }

        public y b() {
            if (this.f29013a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a c(d dVar) {
            String dVar2 = dVar.toString();
            return dVar2.isEmpty() ? g("Cache-Control") : d("Cache-Control", dVar2);
        }

        public a d(String str, String str2) {
            this.f29015c.g(str, str2);
            return this;
        }

        public a e(r rVar) {
            this.f29015c = rVar.f();
            return this;
        }

        public a f(String str, z zVar) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (zVar != null && !r9.f.b(str)) {
                    throw new IllegalArgumentException("method " + str + " must not have a request body.");
                } else if (zVar == null && r9.f.e(str)) {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                } else {
                    this.f29014b = str;
                    this.f29016d = zVar;
                    return this;
                }
            }
            throw new IllegalArgumentException("method.length() == 0");
        }

        public a g(String str) {
            this.f29015c.f(str);
            return this;
        }

        public a h(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return i(s.k(str));
        }

        public a i(s sVar) {
            Objects.requireNonNull(sVar, "url == null");
            this.f29013a = sVar;
            return this;
        }

        a(y yVar) {
            Map<Class<?>, Object> linkedHashMap;
            this.f29017e = Collections.emptyMap();
            this.f29013a = yVar.f29007a;
            this.f29014b = yVar.f29008b;
            this.f29016d = yVar.f29010d;
            if (yVar.f29011e.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap<>(yVar.f29011e);
            }
            this.f29017e = linkedHashMap;
            this.f29015c = yVar.f29009c.f();
        }
    }
}

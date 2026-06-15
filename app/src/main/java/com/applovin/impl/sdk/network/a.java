package com.applovin.impl.sdk.network;

import com.applovin.impl.l4;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f9036a;

    /* renamed from: b  reason: collision with root package name */
    private String f9037b;

    /* renamed from: c  reason: collision with root package name */
    private Map f9038c;

    /* renamed from: d  reason: collision with root package name */
    private Map f9039d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f9040e;

    /* renamed from: f  reason: collision with root package name */
    private String f9041f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f9042g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9043h;

    /* renamed from: i  reason: collision with root package name */
    private int f9044i;

    /* renamed from: j  reason: collision with root package name */
    private final int f9045j;

    /* renamed from: k  reason: collision with root package name */
    private final int f9046k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f9047l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f9048m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f9049n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f9050o;

    /* renamed from: p  reason: collision with root package name */
    private final l4.a f9051p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f9052q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f9053r;

    /* renamed from: com.applovin.impl.sdk.network.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0138a {

        /* renamed from: a  reason: collision with root package name */
        String f9054a;

        /* renamed from: b  reason: collision with root package name */
        String f9055b;

        /* renamed from: c  reason: collision with root package name */
        String f9056c;

        /* renamed from: e  reason: collision with root package name */
        Map f9058e;

        /* renamed from: f  reason: collision with root package name */
        JSONObject f9059f;

        /* renamed from: g  reason: collision with root package name */
        Object f9060g;

        /* renamed from: i  reason: collision with root package name */
        int f9062i;

        /* renamed from: j  reason: collision with root package name */
        int f9063j;

        /* renamed from: k  reason: collision with root package name */
        boolean f9064k;

        /* renamed from: m  reason: collision with root package name */
        boolean f9066m;

        /* renamed from: n  reason: collision with root package name */
        boolean f9067n;

        /* renamed from: o  reason: collision with root package name */
        boolean f9068o;

        /* renamed from: p  reason: collision with root package name */
        boolean f9069p;

        /* renamed from: q  reason: collision with root package name */
        l4.a f9070q;

        /* renamed from: h  reason: collision with root package name */
        int f9061h = 1;

        /* renamed from: l  reason: collision with root package name */
        boolean f9065l = true;

        /* renamed from: d  reason: collision with root package name */
        Map f9057d = new HashMap();

        public C0138a(j jVar) {
            this.f9062i = ((Integer) jVar.a(o4.T2)).intValue();
            this.f9063j = ((Integer) jVar.a(o4.S2)).intValue();
            this.f9066m = ((Boolean) jVar.a(o4.f8198q3)).booleanValue();
            this.f9067n = ((Boolean) jVar.a(o4.S4)).booleanValue();
            this.f9070q = l4.a.a(((Integer) jVar.a(o4.T4)).intValue());
            this.f9069p = ((Boolean) jVar.a(o4.f8200q5)).booleanValue();
        }

        public C0138a a(Map map) {
            this.f9058e = map;
            return this;
        }

        public C0138a b(String str) {
            this.f9055b = str;
            return this;
        }

        public C0138a c(String str) {
            this.f9054a = str;
            return this;
        }

        public C0138a d(boolean z10) {
            this.f9065l = z10;
            return this;
        }

        public C0138a e(boolean z10) {
            this.f9066m = z10;
            return this;
        }

        public C0138a f(boolean z10) {
            this.f9068o = z10;
            return this;
        }

        public C0138a a(JSONObject jSONObject) {
            this.f9059f = jSONObject;
            return this;
        }

        public C0138a b(Map map) {
            this.f9057d = map;
            return this;
        }

        public C0138a c(int i10) {
            this.f9062i = i10;
            return this;
        }

        public C0138a a(String str) {
            this.f9056c = str;
            return this;
        }

        public C0138a b(int i10) {
            this.f9063j = i10;
            return this;
        }

        public C0138a c(boolean z10) {
            this.f9064k = z10;
            return this;
        }

        public C0138a a(Object obj) {
            this.f9060g = obj;
            return this;
        }

        public C0138a b(boolean z10) {
            this.f9069p = z10;
            return this;
        }

        public C0138a a(int i10) {
            this.f9061h = i10;
            return this;
        }

        public C0138a a(boolean z10) {
            this.f9067n = z10;
            return this;
        }

        public C0138a a(l4.a aVar) {
            this.f9070q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(C0138a c0138a) {
        this.f9036a = c0138a.f9055b;
        this.f9037b = c0138a.f9054a;
        this.f9038c = c0138a.f9057d;
        this.f9039d = c0138a.f9058e;
        this.f9040e = c0138a.f9059f;
        this.f9041f = c0138a.f9056c;
        this.f9042g = c0138a.f9060g;
        int i10 = c0138a.f9061h;
        this.f9043h = i10;
        this.f9044i = i10;
        this.f9045j = c0138a.f9062i;
        this.f9046k = c0138a.f9063j;
        this.f9047l = c0138a.f9064k;
        this.f9048m = c0138a.f9065l;
        this.f9049n = c0138a.f9066m;
        this.f9050o = c0138a.f9067n;
        this.f9051p = c0138a.f9070q;
        this.f9052q = c0138a.f9068o;
        this.f9053r = c0138a.f9069p;
    }

    public void a(String str) {
        this.f9036a = str;
    }

    public void b(String str) {
        this.f9037b = str;
    }

    public int c() {
        return this.f9043h - this.f9044i;
    }

    public Object d() {
        return this.f9042g;
    }

    public l4.a e() {
        return this.f9051p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str = this.f9036a;
            if (str == null ? aVar.f9036a == null : str.equals(aVar.f9036a)) {
                Map map = this.f9038c;
                if (map == null ? aVar.f9038c == null : map.equals(aVar.f9038c)) {
                    Map map2 = this.f9039d;
                    if (map2 == null ? aVar.f9039d == null : map2.equals(aVar.f9039d)) {
                        String str2 = this.f9041f;
                        if (str2 == null ? aVar.f9041f == null : str2.equals(aVar.f9041f)) {
                            String str3 = this.f9037b;
                            if (str3 == null ? aVar.f9037b == null : str3.equals(aVar.f9037b)) {
                                JSONObject jSONObject = this.f9040e;
                                if (jSONObject == null ? aVar.f9040e == null : jSONObject.equals(aVar.f9040e)) {
                                    Object obj2 = this.f9042g;
                                    if (obj2 == null ? aVar.f9042g == null : obj2.equals(aVar.f9042g)) {
                                        return this.f9043h == aVar.f9043h && this.f9044i == aVar.f9044i && this.f9045j == aVar.f9045j && this.f9046k == aVar.f9046k && this.f9047l == aVar.f9047l && this.f9048m == aVar.f9048m && this.f9049n == aVar.f9049n && this.f9050o == aVar.f9050o && this.f9051p == aVar.f9051p && this.f9052q == aVar.f9052q && this.f9053r == aVar.f9053r;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String f() {
        return this.f9036a;
    }

    public Map g() {
        return this.f9039d;
    }

    public String h() {
        return this.f9037b;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f9036a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9041f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9037b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f9042g;
        int hashCode5 = ((((((((((((((((((((((hashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f9043h) * 31) + this.f9044i) * 31) + this.f9045j) * 31) + this.f9046k) * 31) + (this.f9047l ? 1 : 0)) * 31) + (this.f9048m ? 1 : 0)) * 31) + (this.f9049n ? 1 : 0)) * 31) + (this.f9050o ? 1 : 0)) * 31) + this.f9051p.b()) * 31) + (this.f9052q ? 1 : 0)) * 31) + (this.f9053r ? 1 : 0);
        Map map = this.f9038c;
        if (map != null) {
            hashCode5 = (hashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.f9039d;
        if (map2 != null) {
            hashCode5 = (hashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f9040e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (hashCode5 * 31) + new String(charArray).hashCode();
        }
        return hashCode5;
    }

    public Map i() {
        return this.f9038c;
    }

    public int j() {
        return this.f9044i;
    }

    public int k() {
        return this.f9046k;
    }

    public int l() {
        return this.f9045j;
    }

    public boolean m() {
        return this.f9050o;
    }

    public boolean n() {
        return this.f9047l;
    }

    public boolean o() {
        return this.f9053r;
    }

    public boolean p() {
        return this.f9048m;
    }

    public boolean q() {
        return this.f9049n;
    }

    public boolean r() {
        return this.f9052q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f9036a + ", backupEndpoint=" + this.f9041f + ", httpMethod=" + this.f9037b + ", httpHeaders=" + this.f9039d + ", body=" + this.f9040e + ", emptyResponse=" + this.f9042g + ", initialRetryAttempts=" + this.f9043h + ", retryAttemptsLeft=" + this.f9044i + ", timeoutMillis=" + this.f9045j + ", retryDelayMillis=" + this.f9046k + ", exponentialRetries=" + this.f9047l + ", retryOnAllErrors=" + this.f9048m + ", retryOnNoConnection=" + this.f9049n + ", encodingEnabled=" + this.f9050o + ", encodingType=" + this.f9051p + ", trackConnectionSpeed=" + this.f9052q + ", gzipBodyEncoding=" + this.f9053r + '}';
    }

    public String a() {
        return this.f9041f;
    }

    public JSONObject b() {
        return this.f9040e;
    }

    public void a(int i10) {
        this.f9044i = i10;
    }

    public static C0138a a(j jVar) {
        return new C0138a(jVar);
    }
}

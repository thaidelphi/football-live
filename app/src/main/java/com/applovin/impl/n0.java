package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinEventParameters;
import com.ironsource.b9;
import com.ironsource.ls;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n0 {

    /* renamed from: e  reason: collision with root package name */
    private static final List f7990e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7991a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7992b;

    /* renamed from: c  reason: collision with root package name */
    private final t3 f7993c;

    /* renamed from: d  reason: collision with root package name */
    private d f7994d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f7995a;

        /* renamed from: b  reason: collision with root package name */
        private long f7996b;

        public long a() {
            return this.f7995a;
        }

        public long b() {
            return this.f7996b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f7995a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f7996b = j10;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class c implements androidx.core.util.b {

        /* renamed from: a  reason: collision with root package name */
        private final String f7997a;

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f7998b;

        /* renamed from: c  reason: collision with root package name */
        private final String f7999c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f8000d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f8001e;

        /* renamed from: f  reason: collision with root package name */
        private final b f8002f;

        /* renamed from: g  reason: collision with root package name */
        private final e f8003g;

        @Override // androidx.core.util.b
        /* renamed from: a */
        public void accept(t3.d dVar) {
            int i10;
            long e8 = dVar.e();
            Object obj = null;
            int i11 = 0;
            try {
                int c10 = dVar.c();
                try {
                    if (c10 <= 0) {
                        n0.this.a(this.f7999c, this.f7997a, c10, e8, (Throwable) null);
                        this.f8003g.a(this.f7997a, c10, null, null);
                    } else if (c10 >= 200 && c10 < 400) {
                        b bVar = this.f8002f;
                        if (bVar != null) {
                            bVar.a(e8);
                        }
                        n0.this.a(this.f7999c, this.f7997a, c10, e8);
                        byte[] d10 = dVar.d();
                        if (d7.f(com.applovin.impl.sdk.j.m()) && (!this.f8001e || l4.b(d10) != l4.a.V2)) {
                            n0.this.f7991a.q().a(d10 != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f7997a, this.f7998b.b() != null ? this.f7998b.b().toString() : "");
                        }
                        if (d10 != null) {
                            String str = new String(dVar.d(), Charset.forName("UTF-8"));
                            b bVar2 = this.f8002f;
                            if (bVar2 != null) {
                                bVar2.b(d10.length);
                                if (this.f7998b.r()) {
                                    n0.this.f7994d = new d(this.f7998b.f(), d10.length, e8);
                                }
                            }
                            if (this.f8001e) {
                                String b10 = l4.b(d10, n0.this.f7991a.a0(), n0.this.f7991a);
                                if (b10 == null) {
                                    HashMap hashMap = new HashMap(2);
                                    hashMap.put("request", StringUtils.getHostAndPath(this.f7997a));
                                    hashMap.put(ls.f18303n, str);
                                    n0.this.f7991a.z().trackEvent("rdf", hashMap);
                                }
                                str = b10;
                            }
                            this.f8003g.a(this.f7997a, n0.this.a(str, this.f8000d), c10);
                            return;
                        }
                        this.f8003g.a(this.f7997a, this.f8000d, c10);
                    } else {
                        this.f8003g.a(this.f7997a, c10, null, null);
                    }
                } catch (MalformedURLException e10) {
                    e = e10;
                    i10 = c10;
                    if (this.f8000d == null) {
                        n0.this.a(this.f7999c, this.f7997a, i10, e8);
                        this.f8003g.a(this.f7997a, this.f8000d, -901);
                        return;
                    }
                    n0.this.a(this.f7999c, this.f7997a, i10, e8, e);
                    this.f8003g.a(this.f7997a, -901, e.getMessage(), null);
                } catch (Throwable th) {
                    th = th;
                    i11 = c10;
                    if (((Boolean) n0.this.f7991a.a(o4.f8186p)).booleanValue()) {
                        i11 = dVar.b();
                    }
                    if (i11 == 0) {
                        i11 = n0.this.a(th);
                    }
                    int i12 = i11;
                    try {
                        byte[] f10 = dVar.f();
                        String str2 = new String(f10);
                        if (f10 != null) {
                            if (this.f8001e) {
                                str2 = l4.b(f10, n0.this.f7991a.a0(), n0.this.f7991a);
                            }
                            obj = n0.this.a(str2, this.f8000d);
                        }
                    } catch (Throwable unused) {
                    }
                    n0.this.a(this.f7999c, this.f7997a, i12, e8, th);
                    this.f8003g.a(this.f7997a, i12, th.getMessage(), obj);
                }
            } catch (MalformedURLException e11) {
                e = e11;
                i10 = 0;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f7997a = str;
            this.f7998b = aVar;
            this.f7999c = str2;
            this.f8000d = obj;
            this.f8001e = z10;
            this.f8002f = bVar;
            this.f8003g = eVar;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final long f8005a = System.currentTimeMillis();

        /* renamed from: b  reason: collision with root package name */
        private final String f8006b;

        /* renamed from: c  reason: collision with root package name */
        private final long f8007c;

        /* renamed from: d  reason: collision with root package name */
        private final long f8008d;

        public d(String str, long j10, long j11) {
            this.f8006b = str;
            this.f8007c = j10;
            this.f8008d = j11;
        }

        protected boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f8007c;
        }

        public long c() {
            return this.f8005a;
        }

        public String d() {
            return this.f8006b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (dVar.a(this) && c() == dVar.c() && b() == dVar.b() && a() == dVar.a()) {
                    String d10 = d();
                    String d11 = dVar.d();
                    return d10 != null ? d10.equals(d11) : d11 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            long c10 = c();
            long b10 = b();
            long a10 = a();
            String d10 = d();
            return ((((((((int) (c10 ^ (c10 >>> 32))) + 59) * 59) + ((int) (b10 ^ (b10 >>> 32)))) * 59) + ((int) ((a10 >>> 32) ^ a10))) * 59) + (d10 == null ? 43 : d10.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f8008d;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public n0(com.applovin.impl.sdk.j jVar) {
        this.f7991a = jVar;
        this.f7992b = jVar.I();
        t3 t3Var = new t3(jVar);
        this.f7993c = t3Var;
        t3Var.a();
    }

    static /* synthetic */ com.applovin.impl.sdk.n b(n0 n0Var) {
        return n0Var.f7992b;
    }

    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        String str;
        byte[] bytes;
        if (aVar != null) {
            String f10 = aVar.f();
            String h10 = aVar.h();
            if (f10 == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (h10 == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!f10.toLowerCase().startsWith("http")) {
                    String str2 = "Requested postback submission to non HTTP endpoint " + f10 + "; skipping...";
                    com.applovin.impl.sdk.n.h("ConnectionManager", str2);
                    eVar.a(f10, AppLovinErrorCodes.INVALID_URL, str2, null);
                    return;
                }
                if (((Boolean) this.f7991a.a(o4.V2)).booleanValue() && !f10.contains("https://")) {
                    this.f7991a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f7991a.I().k("ConnectionManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
                    }
                    f10 = f10.replace("http://", "https://");
                }
                HashMap hashMap = new HashMap(2);
                boolean m7 = aVar.m();
                l4.a a10 = ((Boolean) this.f7991a.a(o4.W4)).booleanValue() ? l4.a.a(((Integer) this.f7991a.a(o4.T4)).intValue()) : aVar.e();
                long a11 = d7.a(this.f7991a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map i10 = aVar.i();
                    Boolean bool = (Boolean) this.f7991a.a(o4.f8142j3);
                    if (i10 != null && aVar.c() > 0) {
                        i10.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (m7) {
                        String a12 = d7.a(i10, bool.booleanValue());
                        String b10 = l4.b(a12, a11, a10, this.f7991a.a0(), this.f7991a);
                        if (StringUtils.isValidString(a12) && TextUtils.isEmpty(b10)) {
                            hashMap.put(AppLovinEventParameters.SEARCH_QUERY, a12);
                        }
                        f10 = StringUtils.appendQueryParameter(f10, "p", b10);
                    } else {
                        f10 = StringUtils.appendQueryParameters(f10, i10, bool.booleanValue());
                    }
                }
                String str3 = f10;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean endsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str3), f7990e);
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar = this.f7992b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Sending ");
                        sb.append(h10);
                        sb.append(" request to id=#");
                        sb.append(str3.hashCode());
                        sb.append(" \"");
                        sb.append(endsWith.booleanValue() ? str3 : StringUtils.getHostAndPath(str3));
                        sb.append("\"...");
                        nVar.d("ConnectionManager", sb.toString());
                    }
                    t3.c.a a13 = new t3.c.a().a(str3).b(h10).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (m7) {
                            bytes = l4.a(aVar.b().toString(), a11, a10, this.f7991a.a0(), this.f7991a);
                            if (bytes == null) {
                                hashMap.put(b9.h.E0, aVar.b().toString());
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes("UTF-8");
                        }
                        byte[] bArr = bytes;
                        byte[] a14 = (!(m7 && a10 == l4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.f7991a.a(o4.f8192p5)).intValue()) ? d7.a(bArr) : null;
                        a13.a("Content-Type", "application/json; charset=utf-8");
                        if (aVar.o() && a14 != null) {
                            a13.a("Content-Encoding", "gzip");
                            a13.a(a14);
                        } else if (bArr != null) {
                            a13.a(bArr);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        hashMap.put("request", StringUtils.getHostAndPath(str3));
                        this.f7991a.z().trackEvent("ref", hashMap);
                    }
                    t3 t3Var = this.f7993c;
                    Object d10 = aVar.d();
                    str = str3;
                    try {
                        t3Var.a(a13.a(new c(str3, aVar, h10, d10, m7, bVar, eVar)).a(this.f7991a.i0().c()).a());
                    } catch (Throwable th) {
                        th = th;
                        a(h10, str, 0, SystemClock.elapsedRealtime() - elapsedRealtime, th);
                        eVar.a(str, 0, th.getMessage(), null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = str3;
                }
            } else {
                throw new IllegalArgumentException("No callback specified");
            }
        } else {
            throw new IllegalArgumentException("No request specified");
        }
    }

    public d a() {
        return this.f7994d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof f8) {
                return g8.a(str, this.f7991a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7992b;
                nVar.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7992b;
            nVar.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (((float) j10) / 1000.0f) + " s over " + o0.g(this.f7991a) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7992b;
            nVar.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (((float) j10) / 1000.0f) + " s over " + o0.g(this.f7991a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}

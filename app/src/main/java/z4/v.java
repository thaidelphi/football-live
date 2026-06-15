package z4;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import z4.v;
/* compiled from: DefaultHttpDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v extends g {

    /* renamed from: u  reason: collision with root package name */
    public static String f33668u = "";

    /* renamed from: v  reason: collision with root package name */
    public static String f33669v = "";

    /* renamed from: e  reason: collision with root package name */
    private final boolean f33670e;

    /* renamed from: f  reason: collision with root package name */
    private final int f33671f;

    /* renamed from: g  reason: collision with root package name */
    private final int f33672g;

    /* renamed from: h  reason: collision with root package name */
    private final String f33673h;

    /* renamed from: i  reason: collision with root package name */
    private final f0 f33674i;

    /* renamed from: j  reason: collision with root package name */
    private final f0 f33675j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f33676k;

    /* renamed from: l  reason: collision with root package name */
    private x5.h<String> f33677l;

    /* renamed from: m  reason: collision with root package name */
    private p f33678m;

    /* renamed from: n  reason: collision with root package name */
    private HttpURLConnection f33679n;

    /* renamed from: o  reason: collision with root package name */
    private InputStream f33680o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f33681p;

    /* renamed from: q  reason: collision with root package name */
    private int f33682q;

    /* renamed from: r  reason: collision with root package name */
    private long f33683r;

    /* renamed from: s  reason: collision with root package name */
    private long f33684s;

    /* renamed from: t  reason: collision with root package name */
    l0 f33685t;

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements b0 {

        /* renamed from: b  reason: collision with root package name */
        private s0 f33687b;

        /* renamed from: c  reason: collision with root package name */
        private x5.h<String> f33688c;

        /* renamed from: d  reason: collision with root package name */
        private String f33689d;

        /* renamed from: g  reason: collision with root package name */
        private boolean f33692g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f33693h;

        /* renamed from: a  reason: collision with root package name */
        private final f0 f33686a = new f0();

        /* renamed from: e  reason: collision with root package name */
        private int f33690e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f33691f = 8000;

        @Override // z4.l.a
        /* renamed from: c */
        public v a() {
            v vVar = new v(this.f33689d, this.f33690e, this.f33691f, this.f33692g, this.f33686a, this.f33688c, this.f33693h);
            s0 s0Var = this.f33687b;
            if (s0Var != null) {
                vVar.i(s0Var);
            }
            return vVar;
        }

        public b d(boolean z10) {
            this.f33692g = z10;
            return this;
        }

        @Override // z4.b0
        /* renamed from: e */
        public final b b(Map<String, String> map) {
            this.f33686a.a(map);
            return this;
        }

        public b f(String str) {
            this.f33689d = str;
            return this;
        }
    }

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c extends y5.l<String, List<String>> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, List<String>> f33694a;

        public c(Map<String, List<String>> map) {
            this.f33694a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean j(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y5.m
        /* renamed from: b */
        public Map<String, List<String>> a() {
            return this.f33694a;
        }

        @Override // y5.l, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // y5.l, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return y5.p0.b(super.entrySet(), new x5.h() { // from class: z4.x
                @Override // x5.h
                public final boolean apply(Object obj) {
                    boolean i10;
                    i10 = v.c.i((Map.Entry) obj);
                    return i10;
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // y5.l, java.util.Map
        /* renamed from: h */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // y5.l, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // y5.l, java.util.Map
        public Set<String> keySet() {
            return y5.p0.b(super.keySet(), new x5.h() { // from class: z4.w
                @Override // x5.h
                public final boolean apply(Object obj) {
                    boolean j10;
                    j10 = v.c.j((String) obj);
                    return j10;
                }
            });
        }

        @Override // y5.l, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private void s() {
        HttpURLConnection httpURLConnection = this.f33679n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                a5.t.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e8);
            }
            this.f33679n = null;
        }
    }

    private URL t(URL url, String str, p pVar) throws c0 {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new c0("Unsupported protocol redirect: " + protocol, pVar, 2001, 1);
                } else if (this.f33670e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new c0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", pVar, 2001, 1);
                }
            } catch (MalformedURLException e8) {
                throw new c0(e8, pVar, 2001, 1);
            }
        }
        throw new c0("Null location redirect", pVar, 2001, 1);
    }

    private static boolean u(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1 A[LOOP:0: B:43:0x00eb->B:45:0x00f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection v(java.net.URL r6, int r7, byte[] r8, long r9, long r11, boolean r13, boolean r14, java.util.Map<java.lang.String, java.lang.String> r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.v.v(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private HttpURLConnection w(p pVar) throws IOException {
        HttpURLConnection v10;
        URL url = new URL(pVar.f33569a.toString());
        int i10 = pVar.f33571c;
        byte[] bArr = pVar.f33572d;
        long j10 = pVar.f33575g;
        long j11 = pVar.f33576h;
        boolean d10 = pVar.d(1);
        if (this.f33670e || this.f33676k) {
            URL url2 = url;
            int i11 = i10;
            byte[] bArr2 = bArr;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 <= 20) {
                    int i14 = i11;
                    long j12 = j10;
                    URL url3 = url2;
                    long j13 = j11;
                    v10 = v(url2, i11, bArr2, j10, j11, d10, false, pVar.f33573e);
                    int responseCode = v10.getResponseCode();
                    String headerField = v10.getHeaderField("Location");
                    if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                        v10.disconnect();
                        url2 = t(url3, headerField, pVar);
                        i11 = i14;
                    } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    } else {
                        v10.disconnect();
                        if (this.f33676k && responseCode == 302) {
                            i11 = i14;
                        } else {
                            bArr2 = null;
                            i11 = 1;
                        }
                        url2 = t(url3, headerField, pVar);
                    }
                    i12 = i13;
                    j10 = j12;
                    j11 = j13;
                } else {
                    throw new c0(new NoRouteToHostException("Too many redirects: " + i13), pVar, 2001, 1);
                }
            }
            return v10;
        }
        return v(url, i10, bArr, j10, j11, d10, true, pVar.f33573e);
    }

    private static void x(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = a5.p0.f482a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) a5.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    private int y(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f33683r;
        if (j10 != -1) {
            long j11 = j10 - this.f33684s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) a5.p0.j(this.f33680o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f33684s += read;
        o(read);
        return read;
    }

    private void z(long j10, p pVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        while (j10 > 0) {
            int read = ((InputStream) a5.p0.j(this.f33680o)).read(bArr, 0, (int) Math.min(j10, (long) CodedOutputStream.DEFAULT_BUFFER_SIZE));
            if (Thread.currentThread().isInterrupted()) {
                throw new c0(new InterruptedIOException(), pVar, 2000, 1);
            }
            if (read != -1) {
                j10 -= read;
                o(read);
            } else {
                throw new c0(pVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
        }
    }

    @Override // z4.i
    public int b(byte[] bArr, int i10, int i11) throws c0 {
        try {
            return y(bArr, i10, i11);
        } catch (IOException e8) {
            throw c0.c(e8, (p) a5.p0.j(this.f33678m), 2);
        }
    }

    @Override // z4.l
    public void close() throws c0 {
        try {
            InputStream inputStream = this.f33680o;
            if (inputStream != null) {
                long j10 = this.f33683r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f33684s;
                }
                x(this.f33679n, j11);
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new c0(e8, (p) a5.p0.j(this.f33678m), 2000, 3);
                }
            }
        } finally {
            this.f33680o = null;
            s();
            if (this.f33681p) {
                this.f33681p = false;
                p();
            }
        }
    }

    @Override // z4.g, z4.l
    public Map<String, List<String>> d() {
        HttpURLConnection httpURLConnection = this.f33679n;
        if (httpURLConnection == null) {
            return y5.r.j();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    @Override // z4.l
    public long l(p pVar) throws c0 {
        byte[] bArr;
        this.f33678m = pVar;
        long j10 = 0;
        this.f33684s = 0L;
        this.f33683r = 0L;
        q(pVar);
        try {
            HttpURLConnection w10 = w(pVar);
            this.f33679n = w10;
            this.f33682q = w10.getResponseCode();
            String responseMessage = w10.getResponseMessage();
            int i10 = this.f33682q;
            if (i10 >= 200 && i10 <= 299) {
                String contentType = w10.getContentType();
                x5.h<String> hVar = this.f33677l;
                if (hVar != null && !hVar.apply(contentType)) {
                    s();
                    throw new d0(contentType, pVar);
                }
                if (this.f33682q == 200) {
                    long j11 = pVar.f33575g;
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
                boolean u10 = u(w10);
                if (!u10) {
                    long j12 = pVar.f33576h;
                    if (j12 != -1) {
                        this.f33683r = j12;
                    } else {
                        long a10 = g0.a(w10.getHeaderField("Content-Length"), w10.getHeaderField("Content-Range"));
                        this.f33683r = a10 != -1 ? a10 - j10 : -1L;
                    }
                } else {
                    this.f33683r = pVar.f33576h;
                }
                try {
                    this.f33680o = w10.getInputStream();
                    if (u10) {
                        this.f33680o = new GZIPInputStream(this.f33680o);
                    }
                    this.f33681p = true;
                    r(pVar);
                    try {
                        z(j10, pVar);
                        return this.f33683r;
                    } catch (IOException e8) {
                        s();
                        if (e8 instanceof c0) {
                            throw ((c0) e8);
                        }
                        throw new c0(e8, pVar, 2000, 1);
                    }
                } catch (IOException e10) {
                    s();
                    throw new c0(e10, pVar, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = w10.getHeaderFields();
            if (this.f33682q == 416) {
                if (pVar.f33575g == g0.b(w10.getHeaderField("Content-Range"))) {
                    this.f33681p = true;
                    r(pVar);
                    long j13 = pVar.f33576h;
                    if (j13 != -1) {
                        return j13;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = w10.getErrorStream();
            try {
                bArr = errorStream != null ? a5.p0.V0(errorStream) : a5.p0.f487f;
            } catch (IOException unused) {
                bArr = a5.p0.f487f;
            }
            byte[] bArr2 = bArr;
            s();
            throw new e0(this.f33682q, responseMessage, this.f33682q == 416 ? new m(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, pVar, bArr2);
        } catch (IOException e11) {
            s();
            throw c0.c(e11, pVar, 1);
        }
    }

    @Override // z4.l
    public Uri m() {
        HttpURLConnection httpURLConnection = this.f33679n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    private v(String str, int i10, int i11, boolean z10, f0 f0Var, x5.h<String> hVar, boolean z11) {
        super(true);
        this.f33673h = str;
        this.f33671f = i10;
        this.f33672g = i11;
        this.f33670e = z10;
        this.f33674i = f0Var;
        this.f33677l = hVar;
        this.f33675j = new f0();
        this.f33676k = z11;
    }
}

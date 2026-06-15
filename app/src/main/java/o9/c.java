package o9;

import com.ironsource.b9;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import n9.b0;
import n9.r;
import n9.z;
import y9.e;
import y9.f;
import y9.s;
/* compiled from: Util.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f29472a;

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f29474c;

    /* renamed from: d  reason: collision with root package name */
    public static final z f29475d;

    /* renamed from: r  reason: collision with root package name */
    private static final Method f29489r;

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f29490s;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f29473b = new String[0];

    /* renamed from: e  reason: collision with root package name */
    private static final f f29476e = f.f("efbbbf");

    /* renamed from: f  reason: collision with root package name */
    private static final f f29477f = f.f("feff");

    /* renamed from: g  reason: collision with root package name */
    private static final f f29478g = f.f("fffe");

    /* renamed from: h  reason: collision with root package name */
    private static final f f29479h = f.f("0000ffff");

    /* renamed from: i  reason: collision with root package name */
    private static final f f29480i = f.f("ffff0000");

    /* renamed from: j  reason: collision with root package name */
    public static final Charset f29481j = Charset.forName("UTF-8");

    /* renamed from: k  reason: collision with root package name */
    public static final Charset f29482k = Charset.forName("ISO-8859-1");

    /* renamed from: l  reason: collision with root package name */
    private static final Charset f29483l = Charset.forName("UTF-16BE");

    /* renamed from: m  reason: collision with root package name */
    private static final Charset f29484m = Charset.forName("UTF-16LE");

    /* renamed from: n  reason: collision with root package name */
    private static final Charset f29485n = Charset.forName("UTF-32BE");

    /* renamed from: o  reason: collision with root package name */
    private static final Charset f29486o = Charset.forName("UTF-32LE");

    /* renamed from: p  reason: collision with root package name */
    public static final TimeZone f29487p = TimeZone.getTimeZone("GMT");

    /* renamed from: q  reason: collision with root package name */
    public static final Comparator<String> f29488q = new a();

    /* compiled from: Util.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* compiled from: Util.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f29491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f29492b;

        b(String str, boolean z10) {
            this.f29491a = str;
            this.f29492b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f29491a);
            thread.setDaemon(this.f29492b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f29472a = bArr;
        Method method = null;
        f29474c = b0.k(null, bArr);
        f29475d = z.d(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f29489r = method;
        f29490s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static boolean A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static X509TrustManager C() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e8) {
            throw b("No System TLS", e8);
        }
    }

    public static boolean D(s sVar, int i10, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c10 = sVar.e().e() ? sVar.e().c() - nanoTime : Long.MAX_VALUE;
        sVar.e().d(Math.min(c10, timeUnit.toNanos(i10)) + nanoTime);
        try {
            y9.c cVar = new y9.c();
            while (sVar.H(cVar, 8192L) != -1) {
                cVar.f();
            }
            if (c10 == Long.MAX_VALUE) {
                sVar.e().a();
            } else {
                sVar.e().d(nanoTime + c10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == Long.MAX_VALUE) {
                sVar.e().a();
            } else {
                sVar.e().d(nanoTime + c10);
            }
            return false;
        } catch (Throwable th) {
            if (c10 == Long.MAX_VALUE) {
                sVar.e().a();
            } else {
                sVar.e().d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static int E(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int F(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static ThreadFactory G(String str, boolean z10) {
        return new b(str, z10);
    }

    public static r H(List<t9.c> list) {
        r.a aVar = new r.a();
        for (t9.c cVar : list) {
            o9.a.f29470a.b(aVar, cVar.f31092a.w(), cVar.f31093b.w());
        }
        return aVar.d();
    }

    public static String I(String str, int i10, int i11) {
        int E = E(str, i10, i11);
        return str.substring(E, F(str, E, i11));
    }

    public static boolean J(String str) {
        return f29490s.matcher(str).matches();
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = f29489r;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static AssertionError b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset c(e eVar, Charset charset) throws IOException {
        f fVar = f29476e;
        if (eVar.B0(0L, fVar)) {
            eVar.c(fVar.r());
            return f29481j;
        }
        f fVar2 = f29477f;
        if (eVar.B0(0L, fVar2)) {
            eVar.c(fVar2.r());
            return f29483l;
        }
        f fVar3 = f29478g;
        if (eVar.B0(0L, fVar3)) {
            eVar.c(fVar3.r());
            return f29484m;
        }
        f fVar4 = f29479h;
        if (eVar.B0(0L, fVar4)) {
            eVar.c(fVar4.r());
            return f29485n;
        }
        f fVar5 = f29480i;
        if (eVar.B0(0L, fVar5)) {
            eVar.c(fVar5.r());
            return f29486o;
        }
        return charset;
    }

    public static String d(String str) {
        InetAddress m7;
        if (str.contains(":")) {
            if (str.startsWith(b9.i.f16696d) && str.endsWith(b9.i.f16698e)) {
                m7 = m(str, 1, str.length() - 1);
            } else {
                m7 = m(str, 0, str.length());
            }
            if (m7 == null) {
                return null;
            }
            byte[] address = m7.getAddress();
            if (address.length == 16) {
                return y(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (j(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int e(String str, long j10, TimeUnit timeUnit) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || i10 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        }
        throw new IllegalArgumentException(str + " < 0");
    }

    public static void f(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static void h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e8) {
                if (!A(e8)) {
                    throw e8;
                }
            } catch (RuntimeException e10) {
                if (!"bio == null".equals(e10.getMessage())) {
                    throw e10;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String[] i(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    private static boolean j(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int k(char c10) {
        if (c10 < '0' || c10 > '9') {
            char c11 = 'a';
            if (c10 < 'a' || c10 > 'f') {
                c11 = 'A';
                if (c10 < 'A' || c10 > 'F') {
                    return -1;
                }
            }
            return (c10 - c11) + 10;
        }
        return c10 - '0';
    }

    private static boolean l(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i14++;
                }
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress m(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = -1
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L9:
            r7 = 0
            if (r12 >= r13) goto L7a
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L27
            java.lang.String r9 = "::"
            r10 = 2
            boolean r9 = r11.regionMatches(r12, r9, r3, r10)
            if (r9 == 0) goto L27
            if (r5 == r2) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L25
            goto L7a
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L4a
            java.lang.String r8 = ":"
            r9 = 1
            boolean r8 = r11.regionMatches(r12, r8, r3, r9)
            if (r8 == 0) goto L35
            int r12 = r12 + 1
            goto L4a
        L35:
            java.lang.String r8 = "."
            boolean r12 = r11.regionMatches(r12, r8, r3, r9)
            if (r12 == 0) goto L49
            int r12 = r4 + (-2)
            boolean r11 = l(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L46
            return r7
        L46:
            int r4 = r4 + 2
            goto L7a
        L49:
            return r7
        L4a:
            r6 = r12
        L4b:
            r8 = r3
            r12 = r6
        L4d:
            if (r12 >= r13) goto L60
            char r9 = r11.charAt(r12)
            int r9 = k(r9)
            if (r9 != r2) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4d
        L60:
            int r9 = r12 - r6
            if (r9 == 0) goto L79
            r10 = 4
            if (r9 <= r10) goto L68
            goto L79
        L68:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L79:
            return r7
        L7a:
            if (r4 == r0) goto L8b
            if (r5 != r2) goto L7f
            return r7
        L7f:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r3)
        L8b:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
            return r11
        L90:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.c.m(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int n(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int o(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean p(s sVar, int i10, TimeUnit timeUnit) {
        try {
            return D(sVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String r(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String s(n9.s sVar, boolean z10) {
        String l10;
        if (sVar.l().contains(":")) {
            l10 = b9.i.f16696d + sVar.l() + b9.i.f16698e;
        } else {
            l10 = sVar.l();
        }
        if (z10 || sVar.w() != n9.s.d(sVar.B())) {
            return l10 + ":" + sVar.w();
        }
        return l10;
    }

    public static <T> List<T> t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> v(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static int x(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    private static String y(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        y9.c cVar = new y9.c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                cVar.j0(58);
                i10 += i13;
                if (i10 == 16) {
                    cVar.j0(58);
                }
            } else {
                if (i10 > 0) {
                    cVar.j0(58);
                }
                cVar.u0(((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return cVar.L();
    }

    public static String[] z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}

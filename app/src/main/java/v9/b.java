package v9;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import n9.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidPlatform.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b extends g {

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f31900c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Socket> f31901d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Socket> f31902e;

    /* renamed from: f  reason: collision with root package name */
    private final f<Socket> f31903f;

    /* renamed from: g  reason: collision with root package name */
    private final f<Socket> f31904g;

    /* renamed from: h  reason: collision with root package name */
    private final c f31905h = c.b();

    /* compiled from: AndroidPlatform.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends x9.c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f31906a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f31907b;

        a(Object obj, Method method) {
            this.f31906a = obj;
            this.f31907b = method;
        }

        @Override // x9.c
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f31907b.invoke(this.f31906a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* renamed from: v9.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class C0369b implements x9.e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f31908a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f31909b;

        C0369b(X509TrustManager x509TrustManager, Method method) {
            this.f31909b = method;
            this.f31908a = x509TrustManager;
        }

        @Override // x9.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f31909b.invoke(this.f31908a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e8) {
                throw o9.c.b("unable to get issues and signature", e8);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0369b) {
                C0369b c0369b = (C0369b) obj;
                return this.f31908a.equals(c0369b.f31908a) && this.f31909b.equals(c0369b.f31909b);
            }
            return false;
        }

        public int hashCode() {
            return this.f31908a.hashCode() + (this.f31909b.hashCode() * 31);
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Method f31910a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f31911b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f31912c;

        c(Method method, Method method2, Method method3) {
            this.f31910a = method;
            this.f31911b = method2;
            this.f31912c = method3;
        }

        static c b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new c(method3, method2, method);
        }

        Object a(String str) {
            Method method = this.f31910a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f31911b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean c(Object obj) {
            if (obj != null) {
                try {
                    this.f31912c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Class<?> cls, f<Socket> fVar, f<Socket> fVar2, f<Socket> fVar3, f<Socket> fVar4) {
        this.f31900c = cls;
        this.f31901d = fVar;
        this.f31902e = fVar2;
        this.f31903f = fVar3;
        this.f31904g = fVar4;
    }

    private boolean v(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.r(str);
        }
    }

    private boolean w(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return v(str, cls, obj);
        }
    }

    public static g x() {
        Class<?> cls;
        f fVar;
        f fVar2;
        if (g.q()) {
            try {
                try {
                    cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
                }
                Class<?> cls2 = cls;
                f fVar3 = new f(null, "setUseSessionTickets", Boolean.TYPE);
                f fVar4 = new f(null, "setHostname", String.class);
                if (z()) {
                    f fVar5 = new f(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                    fVar2 = new f(null, "setAlpnProtocols", byte[].class);
                    fVar = fVar5;
                } else {
                    fVar = null;
                    fVar2 = null;
                }
                return new b(cls2, fVar3, fVar4, fVar, fVar2);
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    private static boolean z() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // v9.g
    public x9.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // v9.g
    public x9.e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0369b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // v9.g
    public void g(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
        if (str != null) {
            this.f31901d.e(sSLSocket, Boolean.TRUE);
            this.f31902e.e(sSLSocket, str);
        }
        f<Socket> fVar = this.f31904g;
        if (fVar == null || !fVar.g(sSLSocket)) {
            return;
        }
        this.f31904g.f(sSLSocket, g.e(list));
    }

    @Override // v9.g
    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e8) {
            if (!o9.c.A(e8)) {
                throw e8;
            }
            throw new IOException(e8);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e10);
                throw iOException;
            }
            throw e10;
        } catch (SecurityException e11) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e11);
            throw iOException2;
        }
    }

    @Override // v9.g
    public SSLContext n() {
        boolean z10 = true;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 16 || i10 >= 22) {
                z10 = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z10) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e8) {
            throw new IllegalStateException("No TLS provider", e8);
        }
    }

    @Override // v9.g
    public String o(SSLSocket sSLSocket) {
        byte[] bArr;
        f<Socket> fVar = this.f31903f;
        if (fVar == null || !fVar.g(sSLSocket) || (bArr = (byte[]) this.f31903f.f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, o9.c.f29481j);
    }

    @Override // v9.g
    public Object p(String str) {
        return this.f31905h.a(str);
    }

    @Override // v9.g
    public boolean r(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.r(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return w(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.r(str);
        } catch (IllegalAccessException e8) {
            e = e8;
            throw o9.c.b("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw o9.c.b("unable to determine cleartext support", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw o9.c.b("unable to determine cleartext support", e);
        }
    }

    @Override // v9.g
    public void t(int i10, String str, Throwable th) {
        int min;
        int i11 = i10 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                }
                i12 = min;
            }
            i12 = min + 1;
        }
    }

    @Override // v9.g
    public void u(String str, Object obj) {
        if (this.f31905h.c(obj)) {
            return;
        }
        t(5, str, null);
    }
}

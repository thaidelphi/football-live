package v9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n9.v;
import n9.w;
/* compiled from: Platform.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final g f31926a = k();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f31927b = Logger.getLogger(v.class.getName());

    public static List<String> b(List<w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = list.get(i10);
            if (wVar != w.HTTP_1_0) {
                arrayList.add(wVar.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(List<w> list) {
        y9.c cVar = new y9.c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = list.get(i10);
            if (wVar != w.HTTP_1_0) {
                cVar.j0(wVar.toString().length());
                cVar.B(wVar.toString());
            }
        }
        return cVar.h0();
    }

    private static g i() {
        g x10 = a.x();
        if (x10 != null) {
            return x10;
        }
        g x11 = b.x();
        Objects.requireNonNull(x11, "No platform found on Android");
        return x11;
    }

    private static g j() {
        c v10;
        if (!s() || (v10 = c.v()) == null) {
            d v11 = d.v();
            if (v11 != null) {
                return v11;
            }
            g v12 = e.v();
            return v12 != null ? v12 : new g();
        }
        return v10;
    }

    private static g k() {
        if (q()) {
            return i();
        }
        return j();
    }

    public static g l() {
        return f31926a;
    }

    public static boolean q() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean s() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(SSLSocket sSLSocket) {
    }

    public x9.c c(X509TrustManager x509TrustManager) {
        return new x9.a(d(x509TrustManager));
    }

    public x9.e d(X509TrustManager x509TrustManager) {
        return new x9.b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public String m() {
        return "OkHttp";
    }

    public SSLContext n() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e8) {
            throw new IllegalStateException("No TLS provider", e8);
        }
    }

    public String o(SSLSocket sSLSocket) {
        return null;
    }

    public Object p(String str) {
        if (f31927b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean r(String str) {
        return true;
    }

    public void t(int i10, String str, Throwable th) {
        f31927b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void u(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        t(5, str, (Throwable) obj);
    }
}

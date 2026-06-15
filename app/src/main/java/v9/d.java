package v9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import n9.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Jdk9Platform.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d extends g {

    /* renamed from: c  reason: collision with root package name */
    final Method f31913c;

    /* renamed from: d  reason: collision with root package name */
    final Method f31914d;

    d(Method method, Method method2) {
        this.f31913c = method;
        this.f31914d = method2;
    }

    public static d v() {
        try {
            return new d(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // v9.g
    public void g(SSLSocket sSLSocket, String str, List<w> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b10 = g.b(list);
            this.f31913c.invoke(sSLParameters, b10.toArray(new String[b10.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw o9.c.b("unable to set ssl parameters", e8);
        }
    }

    @Override // v9.g
    public String o(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f31914d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e8) {
            throw o9.c.b("failed to get ALPN selected protocol", e8);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw o9.c.b("failed to get ALPN selected protocol", e10);
        }
    }
}

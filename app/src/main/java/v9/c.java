package v9;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import n9.w;
import org.conscrypt.Conscrypt;
/* compiled from: ConscryptPlatform.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c extends g {
    private c() {
    }

    public static c v() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new c();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider w() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // v9.g
    public void f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // v9.g
    public void g(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) g.b(list).toArray(new String[0]));
            return;
        }
        super.g(sSLSocket, str, list);
    }

    @Override // v9.g
    public SSLContext n() {
        try {
            return SSLContext.getInstance("TLSv1.3", w());
        } catch (NoSuchAlgorithmException e8) {
            try {
                return SSLContext.getInstance("TLS", w());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e8);
            }
        }
    }

    @Override // v9.g
    public String o(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.o(sSLSocket);
    }
}

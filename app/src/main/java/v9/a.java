package v9;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import n9.w;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Android10Platform.java */
@SuppressLint({"NewApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends b {
    a(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    private void A(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    public static g x() {
        if (g.q()) {
            try {
                if (b.y() >= 29) {
                    return new a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
                }
            } catch (ClassNotFoundException unused) {
            }
            return null;
        }
        return null;
    }

    @Override // v9.b, v9.g
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void g(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
        try {
            A(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) g.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e8) {
            throw new IOException("Android internal error", e8);
        }
    }

    @Override // v9.b, v9.g
    @IgnoreJRERequirement
    public String o(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}

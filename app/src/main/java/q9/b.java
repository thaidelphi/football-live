package q9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import n9.k;
/* compiled from: ConnectionSpecSelector.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<k> f30147a;

    /* renamed from: b  reason: collision with root package name */
    private int f30148b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30149c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30150d;

    public b(List<k> list) {
        this.f30147a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i10 = this.f30148b; i10 < this.f30147a.size(); i10++) {
            if (this.f30147a.get(i10).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public k a(SSLSocket sSLSocket) throws IOException {
        k kVar;
        int i10 = this.f30148b;
        int size = this.f30147a.size();
        while (true) {
            if (i10 >= size) {
                kVar = null;
                break;
            }
            kVar = this.f30147a.get(i10);
            if (kVar.c(sSLSocket)) {
                this.f30148b = i10 + 1;
                break;
            }
            i10++;
        }
        if (kVar != null) {
            this.f30149c = c(sSLSocket);
            o9.a.f29470a.c(kVar, sSLSocket, this.f30150d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f30150d + ", modes=" + this.f30147a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f30150d = true;
        if (!this.f30149c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}

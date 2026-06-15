package d1;

import android.webkit.SafeBrowsingResponse;
import d1.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
/* compiled from: SafeBrowsingResponseImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j extends c1.b {

    /* renamed from: a  reason: collision with root package name */
    private SafeBrowsingResponse f23886a;

    /* renamed from: b  reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f23887b;

    public j(InvocationHandler invocationHandler) {
        this.f23887b = (SafeBrowsingResponseBoundaryInterface) z9.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f23887b == null) {
            this.f23887b = (SafeBrowsingResponseBoundaryInterface) z9.a.a(SafeBrowsingResponseBoundaryInterface.class, q.c().b(this.f23886a));
        }
        return this.f23887b;
    }

    private SafeBrowsingResponse c() {
        if (this.f23886a == null) {
            this.f23886a = q.c().a(Proxy.getInvocationHandler(this.f23887b));
        }
        return this.f23886a;
    }

    @Override // c1.b
    public void a(boolean z10) {
        a.f fVar = p.f23928z;
        if (fVar.b()) {
            e.e(c(), z10);
        } else if (fVar.c()) {
            b().showInterstitial(z10);
        } else {
            throw p.a();
        }
    }

    public j(SafeBrowsingResponse safeBrowsingResponse) {
        this.f23886a = safeBrowsingResponse;
    }
}

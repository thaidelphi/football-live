package r9;

import com.ironsource.cc;
import java.io.IOException;
import java.util.List;
import n9.a0;
import n9.l;
import n9.m;
import n9.t;
import n9.u;
import n9.y;
import n9.z;
/* compiled from: BridgeInterceptor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    private final m f30454a;

    public a(m mVar) {
        this.f30454a = mVar;
    }

    private String b(List<l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb.append("; ");
            }
            l lVar = list.get(i10);
            sb.append(lVar.c());
            sb.append(cc.T);
            sb.append(lVar.k());
        }
        return sb.toString();
    }

    @Override // n9.t
    public a0 a(t.a aVar) throws IOException {
        y b10 = aVar.b();
        y.a h10 = b10.h();
        z a10 = b10.a();
        if (a10 != null) {
            u b11 = a10.b();
            if (b11 != null) {
                h10.d("Content-Type", b11.toString());
            }
            long a11 = a10.a();
            if (a11 != -1) {
                h10.d("Content-Length", Long.toString(a11));
                h10.g("Transfer-Encoding");
            } else {
                h10.d("Transfer-Encoding", "chunked");
                h10.g("Content-Length");
            }
        }
        boolean z10 = false;
        if (b10.c("Host") == null) {
            h10.d("Host", o9.c.s(b10.i(), false));
        }
        if (b10.c("Connection") == null) {
            h10.d("Connection", "Keep-Alive");
        }
        if (b10.c("Accept-Encoding") == null && b10.c("Range") == null) {
            z10 = true;
            h10.d("Accept-Encoding", "gzip");
        }
        List<l> a12 = this.f30454a.a(b10.i());
        if (!a12.isEmpty()) {
            h10.d("Cookie", b(a12));
        }
        if (b10.c("User-Agent") == null) {
            h10.d("User-Agent", o9.d.a());
        }
        a0 e8 = aVar.e(h10.b());
        e.g(this.f30454a, b10.i(), e8.z());
        a0.a p10 = e8.J().p(b10);
        if (z10 && "gzip".equalsIgnoreCase(e8.t("Content-Encoding")) && e.c(e8)) {
            y9.j jVar = new y9.j(e8.a().t());
            p10.j(e8.z().f().f("Content-Encoding").f("Content-Length").d());
            p10.b(new h(e8.t("Content-Type"), -1L, y9.l.d(jVar)));
        }
        return p10.c();
    }
}

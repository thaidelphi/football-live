package q9;

import com.ironsource.in;
import java.io.IOException;
import n9.a0;
import n9.t;
import n9.v;
import n9.y;
/* compiled from: ConnectInterceptor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public final v f30146a;

    public a(v vVar) {
        this.f30146a = vVar;
    }

    @Override // n9.t
    public a0 a(t.a aVar) throws IOException {
        r9.g gVar = (r9.g) aVar;
        y b10 = gVar.b();
        g k10 = gVar.k();
        return gVar.j(b10, k10, k10.i(this.f30146a, aVar, !b10.g().equals(in.f17848a)), k10.d());
    }
}

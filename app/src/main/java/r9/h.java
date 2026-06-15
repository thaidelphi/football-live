package r9;

import n9.b0;
import n9.u;
/* compiled from: RealResponseBody.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h extends b0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f30474a;

    /* renamed from: b  reason: collision with root package name */
    private final long f30475b;

    /* renamed from: c  reason: collision with root package name */
    private final y9.e f30476c;

    public h(String str, long j10, y9.e eVar) {
        this.f30474a = str;
        this.f30475b = j10;
        this.f30476c = eVar;
    }

    @Override // n9.b0
    public long b() {
        return this.f30475b;
    }

    @Override // n9.b0
    public u f() {
        String str = this.f30474a;
        if (str != null) {
            return u.d(str);
        }
        return null;
    }

    @Override // n9.b0
    public y9.e t() {
        return this.f30476c;
    }
}

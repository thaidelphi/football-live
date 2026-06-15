package j4;

import a5.l0;
import java.io.IOException;
import n3.m1;
import w3.z;
/* compiled from: BundledHlsMediaChunkExtractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements j {

    /* renamed from: d  reason: collision with root package name */
    private static final s3.p f26938d = new s3.p();

    /* renamed from: a  reason: collision with root package name */
    final s3.i f26939a;

    /* renamed from: b  reason: collision with root package name */
    private final m1 f26940b;

    /* renamed from: c  reason: collision with root package name */
    private final l0 f26941c;

    public b(s3.i iVar, m1 m1Var, l0 l0Var) {
        this.f26939a = iVar;
        this.f26940b = m1Var;
        this.f26941c = l0Var;
    }

    @Override // j4.j
    public boolean a(s3.j jVar) throws IOException {
        return this.f26939a.a(jVar, f26938d) == 0;
    }

    @Override // j4.j
    public void b(s3.k kVar) {
        this.f26939a.b(kVar);
    }

    @Override // j4.j
    public void c() {
        this.f26939a.d(0L, 0L);
    }

    @Override // j4.j
    public boolean d() {
        s3.i iVar = this.f26939a;
        return (iVar instanceof z) || (iVar instanceof v3.f);
    }

    @Override // j4.j
    public boolean e() {
        s3.i iVar = this.f26939a;
        return (iVar instanceof w3.e) || (iVar instanceof w3.a) || (iVar instanceof w3.c) || (iVar instanceof u3.e);
    }

    @Override // j4.j
    public j f() {
        s3.i eVar;
        a5.a.f(!d());
        s3.i iVar = this.f26939a;
        if (iVar instanceof s) {
            eVar = new s(this.f26940b.f28176c, this.f26941c);
        } else if (iVar instanceof w3.e) {
            eVar = new w3.e();
        } else if (iVar instanceof w3.a) {
            eVar = new w3.a();
        } else if (iVar instanceof w3.c) {
            eVar = new w3.c();
        } else if (iVar instanceof u3.e) {
            eVar = new u3.e();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f26939a.getClass().getSimpleName());
        }
        return new b(eVar, this.f26940b, this.f26941c);
    }
}

package i9;

import d9.g1;
import d9.k2;
import d9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainDispatchers.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b0 extends k2 implements y0 {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f26644b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26645c;

    public b0(Throwable th, String str) {
        this.f26644b = th;
        this.f26645c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void N0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f26644b
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f26645c
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f26644b
            r1.<init>(r0, r2)
            throw r1
        L36:
            i9.a0.d()
            i8.d r0 = new i8.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.b0.N0():java.lang.Void");
    }

    @Override // d9.j0
    public boolean I0(m8.g gVar) {
        N0();
        throw new i8.d();
    }

    @Override // d9.k2
    public k2 K0() {
        return this;
    }

    @Override // d9.j0
    /* renamed from: M0 */
    public Void G0(m8.g gVar, Runnable runnable) {
        N0();
        throw new i8.d();
    }

    @Override // d9.y0
    /* renamed from: O0 */
    public Void R(long j10, d9.n<? super i8.w> nVar) {
        N0();
        throw new i8.d();
    }

    @Override // d9.y0
    public g1 X(long j10, Runnable runnable, m8.g gVar) {
        N0();
        throw new i8.d();
    }

    @Override // d9.k2, d9.j0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f26644b != null) {
            str = ", cause=" + this.f26644b;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}

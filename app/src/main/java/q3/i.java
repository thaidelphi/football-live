package q3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import n3.m1;
/* compiled from: DecoderReuseEvaluation.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f30101a;

    /* renamed from: b  reason: collision with root package name */
    public final m1 f30102b;

    /* renamed from: c  reason: collision with root package name */
    public final m1 f30103c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30104d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30105e;

    public i(String str, m1 m1Var, m1 m1Var2, int i10, int i11) {
        a5.a.a(i10 == 0 || i11 == 0);
        this.f30101a = a5.a.d(str);
        this.f30102b = (m1) a5.a.e(m1Var);
        this.f30103c = (m1) a5.a.e(m1Var2);
        this.f30104d = i10;
        this.f30105e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f30104d == iVar.f30104d && this.f30105e == iVar.f30105e && this.f30101a.equals(iVar.f30101a) && this.f30102b.equals(iVar.f30102b) && this.f30103c.equals(iVar.f30103c);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f30104d) * 31) + this.f30105e) * 31) + this.f30101a.hashCode()) * 31) + this.f30102b.hashCode()) * 31) + this.f30103c.hashCode();
    }
}

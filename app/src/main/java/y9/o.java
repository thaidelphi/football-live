package y9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Segment.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f33386a;

    /* renamed from: b  reason: collision with root package name */
    int f33387b;

    /* renamed from: c  reason: collision with root package name */
    int f33388c;

    /* renamed from: d  reason: collision with root package name */
    boolean f33389d;

    /* renamed from: e  reason: collision with root package name */
    boolean f33390e;

    /* renamed from: f  reason: collision with root package name */
    o f33391f;

    /* renamed from: g  reason: collision with root package name */
    o f33392g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o() {
        this.f33386a = new byte[8192];
        this.f33390e = true;
        this.f33389d = false;
    }

    public final void a() {
        o oVar = this.f33392g;
        if (oVar != this) {
            if (oVar.f33390e) {
                int i10 = this.f33388c - this.f33387b;
                if (i10 > (8192 - oVar.f33388c) + (oVar.f33389d ? 0 : oVar.f33387b)) {
                    return;
                }
                f(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final o b() {
        o oVar = this.f33391f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f33392g;
        oVar3.f33391f = oVar;
        this.f33391f.f33392g = oVar3;
        this.f33391f = null;
        this.f33392g = null;
        return oVar2;
    }

    public final o c(o oVar) {
        oVar.f33392g = this;
        oVar.f33391f = this.f33391f;
        this.f33391f.f33392g = oVar;
        this.f33391f = oVar;
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final o d() {
        this.f33389d = true;
        return new o(this.f33386a, this.f33387b, this.f33388c, true, false);
    }

    public final o e(int i10) {
        o b10;
        if (i10 > 0 && i10 <= this.f33388c - this.f33387b) {
            if (i10 >= 1024) {
                b10 = d();
            } else {
                b10 = p.b();
                System.arraycopy(this.f33386a, this.f33387b, b10.f33386a, 0, i10);
            }
            b10.f33388c = b10.f33387b + i10;
            this.f33387b += i10;
            this.f33392g.c(b10);
            return b10;
        }
        throw new IllegalArgumentException();
    }

    public final void f(o oVar, int i10) {
        if (oVar.f33390e) {
            int i11 = oVar.f33388c;
            if (i11 + i10 > 8192) {
                if (!oVar.f33389d) {
                    int i12 = oVar.f33387b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = oVar.f33386a;
                        System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                        oVar.f33388c -= oVar.f33387b;
                        oVar.f33387b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f33386a, this.f33387b, oVar.f33386a, oVar.f33388c, i10);
            oVar.f33388c += i10;
            this.f33387b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f33386a = bArr;
        this.f33387b = i10;
        this.f33388c = i11;
        this.f33389d = z10;
        this.f33390e = z11;
    }
}

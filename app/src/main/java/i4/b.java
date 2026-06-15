package i4;
/* compiled from: BaseUrl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f26515a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26516b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26517c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26518d;

    public b(String str, String str2, int i10, int i11) {
        this.f26515a = str;
        this.f26516b = str2;
        this.f26517c = i10;
        this.f26518d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f26517c == bVar.f26517c && this.f26518d == bVar.f26518d && x5.f.a(this.f26515a, bVar.f26515a) && x5.f.a(this.f26516b, bVar.f26516b);
        }
        return false;
    }

    public int hashCode() {
        return x5.f.b(this.f26515a, this.f26516b, Integer.valueOf(this.f26517c), Integer.valueOf(this.f26518d));
    }
}

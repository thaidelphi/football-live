package l1;
/* compiled from: SystemIdInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f27409a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27410b;

    public g(String str, int i10) {
        this.f27409a = str;
        this.f27410b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f27410b != gVar.f27410b) {
                return false;
            }
            return this.f27409a.equals(gVar.f27409a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f27409a.hashCode() * 31) + this.f27410b;
    }
}

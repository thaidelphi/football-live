package l1;
/* compiled from: Preference.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f27404a;

    /* renamed from: b  reason: collision with root package name */
    public Long f27405b;

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f27404a.equals(dVar.f27404a)) {
                Long l10 = this.f27405b;
                Long l11 = dVar.f27405b;
                return l10 != null ? l10.equals(l11) : l11 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f27404a.hashCode() * 31;
        Long l10 = this.f27405b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f27404a = str;
        this.f27405b = Long.valueOf(j10);
    }
}

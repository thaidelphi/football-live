package i4;

import a5.p0;
/* compiled from: Descriptor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f26546a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26547b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26548c;

    public e(String str, String str2, String str3) {
        this.f26546a = str;
        this.f26547b = str2;
        this.f26548c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return p0.c(this.f26546a, eVar.f26546a) && p0.c(this.f26547b, eVar.f26547b) && p0.c(this.f26548c, eVar.f26548c);
    }

    public int hashCode() {
        int hashCode = this.f26546a.hashCode() * 31;
        String str = this.f26547b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26548c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

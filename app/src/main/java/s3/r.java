package s3;

import com.ironsource.b9;
/* compiled from: SeekPoint.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final r f30724c = new r(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f30725a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30726b;

    public r(long j10, long j11) {
        this.f30725a = j10;
        this.f30726b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f30725a == rVar.f30725a && this.f30726b == rVar.f30726b;
    }

    public int hashCode() {
        return (((int) this.f30725a) * 31) + ((int) this.f30726b);
    }

    public String toString() {
        return "[timeUs=" + this.f30725a + ", position=" + this.f30726b + b9.i.f16698e;
    }
}

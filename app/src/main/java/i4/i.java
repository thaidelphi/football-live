package i4;

import a5.n0;
import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: RangedUri.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f26564a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26565b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26566c;

    /* renamed from: d  reason: collision with root package name */
    private int f26567d;

    public i(String str, long j10, long j11) {
        this.f26566c = str == null ? "" : str;
        this.f26564a = j10;
        this.f26565b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f26565b;
            if (j10 != -1) {
                long j11 = this.f26564a;
                if (j11 + j10 == iVar.f26564a) {
                    long j12 = iVar.f26565b;
                    return new i(c10, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f26565b;
            if (j13 != -1) {
                long j14 = iVar.f26564a;
                if (j14 + j13 == this.f26564a) {
                    return new i(c10, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return n0.e(str, this.f26566c);
    }

    public String c(String str) {
        return n0.d(str, this.f26566c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f26564a == iVar.f26564a && this.f26565b == iVar.f26565b && this.f26566c.equals(iVar.f26566c);
    }

    public int hashCode() {
        if (this.f26567d == 0) {
            this.f26567d = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f26564a)) * 31) + ((int) this.f26565b)) * 31) + this.f26566c.hashCode();
        }
        return this.f26567d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f26566c + ", start=" + this.f26564a + ", length=" + this.f26565b + ")";
    }
}

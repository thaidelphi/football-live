package e4;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: MediaPeriodId.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25139a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25140b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25141c;

    /* renamed from: d  reason: collision with root package name */
    public final long f25142d;

    /* renamed from: e  reason: collision with root package name */
    public final int f25143e;

    public r(Object obj) {
        this(obj, -1L);
    }

    public r a(Object obj) {
        return this.f25139a.equals(obj) ? this : new r(obj, this.f25140b, this.f25141c, this.f25142d, this.f25143e);
    }

    public boolean b() {
        return this.f25140b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f25139a.equals(rVar.f25139a) && this.f25140b == rVar.f25140b && this.f25141c == rVar.f25141c && this.f25142d == rVar.f25142d && this.f25143e == rVar.f25143e;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f25139a.hashCode()) * 31) + this.f25140b) * 31) + this.f25141c) * 31) + ((int) this.f25142d)) * 31) + this.f25143e;
    }

    public r(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public r(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public r(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r(r rVar) {
        this.f25139a = rVar.f25139a;
        this.f25140b = rVar.f25140b;
        this.f25141c = rVar.f25141c;
        this.f25142d = rVar.f25142d;
        this.f25143e = rVar.f25143e;
    }

    private r(Object obj, int i10, int i11, long j10, int i12) {
        this.f25139a = obj;
        this.f25140b = i10;
        this.f25141c = i11;
        this.f25142d = j10;
        this.f25143e = i12;
    }
}

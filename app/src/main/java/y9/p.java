package y9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentPool.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    static o f33393a;

    /* renamed from: b  reason: collision with root package name */
    static long f33394b;

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(o oVar) {
        if (oVar.f33391f == null && oVar.f33392g == null) {
            if (oVar.f33389d) {
                return;
            }
            synchronized (p.class) {
                long j10 = f33394b;
                if (j10 + 8192 > 65536) {
                    return;
                }
                f33394b = j10 + 8192;
                oVar.f33391f = f33393a;
                oVar.f33388c = 0;
                oVar.f33387b = 0;
                f33393a = oVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o b() {
        synchronized (p.class) {
            o oVar = f33393a;
            if (oVar != null) {
                f33393a = oVar.f33391f;
                oVar.f33391f = null;
                f33394b -= 8192;
                return oVar;
            }
            return new o();
        }
    }
}

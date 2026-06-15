package m9;

import i9.k0;
import i9.n0;
/* compiled from: Semaphore.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int f27825a;

    /* renamed from: b  reason: collision with root package name */
    private static final k0 f27826b;

    /* renamed from: c  reason: collision with root package name */
    private static final k0 f27827c;

    /* renamed from: d  reason: collision with root package name */
    private static final k0 f27828d;

    /* renamed from: e  reason: collision with root package name */
    private static final k0 f27829e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f27830f;

    static {
        int e8;
        int e10;
        e8 = n0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f27825a = e8;
        f27826b = new k0("PERMIT");
        f27827c = new k0("TAKEN");
        f27828d = new k0("BROKEN");
        f27829e = new k0("CANCELLED");
        e10 = n0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f27830f = e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f h(long j10, f fVar) {
        return new f(j10, fVar, 0);
    }
}

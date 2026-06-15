package d9;
/* compiled from: EventLoop.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    private static final i9.k0 f24498a = new i9.k0("REMOVED_TASK");

    /* renamed from: b  reason: collision with root package name */
    private static final i9.k0 f24499b = new i9.k0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}

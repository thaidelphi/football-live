package f9;

import com.unity3d.services.UnityAdsConstants;
import i8.w;
import i9.k0;
import i9.n0;
/* compiled from: BufferedChannel.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final i<Object> f25529a = new i<>(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f25530b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f25531c;

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f25532d;

    /* renamed from: e  reason: collision with root package name */
    private static final k0 f25533e;

    /* renamed from: f  reason: collision with root package name */
    private static final k0 f25534f;

    /* renamed from: g  reason: collision with root package name */
    private static final k0 f25535g;

    /* renamed from: h  reason: collision with root package name */
    private static final k0 f25536h;

    /* renamed from: i  reason: collision with root package name */
    private static final k0 f25537i;

    /* renamed from: j  reason: collision with root package name */
    private static final k0 f25538j;

    /* renamed from: k  reason: collision with root package name */
    private static final k0 f25539k;

    /* renamed from: l  reason: collision with root package name */
    private static final k0 f25540l;

    /* renamed from: m  reason: collision with root package name */
    private static final k0 f25541m;

    /* renamed from: n  reason: collision with root package name */
    private static final k0 f25542n;

    /* renamed from: o  reason: collision with root package name */
    private static final k0 f25543o;

    /* renamed from: p  reason: collision with root package name */
    private static final k0 f25544p;

    /* renamed from: q  reason: collision with root package name */
    private static final k0 f25545q;

    /* renamed from: r  reason: collision with root package name */
    private static final k0 f25546r;

    /* renamed from: s  reason: collision with root package name */
    private static final k0 f25547s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: BufferedChannel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    /* synthetic */ class a<E> extends kotlin.jvm.internal.l implements t8.p<Long, i<E>, i<E>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25548a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final i<E> a(long j10, i<E> iVar) {
            return c.x(j10, iVar);
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return a(l10.longValue(), (i) obj);
        }
    }

    static {
        int e8;
        int e10;
        e8 = n0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f25530b = e8;
        e10 = n0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 0, 0, 12, null);
        f25531c = e10;
        f25532d = new k0("BUFFERED");
        f25533e = new k0("SHOULD_BUFFER");
        f25534f = new k0("S_RESUMING_BY_RCV");
        f25535g = new k0("RESUMING_BY_EB");
        f25536h = new k0("POISONED");
        f25537i = new k0("DONE_RCV");
        f25538j = new k0("INTERRUPTED_SEND");
        f25539k = new k0("INTERRUPTED_RCV");
        f25540l = new k0("CHANNEL_CLOSED");
        f25541m = new k0("SUSPEND");
        f25542n = new k0("SUSPEND_NO_WAITER");
        f25543o = new k0("FAILED");
        f25544p = new k0("NO_RECEIVE_RESULT");
        f25545q = new k0("CLOSE_HANDLER_CLOSED");
        f25546r = new k0("CLOSE_HANDLER_INVOKED");
        f25547s = new k0("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MAX_VALUE) {
                return i10;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(d9.n<? super T> nVar, T t10, t8.l<? super Throwable, w> lVar) {
        Object p10 = nVar.p(t10, null, lVar);
        if (p10 != null) {
            nVar.u(p10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean C(d9.n nVar, Object obj, t8.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(nVar, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> i<E> x(long j10, i<E> iVar) {
        return new i<>(j10, iVar, iVar.u(), 0);
    }

    public static final <E> z8.e<i<E>> y() {
        return a.f25548a;
    }

    public static final k0 z() {
        return f25540l;
    }
}

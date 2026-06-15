package o3;

import android.media.metrics.LogSessionId;
/* compiled from: PlayerId.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class q1 {

    /* renamed from: b  reason: collision with root package name */
    public static final q1 f29317b;

    /* renamed from: a  reason: collision with root package name */
    private final a f29318a;

    /* compiled from: PlayerId.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f29319b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f29320a;

        public a(LogSessionId logSessionId) {
            this.f29320a = logSessionId;
        }
    }

    static {
        f29317b = a5.p0.f482a < 31 ? new q1() : new q1(a.f29319b);
    }

    public q1() {
        this((a) null);
        a5.a.f(a5.p0.f482a < 31);
    }

    public LogSessionId a() {
        return ((a) a5.a.e(this.f29318a)).f29320a;
    }

    public q1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private q1(a aVar) {
        this.f29318a = aVar;
    }
}

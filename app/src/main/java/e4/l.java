package e4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: LoadEventInfo.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f25088h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f25089a;

    /* renamed from: b  reason: collision with root package name */
    public final z4.p f25090b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f25091c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f25092d;

    /* renamed from: e  reason: collision with root package name */
    public final long f25093e;

    /* renamed from: f  reason: collision with root package name */
    public final long f25094f;

    /* renamed from: g  reason: collision with root package name */
    public final long f25095g;

    public l(long j10, z4.p pVar, long j11) {
        this(j10, pVar, pVar.f33569a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public static long a() {
        return f25088h.getAndIncrement();
    }

    public l(long j10, z4.p pVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f25089a = j10;
        this.f25090b = pVar;
        this.f25091c = uri;
        this.f25092d = map;
        this.f25093e = j11;
        this.f25094f = j12;
        this.f25095g = j13;
    }
}

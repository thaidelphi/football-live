package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.q9;
import com.ironsource.xh;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class cs implements xh, xh.a {

    /* renamed from: a  reason: collision with root package name */
    private final ds f16905a;

    /* renamed from: b  reason: collision with root package name */
    private final ur f16906b;

    /* renamed from: c  reason: collision with root package name */
    private final q9 f16907c;

    /* renamed from: d  reason: collision with root package name */
    private int f16908d;

    /* renamed from: e  reason: collision with root package name */
    private long f16909e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16910a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f16911b = -1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f16912c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final long f16913d = -1;

        private a() {
        }
    }

    public cs(ds storage, ur initResponseStorage, q9 currentTimeProvider) {
        kotlin.jvm.internal.n.f(storage, "storage");
        kotlin.jvm.internal.n.f(initResponseStorage, "initResponseStorage");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f16905a = storage;
        this.f16906b = initResponseStorage;
        this.f16907c = currentTimeProvider;
        this.f16908d = -1;
        this.f16909e = -1L;
    }

    public /* synthetic */ cs(ds dsVar, ur urVar, q9 q9Var, int i10, kotlin.jvm.internal.h hVar) {
        this(dsVar, (i10 & 2) != 0 ? new vr() : urVar, (i10 & 4) != 0 ? new q9.a() : q9Var);
    }

    private final long a(Context context, ds dsVar) {
        long a10 = dsVar.a(context, -1L);
        if (this.f16906b.a(context) || a10 != -1) {
            return a10;
        }
        long a11 = this.f16907c.a();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("set first session timestamp = " + a11);
        dsVar.b(context, a11);
        return a11;
    }

    private final int b(Context context, ds dsVar) {
        int b10 = dsVar.b(context, 0) + 1;
        dsVar.a(context, b10);
        return b10;
    }

    @Override // com.ironsource.xh
    public long a() {
        return this.f16909e;
    }

    @Override // com.ironsource.xh.a
    public void a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        this.f16908d = b(context, this.f16905a);
        this.f16909e = a(context, this.f16905a);
    }

    @Override // com.ironsource.xh
    public String b() {
        String sessionId = IronSourceUtils.getSessionId();
        kotlin.jvm.internal.n.e(sessionId, "getSessionId()");
        return sessionId;
    }

    @Override // com.ironsource.xh
    public int c() {
        return this.f16908d;
    }
}

package com.ironsource;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class es implements ds {

    /* renamed from: a  reason: collision with root package name */
    private final yh f17321a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17322a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final String f17323b = "sessionNumber";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17324c = "firstSessionTimestamp";

        private a() {
        }
    }

    public es() {
        this(null, 1, null);
    }

    public es(yh sdkSharedPref) {
        kotlin.jvm.internal.n.f(sdkSharedPref, "sdkSharedPref");
        this.f17321a = sdkSharedPref;
    }

    public /* synthetic */ es(yh yhVar, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? new gs() : yhVar);
    }

    @Override // com.ironsource.nr
    public long a(Context context, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        return this.f17321a.b(context, "firstSessionTimestamp", j10);
    }

    @Override // com.ironsource.fs
    public void a(Context context, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        this.f17321a.a(context, a.f17323b, i10);
    }

    @Override // com.ironsource.fs
    public int b(Context context, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        return this.f17321a.b(context, a.f17323b, i10);
    }

    @Override // com.ironsource.nr
    public void b(Context context, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        this.f17321a.a(context, "firstSessionTimestamp", j10);
    }
}

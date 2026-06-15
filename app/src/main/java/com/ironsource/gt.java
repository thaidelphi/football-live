package com.ironsource;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gt implements g8 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f17611d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f17612e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final long f17613f = -1;

    /* renamed from: a  reason: collision with root package name */
    private final Context f17614a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17615b;

    /* renamed from: c  reason: collision with root package name */
    private final yh f17616c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public gt(Context context, String baseName, yh sdkSharedPref) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(baseName, "baseName");
        kotlin.jvm.internal.n.f(sdkSharedPref, "sdkSharedPref");
        this.f17614a = context;
        this.f17615b = baseName;
        this.f17616c = sdkSharedPref;
    }

    public /* synthetic */ gt(Context context, String str, yh yhVar, int i10, kotlin.jvm.internal.h hVar) {
        this(context, str, (i10 & 4) != 0 ? new gs() : yhVar);
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    private final Long a(Long l10) {
        if (l10 != null && l10.longValue() == -1) {
            return null;
        }
        return l10;
    }

    @Override // com.ironsource.g8
    public Long a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        return a(Long.valueOf(this.f17616c.b(this.f17614a, new ht(identifier, this.f17615b + ".show_count_threshold").a(), -1L)));
    }

    @Override // com.ironsource.g8
    public void a(String identifier, int i10) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f17616c.a(this.f17614a, new ht(identifier, this.f17615b + ".show_count_show_counter").a(), i10);
    }

    @Override // com.ironsource.g8
    public void a(String identifier, long j10) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f17616c.a(this.f17614a, new ht(identifier, this.f17615b + ".show_count_threshold").a(), j10);
    }

    @Override // com.ironsource.g8
    public Long b(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        return a(Long.valueOf(this.f17616c.b(this.f17614a, new ht(identifier, this.f17615b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.g8
    public void b(String identifier, long j10) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        this.f17616c.a(this.f17614a, new ht(identifier, this.f17615b + ".pacing_last_show_time").a(), j10);
    }

    @Override // com.ironsource.g8
    public Integer c(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        return a(Integer.valueOf(this.f17616c.b(this.f17614a, new ht(identifier, this.f17615b + ".show_count_show_counter").a(), -1)));
    }
}

package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class rm {

    /* renamed from: m  reason: collision with root package name */
    public static final a f19995m = new a(null);

    /* renamed from: n  reason: collision with root package name */
    private static final int f19996n = 0;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19997a;

    /* renamed from: b  reason: collision with root package name */
    private h4 f19998b;

    /* renamed from: c  reason: collision with root package name */
    private int f19999c;

    /* renamed from: d  reason: collision with root package name */
    private long f20000d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20001e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<cn> f20002f;

    /* renamed from: g  reason: collision with root package name */
    private cn f20003g;

    /* renamed from: h  reason: collision with root package name */
    private int f20004h;

    /* renamed from: i  reason: collision with root package name */
    private o5 f20005i;

    /* renamed from: j  reason: collision with root package name */
    private long f20006j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20007k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20008l;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public rm(int i10, long j10, boolean z10, h4 events, o5 auctionSettings, int i11, long j11, boolean z11, boolean z12, boolean z13) {
        kotlin.jvm.internal.n.f(events, "events");
        kotlin.jvm.internal.n.f(auctionSettings, "auctionSettings");
        this.f19997a = z13;
        this.f20002f = new ArrayList<>();
        this.f19999c = i10;
        this.f20000d = j10;
        this.f20001e = z10;
        this.f19998b = events;
        this.f20004h = i11;
        this.f20005i = auctionSettings;
        this.f20006j = j11;
        this.f20007k = z11;
        this.f20008l = z12;
    }

    public final cn a(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        Iterator<cn> it = this.f20002f.iterator();
        while (it.hasNext()) {
            cn next = it.next();
            if (kotlin.jvm.internal.n.a(next.getPlacementName(), placementName)) {
                return next;
            }
        }
        return null;
    }

    public final void a(int i10) {
        this.f19999c = i10;
    }

    public final void a(long j10) {
        this.f20000d = j10;
    }

    public final void a(cn cnVar) {
        if (cnVar != null) {
            this.f20002f.add(cnVar);
            if (this.f20003g == null || cnVar.getPlacementId() == 0) {
                this.f20003g = cnVar;
            }
        }
    }

    public final void a(h4 h4Var) {
        kotlin.jvm.internal.n.f(h4Var, "<set-?>");
        this.f19998b = h4Var;
    }

    public final void a(o5 o5Var) {
        kotlin.jvm.internal.n.f(o5Var, "<set-?>");
        this.f20005i = o5Var;
    }

    public final void a(boolean z10) {
        this.f20001e = z10;
    }

    public final boolean a() {
        return this.f20001e;
    }

    public final int b() {
        return this.f19999c;
    }

    public final void b(int i10) {
        this.f20004h = i10;
    }

    public final void b(long j10) {
        this.f20006j = j10;
    }

    public final void b(boolean z10) {
        this.f20007k = z10;
    }

    public final long c() {
        return this.f20000d;
    }

    public final void c(boolean z10) {
        this.f20008l = z10;
    }

    public final o5 d() {
        return this.f20005i;
    }

    public final cn e() {
        Iterator<cn> it = this.f20002f.iterator();
        while (it.hasNext()) {
            cn next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f20003g;
    }

    public final int f() {
        return this.f20004h;
    }

    public final h4 g() {
        return this.f19998b;
    }

    public final long h() {
        return this.f20006j;
    }

    public final boolean i() {
        return this.f20007k;
    }

    public final boolean j() {
        return this.f19997a;
    }

    public final boolean k() {
        return this.f20008l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f19999c + ", bidderExclusive=" + this.f20001e + '}';
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class kn {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18097e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static volatile kn f18098f;

    /* renamed from: a  reason: collision with root package name */
    private cq f18099a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f18100b;

    /* renamed from: c  reason: collision with root package name */
    private String f18101c;

    /* renamed from: d  reason: collision with root package name */
    private s8 f18102d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final e3 a(IronSource.AD_UNIT adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            kn knVar = kn.f18098f;
            s8 b10 = knVar != null ? knVar.b() : null;
            kn knVar2 = kn.f18098f;
            cq e8 = knVar2 != null ? knVar2.e() : null;
            return (b10 == null || e8 == null) ? new kb() : new r7(b10, e8, adFormat);
        }

        public final kn a() {
            kn knVar = kn.f18098f;
            if (knVar == null) {
                synchronized (this) {
                    knVar = kn.f18098f;
                    if (knVar == null) {
                        knVar = new kn(null);
                        a aVar = kn.f18097e;
                        kn.f18098f = knVar;
                    }
                }
            }
            return knVar;
        }
    }

    private kn() {
        this.f18100b = new AtomicBoolean(false);
        this.f18101c = "";
    }

    public /* synthetic */ kn(kotlin.jvm.internal.h hVar) {
        this();
    }

    public static final kn d() {
        return f18097e.a();
    }

    public final void a(cq cqVar) {
        this.f18099a = cqVar;
    }

    public final void a(s8 s8Var) {
        this.f18102d = s8Var;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f18101c = str;
    }

    public final s8 b() {
        return this.f18102d;
    }

    public final AtomicBoolean c() {
        return this.f18100b;
    }

    public final cq e() {
        return this.f18099a;
    }

    public final String f() {
        return this.f18101c;
    }

    public final void g() {
        this.f18100b.set(true);
    }
}

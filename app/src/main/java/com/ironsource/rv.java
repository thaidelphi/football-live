package com.ironsource;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class rv extends gp {

    /* renamed from: f  reason: collision with root package name */
    public static final a f20034f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f20035g = "ViewVisibilityTrigger";

    /* renamed from: d  reason: collision with root package name */
    private final b f20036d;

    /* renamed from: e  reason: collision with root package name */
    private final tv f20037e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements ro {
        b() {
        }

        @Override // com.ironsource.ro
        public void a(boolean z10) {
            rv.this.a(!z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(View view) {
        super(false, 1, null);
        kotlin.jvm.internal.n.f(view, "view");
        b bVar = new b();
        this.f20036d = bVar;
        tv tvVar = new tv(bVar);
        this.f20037e = tvVar;
        tvVar.a(view);
        a(!tvVar.c());
    }

    @Override // com.ironsource.gp
    public String b() {
        return f20035g;
    }

    public final void e() {
        this.f20037e.b();
    }
}

package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class bl {

    /* renamed from: a  reason: collision with root package name */
    private final o1 f16764a;

    /* renamed from: b  reason: collision with root package name */
    private String f16765b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16766c;

    public bl(o1 adTools) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        this.f16764a = adTools;
        this.f16765b = "";
    }

    public final o1 a() {
        return this.f16764a;
    }

    public final void a(f1 adProperties) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f16764a.e().a(new c2(this.f16764a, adProperties, null, 4, null));
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        this.f16764a.d(runnable);
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f16765b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boolean z10) {
        this.f16766c = z10;
    }

    public final String b() {
        return this.f16765b;
    }

    public final void b(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f16764a.e(callback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        return this.f16766c;
    }

    public abstract boolean d();
}

package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class li {

    /* renamed from: a  reason: collision with root package name */
    private final String f18213a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18214b;

    /* renamed from: c  reason: collision with root package name */
    private v0 f18215c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18216d;

    /* renamed from: e  reason: collision with root package name */
    private String f18217e;

    /* renamed from: f  reason: collision with root package name */
    private String f18218f;

    public li(String appKey, String userId) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(userId, "userId");
        this.f18213a = appKey;
        this.f18214b = userId;
    }

    public static /* synthetic */ li a(li liVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liVar.f18213a;
        }
        if ((i10 & 2) != 0) {
            str2 = liVar.f18214b;
        }
        return liVar.a(str, str2);
    }

    public final li a(String appKey, String userId) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(userId, "userId");
        return new li(appKey, userId);
    }

    public final <T> T a(lm<li, T> mapper) {
        kotlin.jvm.internal.n.f(mapper, "mapper");
        return mapper.a(this);
    }

    public final String a() {
        return this.f18213a;
    }

    public final void a(v0 v0Var) {
        this.f18215c = v0Var;
    }

    public final void a(String str) {
        this.f18218f = str;
    }

    public final void a(boolean z10) {
        this.f18216d = z10;
    }

    public final String b() {
        return this.f18214b;
    }

    public final void b(String str) {
        this.f18217e = str;
    }

    public final boolean c() {
        return this.f18216d;
    }

    public final String d() {
        return this.f18213a;
    }

    public final v0 e() {
        return this.f18215c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof li) {
            li liVar = (li) obj;
            return kotlin.jvm.internal.n.a(this.f18213a, liVar.f18213a) && kotlin.jvm.internal.n.a(this.f18214b, liVar.f18214b);
        }
        return false;
    }

    public final String f() {
        return this.f18218f;
    }

    public final String g() {
        return this.f18217e;
    }

    public final String h() {
        return this.f18214b;
    }

    public int hashCode() {
        return (this.f18213a.hashCode() * 31) + this.f18214b.hashCode();
    }

    public String toString() {
        return "InitConfig(appKey=" + this.f18213a + ", userId=" + this.f18214b + ')';
    }
}

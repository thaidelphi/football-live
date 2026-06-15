package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qv {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19906a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19907b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f19908c;

    public qv(boolean z10, boolean z11, boolean z12) {
        this.f19906a = z10;
        this.f19907b = z11;
        this.f19908c = z12;
    }

    public static /* synthetic */ qv a(qv qvVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = qvVar.f19906a;
        }
        if ((i10 & 2) != 0) {
            z11 = qvVar.f19907b;
        }
        if ((i10 & 4) != 0) {
            z12 = qvVar.f19908c;
        }
        return qvVar.a(z10, z11, z12);
    }

    public final qv a(boolean z10, boolean z11, boolean z12) {
        return new qv(z10, z11, z12);
    }

    public final boolean a() {
        return this.f19906a;
    }

    public final boolean b() {
        return this.f19907b;
    }

    public final boolean c() {
        return this.f19908c;
    }

    public final boolean d() {
        return this.f19908c;
    }

    public final boolean e() {
        return this.f19906a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qv) {
            qv qvVar = (qv) obj;
            return this.f19906a == qvVar.f19906a && this.f19907b == qvVar.f19907b && this.f19908c == qvVar.f19908c;
        }
        return false;
    }

    public final boolean f() {
        return this.f19907b;
    }

    public final JSONObject g() {
        JSONObject put = new JSONObject().put(ug.f20996k, this.f19906a).put(ug.f20997l, this.f19907b).put(ug.f20998m, this.f19908c);
        kotlin.jvm.internal.n.e(put, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f19906a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f19907b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z11 = this.f19908c;
        return i12 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f19906a + ", isWindowVisible=" + this.f19907b + ", isShown=" + this.f19908c + ')';
    }
}

package x4;

import a5.p0;
import n3.b3;
import n3.q3;
/* compiled from: TrackSelectorResult.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f32589a;

    /* renamed from: b  reason: collision with root package name */
    public final b3[] f32590b;

    /* renamed from: c  reason: collision with root package name */
    public final s[] f32591c;

    /* renamed from: d  reason: collision with root package name */
    public final q3 f32592d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f32593e;

    public c0(b3[] b3VarArr, s[] sVarArr, q3 q3Var, Object obj) {
        this.f32590b = b3VarArr;
        this.f32591c = (s[]) sVarArr.clone();
        this.f32592d = q3Var;
        this.f32593e = obj;
        this.f32589a = b3VarArr.length;
    }

    public boolean a(c0 c0Var) {
        if (c0Var == null || c0Var.f32591c.length != this.f32591c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f32591c.length; i10++) {
            if (!b(c0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(c0 c0Var, int i10) {
        return c0Var != null && p0.c(this.f32590b[i10], c0Var.f32590b[i10]) && p0.c(this.f32591c[i10], c0Var.f32591c[i10]);
    }

    public boolean c(int i10) {
        return this.f32590b[i10] != null;
    }
}

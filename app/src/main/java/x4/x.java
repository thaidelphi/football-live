package x4;

import android.os.Bundle;
import e4.k0;
import java.util.Collections;
import java.util.List;
import n3.h;
/* compiled from: TrackSelectionOverride.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x implements n3.h {

    /* renamed from: c  reason: collision with root package name */
    public static final h.a<x> f32692c = new h.a() { // from class: x4.w
        @Override // n3.h.a
        public final n3.h a(Bundle bundle) {
            x d10;
            d10 = x.d(bundle);
            return d10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final k0 f32693a;

    /* renamed from: b  reason: collision with root package name */
    public final y5.q<Integer> f32694b;

    public x(k0 k0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= k0Var.f25083a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f32693a = k0Var;
        this.f32694b = y5.q.l(list);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x d(Bundle bundle) {
        return new x(k0.f25082f.a((Bundle) a5.a.e(bundle.getBundle(c(0)))), a6.b.c((int[]) a5.a.e(bundle.getIntArray(c(1)))));
    }

    public int b() {
        return this.f32693a.f25085c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f32693a.equals(xVar.f32693a) && this.f32694b.equals(xVar.f32694b);
    }

    public int hashCode() {
        return this.f32693a.hashCode() + (this.f32694b.hashCode() * 31);
    }
}

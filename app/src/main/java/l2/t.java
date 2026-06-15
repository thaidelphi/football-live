package l2;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: TargetTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Set<p2.h<?>> f27522a = Collections.newSetFromMap(new WeakHashMap());

    public void i() {
        this.f27522a.clear();
    }

    public List<p2.h<?>> j() {
        return s2.k.i(this.f27522a);
    }

    public void k(p2.h<?> hVar) {
        this.f27522a.add(hVar);
    }

    public void l(p2.h<?> hVar) {
        this.f27522a.remove(hVar);
    }

    @Override // l2.m
    public void onDestroy() {
        for (p2.h hVar : s2.k.i(this.f27522a)) {
            hVar.onDestroy();
        }
    }

    @Override // l2.m
    public void onStart() {
        for (p2.h hVar : s2.k.i(this.f27522a)) {
            hVar.onStart();
        }
    }

    @Override // l2.m
    public void onStop() {
        for (p2.h hVar : s2.k.i(this.f27522a)) {
            hVar.onStop();
        }
    }
}

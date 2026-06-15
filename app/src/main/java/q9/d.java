package q9;

import java.util.LinkedHashSet;
import java.util.Set;
import n9.c0;
/* compiled from: RouteDatabase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c0> f30165a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.f30165a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.f30165a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.f30165a.contains(c0Var);
    }
}

package l2;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class a implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Set<m> f27486a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private boolean f27487b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27488c;

    @Override // l2.l
    public void a(m mVar) {
        this.f27486a.add(mVar);
        if (this.f27488c) {
            mVar.onDestroy();
        } else if (this.f27487b) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    @Override // l2.l
    public void b(m mVar) {
        this.f27486a.remove(mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f27488c = true;
        for (m mVar : s2.k.i(this.f27486a)) {
            mVar.onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f27487b = true;
        for (m mVar : s2.k.i(this.f27486a)) {
            mVar.onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f27487b = false;
        for (m mVar : s2.k.i(this.f27486a)) {
            mVar.onStop();
        }
    }
}

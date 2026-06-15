package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerViewModel.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l extends k0 {

    /* renamed from: k  reason: collision with root package name */
    private static final l0.b f3379k = new a();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3383g;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, Fragment> f3380d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, l> f3381e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, o0> f3382f = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f3384h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3385i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3386j = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements l0.b {
        a() {
        }

        @Override // androidx.lifecycle.l0.b
        public <T extends k0> T a(Class<T> cls) {
            return new l(true);
        }

        @Override // androidx.lifecycle.l0.b
        public /* synthetic */ k0 b(Class cls, k0.a aVar) {
            return m0.b(this, cls, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(boolean z10) {
        this.f3383g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l j(o0 o0Var) {
        return (l) new l0(o0Var, f3379k).a(l.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.k0
    public void d() {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3384h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f3380d.equals(lVar.f3380d) && this.f3381e.equals(lVar.f3381e) && this.f3382f.equals(lVar.f3382f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f3386j) {
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f3380d.containsKey(fragment.f3147f)) {
        } else {
            this.f3380d.put(fragment.f3147f, fragment);
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (FragmentManager.F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f3381e.get(fragment.f3147f);
        if (lVar != null) {
            lVar.d();
            this.f3381e.remove(fragment.f3147f);
        }
        o0 o0Var = this.f3382f.get(fragment.f3147f);
        if (o0Var != null) {
            o0Var.a();
            this.f3382f.remove(fragment.f3147f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.f3380d.get(str);
    }

    public int hashCode() {
        return (((this.f3380d.hashCode() * 31) + this.f3381e.hashCode()) * 31) + this.f3382f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l i(Fragment fragment) {
        l lVar = this.f3381e.get(fragment.f3147f);
        if (lVar == null) {
            l lVar2 = new l(this.f3383g);
            this.f3381e.put(fragment.f3147f, lVar2);
            return lVar2;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return new ArrayList(this.f3380d.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0 l(Fragment fragment) {
        o0 o0Var = this.f3382f.get(fragment.f3147f);
        if (o0Var == null) {
            o0 o0Var2 = new o0();
            this.f3382f.put(fragment.f3147f, o0Var2);
            return o0Var2;
        }
        return o0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f3384h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (this.f3386j) {
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f3380d.remove(fragment.f3147f) != null) && FragmentManager.F0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10) {
        this.f3386j = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(Fragment fragment) {
        if (this.f3380d.containsKey(fragment.f3147f)) {
            if (this.f3383g) {
                return this.f3384h;
            }
            return !this.f3385i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3380d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3381e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3382f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

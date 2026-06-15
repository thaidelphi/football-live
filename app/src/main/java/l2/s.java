package l2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s extends Fragment {

    /* renamed from: b0  reason: collision with root package name */
    private final l2.a f27515b0;

    /* renamed from: c0  reason: collision with root package name */
    private final q f27516c0;

    /* renamed from: d0  reason: collision with root package name */
    private final Set<s> f27517d0;

    /* renamed from: e0  reason: collision with root package name */
    private s f27518e0;

    /* renamed from: f0  reason: collision with root package name */
    private com.bumptech.glide.k f27519f0;

    /* renamed from: g0  reason: collision with root package name */
    private Fragment f27520g0;

    /* compiled from: SupportRequestManagerFragment.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a implements q {
        a() {
        }

        @Override // l2.q
        public Set<com.bumptech.glide.k> a() {
            Set<s> X1 = s.this.X1();
            HashSet hashSet = new HashSet(X1.size());
            for (s sVar : X1) {
                if (sVar.a2() != null) {
                    hashSet.add(sVar.a2());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + s.this + "}";
        }
    }

    public s() {
        this(new l2.a());
    }

    private void W1(s sVar) {
        this.f27517d0.add(sVar);
    }

    private Fragment Z1() {
        Fragment D = D();
        return D != null ? D : this.f27520g0;
    }

    private static FragmentManager c2(Fragment fragment) {
        while (fragment.D() != null) {
            fragment = fragment.D();
        }
        return fragment.x();
    }

    private boolean d2(Fragment fragment) {
        Fragment Z1 = Z1();
        while (true) {
            Fragment D = fragment.D();
            if (D == null) {
                return false;
            }
            if (D.equals(Z1)) {
                return true;
            }
            fragment = fragment.D();
        }
    }

    private void e2(Context context, FragmentManager fragmentManager) {
        i2();
        s s10 = com.bumptech.glide.b.c(context).k().s(fragmentManager);
        this.f27518e0 = s10;
        if (equals(s10)) {
            return;
        }
        this.f27518e0.W1(this);
    }

    private void f2(s sVar) {
        this.f27517d0.remove(sVar);
    }

    private void i2() {
        s sVar = this.f27518e0;
        if (sVar != null) {
            sVar.f2(this);
            this.f27518e0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void A0() {
        super.A0();
        this.f27515b0.c();
        i2();
    }

    @Override // androidx.fragment.app.Fragment
    public void D0() {
        super.D0();
        this.f27520g0 = null;
        i2();
    }

    @Override // androidx.fragment.app.Fragment
    public void S0() {
        super.S0();
        this.f27515b0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void T0() {
        super.T0();
        this.f27515b0.e();
    }

    Set<s> X1() {
        s sVar = this.f27518e0;
        if (sVar == null) {
            return Collections.emptySet();
        }
        if (equals(sVar)) {
            return Collections.unmodifiableSet(this.f27517d0);
        }
        HashSet hashSet = new HashSet();
        for (s sVar2 : this.f27518e0.X1()) {
            if (d2(sVar2.Z1())) {
                hashSet.add(sVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2.a Y1() {
        return this.f27515b0;
    }

    public com.bumptech.glide.k a2() {
        return this.f27519f0;
    }

    public q b2() {
        return this.f27516c0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g2(Fragment fragment) {
        FragmentManager c22;
        this.f27520g0 = fragment;
        if (fragment == null || fragment.p() == null || (c22 = c2(fragment)) == null) {
            return;
        }
        e2(fragment.p(), c22);
    }

    public void h2(com.bumptech.glide.k kVar) {
        this.f27519f0 = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void s0(Context context) {
        super.s0(context);
        FragmentManager c22 = c2(this);
        if (c22 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            e2(p(), c22);
        } catch (IllegalStateException e8) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + Z1() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public s(l2.a aVar) {
        this.f27516c0 = new a();
        this.f27517d0 = new HashSet();
        this.f27515b0 = aVar;
    }
}

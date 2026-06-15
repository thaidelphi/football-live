package l2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final l2.a f27495a;

    /* renamed from: b  reason: collision with root package name */
    private final q f27496b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<o> f27497c;

    /* renamed from: d  reason: collision with root package name */
    private com.bumptech.glide.k f27498d;

    /* renamed from: e  reason: collision with root package name */
    private o f27499e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f27500f;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a implements q {
        a() {
        }

        @Override // l2.q
        public Set<com.bumptech.glide.k> a() {
            Set<o> b10 = o.this.b();
            HashSet hashSet = new HashSet(b10.size());
            for (o oVar : b10) {
                if (oVar.e() != null) {
                    hashSet.add(oVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new l2.a());
    }

    private void a(o oVar) {
        this.f27497c.add(oVar);
    }

    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f27500f;
    }

    @TargetApi(17)
    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        o q10 = com.bumptech.glide.b.c(activity).k().q(activity);
        this.f27499e = q10;
        if (equals(q10)) {
            return;
        }
        this.f27499e.a(this);
    }

    private void i(o oVar) {
        this.f27497c.remove(oVar);
    }

    private void l() {
        o oVar = this.f27499e;
        if (oVar != null) {
            oVar.i(this);
            this.f27499e = null;
        }
    }

    @TargetApi(17)
    Set<o> b() {
        if (equals(this.f27499e)) {
            return Collections.unmodifiableSet(this.f27497c);
        }
        if (this.f27499e != null && Build.VERSION.SDK_INT >= 17) {
            HashSet hashSet = new HashSet();
            for (o oVar : this.f27499e.b()) {
                if (g(oVar.getParentFragment())) {
                    hashSet.add(oVar);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2.a c() {
        return this.f27495a;
    }

    public com.bumptech.glide.k e() {
        return this.f27498d;
    }

    public q f() {
        return this.f27496b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        this.f27500f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(com.bumptech.glide.k kVar) {
        this.f27498d = kVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e8) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e8);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f27495a.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f27495a.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f27495a.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    o(l2.a aVar) {
        this.f27496b = new a();
        this.f27497c = new HashSet();
        this.f27495a = aVar;
    }
}

package l2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;
import com.ironsource.b9;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: RequestManagerRetriever.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p implements Handler.Callback {

    /* renamed from: j  reason: collision with root package name */
    private static final b f27502j = new a();

    /* renamed from: a  reason: collision with root package name */
    private volatile com.bumptech.glide.k f27503a;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f27506d;

    /* renamed from: e  reason: collision with root package name */
    private final b f27507e;

    /* renamed from: i  reason: collision with root package name */
    private final k f27511i;

    /* renamed from: b  reason: collision with root package name */
    final Map<FragmentManager, o> f27504b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<androidx.fragment.app.FragmentManager, s> f27505c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f27508f = new androidx.collection.a<>();

    /* renamed from: g  reason: collision with root package name */
    private final androidx.collection.a<View, android.app.Fragment> f27509g = new androidx.collection.a<>();

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f27510h = new Bundle();

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements b {
        a() {
        }

        @Override // l2.p.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, q qVar, Context context) {
            return new com.bumptech.glide.k(bVar, lVar, qVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, q qVar, Context context);
    }

    public p(b bVar, com.bumptech.glide.e eVar) {
        this.f27507e = bVar == null ? f27502j : bVar;
        this.f27506d = new Handler(Looper.getMainLooper(), this);
        this.f27511i = b(eVar);
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static k b(com.bumptech.glide.e eVar) {
        if (f2.r.f25354h && f2.r.f25353g) {
            if (eVar.a(c.d.class)) {
                return new i();
            }
            return new j();
        }
        return new g();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    private void d(FragmentManager fragmentManager, androidx.collection.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        e(fragmentManager, aVar);
    }

    @Deprecated
    private void e(FragmentManager fragmentManager, androidx.collection.a<View, android.app.Fragment> aVar) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            this.f27510h.putInt(b9.h.W, i10);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f27510h, b9.h.W);
            } catch (Exception unused) {
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                if (Build.VERSION.SDK_INT >= 17) {
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            i10 = i11;
        }
    }

    private static void f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.W() != null) {
                map.put(fragment.W(), fragment);
                f(fragment.o().s0(), map);
            }
        }
    }

    @Deprecated
    private android.app.Fragment g(View view, Activity activity) {
        this.f27509g.clear();
        d(activity.getFragmentManager(), this.f27509g);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f27509g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f27509g.clear();
        return fragment;
    }

    private Fragment h(View view, FragmentActivity fragmentActivity) {
        this.f27508f.clear();
        f(fragmentActivity.getSupportFragmentManager().s0(), this.f27508f);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f27508f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f27508f.clear();
        return fragment;
    }

    @Deprecated
    private com.bumptech.glide.k i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        o r10 = r(fragmentManager, fragment);
        com.bumptech.glide.k e8 = r10.e();
        if (e8 == null) {
            e8 = this.f27507e.a(com.bumptech.glide.b.c(context), r10.c(), r10.f(), context);
            if (z10) {
                e8.onStart();
            }
            r10.k(e8);
        }
        return e8;
    }

    private com.bumptech.glide.k p(Context context) {
        if (this.f27503a == null) {
            synchronized (this) {
                if (this.f27503a == null) {
                    this.f27503a = this.f27507e.a(com.bumptech.glide.b.c(context.getApplicationContext()), new l2.b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f27503a;
    }

    private o r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        o oVar = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null) {
            o oVar2 = this.f27504b.get(fragmentManager);
            if (oVar2 == null) {
                o oVar3 = new o();
                oVar3.j(fragment);
                this.f27504b.put(fragmentManager, oVar3);
                fragmentManager.beginTransaction().add(oVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f27506d.obtainMessage(1, fragmentManager).sendToTarget();
                return oVar3;
            }
            return oVar2;
        }
        return oVar;
    }

    private s t(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        s sVar = (s) fragmentManager.i0("com.bumptech.glide.manager");
        if (sVar == null) {
            s sVar2 = this.f27505c.get(fragmentManager);
            if (sVar2 == null) {
                s sVar3 = new s();
                sVar3.g2(fragment);
                this.f27505c.put(fragmentManager, sVar3);
                fragmentManager.m().d(sVar3, "com.bumptech.glide.manager").g();
                this.f27506d.obtainMessage(2, fragmentManager).sendToTarget();
                return sVar3;
            }
            return sVar2;
        }
        return sVar;
    }

    private static boolean u(Context context) {
        Activity c10 = c(context);
        return c10 == null || !c10.isFinishing();
    }

    private com.bumptech.glide.k v(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z10) {
        s t10 = t(fragmentManager, fragment);
        com.bumptech.glide.k a22 = t10.a2();
        if (a22 == null) {
            a22 = this.f27507e.a(com.bumptech.glide.b.c(context), t10.Y1(), t10.b2(), context);
            if (z10) {
                a22.onStart();
            }
            t10.h2(a22);
        }
        return a22;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        int i10 = message.what;
        Object obj3 = null;
        boolean z10 = true;
        if (i10 == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.f27504b.remove(obj);
        } else if (i10 == 2) {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f27505c.remove(obj);
        } else {
            z10 = false;
            obj2 = null;
            if (z10 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z10;
        }
        Object obj4 = obj;
        obj3 = remove;
        obj2 = obj4;
        if (z10) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z10;
    }

    public com.bumptech.glide.k j(Activity activity) {
        if (s2.k.q()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return o((FragmentActivity) activity);
        }
        a(activity);
        this.f27511i.a(activity);
        return i(activity, activity.getFragmentManager(), null, u(activity));
    }

    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.k k(android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!s2.k.q() && Build.VERSION.SDK_INT >= 17) {
                if (fragment.getActivity() != null) {
                    this.f27511i.a(fragment.getActivity());
                }
                return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return l(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    public com.bumptech.glide.k l(Context context) {
        if (context != null) {
            if (s2.k.r() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return o((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return l(contextWrapper.getBaseContext());
                    }
                }
            }
            return p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public com.bumptech.glide.k m(View view) {
        if (s2.k.q()) {
            return l(view.getContext().getApplicationContext());
        }
        s2.j.d(view);
        s2.j.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c10 = c(view.getContext());
        if (c10 == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (c10 instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) c10;
            Fragment h10 = h(view, fragmentActivity);
            return h10 != null ? n(h10) : o(fragmentActivity);
        }
        android.app.Fragment g10 = g(view, c10);
        if (g10 == null) {
            return j(c10);
        }
        return k(g10);
    }

    public com.bumptech.glide.k n(Fragment fragment) {
        s2.j.e(fragment.p(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (s2.k.q()) {
            return l(fragment.p().getApplicationContext());
        }
        if (fragment.i() != null) {
            this.f27511i.a(fragment.i());
        }
        return v(fragment.p(), fragment.o(), fragment, fragment.n0());
    }

    public com.bumptech.glide.k o(FragmentActivity fragmentActivity) {
        if (s2.k.q()) {
            return l(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.f27511i.a(fragmentActivity);
        return v(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, u(fragmentActivity));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public o q(Activity activity) {
        return r(activity.getFragmentManager(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s s(androidx.fragment.app.FragmentManager fragmentManager) {
        return t(fragmentManager, null);
    }
}

package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* compiled from: FragmentTransaction.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private final g f3398a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f3399b;

    /* renamed from: d  reason: collision with root package name */
    int f3401d;

    /* renamed from: e  reason: collision with root package name */
    int f3402e;

    /* renamed from: f  reason: collision with root package name */
    int f3403f;

    /* renamed from: g  reason: collision with root package name */
    int f3404g;

    /* renamed from: h  reason: collision with root package name */
    int f3405h;

    /* renamed from: i  reason: collision with root package name */
    boolean f3406i;

    /* renamed from: k  reason: collision with root package name */
    String f3408k;

    /* renamed from: l  reason: collision with root package name */
    int f3409l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f3410m;

    /* renamed from: n  reason: collision with root package name */
    int f3411n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f3412o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f3413p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<String> f3414q;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f3416s;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f3400c = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    boolean f3407j = true;

    /* renamed from: r  reason: collision with root package name */
    boolean f3415r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f3417a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f3418b;

        /* renamed from: c  reason: collision with root package name */
        int f3419c;

        /* renamed from: d  reason: collision with root package name */
        int f3420d;

        /* renamed from: e  reason: collision with root package name */
        int f3421e;

        /* renamed from: f  reason: collision with root package name */
        int f3422f;

        /* renamed from: g  reason: collision with root package name */
        i.b f3423g;

        /* renamed from: h  reason: collision with root package name */
        i.b f3424h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment) {
            this.f3417a = i10;
            this.f3418b = fragment;
            i.b bVar = i.b.RESUMED;
            this.f3423g = bVar;
            this.f3424h = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(g gVar, ClassLoader classLoader) {
        this.f3398a = gVar;
        this.f3399b = classLoader;
    }

    public q b(int i10, Fragment fragment, String str) {
        k(i10, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.G = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public q d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f3400c.add(aVar);
        aVar.f3419c = this.f3401d;
        aVar.f3420d = this.f3402e;
        aVar.f3421e = this.f3403f;
        aVar.f3422f = this.f3404g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public q j() {
        if (!this.f3406i) {
            this.f3407j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.f3166y;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f3166y + " now " + str);
                }
                fragment.f3166y = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.f3164w;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3164w + " now " + i10);
                    }
                    fragment.f3164w = i10;
                    fragment.f3165x = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            e(new a(i11, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public q l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public q m(int i10, Fragment fragment) {
        return n(i10, fragment, null);
    }

    public q n(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            k(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public q o(boolean z10) {
        this.f3415r = z10;
        return this;
    }
}

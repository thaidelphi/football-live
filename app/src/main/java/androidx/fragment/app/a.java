package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.q;
import java.io.PrintWriter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BackStackRecord.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends q implements FragmentManager.n {

    /* renamed from: t  reason: collision with root package name */
    final FragmentManager f3280t;

    /* renamed from: u  reason: collision with root package name */
    boolean f3281u;

    /* renamed from: v  reason: collision with root package name */
    int f3282v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FragmentManager fragmentManager) {
        super(fragmentManager.q0(), fragmentManager.t0() != null ? fragmentManager.t0().f().getClassLoader() : null);
        this.f3282v = -1;
        this.f3280t = fragmentManager;
    }

    private static boolean z(q.a aVar) {
        Fragment fragment = aVar.f3418b;
        return (fragment == null || !fragment.f3153l || fragment.H == null || fragment.A || fragment.f3167z || !fragment.i0()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        for (int i10 = 0; i10 < this.f3400c.size(); i10++) {
            if (z(this.f3400c.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        if (this.f3416s != null) {
            for (int i10 = 0; i10 < this.f3416s.size(); i10++) {
                this.f3416s.get(i10).run();
            }
            this.f3416s = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(Fragment.h hVar) {
        for (int i10 = 0; i10 < this.f3400c.size(); i10++) {
            q.a aVar = this.f3400c.get(i10);
            if (z(aVar)) {
                aVar.f3418b.K1(hVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment D(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3400c.size() - 1; size >= 0; size--) {
            q.a aVar = this.f3400c.get(size);
            int i10 = aVar.f3417a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3418b;
                            break;
                        case 10:
                            aVar.f3424h = aVar.f3423g;
                            break;
                    }
                }
                arrayList.add(aVar.f3418b);
            }
            arrayList.remove(aVar.f3418b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f3406i) {
            this.f3280t.e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.q
    public int f() {
        return q(false);
    }

    @Override // androidx.fragment.app.q
    public int g() {
        return q(true);
    }

    @Override // androidx.fragment.app.q
    public void h() {
        j();
        this.f3280t.c0(this, false);
    }

    @Override // androidx.fragment.app.q
    public void i() {
        j();
        this.f3280t.c0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.q
    public void k(int i10, Fragment fragment, String str, int i11) {
        super.k(i10, fragment, str, i11);
        fragment.f3160s = this.f3280t;
    }

    @Override // androidx.fragment.app.q
    public q l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f3160s;
        if (fragmentManager != null && fragmentManager != this.f3280t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.l(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i10) {
        q.a aVar;
        if (this.f3406i) {
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3400c.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = this.f3400c.get(i11).f3418b;
                if (fragment != null) {
                    fragment.f3159r += i10;
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3418b + " to " + aVar.f3418b.f3159r);
                    }
                }
            }
        }
    }

    int q(boolean z10) {
        if (!this.f3281u) {
            if (FragmentManager.F0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new v("FragmentManager"));
                r("  ", printWriter);
                printWriter.close();
            }
            this.f3281u = true;
            if (this.f3406i) {
                this.f3282v = this.f3280t.j();
            } else {
                this.f3282v = -1;
            }
            this.f3280t.Z(this, z10);
            return this.f3282v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3408k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3282v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3281u);
            if (this.f3405h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3405h));
            }
            if (this.f3401d != 0 || this.f3402e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3401d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3402e));
            }
            if (this.f3403f != 0 || this.f3404g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3403f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3404g));
            }
            if (this.f3409l != 0 || this.f3410m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3409l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3410m);
            }
            if (this.f3411n != 0 || this.f3412o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3411n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3412o);
            }
        }
        if (this.f3400c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3400c.size();
        for (int i10 = 0; i10 < size; i10++) {
            q.a aVar = this.f3400c.get(i10);
            switch (aVar.f3417a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3417a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3418b);
            if (z10) {
                if (aVar.f3419c != 0 || aVar.f3420d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3419c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3420d));
                }
                if (aVar.f3421e != 0 || aVar.f3422f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3421e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3422f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        int size = this.f3400c.size();
        for (int i10 = 0; i10 < size; i10++) {
            q.a aVar = this.f3400c.get(i10);
            Fragment fragment = aVar.f3418b;
            if (fragment != null) {
                fragment.L1(false);
                fragment.J1(this.f3405h);
                fragment.O1(this.f3413p, this.f3414q);
            }
            switch (aVar.f3417a) {
                case 1:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.j1(fragment, false);
                    this.f3280t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3417a);
                case 3:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.b1(fragment);
                    break;
                case 4:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.C0(fragment);
                    break;
                case 5:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.j1(fragment, false);
                    this.f3280t.n1(fragment);
                    break;
                case 6:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.y(fragment);
                    break;
                case 7:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.j1(fragment, false);
                    this.f3280t.l(fragment);
                    break;
                case 8:
                    this.f3280t.l1(fragment);
                    break;
                case 9:
                    this.f3280t.l1(null);
                    break;
                case 10:
                    this.f3280t.k1(fragment, aVar.f3424h);
                    break;
            }
            if (!this.f3415r && aVar.f3417a != 1 && fragment != null && !FragmentManager.P) {
                this.f3280t.O0(fragment);
            }
        }
        if (this.f3415r || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.f3280t;
        fragmentManager.P0(fragmentManager.f3222q, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3282v >= 0) {
            sb.append(" #");
            sb.append(this.f3282v);
        }
        if (this.f3408k != null) {
            sb.append(" ");
            sb.append(this.f3408k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(boolean z10) {
        for (int size = this.f3400c.size() - 1; size >= 0; size--) {
            q.a aVar = this.f3400c.get(size);
            Fragment fragment = aVar.f3418b;
            if (fragment != null) {
                fragment.L1(true);
                fragment.J1(FragmentManager.g1(this.f3405h));
                fragment.O1(this.f3414q, this.f3413p);
            }
            switch (aVar.f3417a) {
                case 1:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.j1(fragment, true);
                    this.f3280t.b1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3417a);
                case 3:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.g(fragment);
                    break;
                case 4:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.n1(fragment);
                    break;
                case 5:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.j1(fragment, true);
                    this.f3280t.C0(fragment);
                    break;
                case 6:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.l(fragment);
                    break;
                case 7:
                    fragment.C1(aVar.f3419c, aVar.f3420d, aVar.f3421e, aVar.f3422f);
                    this.f3280t.j1(fragment, true);
                    this.f3280t.y(fragment);
                    break;
                case 8:
                    this.f3280t.l1(null);
                    break;
                case 9:
                    this.f3280t.l1(fragment);
                    break;
                case 10:
                    this.f3280t.k1(fragment, aVar.f3423g);
                    break;
            }
            if (!this.f3415r && aVar.f3417a != 3 && fragment != null && !FragmentManager.P) {
                this.f3280t.O0(fragment);
            }
        }
        if (this.f3415r || !z10 || FragmentManager.P) {
            return;
        }
        FragmentManager fragmentManager = this.f3280t;
        fragmentManager.P0(fragmentManager.f3222q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f3400c.size()) {
            q.a aVar = this.f3400c.get(i10);
            int i11 = aVar.f3417a;
            if (i11 != 1) {
                if (i11 == 2) {
                    Fragment fragment3 = aVar.f3418b;
                    int i12 = fragment3.f3165x;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f3165x == i12) {
                            if (fragment4 == fragment3) {
                                z10 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3400c.add(i10, new q.a(9, fragment4));
                                    i10++;
                                    fragment2 = null;
                                }
                                q.a aVar2 = new q.a(3, fragment4);
                                aVar2.f3419c = aVar.f3419c;
                                aVar2.f3421e = aVar.f3421e;
                                aVar2.f3420d = aVar.f3420d;
                                aVar2.f3422f = aVar.f3422f;
                                this.f3400c.add(i10, aVar2);
                                arrayList.remove(fragment4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f3400c.remove(i10);
                        i10--;
                    } else {
                        aVar.f3417a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList.remove(aVar.f3418b);
                    Fragment fragment5 = aVar.f3418b;
                    if (fragment5 == fragment2) {
                        this.f3400c.add(i10, new q.a(9, fragment5));
                        i10++;
                        fragment2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f3400c.add(i10, new q.a(9, fragment2));
                        i10++;
                        fragment2 = aVar.f3418b;
                    }
                }
                i10++;
            }
            arrayList.add(aVar.f3418b);
            i10++;
        }
        return fragment2;
    }

    public String w() {
        return this.f3408k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(int i10) {
        int size = this.f3400c.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = this.f3400c.get(i11).f3418b;
            int i12 = fragment != null ? fragment.f3165x : 0;
            if (i12 != 0 && i12 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(ArrayList<a> arrayList, int i10, int i11) {
        if (i11 == i10) {
            return false;
        }
        int size = this.f3400c.size();
        int i12 = -1;
        for (int i13 = 0; i13 < size; i13++) {
            Fragment fragment = this.f3400c.get(i13).f3418b;
            int i14 = fragment != null ? fragment.f3165x : 0;
            if (i14 != 0 && i14 != i12) {
                for (int i15 = i10; i15 < i11; i15++) {
                    a aVar = arrayList.get(i15);
                    int size2 = aVar.f3400c.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        Fragment fragment2 = aVar.f3400c.get(i16).f3418b;
                        if ((fragment2 != null ? fragment2.f3165x : 0) == i14) {
                            return true;
                        }
                    }
                }
                i12 = i14;
            }
        }
        return false;
    }
}

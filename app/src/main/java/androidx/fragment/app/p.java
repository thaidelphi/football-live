package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStore.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f3395a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, o> f3396b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private l f3397c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f3395a.contains(fragment)) {
            synchronized (this.f3395a) {
                this.f3395a.add(fragment);
            }
            fragment.f3153l = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f3396b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f3396b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i10) {
        for (o oVar : this.f3396b.values()) {
            if (oVar != null) {
                oVar.t(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3396b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o oVar : this.f3396b.values()) {
                printWriter.print(str);
                if (oVar != null) {
                    Fragment k10 = oVar.k();
                    printWriter.println(k10);
                    k10.f(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3395a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f3395a.get(i10).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        o oVar = this.f3396b.get(str);
        if (oVar != null) {
            return oVar.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i10) {
        for (int size = this.f3395a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3395a.get(size);
            if (fragment != null && fragment.f3164w == i10) {
                return fragment;
            }
        }
        for (o oVar : this.f3396b.values()) {
            if (oVar != null) {
                Fragment k10 = oVar.k();
                if (k10.f3164w == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f3395a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3395a.get(size);
                if (fragment != null && str.equals(fragment.f3166y)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (o oVar : this.f3396b.values()) {
                if (oVar != null) {
                    Fragment k10 = oVar.k();
                    if (str.equals(k10.f3166y)) {
                        return k10;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment h10;
        for (o oVar : this.f3396b.values()) {
            if (oVar != null && (h10 = oVar.k().h(str)) != null) {
                return h10;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.G;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3395a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f3395a.get(i10);
            if (fragment2.G == viewGroup && (view2 = fragment2.H) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3395a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3395a.get(indexOf);
            if (fragment3.G == viewGroup && (view = fragment3.H) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<o> k() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : this.f3396b.values()) {
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : this.f3396b.values()) {
            if (oVar != null) {
                arrayList.add(oVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o m(String str) {
        return this.f3396b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f3395a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3395a) {
            arrayList = new ArrayList(this.f3395a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l o() {
        return this.f3397c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(o oVar) {
        Fragment k10 = oVar.k();
        if (c(k10.f3147f)) {
            return;
        }
        this.f3396b.put(k10.f3147f, oVar);
        if (k10.C) {
            if (k10.B) {
                this.f3397c.f(k10);
            } else {
                this.f3397c.n(k10);
            }
            k10.C = false;
        }
        if (FragmentManager.F0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(o oVar) {
        Fragment k10 = oVar.k();
        if (k10.B) {
            this.f3397c.n(k10);
        }
        if (this.f3396b.put(k10.f3147f, null) != null && FragmentManager.F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it = this.f3395a.iterator();
        while (it.hasNext()) {
            o oVar = this.f3396b.get(it.next().f3147f);
            if (oVar != null) {
                oVar.m();
            }
        }
        for (o oVar2 : this.f3396b.values()) {
            if (oVar2 != null) {
                oVar2.m();
                Fragment k10 = oVar2.k();
                if (k10.f3154m && !k10.f0()) {
                    q(oVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.f3395a) {
            this.f3395a.remove(fragment);
        }
        fragment.f3153l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.f3396b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.f3395a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f10 = f(str);
                if (f10 != null) {
                    if (FragmentManager.F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<FragmentState> v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f3396b.size());
        for (o oVar : this.f3396b.values()) {
            if (oVar != null) {
                Fragment k10 = oVar.k();
                FragmentState r10 = oVar.r();
                arrayList.add(r10);
                if (FragmentManager.F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + r10.f3279m);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.f3395a) {
            if (this.f3395a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3395a.size());
            Iterator<Fragment> it = this.f3395a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f3147f);
                if (FragmentManager.F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f3147f + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(l lVar) {
        this.f3397c = lVar;
    }
}

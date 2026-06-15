package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: CheckableGroup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a<T extends h<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, T> f14359a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f14360b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private b f14361c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14362d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14363e;

    /* compiled from: CheckableGroup.java */
    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class C0189a implements h.a<T> {
        C0189a() {
        }

        @Override // com.google.android.material.internal.h.a
        /* renamed from: b */
        public void a(T t10, boolean z10) {
            if (z10) {
                if (!a.this.g(t10)) {
                    return;
                }
            } else {
                a aVar = a.this;
                if (!aVar.r(t10, aVar.f14363e)) {
                    return;
                }
            }
            a.this.m();
        }
    }

    /* compiled from: CheckableGroup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b {
        void a(Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h<T> hVar) {
        int id = hVar.getId();
        if (this.f14360b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t10 = this.f14359a.get(Integer.valueOf(k()));
        if (t10 != null) {
            r(t10, false);
        }
        boolean add = this.f14360b.add(Integer.valueOf(id));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f14361c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(h<T> hVar, boolean z10) {
        int id = hVar.getId();
        if (this.f14360b.contains(Integer.valueOf(id))) {
            if (z10 && this.f14360b.size() == 1 && this.f14360b.contains(Integer.valueOf(id))) {
                hVar.setChecked(true);
                return false;
            }
            boolean remove = this.f14360b.remove(Integer.valueOf(id));
            if (hVar.isChecked()) {
                hVar.setChecked(false);
            }
            return remove;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t10) {
        this.f14359a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            g(t10);
        }
        t10.setInternalOnCheckedChangeListener(new C0189a());
    }

    public void f(int i10) {
        T t10 = this.f14359a.get(Integer.valueOf(i10));
        if (t10 != null && g(t10)) {
            m();
        }
    }

    public void h() {
        boolean z10 = !this.f14360b.isEmpty();
        for (T t10 : this.f14359a.values()) {
            r(t10, false);
        }
        if (z10) {
            m();
        }
    }

    public Set<Integer> i() {
        return new HashSet(this.f14360b);
    }

    public List<Integer> j(ViewGroup viewGroup) {
        Set<Integer> i10 = i();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof h) && i10.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f14362d || this.f14360b.isEmpty()) {
            return -1;
        }
        return this.f14360b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f14362d;
    }

    public void n(T t10) {
        t10.setInternalOnCheckedChangeListener(null);
        this.f14359a.remove(Integer.valueOf(t10.getId()));
        this.f14360b.remove(Integer.valueOf(t10.getId()));
    }

    public void o(b bVar) {
        this.f14361c = bVar;
    }

    public void p(boolean z10) {
        this.f14363e = z10;
    }

    public void q(boolean z10) {
        if (this.f14362d != z10) {
            this.f14362d = z10;
            h();
        }
    }
}

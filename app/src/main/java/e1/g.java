package e1;

import android.text.TextUtils;
import androidx.work.b0;
import androidx.work.p;
import androidx.work.r;
import androidx.work.s;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: WorkContinuationImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g extends y {

    /* renamed from: j  reason: collision with root package name */
    private static final String f24856j = p.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final i f24857a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24858b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.work.h f24859c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends b0> f24860d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f24861e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f24862f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f24863g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f24864h;

    /* renamed from: i  reason: collision with root package name */
    private s f24865i;

    public g(i iVar, List<? extends b0> list) {
        this(iVar, null, androidx.work.h.KEEP, list, null);
    }

    private static boolean k(g gVar, Set<String> set) {
        set.addAll(gVar.e());
        Set<String> n10 = n(gVar);
        for (String str : set) {
            if (n10.contains(str)) {
                return true;
            }
        }
        List<g> g10 = gVar.g();
        if (g10 != null && !g10.isEmpty()) {
            for (g gVar2 : g10) {
                if (k(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.e());
        return false;
    }

    public static Set<String> n(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> g10 = gVar.g();
        if (g10 != null && !g10.isEmpty()) {
            for (g gVar2 : g10) {
                hashSet.addAll(gVar2.e());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.y
    public s a() {
        if (!this.f24864h) {
            m1.b bVar = new m1.b(this);
            this.f24857a.x().b(bVar);
            this.f24865i = bVar.e();
        } else {
            p.c().h(f24856j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f24861e)), new Throwable[0]);
        }
        return this.f24865i;
    }

    @Override // androidx.work.y
    public y c(List<r> list) {
        return list.isEmpty() ? this : new g(this.f24857a, this.f24858b, androidx.work.h.KEEP, list, Collections.singletonList(this));
    }

    public androidx.work.h d() {
        return this.f24859c;
    }

    public List<String> e() {
        return this.f24861e;
    }

    public String f() {
        return this.f24858b;
    }

    public List<g> g() {
        return this.f24863g;
    }

    public List<? extends b0> h() {
        return this.f24860d;
    }

    public i i() {
        return this.f24857a;
    }

    public boolean j() {
        return k(this, new HashSet());
    }

    public boolean l() {
        return this.f24864h;
    }

    public void m() {
        this.f24864h = true;
    }

    public g(i iVar, String str, androidx.work.h hVar, List<? extends b0> list) {
        this(iVar, str, hVar, list, null);
    }

    public g(i iVar, String str, androidx.work.h hVar, List<? extends b0> list, List<g> list2) {
        this.f24857a = iVar;
        this.f24858b = str;
        this.f24859c = hVar;
        this.f24860d = list;
        this.f24863g = list2;
        this.f24861e = new ArrayList(list.size());
        this.f24862f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f24862f.addAll(gVar.f24862f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = list.get(i10).a();
            this.f24861e.add(a10);
            this.f24862f.add(a10);
        }
    }
}

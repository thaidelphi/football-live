package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h3 implements ft<JSONArray> {

    /* renamed from: a  reason: collision with root package name */
    private final List<g3> f17638a = new ArrayList();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17639a;

        static {
            int[] iArr = new int[et.values().length];
            try {
                iArr[et.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[et.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17639a = iArr;
        }
    }

    private final List<g3> a() {
        int k10;
        Set Q;
        List<g3> list = this.f17638a;
        ArrayList<g3> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            g3 g3Var = (g3) next;
            if ((g3Var.e() == ct.LoadSuccess || g3Var.e() == ct.LoadRequest) ? false : false) {
                arrayList.add(next);
            }
        }
        k10 = j8.r.k(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(k10);
        for (g3 g3Var2 : arrayList) {
            arrayList2.add(g3Var2.a());
        }
        Q = j8.y.Q(arrayList2);
        List<g3> list2 = this.f17638a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            g3 g3Var3 = (g3) obj;
            if (g3Var3.e() == ct.LoadSuccess && !Q.contains(g3Var3.a())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    private final List<g3> b() {
        List<g3> list = this.f17638a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((g3) obj).e() != ct.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(g3 event) {
        kotlin.jvm.internal.n.f(event, "event");
        this.f17638a.add(event);
    }

    @Override // com.ironsource.we
    /* renamed from: b */
    public JSONArray a(et mode) {
        int k10;
        int k11;
        kotlin.jvm.internal.n.f(mode, "mode");
        int i10 = a.f17639a[mode.ordinal()];
        if (i10 == 1) {
            List<g3> b10 = b();
            k10 = j8.r.k(b10, 10);
            ArrayList arrayList = new ArrayList(k10);
            for (g3 g3Var : b10) {
                arrayList.add(g3Var.d());
            }
            return new JSONArray((Collection) arrayList);
        } else if (i10 == 2) {
            List<g3> a10 = a();
            k11 = j8.r.k(a10, 10);
            ArrayList arrayList2 = new ArrayList(k11);
            for (g3 g3Var2 : a10) {
                arrayList2.add(g3Var2.c());
            }
            return new JSONArray((Collection) arrayList2);
        } else {
            throw new i8.l();
        }
    }
}

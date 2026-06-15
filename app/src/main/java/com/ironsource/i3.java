package com.ironsource;

import com.ironsource.q9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class i3 implements q3 {

    /* renamed from: a  reason: collision with root package name */
    private final l3 f17768a;

    /* renamed from: b  reason: collision with root package name */
    private final rf f17769b;

    /* renamed from: c  reason: collision with root package name */
    private final lm<Integer, Integer> f17770c;

    /* renamed from: d  reason: collision with root package name */
    private final q9 f17771d;

    /* renamed from: e  reason: collision with root package name */
    private List<n3> f17772e;

    public i3(l3 eventBaseData, rf eventsManager, lm<Integer, Integer> eventsMapper, q9 currentTimeProvider) {
        kotlin.jvm.internal.n.f(eventBaseData, "eventBaseData");
        kotlin.jvm.internal.n.f(eventsManager, "eventsManager");
        kotlin.jvm.internal.n.f(eventsMapper, "eventsMapper");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f17768a = eventBaseData;
        this.f17769b = eventsManager;
        this.f17770c = eventsMapper;
        this.f17771d = currentTimeProvider;
        this.f17772e = new ArrayList();
    }

    public /* synthetic */ i3(l3 l3Var, rf rfVar, lm lmVar, q9 q9Var, int i10, kotlin.jvm.internal.h hVar) {
        this(l3Var, rfVar, lmVar, (i10 & 8) != 0 ? new q9.a() : q9Var);
    }

    private final JSONObject b(List<? extends n3> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (n3 n3Var : list) {
            n3Var.a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.q3
    public void a() {
        this.f17772e.clear();
    }

    @Override // com.ironsource.q3
    public void a(int i10, List<n3> arrayList) {
        kotlin.jvm.internal.n.f(arrayList, "arrayList");
        try {
            for (n3 n3Var : this.f17768a.a()) {
                arrayList.add(n3Var);
            }
            for (n3 n3Var2 : this.f17772e) {
                arrayList.add(n3Var2);
            }
            this.f17769b.a(new zb(this.f17770c.a(Integer.valueOf(i10)).intValue(), this.f17771d.a(), b(arrayList)));
        } catch (Exception e8) {
            o9.d().a(e8);
            System.out.println((Object) ("LogRemote | Exception: " + e8.getMessage()));
        }
    }

    public final void a(List<n3> list) {
        kotlin.jvm.internal.n.f(list, "<set-?>");
        this.f17772e = list;
    }

    @Override // com.ironsource.q3
    public void a(n3... analyticsEventEntity) {
        kotlin.jvm.internal.n.f(analyticsEventEntity, "analyticsEventEntity");
        for (n3 n3Var : analyticsEventEntity) {
            this.f17772e.add(n3Var);
        }
    }

    public final List<n3> b() {
        return this.f17772e;
    }
}

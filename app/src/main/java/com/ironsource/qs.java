package com.ironsource;

import com.ironsource.zh;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qs implements zh, zh.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Integer> f19900a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Integer> f19901b = new HashMap();

    @Override // com.ironsource.zh.a
    public void a(zh.b smash) {
        kotlin.jvm.internal.n.f(smash, "smash");
        synchronized (this) {
            String c10 = smash.c();
            if (this.f19900a.containsKey(c10)) {
                Map<String, Integer> map = this.f19900a;
                Integer num = map.get(c10);
                kotlin.jvm.internal.n.c(num);
                map.put(c10, Integer.valueOf(num.intValue() + 1));
            }
            i8.w wVar = i8.w.f26638a;
        }
    }

    @Override // com.ironsource.zh.a
    public void a(List<? extends zh.b> smashes) {
        kotlin.jvm.internal.n.f(smashes, "smashes");
        for (zh.b bVar : smashes) {
            this.f19900a.put(bVar.c(), 0);
            this.f19901b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.ironsource.zh
    public boolean a() {
        for (String str : this.f19901b.keySet()) {
            Integer num = this.f19900a.get(str);
            kotlin.jvm.internal.n.c(num);
            int intValue = num.intValue();
            Integer num2 = this.f19901b.get(str);
            kotlin.jvm.internal.n.c(num2);
            if (intValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ironsource.zh
    public boolean b(zh.b smash) {
        boolean z10;
        kotlin.jvm.internal.n.f(smash, "smash");
        synchronized (this) {
            String c10 = smash.c();
            if (this.f19900a.containsKey(c10)) {
                Integer num = this.f19900a.get(c10);
                kotlin.jvm.internal.n.c(num);
                z10 = num.intValue() >= smash.b();
            }
        }
        return z10;
    }
}

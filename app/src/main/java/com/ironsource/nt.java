package com.ironsource;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class nt extends ha {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(w1 adUnitData, zv waterfallInstances) {
        super(adUnitData, waterfallInstances);
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
    }

    private final int a(zv zvVar) {
        Integer num;
        List<a0> b10 = zvVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b10) {
            if (((a0) obj).v()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(b((a0) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(b((a0) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        return num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private final int b(a0 a0Var) {
        return a0Var.h().l();
    }

    @Override // com.ironsource.g0
    protected boolean a(a0 instance, zv waterfallInstances) {
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }
}

package com.iab.omid.library.adcolony.c;

import android.view.View;
import com.iab.omid.library.adcolony.c.a;
import com.iab.omid.library.adcolony.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f15616a;

    public c(a aVar) {
        this.f15616a = aVar;
    }

    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.adcolony.b.a a10 = com.iab.omid.library.adcolony.b.a.a();
        if (a10 != null) {
            Collection<com.iab.omid.library.adcolony.adsession.a> c10 = a10.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c10.size() * 2) + 3);
            for (com.iab.omid.library.adcolony.adsession.a aVar : c10) {
                View e8 = aVar.e();
                if (e8 != null && f.c(e8) && (rootView = e8.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a11 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a11) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.adcolony.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.adcolony.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.adcolony.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0199a interfaceC0199a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0199a.a(it.next(), this.f15616a, jSONObject, z11);
        }
    }
}

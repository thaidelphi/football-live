package com.iab.omid.library.startio.processor;

import android.view.View;
import com.iab.omid.library.startio.processor.a;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f16003a;

    public c(a aVar) {
        this.f16003a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.startio.internal.c c10 = com.iab.omid.library.startio.internal.c.c();
        if (c10 != null) {
            Collection<com.iab.omid.library.startio.adsession.a> a10 = c10.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a10.size() * 2) + 3);
            for (com.iab.omid.library.startio.adsession.a aVar : a10) {
                View c11 = aVar.c();
                if (c11 != null && h.e(c11) && (rootView = c11.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c12 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c12) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.startio.processor.a
    public JSONObject a(View view) {
        JSONObject a10 = com.iab.omid.library.startio.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.startio.utils.c.a(a10, e.a());
        return a10;
    }

    @Override // com.iab.omid.library.startio.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0210a interfaceC0210a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0210a.a(it.next(), this.f16003a, jSONObject, z11);
        }
    }
}

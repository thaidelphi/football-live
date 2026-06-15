package com.appnext.core.ra.services.a;

import android.content.Context;
import android.os.Bundle;
import com.appnext.core.ra.services.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a {
    private Context aO;

    public a(Context context) {
        this.aO = context;
    }

    private static Bundle a(a.EnumC0158a enumC0158a) {
        Bundle bundle = new Bundle();
        bundle.putInt("action", enumC0158a.ordinal());
        return bundle;
    }

    protected abstract boolean A(String str);

    protected abstract void B(String str);

    protected abstract void a(com.appnext.core.ra.b.a aVar);

    public final void aB() {
        B(a.EnumC0158a.SendRA.name());
    }

    public final void b(long j10) {
        a.EnumC0158a enumC0158a = a.EnumC0158a.SendRA;
        a(new com.appnext.core.ra.b.a(enumC0158a, enumC0158a.hashCode(), a(enumC0158a), j10, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, true));
    }

    public final void c(long j10) {
        try {
            a.EnumC0158a enumC0158a = a.EnumC0158a.DownloadingConfig;
            a(new com.appnext.core.ra.b.a(enumC0158a, enumC0158a.hashCode(), a(enumC0158a), j10, j10, true));
        } catch (Throwable th) {
            com.appnext.base.a.a("RecentAppsServiceLogic$scheduleDownloadingConfig", th);
        }
    }

    protected abstract void c(List<com.appnext.core.ra.b.a> list);

    public final void e(ArrayList<String> arrayList) {
        try {
            a.EnumC0158a enumC0158a = a.EnumC0158a.StoreRa;
            Bundle a10 = a(enumC0158a);
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                a10.putString("more_data", jSONArray.toString());
            }
            com.appnext.core.ra.b.a aVar = new com.appnext.core.ra.b.a(enumC0158a, enumC0158a.hashCode() + ((int) (System.currentTimeMillis() % 7)), a10, 0L, 0L, false);
            a.EnumC0158a enumC0158a2 = a.EnumC0158a.DownloadingConfig;
            if (A(enumC0158a2.name())) {
                a(aVar);
                return;
            }
            com.appnext.core.ra.b.a aVar2 = new com.appnext.core.ra.b.a(enumC0158a2, enumC0158a2.hashCode(), a(enumC0158a2), 0L, 0L, false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(aVar2);
            arrayList2.add(aVar);
            c(arrayList2);
        } catch (Throwable th) {
            com.appnext.base.a.a("RecentAppsServiceLogic$storeRA", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getContext() {
        return this.aO;
    }
}

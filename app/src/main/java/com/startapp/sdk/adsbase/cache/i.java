package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f23061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.b f23062b;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f23063a;

        public a(ArrayList arrayList) {
            this.f23063a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DiskAdCacheManager.b bVar = i.this.f23062b;
            List<DiskAdCacheManager.DiskCacheKey> list = this.f23063a;
            com.startapp.sdk.adsbase.cache.a aVar = (com.startapp.sdk.adsbase.cache.a) bVar;
            aVar.getClass();
            if (list != null) {
                try {
                    for (DiskAdCacheManager.DiskCacheKey diskCacheKey : list) {
                        d dVar = aVar.f23017b;
                        AdPreferences.Placement placement = diskCacheKey.placement;
                        dVar.getClass();
                        if (d.a(placement)) {
                            aVar.f23017b.a(aVar.f23016a, null, diskCacheKey.placement, diskCacheKey.adPreferences, true, false, diskCacheKey.a(), null);
                        }
                    }
                } catch (Throwable th) {
                    l3.a(th);
                }
            }
            d dVar2 = aVar.f23017b;
            Context context = aVar.f23016a;
            dVar2.f23024d = false;
            Iterator it = dVar2.f23025e.iterator();
            while (it.hasNext()) {
                d.b bVar2 = (d.b) it.next();
                if (d.a(bVar2.f23031b)) {
                    dVar2.a(context, bVar2.f23030a, bVar2.f23031b, bVar2.f23032c, false, false, 0, bVar2.f23033d);
                }
            }
            dVar2.f23025e.clear();
        }
    }

    public i(Context context, com.startapp.sdk.adsbase.cache.a aVar) {
        this.f23061a = context;
        this.f23062b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new a(g2.d(this.f23061a, "startapp_ads".concat(File.separator).concat("keys"))));
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}

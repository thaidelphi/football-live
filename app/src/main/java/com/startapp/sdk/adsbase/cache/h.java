package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import java.io.File;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f23058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.c f23059b;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((b) h.this.f23059b).f23018a.f23023c = false;
        }
    }

    public h(Context context, b bVar) {
        this.f23058a = context;
        this.f23059b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f23058a;
            g2.a(new File(g2.b(context, "startapp_ads")));
            g2.a(new File(g2.a(context, "startapp_ads")));
            new Handler(Looper.getMainLooper()).post(new a());
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}

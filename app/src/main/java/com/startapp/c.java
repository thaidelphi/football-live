package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.cache.d f21805b;

    public c(com.startapp.sdk.adsbase.cache.d dVar, Context context) {
        this.f21805b = dVar;
        this.f21804a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f21804a;
            String str = File.separator;
            String concat = "startapp_ads".concat(str).concat("keys");
            if (concat != null) {
                g2.a(new File(g2.b(context, concat)));
                g2.a(new File(g2.a(context, concat)));
            }
            Context context2 = this.f21804a;
            String concat2 = "startapp_ads".concat(str).concat("interstitials");
            if (concat2 != null) {
                g2.a(new File(g2.b(context2, concat2)));
                g2.a(new File(g2.a(context2, concat2)));
            }
            for (Map.Entry entry : this.f21805b.f23021a.entrySet()) {
                CacheKey cacheKey = (CacheKey) entry.getKey();
                com.startapp.sdk.adsbase.cache.g gVar = (com.startapp.sdk.adsbase.cache.g) entry.getValue();
                Context context3 = this.f21804a;
                AdPreferences.Placement a10 = cacheKey.a();
                AdPreferences adPreferences = gVar.f23042d;
                this.f21805b.getClass();
                String replace = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                int i10 = gVar.f23051m;
                DiskAdCacheManager.DiskCacheKey diskCacheKey = new DiskAdCacheManager.DiskCacheKey(a10, adPreferences);
                diskCacheKey.a(i10);
                String concat3 = "startapp_ads".concat(File.separator).concat("keys");
                if (replace != null) {
                    File file = new File(g2.a(context3, concat3));
                    if (file.exists() || file.mkdirs()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, replace));
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        objectOutputStream.writeObject(diskCacheKey);
                        objectOutputStream.close();
                        fileOutputStream.close();
                    }
                }
                Context context4 = this.f21804a;
                this.f21805b.getClass();
                String replace2 = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                DiskAdCacheManager.DiskCachedAd diskCachedAd = new DiskAdCacheManager.DiskCachedAd(gVar.f23043e);
                String concat4 = "startapp_ads".concat(File.separator).concat("interstitials");
                if (replace2 != null) {
                    File file2 = new File(g2.a(context4, concat4));
                    if (file2.exists() || file2.mkdirs()) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file2, replace2));
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
                        objectOutputStream2.writeObject(diskCachedAd);
                        objectOutputStream2.close();
                        fileOutputStream2.close();
                    }
                }
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}

package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f23065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23066b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AdEventListener f23067c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.a f23068d;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DiskAdCacheManager.DiskCachedAd f23069a;

        public a(DiskAdCacheManager.DiskCachedAd diskCachedAd) {
            this.f23069a = diskCachedAd;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                DiskAdCacheManager.DiskCachedAd diskCachedAd = this.f23069a;
                if (diskCachedAd == null) {
                    j jVar = j.this;
                    DiskAdCacheManager.a(jVar.f23065a, jVar.f23067c);
                } else {
                    if (diskCachedAd.a() != null && this.f23069a.a().isReady()) {
                        if (this.f23069a.a().c()) {
                            j jVar2 = j.this;
                            DiskAdCacheManager.a(jVar2.f23065a, jVar2.f23067c);
                        } else {
                            j jVar3 = j.this;
                            DiskAdCacheManager.a(jVar3.f23065a, this.f23069a, jVar3.f23068d, jVar3.f23067c);
                        }
                    }
                    j jVar4 = j.this;
                    DiskAdCacheManager.a(jVar4.f23065a, jVar4.f23067c);
                }
            } catch (Throwable th) {
                l3.a(th);
                j jVar5 = j.this;
                DiskAdCacheManager.a(jVar5.f23065a, jVar5.f23067c);
            }
        }
    }

    public j(Context context, e eVar, f fVar, String str) {
        this.f23065a = context;
        this.f23066b = str;
        this.f23067c = eVar;
        this.f23068d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f23065a;
            String concat = "startapp_ads".concat(File.separator).concat("interstitials");
            String str = this.f23066b;
            DiskAdCacheManager.DiskCachedAd diskCachedAd = null;
            if (str != null) {
                File file = new File(g2.a(context, concat));
                if (file.exists() && file.isDirectory()) {
                    File file2 = new File(file, str);
                    if (file2.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        fileInputStream.close();
                        diskCachedAd = readObject;
                    }
                }
            }
            new Handler(Looper.getMainLooper()).post(new a(diskCachedAd));
        } catch (Throwable th) {
            l3.a(th);
            DiskAdCacheManager.a(this.f23065a, this.f23067c);
        }
    }
}

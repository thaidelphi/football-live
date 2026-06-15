package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.cache.g;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Iterator;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j1 {

    /* renamed from: a  reason: collision with root package name */
    public final com.startapp.sdk.adsbase.cache.g f22119a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f22120b = null;

    /* renamed from: c  reason: collision with root package name */
    public Long f22121c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22122d = false;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j1.this.c();
        }
    }

    public j1(com.startapp.sdk.adsbase.cache.g gVar) {
        this.f22119a = gVar;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        d();
        com.startapp.sdk.adsbase.cache.g gVar = this.f22119a;
        if (gVar.f23051m < MetaData.f23158k.O()) {
            gVar.f23051m++;
            gVar.a(null, null, true, false, false);
            return;
        }
        g.b bVar = gVar.f23054p;
        if (bVar != null) {
            com.startapp.sdk.adsbase.cache.c cVar = (com.startapp.sdk.adsbase.cache.c) bVar;
            synchronized (cVar.f23019a.f23021a) {
                Iterator it = cVar.f23019a.f23021a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() == gVar) {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    public final void d() {
        this.f22121c = null;
        this.f22122d = false;
    }

    public final void e() {
        if (this.f22122d) {
            return;
        }
        if (this.f22121c == null) {
            this.f22121c = Long.valueOf(System.currentTimeMillis());
        }
        if (a()) {
            if (this.f22120b == null) {
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = Looper.getMainLooper();
                }
                this.f22120b = new Handler(myLooper);
            }
            long b10 = b();
            if (b10 >= 0) {
                this.f22122d = true;
                this.f22120b.postDelayed(new a(), b10);
            }
        }
    }

    public final void f() {
        Handler handler = this.f22120b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}

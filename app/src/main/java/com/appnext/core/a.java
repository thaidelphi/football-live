package com.appnext.core;

import android.os.Handler;
import android.os.Looper;
import com.appnext.core.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    private String placementID;

    /* renamed from: m  reason: collision with root package name */
    private int f10054m = 0;
    private Long bW = 0L;
    private ArrayList<?> ads = null;
    private String bY = "";
    private ArrayList<d.a> bX = new ArrayList<>();

    public final Long O() {
        return this.bW;
    }

    public final int P() {
        return this.f10054m;
    }

    public final void a(d.a aVar) {
        try {
            synchronized (this.bX) {
                ListIterator<d.a> listIterator = this.bX.listIterator();
                if (aVar != null && listIterator != null) {
                    listIterator.add(aVar);
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("AdContainer$addListener", th);
        }
    }

    public final void b(int i10) {
        this.f10054m = i10;
    }

    public final void c(ArrayList<?> arrayList) {
        a(arrayList, true);
    }

    public final ArrayList<?> getAds() {
        try {
            if (this.ads == null) {
                return null;
            }
            ArrayList<?> arrayList = new ArrayList<>();
            Iterator<?> it = this.ads.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList<>();
        }
    }

    public final String getPlacementID() {
        return this.placementID;
    }

    public final void k(String str) {
        this.bY = str;
    }

    public final synchronized void l(final String str) {
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.core.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        synchronized (a.this.bX) {
                            ListIterator listIterator = a.this.bX.listIterator();
                            while (listIterator.hasNext()) {
                                ((d.a) listIterator.next()).error(str);
                                listIterator.remove();
                            }
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("AdContainer$notifyListenersError", th);
                    }
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("AdContainer$notifyListenersError", th);
        }
    }

    public final void setPlacementID(String str) {
        this.placementID = str;
    }

    public final String w() {
        return this.bY;
    }

    public final void a(ArrayList<?> arrayList, boolean z10) {
        this.ads = arrayList;
        if (z10) {
            this.bW = Long.valueOf(System.currentTimeMillis());
        }
    }
}

package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21744a;

    /* renamed from: b  reason: collision with root package name */
    public final List<AppPresenceDetails> f21745b;

    /* renamed from: c  reason: collision with root package name */
    public final a f21746c = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a0 a0Var = a0.this;
            a0Var.getClass();
            try {
                k3.a(a0Var.f21744a, (List<String>) a0.a(a0Var.f21745b), new TrackingParams().a("APP_PRESENCE"));
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    public a0(Context context, ArrayList arrayList) {
        this.f21745b = arrayList;
        this.f21744a = context;
    }

    public static ArrayList a(List list) {
        String c10;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AppPresenceDetails appPresenceDetails = (AppPresenceDetails) it.next();
            if (!appPresenceDetails.e() && (c10 = appPresenceDetails.c()) != null) {
                try {
                    str = Uri.parse(c10).getQueryParameter("d");
                } catch (Throwable th) {
                    l3.a(th);
                    str = null;
                }
                if (str != null) {
                    if (appPresenceDetails.d()) {
                        arrayList2.add("d=".concat(str));
                    } else {
                        arrayList3.add("d=".concat(str));
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(com.startapp.sdk.adsbase.a.a(com.ironsource.mediationsdk.metadata.a.f18924g, arrayList2));
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(com.startapp.sdk.adsbase.a.a("false", arrayList3));
        }
        return arrayList;
    }
}

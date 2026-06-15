package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class kc {

    /* renamed from: e  reason: collision with root package name */
    private static final String f18048e = "EventsTracker";

    /* renamed from: a  reason: collision with root package name */
    private cf f18049a;

    /* renamed from: b  reason: collision with root package name */
    private ec f18050b;

    /* renamed from: c  reason: collision with root package name */
    private vf f18051c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f18052d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18053a;

        a(String str) {
            this.f18053a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                fq fqVar = new fq();
                ArrayList<Pair<String, String>> d10 = kc.this.f18050b.d();
                if (in.f17849b.equals(kc.this.f18050b.e())) {
                    fqVar = rg.b(kc.this.f18050b.b(), this.f18053a, d10);
                } else if (in.f17848a.equals(kc.this.f18050b.e())) {
                    fqVar = rg.a(kc.this.f18050b.b(), this.f18053a, d10);
                }
                kc kcVar = kc.this;
                kcVar.a("response status code: " + fqVar.f17495a);
            } catch (Exception e8) {
                o9.d().a(e8);
            }
        }
    }

    public kc(ec ecVar, cf cfVar) {
        if (ecVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (ecVar.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f18050b = ecVar;
        this.f18049a = cfVar;
        this.f18051c = ecVar.c();
        this.f18052d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f18050b.f()) {
            Log.d(f18048e, str);
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    private void b(String str) {
        this.f18052d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f18050b.a() && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            a(hashMap, this.f18049a.a());
            a(hashMap, map);
            b(this.f18051c.a(hashMap));
        }
    }
}

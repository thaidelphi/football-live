package com.applovin.impl.sdk;

import android.content.Intent;
import com.applovin.impl.d7;
import com.applovin.impl.k6;
import com.applovin.impl.l1;
import com.applovin.impl.l4;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u5;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.b9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", b9.h.f16647e0, "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a  reason: collision with root package name */
    private final j f8695a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f8696b = new AtomicBoolean();

    public EventServiceImpl(j jVar) {
        this.f8695a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(l1 l1Var, Map map, boolean z10) {
        Map a10 = a(l1Var, false);
        HashMap hashMap = new HashMap(l1Var.d());
        if (((Boolean) this.f8695a.a(o4.f8152k5)).booleanValue() || ((Boolean) this.f8695a.a(o4.f8112f5)).booleanValue()) {
            hashMap.putAll(a10);
            a10 = null;
        }
        this.f8695a.W().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a10).c(hashMap).a(a(l1Var, map)).c(((Boolean) this.f8695a.a(o4.f8232u5)).booleanValue()).a(((Boolean) this.f8695a.a(o4.S4)).booleanValue()).d(z10).a(l4.a.a(((Integer) this.f8695a.a(o4.f8088c5)).intValue())).a());
    }

    private String b() {
        return ((String) this.f8695a.a(o4.f8251x0)) + "4.0/pix";
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f8696b.compareAndSet(false, true)) {
            this.f8695a.z().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.f8695a.I();
        if (n.a()) {
            this.f8695a.I().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        l1 l1Var = new l1(str, new HashMap());
        Map a10 = a(l1Var, true);
        HashMap hashMap = new HashMap(l1Var.d());
        if (((Boolean) this.f8695a.a(o4.f8152k5)).booleanValue() || ((Boolean) this.f8695a.a(o4.f8112f5)).booleanValue()) {
            hashMap.putAll(a10);
            a10 = null;
        }
        this.f8695a.W().e(com.applovin.impl.sdk.network.d.b().d(b()).a(a()).b(a10).c(hashMap).a(a(l1Var, (Map) null)).c(((Boolean) this.f8695a.a(o4.f8232u5)).booleanValue()).a(((Boolean) this.f8695a.a(o4.S4)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            n.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f8695a.D().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        this.f8695a.I();
        if (n.a()) {
            n I = this.f8695a.I();
            I.a("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final l1 l1Var = new l1(str, map);
        final boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f8695a.i0().a((z4) new k6(this.f8695a, contains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.y
                @Override // java.lang.Runnable
                public final void run() {
                    EventServiceImpl.this.a(l1Var, map2, contains);
                }
            }), u5.b.OTHER);
        } catch (Throwable th) {
            this.f8695a.I();
            if (n.a()) {
                n I2 = this.f8695a.I();
                I2.a("AppLovinEventService", "Unable to track event: " + l1Var, th);
            }
            this.f8695a.D().a("AppLovinEventService", "trackEvent", th);
        }
    }

    private String a() {
        return ((String) this.f8695a.a(o4.f8259y0)) + "4.0/pix";
    }

    private Map a(l1 l1Var, boolean z10) {
        boolean contains = this.f8695a.c(o4.C0).contains(l1Var.c());
        Map a10 = this.f8695a.x().a(null, z10, false);
        a10.put("event", contains ? l1Var.c() : "postinstall");
        a10.put("event_id", l1Var.b());
        a10.put("ts", Long.toString(l1Var.a()));
        if (!contains) {
            a10.put("sub_event", l1Var.c());
        }
        return d7.a(a10);
    }

    private Map a(l1 l1Var, Map map) {
        Map map2 = CollectionUtils.map(map);
        boolean contains = this.f8695a.c(o4.C0).contains(l1Var.c());
        map2.put("AppLovin-Event", contains ? l1Var.c() : "postinstall");
        if (!contains) {
            map2.put("AppLovin-Sub-Event", l1Var.c());
        }
        return map2;
    }
}

package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ho {

    /* renamed from: d  reason: collision with root package name */
    public static final String f17692d = "Ironsrc";

    /* renamed from: e  reason: collision with root package name */
    public static final String f17693e = "7";

    /* renamed from: f  reason: collision with root package name */
    public static final String f17694f = Omid.getVersion();

    /* renamed from: g  reason: collision with root package name */
    public static final String f17695g = "omidVersion";

    /* renamed from: h  reason: collision with root package name */
    public static final String f17696h = "omidPartnerName";

    /* renamed from: i  reason: collision with root package name */
    public static final String f17697i = "omidPartnerVersion";

    /* renamed from: j  reason: collision with root package name */
    public static final String f17698j = "omidActiveAdSessions";

    /* renamed from: k  reason: collision with root package name */
    private static final String f17699k = "Invalid OMID impressionOwner";

    /* renamed from: l  reason: collision with root package name */
    private static final String f17700l = "Invalid OMID videoEventsOwner";

    /* renamed from: m  reason: collision with root package name */
    private static final String f17701m = "Missing OMID impressionOwner";

    /* renamed from: n  reason: collision with root package name */
    private static final String f17702n = "Missing OMID videoEventsOwner";

    /* renamed from: o  reason: collision with root package name */
    private static final String f17703o = "OMID has not been activated";

    /* renamed from: p  reason: collision with root package name */
    private static final String f17704p = "Missing OMID creativeType";

    /* renamed from: q  reason: collision with root package name */
    private static final String f17705q = "Missing adview id in OMID params";

    /* renamed from: r  reason: collision with root package name */
    private static final String f17706r = "No adview found with the provided adViewId";

    /* renamed from: s  reason: collision with root package name */
    private static final String f17707s = "OMID Session has already started";

    /* renamed from: t  reason: collision with root package name */
    private static final String f17708t = "OMID Session has not started";

    /* renamed from: a  reason: collision with root package name */
    private final Partner f17709a = Partner.createPartner(f17692d, f17693e);

    /* renamed from: c  reason: collision with root package name */
    private boolean f17711c = false;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, AdSession> f17710b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: i  reason: collision with root package name */
        private static final String f17712i = "isolateVerificationScripts";

        /* renamed from: j  reason: collision with root package name */
        private static final String f17713j = "impressionOwner";

        /* renamed from: k  reason: collision with root package name */
        private static final String f17714k = "videoEventsOwner";

        /* renamed from: l  reason: collision with root package name */
        private static final String f17715l = "customReferenceData";

        /* renamed from: m  reason: collision with root package name */
        private static final String f17716m = "creativeType";

        /* renamed from: n  reason: collision with root package name */
        private static final String f17717n = "impressionType";

        /* renamed from: o  reason: collision with root package name */
        public static final String f17718o = "adViewId";

        /* renamed from: a  reason: collision with root package name */
        public boolean f17719a;

        /* renamed from: b  reason: collision with root package name */
        public Owner f17720b;

        /* renamed from: c  reason: collision with root package name */
        public Owner f17721c;

        /* renamed from: d  reason: collision with root package name */
        public String f17722d;

        /* renamed from: e  reason: collision with root package name */
        public ImpressionType f17723e;

        /* renamed from: f  reason: collision with root package name */
        public CreativeType f17724f;

        /* renamed from: g  reason: collision with root package name */
        public String f17725g;

        /* renamed from: h  reason: collision with root package name */
        public Owner f17726h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f17719a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(ho.f17701m);
            }
            try {
                aVar.f17720b = Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
                String optString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(optString)) {
                    throw new IllegalArgumentException(ho.f17702n);
                }
                try {
                    aVar.f17721c = Owner.valueOf(optString2.toUpperCase(Locale.getDefault()));
                    aVar.f17722d = jSONObject.optString("customReferenceData", "");
                    aVar.f17724f = b(jSONObject);
                    aVar.f17723e = c(jSONObject);
                    aVar.f17725g = e(jSONObject);
                    aVar.f17726h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e8) {
                    o9.d().a(e8);
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                }
            } catch (IllegalArgumentException e10) {
                o9.d().a(e10);
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            CreativeType[] values;
            String optString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(ho.f17704p + optString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(ho.f17704p + optString);
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            ImpressionType[] values;
            String optString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(ho.f17704p + optString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(ho.f17704p + optString);
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e8) {
                o9.d().a(e8);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("adViewId", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(ho.f17705q + optString);
            }
            return optString;
        }
    }

    private AdSession a(a aVar, vh vhVar) throws IllegalArgumentException {
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f17724f, aVar.f17723e, aVar.f17720b, aVar.f17721c, aVar.f17719a), AdSessionContext.createHtmlAdSessionContext(this.f17709a, vhVar.getPresentingView(), null, aVar.f17722d));
        createAdSession.registerAdView(vhVar.getPresentingView());
        return createAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f17711c) {
            throw new IllegalStateException(f17703o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f17708t);
        }
    }

    public fr a() {
        fr frVar = new fr();
        frVar.b(f17695g, SDKUtils.encodeString(f17694f));
        frVar.b(f17696h, SDKUtils.encodeString(f17692d));
        frVar.b(f17697i, SDKUtils.encodeString(f17693e));
        frVar.b(f17698j, SDKUtils.encodeString(Arrays.toString(this.f17710b.keySet().toArray())));
        return frVar;
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.f17711c) {
            return;
        }
        Omid.activate(context);
        this.f17711c = true;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (!this.f17711c) {
            throw new IllegalStateException(f17703o);
        }
        if (TextUtils.isEmpty(aVar.f17725g)) {
            throw new IllegalStateException(f17705q);
        }
        String str = aVar.f17725g;
        if (this.f17710b.containsKey(str)) {
            throw new IllegalStateException(f17707s);
        }
        vh a10 = bh.a().a(str);
        if (a10 == null) {
            throw new IllegalStateException(f17706r);
        }
        AdSession a11 = a(aVar, a10);
        a11.start();
        this.f17710b.put(str, a11);
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String optString = jSONObject.optString("adViewId");
        AdSession adSession = this.f17710b.get(optString);
        if (adSession == null) {
            throw new IllegalStateException(f17708t);
        }
        adSession.finish();
        this.f17710b.remove(optString);
    }

    public void c(JSONObject jSONObject) throws IllegalArgumentException, IllegalStateException {
        a(jSONObject);
        AdSession adSession = this.f17710b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f17708t);
        }
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            createAdEvents.loaded();
        }
        createAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }
}

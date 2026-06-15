package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f implements AppLovinCommunicatorSubscriber {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6935a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f6936b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashMap f6937c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Set f6938d = Collections.synchronizedSet(new HashSet());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public f(com.applovin.impl.sdk.j jVar) {
        this.f6935a = jVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.j.m()).subscribe(this, "safedk_ad_info");
        }
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f6936b) {
            bundle = (Bundle) this.f6937c.get(str);
        }
        this.f6935a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f6935a.I();
            I.a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    public void b(b bVar) {
        this.f6938d.remove(bVar);
    }

    public void c(String str) {
        this.f6935a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f6935a.I();
            I.a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f6936b) {
            this.f6937c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return f.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f6935a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6935a.I().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f6935a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6935a.I().k("AdReviewManager", "Received SafeDK ad info without private data");
                }
            } else if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f6935a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6935a.I().k("AdReviewManager", "Received SafeDK ad info without ad format");
                }
            } else {
                final String string = bundle2.getString(ug.f21009x);
                if (TextUtils.isEmpty(string)) {
                    this.f6935a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f6935a.I().k("AdReviewManager", "Received SafeDK ad info without serve id");
                        return;
                    }
                    return;
                }
                synchronized (this.f6936b) {
                    this.f6935a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I = this.f6935a.I();
                        I.a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f6937c.put(string, bundle);
                }
                final String string2 = bundle.getString("ad_review_creative_id");
                this.f6935a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I2 = this.f6935a.I();
                    I2.a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
                }
                if (!StringUtils.isValidString(string2) || this.f6938d.isEmpty()) {
                    return;
                }
                HashSet hashSet = new HashSet(this.f6938d);
                this.f6935a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I3 = this.f6935a.I();
                    I3.a("AdReviewManager", "Notifying listeners: " + this.f6938d);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    final b bVar = (b) it.next();
                    this.f6935a.i0().a((z4) new k6(this.f6935a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.ia
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.this.a(bVar, string, string2);
                        }
                    }), u5.b.OTHER);
                }
            }
        }
    }

    public static String b() {
        return b(MobileAdsBridge.versionMethodName);
    }

    private static String b(String str) {
        try {
            return (String) Class.forName("com.applovin.quality.AppLovinQualityService").getMethod(str, null).invoke(null, null);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.f6938d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f6935a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f6935a.I();
            I.a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}

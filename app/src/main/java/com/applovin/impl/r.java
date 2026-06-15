package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8510a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8511b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Collection f8512c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f8513d = false;

    /* renamed from: e  reason: collision with root package name */
    private static a f8514e = null;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8515a;

        /* renamed from: b  reason: collision with root package name */
        private String f8516b = "";

        /* renamed from: c  reason: collision with root package name */
        private EnumC0133a f8517c = EnumC0133a.NOT_SET;

        /* renamed from: com.applovin.impl.r$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public enum EnumC0133a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");
            

            /* renamed from: a  reason: collision with root package name */
            private final String f8522a;

            EnumC0133a(String str) {
                this.f8522a = str;
            }

            public String b() {
                return this.f8522a;
            }
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0133a b() {
            return this.f8517c;
        }

        public boolean c() {
            return this.f8515a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.a(this) && c() == aVar.c()) {
                    String a10 = a();
                    String a11 = aVar.a();
                    if (a10 != null ? a10.equals(a11) : a11 == null) {
                        EnumC0133a b10 = b();
                        EnumC0133a b11 = aVar.b();
                        return b10 != null ? b10.equals(b11) : b11 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i10 = c() ? 79 : 97;
            String a10 = a();
            int hashCode = ((i10 + 59) * 59) + (a10 == null ? 43 : a10.hashCode());
            EnumC0133a b10 = b();
            return (hashCode * 59) + (b10 != null ? b10.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z10) {
            this.f8515a = z10;
        }

        public void a(String str) {
            this.f8516b = str;
        }

        public void a(EnumC0133a enumC0133a) {
            this.f8517c = enumC0133a;
        }

        public String a() {
            return this.f8516b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet<CountDownLatch> hashSet;
        d7.a();
        Object obj = f8511b;
        synchronized (obj) {
            if (f8513d) {
                return f8514e;
            }
            Collection collection = f8512c;
            boolean isEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (isEmpty) {
                a c10 = c(context);
                synchronized (obj) {
                    f8513d = true;
                    f8514e = c10;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                for (CountDownLatch countDownLatch2 : hashSet) {
                    countDownLatch2.countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    com.applovin.impl.sdk.n.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e8) {
                com.applovin.impl.sdk.n.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e8);
            }
            synchronized (f8511b) {
                aVar = f8514e;
            }
            return aVar;
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a collectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (collectGoogleAdvertisingInfo == null) {
            collectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return collectGoogleAdvertisingInfo == null ? new a() : collectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f8510a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z10);
                aVar.a(z10 ? a.EnumC0133a.ON : a.EnumC0133a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e8) {
                com.applovin.impl.sdk.n.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e8);
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f8510a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        d7.a();
        if (a()) {
            try {
                a aVar = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.a(isLimitAdTrackingEnabled);
                aVar.a(isLimitAdTrackingEnabled ? a.EnumC0133a.ON : a.EnumC0133a.OFF);
                aVar.a(advertisingIdInfo.getId());
                return aVar;
            } catch (Throwable th) {
                if (AppLovinSdkUtils.isFireOS(context)) {
                    return null;
                }
                com.applovin.impl.sdk.n.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                return null;
            }
        } else if (AppLovinSdkUtils.isFireOS(context)) {
            return null;
        } else {
            com.applovin.impl.sdk.n.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
    }

    public static boolean a() {
        return d7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}

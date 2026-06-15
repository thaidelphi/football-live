package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyEventTracker {
    public static final String CUSTOM_EVENT_1 = "ADCT_CUSTOM_EVENT_1";
    public static final String CUSTOM_EVENT_2 = "ADCT_CUSTOM_EVENT_2";
    public static final String CUSTOM_EVENT_3 = "ADCT_CUSTOM_EVENT_3";
    public static final String CUSTOM_EVENT_4 = "ADCT_CUSTOM_EVENT_4";
    public static final String CUSTOM_EVENT_5 = "ADCT_CUSTOM_EVENT_5";
    public static final String LOGIN_DEFAULT = "ADCT_DEFAULT_LOGIN";
    public static final String LOGIN_FACEBOOK = "ADCT_FACEBOOK_LOGIN";
    public static final String LOGIN_GOOGLE = "ADCT_GOOGLE_LOGIN";
    public static final String LOGIN_LINKEDIN = "ADCT_LINKEDIN_LOGIN";
    public static final String LOGIN_OPENID = "ADCT_OPENID_LOGIN";
    public static final String LOGIN_TWITTER = "ADCT_TWITTER_LOGIN";
    public static final String REGISTRATION_CUSTOM = "ADCT_CUSTOM_REGISTRATION";
    public static final String REGISTRATION_DEFAULT = "ADCT_DEFAULT_REGISTRATION";
    public static final String REGISTRATION_FACEBOOK = "ADCT_FACEBOOK_REGISTRATION";
    public static final String REGISTRATION_GOOGLE = "ADCT_GOOGLE_REGISTRATION";
    public static final String REGISTRATION_LINKEDIN = "ADCT_LINKEDIN_REGISTRATION";
    public static final String REGISTRATION_OPENID = "ADCT_OPENID_REGISTRATION";
    public static final String REGISTRATION_TWITTER = "ADCT_TWITTER_REGISTRATION";
    public static final String SOCIAL_SHARING_CUSTOM = "ADCT_CUSTOM_SHARING";
    public static final String SOCIAL_SHARING_FACEBOOK = "ADCT_FACEBOOK_SHARING";
    public static final String SOCIAL_SHARING_FLICKR = "ADCT_FLICKR_SHARING";
    public static final String SOCIAL_SHARING_FOURSQUARE = "ADCT_FOURSQUARE_SHARING";
    public static final String SOCIAL_SHARING_GOOGLE = "ADCT_GOOGLE_SHARING";
    public static final String SOCIAL_SHARING_INSTAGRAM = "ADCT_INSTAGRAM_SHARING";
    public static final String SOCIAL_SHARING_LINKEDIN = "ADCT_LINKEDIN_SHARING";
    public static final String SOCIAL_SHARING_PINTEREST = "ADCT_PINTEREST_SHARING";
    public static final String SOCIAL_SHARING_SNAPCHAT = "ADCT_SNAPCHAT_SHARING";
    public static final String SOCIAL_SHARING_TUMBLR = "ADCT_TUMBLR_SHARING";
    public static final String SOCIAL_SHARING_TWITTER = "ADCT_TWITTER_SHARING";
    public static final String SOCIAL_SHARING_VIMEO = "ADCT_VIMEO_SHARING";
    public static final String SOCIAL_SHARING_VINE = "ADCT_VINE_SHARING";
    public static final String SOCIAL_SHARING_YOUTUBE = "ADCT_YOUTUBE_SHARING";

    /* renamed from: a  reason: collision with root package name */
    private static final List<f1> f5695a = Collections.synchronizedList(new ArrayList());

    static void a(f1 f1Var) {
        List<f1> list = f5695a;
        synchronized (list) {
            if (200 > list.size()) {
                list.add(f1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        k b10 = a.b();
        if (b10.v().equals("") || !b10.I()) {
            return;
        }
        List<f1> list = f5695a;
        synchronized (list) {
            for (f1 f1Var : list) {
                b(f1Var);
            }
            f5695a.clear();
        }
    }

    private static void c(f1 f1Var) {
        f1 f10 = c0.f(f1Var, "payload");
        if (l.H) {
            c0.a(f10, "api_key", "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            c0.a(f10, "api_key", a.b().v());
        }
        try {
            f1Var.r("payload");
            f1Var.a("payload", f10);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    private static void d(f1 f1Var) {
        c0.a(f1Var, "timezone", TimeZone.getDefault().getID());
        c0.a(f1Var, "action_time", String.valueOf(Math.round((float) (System.currentTimeMillis() / 1000))));
    }

    public static void logAchievementUnlocked(String str) {
        if (a(str, "logAchievementUnlocked")) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("description", str);
        logEvent("achievement_unlocked", hashMap);
    }

    public static void logActivated() {
        logEvent("activated");
    }

    public static void logAdImpression() {
        logEvent("ad_impression");
    }

    public static void logAddToCart(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_cart", hashMap);
    }

    public static void logAddToWishlist(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_wishlist", hashMap);
    }

    public static void logAppOpen() {
        logEvent("app_open");
    }

    public static void logAppRated() {
        logEvent("app_rated");
    }

    public static void logCheckoutInitiated() {
        logEvent("checkout_initiated");
    }

    public static void logContentView(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(AppLovinEventParameters.CONTENT_IDENTIFIER, str);
        hashMap.put("content_type", str2);
        logEvent("content_view", hashMap);
    }

    public static void logCreditsSpent(String str, Integer num, Double d10, String str2) {
        if (str2 != null && str2.length() != 3) {
            new e0.a().a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").a(e0.f5980h);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("quantity", String.valueOf(num));
        hashMap.put(b9.h.X, String.valueOf(d10));
        hashMap.put("currency_code", str2);
        logEvent("credits_spent", hashMap);
    }

    public static void logCustomEvent(String str, String str2) {
        if (a(str2, "logCustomEvent")) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("description", str2);
        logEvent("custom_event", hashMap);
    }

    public static void logEvent(String str) {
        logEvent(str, null);
    }

    public static void logInvite() {
        logEvent(AppLovinEventTypes.USER_SENT_INVITATION);
    }

    public static void logLevelAchieved(Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("level_achieved", String.valueOf(num));
        logEvent("level_achieved", hashMap);
    }

    public static void logLogin(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        logEvent(AppLovinEventTypes.USER_LOGGED_IN, hashMap);
    }

    public static void logPaymentInfoAdded() {
        logEvent("payment_info_added");
    }

    public static void logRegistrationCompleted(String str, String str2) {
        if (a(str2, "logRegistrationCompleted")) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        hashMap.put("description", str2);
        logEvent("registration_completed", hashMap);
    }

    public static void logReservation() {
        logEvent(AppLovinEventTypes.USER_CREATED_RESERVATION);
    }

    public static void logSearch(String str) {
        if (str != null && str.length() > 512) {
            new e0.a().a("logSearch searchString cannot exceed 512 characters. Event will ").a("not be sent.").a(e0.f5980h);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("search_string", str);
        logEvent(AppLovinEventTypes.USER_EXECUTED_SEARCH, hashMap);
    }

    public static void logSocialSharingEvent(String str, String str2) {
        if (a(str2, "logSocialSharingEvent")) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("network", str);
        hashMap.put("description", str2);
        logEvent("social_sharing_event", hashMap);
    }

    public static void logTransaction(String str, Integer num, Double d10, String str2, String str3, String str4, String str5) {
        if (a(str5, "logTransaction")) {
            return;
        }
        if (str2 != null && str2.length() != 3) {
            new e0.a().a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").a(e0.f5980h);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        hashMap.put("quantity", String.valueOf(num));
        hashMap.put("price", String.valueOf(d10));
        hashMap.put("currency_code", str2);
        hashMap.put("receipt", str3);
        hashMap.put(b9.h.U, str4);
        hashMap.put("description", str5);
        logEvent("transaction", hashMap);
    }

    public static void logTutorialCompleted() {
        logEvent("tutorial_completed");
    }

    public static void logEvent(String str, HashMap<String, String> hashMap) {
        f1 b10 = c0.b();
        c0.a(b10, "event_name", str);
        f1 b11 = c0.b();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if (entry.getValue() != null && !entry.getValue().equals("null")) {
                    c0.a(b11, entry.getKey(), entry.getValue());
                }
            }
        }
        d(b11);
        c0.a(b10, "payload", b11);
        b(b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        boolean z10;
        List<f1> list = f5695a;
        synchronized (list) {
            z10 = list.size() != 0;
        }
        return z10;
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() <= 512) {
            return false;
        }
        new e0.a().a("Description of event ").a(str2).a(" must be less").a(" than 512 characters").a(e0.f5980h);
        return true;
    }

    private static void b(f1 f1Var) {
        k b10 = a.b();
        if (!b10.v().equals("") && b10.I()) {
            c(f1Var);
            new h0("AdColony.log_event", 1, f1Var).c();
            return;
        }
        a(f1Var);
    }
}

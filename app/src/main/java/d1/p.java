package d1;

import android.content.pm.PackageInfo;
import android.os.Build;
import d1.a;
import d1.k;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: WebViewFeatureInternal.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b f23897a = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f23899b = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c  reason: collision with root package name */
    public static final a.e f23901c = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d  reason: collision with root package name */
    public static final a.c f23903d = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e  reason: collision with root package name */
    public static final a.f f23905e = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final a.f f23907f = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final a.f f23909g = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h  reason: collision with root package name */
    public static final a.f f23910h = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i  reason: collision with root package name */
    public static final a.f f23911i = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j  reason: collision with root package name */
    public static final a.f f23912j = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k  reason: collision with root package name */
    public static final a.c f23913k = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l  reason: collision with root package name */
    public static final a.c f23914l = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m  reason: collision with root package name */
    public static final a.c f23915m = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n  reason: collision with root package name */
    public static final a.c f23916n = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o  reason: collision with root package name */
    public static final a.c f23917o = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p  reason: collision with root package name */
    public static final a.c f23918p = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q  reason: collision with root package name */
    public static final a.b f23919q = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r  reason: collision with root package name */
    public static final a.b f23920r = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s  reason: collision with root package name */
    public static final a.c f23921s = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t  reason: collision with root package name */
    public static final a.f f23922t = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u  reason: collision with root package name */
    public static final a.c f23923u = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v  reason: collision with root package name */
    public static final a.b f23924v = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w  reason: collision with root package name */
    public static final a.b f23925w = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x  reason: collision with root package name */
    public static final a.f f23926x = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y  reason: collision with root package name */
    public static final a.f f23927y = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z  reason: collision with root package name */
    public static final a.f f23928z = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final a.b A = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final a.b B = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final a.d C = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final a.b D = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final a.b E = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final a.b F = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final a.b G = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final a.e H = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final a.e I = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final a.h J = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final a.h K = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final a.g L = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final k.b M = new k.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final k.a N = new k.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final a.h O = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final a.i P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final a.d Q = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final a.d R = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final a.h S = new a.h("FORCE_DARK", "FORCE_DARK");
    public static final a.d T = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final a.d U = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final a.d V = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final a.d W = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final a.d X = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final a.d Y = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final a.d Z = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: a0  reason: collision with root package name */
    public static final a.d f23898a0 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: b0  reason: collision with root package name */
    public static final a.d f23900b0 = new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: c0  reason: collision with root package name */
    public static final a.d f23902c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* renamed from: d0  reason: collision with root package name */
    public static final a.d f23904d0 = new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: e0  reason: collision with root package name */
    public static final a.d f23906e0 = new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* renamed from: f0  reason: collision with root package name */
    public static final a.d f23908f0 = new a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* compiled from: WebViewFeatureInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends a.i {

        /* renamed from: d  reason: collision with root package name */
        private final Pattern f23929d;

        a(String str, String str2) {
            super(str, str2);
            this.f23929d = Pattern.compile("\\A\\d+");
        }

        @Override // d1.a
        public boolean c() {
            boolean c10 = super.c();
            if (!c10 || Build.VERSION.SDK_INT >= 29) {
                return c10;
            }
            PackageInfo c11 = c1.h.c();
            if (c11 == null) {
                return false;
            }
            Matcher matcher = this.f23929d.matcher(c11.versionName);
            return matcher.find() && Integer.parseInt(c11.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* compiled from: WebViewFeatureInternal.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public boolean c() {
            if (super.c() && c1.i.a("MULTI_PROCESS")) {
                return c1.h.h();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, d1.a.d());
    }

    public static <T extends g> boolean c(String str, Collection<T> collection) {
        HashSet<g> hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.a().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (!hashSet.isEmpty()) {
            for (g gVar : hashSet) {
                if (gVar.isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }
}

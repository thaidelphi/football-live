package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b3;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.d7;
import com.applovin.impl.o3;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.impl.u5;
import com.applovin.impl.u7;
import com.applovin.impl.v2;
import com.applovin.impl.w2;
import com.applovin.impl.x2;
import com.applovin.impl.z4;
import com.applovin.impl.z6;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.b9;
import com.ironsource.in;
import com.ironsource.ls;
import com.ironsource.ug;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a  reason: collision with root package name */
    private final j f8877a;

    /* renamed from: b  reason: collision with root package name */
    private final AppLovinCommunicator f8878b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j jVar) {
        this.f8877a = jVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(j.m());
        this.f8878b = appLovinCommunicator;
        if (((Boolean) jVar.a(o4.A6)).booleanValue()) {
            appLovinCommunicator.a(jVar);
            appLovinCommunicator.subscribe(this, z6.f9835a);
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (b("safedk_init") && com.applovin.impl.f.c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8877a.a0());
            bundle.putString("applovin_random_token", this.f8877a.Z());
            bundle.putString("compass_random_token", this.f8877a.r());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(j.m()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(o3.a(this.f8877a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f8877a.o0().c());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f8877a.a(o4.B6)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f8877a.I();
            if (n.a()) {
                n I = this.f8877a.I();
                I.a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.f.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        long longValue;
        long longValue2;
        Map<String, Object> map;
        long j10;
        int i10;
        if (((Boolean) this.f8877a.a(o4.A6)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString(ug.f21009x, "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8877a.a0());
                }
                this.f8877a.W().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((Boolean) this.f8877a.a(o4.S4)).booleanValue()).b(string).a());
            } else if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", in.f17849b);
                if (messageData2.containsKey("timeout_sec")) {
                    longValue = TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec"));
                } else {
                    longValue = ((Long) this.f8877a.a(o4.f8150k3)).longValue();
                }
                int i11 = messageData2.getInt("retry_count", ((Integer) this.f8877a.a(o4.f8158l3)).intValue());
                if (messageData2.containsKey("retry_delay_sec")) {
                    longValue2 = TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec"));
                } else {
                    longValue2 = ((Long) this.f8877a.a(o4.f8166m3)).longValue();
                }
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j11 = longValue2;
                if (in.f17848a.equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f8877a.x().a(null, false, false))));
                    }
                    j10 = longValue;
                    i10 = i11;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        Map B = this.f8877a.x().B();
                        Map m7 = this.f8877a.x().m();
                        if (m7.containsKey("idfv") && m7.containsKey("idfv_scope")) {
                            i10 = i11;
                            String str = (String) m7.get("idfv");
                            j10 = longValue;
                            Integer num = (Integer) m7.get("idfv_scope");
                            num.intValue();
                            m7.remove("idfv");
                            m7.remove("idfv_scope");
                            B.put("idfv", str);
                            B.put("idfv_scope", num);
                        } else {
                            j10 = longValue;
                            i10 = i11;
                        }
                        B.put("server_installed_at", this.f8877a.a(o4.f8178o));
                        B.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8877a.a0());
                        map.put("app", B);
                        map.put(b9.h.G, m7);
                    } else {
                        j10 = longValue;
                        i10 = i11;
                    }
                }
                this.f8877a.i0().a((z4) new com.applovin.impl.k0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f8877a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j10).a(i10).b((int) j11).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f8877a), u5.b.OTHER);
            } else if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f8877a.j().addCustomQueryParams(d7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f8877a.j().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f8877a.P().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            }
        }
    }

    public void b(u2 u2Var, String str) {
        if (b("max_ad_events")) {
            Bundle a10 = a(u2Var);
            a10.putString("type", str);
            this.f8877a.I();
            if (n.a()) {
                n I = this.f8877a.I();
                I.a("CommunicatorService", "Sending \"max_ad_events\" message: " + a10);
            }
            a(a10, "max_ad_events");
        }
    }

    public void b(u2 u2Var) {
        if (b("max_revenue_events")) {
            Bundle a10 = a(u2Var);
            a10.putAll(JsonUtils.toBundle(u2Var.R()));
            a10.putString("country_code", this.f8877a.s().getCountryCode());
            a(a10, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
                a(bundle, "test_mode_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "test_mode_networks_updated");
        }
    }

    public void a(u2 u2Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle a10 = a(u2Var);
            a10.putString("callback_name", str);
            a(a10, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f8877a.a(o4.A6)).booleanValue()) {
            return this.f8877a.c(o4.f8273z6).contains(str) || this.f8878b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("live_networks", new ArrayList<>(list));
                a(bundle, "live_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString(ls.f18303n, maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString(ug.f21009x, str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle(b9.h.E0, JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f8878b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f8877a.c(o4.f8273z6).contains(str)));
        }
    }

    public boolean a(String str) {
        return z6.f9835a.contains(str);
    }

    private Bundle a(u2 u2Var) {
        Bundle bundle = new Bundle();
        bundle.putString(ug.f21009x, u2Var.S());
        bundle.putString("network_name", u2Var.c());
        bundle.putString("max_ad_unit_id", u2Var.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", u2Var.U());
        bundle.putString("ad_format", u2Var.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", u2Var.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", u2Var.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", u2Var.getDspName(), bundle);
        if (u2Var.Z()) {
            BundleUtils.putStringIfValid("hybrid_ad_format", u2Var.J().getLabel(), bundle);
        }
        if (u2Var.a0()) {
            bundle.putString("custom_js_network_name", u2Var.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(u2Var.c())) {
            bundle.putString("custom_sdk_network_name", u2Var.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(u2Var.x()));
        if (u2Var instanceof b3) {
            View view = null;
            if (u2Var instanceof v2) {
                view = ((v2) u2Var).y();
            } else if (u2Var instanceof x2) {
                x2 x2Var = (x2) u2Var;
                if (!x2Var.y0()) {
                    view = x2Var.s0() != null ? x2Var.s0() : x2Var.t0();
                }
            }
            bundle.putString("ad_view", view != null ? u7.a(view) : "N/A");
        } else if (u2Var instanceof w2) {
            Bundle bundle2 = ((w2) u2Var).q0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}

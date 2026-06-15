package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f6642a;

    public m(JSONObject jSONObject) {
        this.f6642a = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer a() {
        String string = JsonUtils.getString(this.f6642a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f6642a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean c() {
        return JsonUtils.getBoolean(this.f6642a, "geolocation_enabled", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean d() {
        return JsonUtils.getBoolean(this.f6642a, "allow_content_access", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean e() {
        return JsonUtils.getBoolean(this.f6642a, "allow_file_access", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean f() {
        return JsonUtils.getBoolean(this.f6642a, "allow_file_access_from_file_urls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean g() {
        return JsonUtils.getBoolean(this.f6642a, "allow_universal_access_from_file_urls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean h() {
        return JsonUtils.getBoolean(this.f6642a, "display_zoom_controls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean i() {
        return JsonUtils.getBoolean(this.f6642a, "load_with_overview_mode", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean j() {
        return JsonUtils.getBoolean(this.f6642a, "need_initial_focus", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean k() {
        return JsonUtils.getBoolean(this.f6642a, "offscreen_pre_raster", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean l() {
        return JsonUtils.getBoolean(this.f6642a, "save_form_data", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean m() {
        return JsonUtils.getBoolean(this.f6642a, "algorithmic_darkening_allowed", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean n() {
        return JsonUtils.getBoolean(this.f6642a, "block_network_image", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean o() {
        return JsonUtils.getBoolean(this.f6642a, "loads_images_automatically", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean p() {
        return JsonUtils.getBoolean(this.f6642a, "use_built_in_zoom_controls", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean q() {
        return JsonUtils.getBoolean(this.f6642a, "use_wide_view_port", null);
    }
}

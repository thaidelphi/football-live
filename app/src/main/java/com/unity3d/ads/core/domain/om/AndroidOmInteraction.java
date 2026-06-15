package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
/* compiled from: AndroidOmInteraction.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final CreativeType getCreativeType(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("creativeType");
        if (optInt != 1) {
            if (optInt != 2) {
                if (optInt != 3) {
                    if (optInt != 4) {
                        if (optInt == 5) {
                            return CreativeType.AUDIO;
                        }
                        throw new IllegalArgumentException("Invalid creativeType");
                    }
                    return CreativeType.VIDEO;
                }
                return CreativeType.NATIVE_DISPLAY;
            }
            return CreativeType.HTML_DISPLAY;
        }
        return CreativeType.DEFINED_BY_JAVASCRIPT;
    }

    private final ImpressionType getImpressionType(JSONObject jSONObject) {
        switch (jSONObject.optInt("impressionType")) {
            case 1:
                return ImpressionType.DEFINED_BY_JAVASCRIPT;
            case 2:
                return ImpressionType.UNSPECIFIED;
            case 3:
                return ImpressionType.LOADED;
            case 4:
                return ImpressionType.BEGIN_TO_RENDER;
            case 5:
                return ImpressionType.ONE_PIXEL;
            case 6:
                return ImpressionType.VIEWABLE;
            case 7:
                return ImpressionType.AUDIBLE;
            case 8:
                return ImpressionType.OTHER;
            default:
                throw new IllegalArgumentException("Invalid impressionType");
        }
    }

    private final Owner getImpressionsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("impressionOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return Owner.NONE;
                    }
                    throw new IllegalArgumentException("Invalid impressionOwner");
                }
                return Owner.NATIVE;
            }
            return Owner.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    private final Owner getMediaEventsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("mediaEventsOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return Owner.NONE;
                    }
                    throw new IllegalArgumentException("Invalid mediaEventsOwner");
                }
                return Owner.NATIVE;
            }
            return Owner.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    private final Owner getVideoEventsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("videoEventsOwner");
            if (optInt != 1) {
                if (optInt != 2) {
                    if (optInt == 3) {
                        return Owner.NONE;
                    }
                    throw new IllegalArgumentException("Invalid videoEventsOwner");
                }
                return Owner.NATIVE;
            }
            return Owner.JAVASCRIPT;
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public OmidOptions getOMidOptions(JSONObject options) {
        n.f(options, "options");
        return new OmidOptions(options.optBoolean("isolateVerificationScripts"), getImpressionsOwner(options), getVideoEventsOwner(options), options.optString("customReferenceData"), getImpressionType(options), getCreativeType(options), getMediaEventsOwner(options));
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public WebView getWebview(AdObject adObject) {
        n.f(adObject, "adObject");
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}

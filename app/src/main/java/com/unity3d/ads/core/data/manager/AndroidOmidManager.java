package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.Omid;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import kotlin.jvm.internal.n;
/* compiled from: AndroidOmidManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(Context context) {
        n.f(context, "context");
        Omid.activate(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdEvents createAdEvents(AdSession adSession) {
        n.f(adSession, "adSession");
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        n.e(createAdEvents, "createAdEvents(adSession)");
        return createAdEvents;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext context) {
        n.f(adSessionConfiguration, "adSessionConfiguration");
        n.f(context, "context");
        AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, context);
        n.e(createAdSession, "createAdSession(adSessionConfiguration, context)");
        return createAdSession;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner mediaEventsOwner, boolean z10) {
        n.f(creativeType, "creativeType");
        n.f(impressionType, "impressionType");
        n.f(owner, "owner");
        n.f(mediaEventsOwner, "mediaEventsOwner");
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, mediaEventsOwner, z10);
        n.e(createAdSessionConfiguration, "createAdSessionConfigura…VerificationScripts\n    )");
        return createAdSessionConfiguration;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        AdSessionContext createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, webView, str, str2);
        n.e(createHtmlAdSessionContext, "createHtmlAdSessionConte…customReferenceData\n    )");
        return createHtmlAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public AdSessionContext createJavaScriptAdSessionContext(Partner partner, WebView webView, String str, String str2) {
        AdSessionContext createJavascriptAdSessionContext = AdSessionContext.createJavascriptAdSessionContext(partner, webView, str, str2);
        n.e(createJavascriptAdSessionContext, "createJavascriptAdSessio…customReferenceData\n    )");
        return createJavascriptAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public String getVersion() {
        String version = Omid.getVersion();
        n.e(version, "getVersion()");
        return version;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return Omid.isActive();
    }
}

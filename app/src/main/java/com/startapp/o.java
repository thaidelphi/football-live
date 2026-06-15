package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.startio.Omid;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.AdSessionConfiguration;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.CreativeType;
import com.iab.omid.library.startio.adsession.ImpressionType;
import com.iab.omid.library.startio.adsession.Owner;
import com.iab.omid.library.startio.adsession.Partner;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o {
    public static AdSession a(WebView webView) {
        try {
            Context context = webView.getContext();
            if (!Omid.isActive()) {
                Omid.activate(context);
            }
            if (1 == 0) {
                return null;
            }
            return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Startio", "4.11.5"), webView, null, ""));
        } catch (Throwable th) {
            l3.a(th);
            return null;
        }
    }

    public static AdSession b(Context context, List<VerificationDetails> list, boolean z10) {
        try {
            return a(context, list, z10);
        } catch (Throwable th) {
            l3.a(th);
            return null;
        }
    }

    public static MediaEvents b(AdSession adSession) {
        if (adSession != null) {
            try {
                return MediaEvents.createMediaEvents(adSession);
            } catch (Throwable th) {
                l3.a(th);
                return null;
            }
        }
        return null;
    }

    public static AdSession a(Context context, List<VerificationDetails> list, boolean z10) {
        boolean z11;
        URL url;
        try {
            if (!Omid.isActive()) {
                Omid.activate(context);
            }
            z11 = true;
        } catch (Throwable th) {
            l3.a(th);
            z11 = false;
        }
        if (z11) {
            String a10 = m6.a();
            ArrayList arrayList = new ArrayList(list.size());
            for (VerificationDetails verificationDetails : list) {
                try {
                    url = new URL(verificationDetails.c());
                } catch (Throwable th2) {
                    l3.a(th2);
                    url = null;
                }
                if (url != null) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(verificationDetails.a(), url, verificationDetails.b()));
                }
            }
            AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Startio", "4.11.5"), a10, arrayList, null, "");
            CreativeType creativeType = z10 ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY;
            ImpressionType impressionType = ImpressionType.VIEWABLE;
            Owner owner = Owner.NATIVE;
            return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, z10 ? owner : Owner.NONE, false), createNativeAdSessionContext);
        }
        return null;
    }

    public static AdEvents a(AdSession adSession) {
        if (adSession != null) {
            try {
                return AdEvents.createAdEvents(adSession);
            } catch (Throwable th) {
                l3.a(th);
                return null;
            }
        }
        return null;
    }
}

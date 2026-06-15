package com.startapp;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j6 {

    /* renamed from: a  reason: collision with root package name */
    public final AdSession f22140a;

    /* renamed from: b  reason: collision with root package name */
    public final AdEvents f22141b;

    /* renamed from: c  reason: collision with root package name */
    public final MediaEvents f22142c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f22143d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f22144e = new AtomicBoolean();

    public j6(WebView webView) {
        AdSession a10 = o.a(webView);
        this.f22140a = a10;
        webView.getContext();
        this.f22141b = o.a(a10);
        this.f22142c = null;
    }

    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f22140a;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public j6(Context context, List<VerificationDetails> list, boolean z10) {
        AdSession b10 = o.b(context, list, z10);
        this.f22140a = b10;
        this.f22141b = o.a(b10);
        this.f22142c = z10 ? o.b(b10) : null;
    }
}

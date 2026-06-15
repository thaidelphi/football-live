package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class WebViewAdPlayer$onBroadcastEvent$2 extends o implements t8.a<WebViewEvent> {
    final /* synthetic */ String $event;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$onBroadcastEvent$2(String str) {
        super(0);
        this.$event = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final WebViewEvent invoke() {
        JSONObject jSONObject = new JSONObject(this.$event);
        String eventType = jSONObject.getString("eventType");
        String optString = jSONObject.optString("data");
        n.e(eventType, "eventType");
        return new OnBroadcastEvent(eventType, optString);
    }
}

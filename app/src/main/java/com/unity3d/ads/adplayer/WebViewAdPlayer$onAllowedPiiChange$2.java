package com.unity3d.ads.adplayer;

import android.util.Base64;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class WebViewAdPlayer$onAllowedPiiChange$2 extends o implements t8.a<WebViewEvent> {
    final /* synthetic */ byte[] $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$onAllowedPiiChange$2(byte[] bArr) {
        super(0);
        this.$value = bArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final WebViewEvent invoke() {
        String encodeToString = Base64.encodeToString(this.$value, 2);
        n.e(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
        return new OnAllowedPiiChangeEvent(encodeToString);
    }
}

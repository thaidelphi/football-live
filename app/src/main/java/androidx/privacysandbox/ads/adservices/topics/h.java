package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.n;
/* compiled from: TopicsManagerApi33Ext5Impl.kt */
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h extends j {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.n.f(r2, r0)
            java.lang.Class<android.adservices.topics.TopicsManager> r0 = android.adservices.topics.TopicsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.n.e(r2, r0)
            android.adservices.topics.TopicsManager r2 = (android.adservices.topics.TopicsManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.h.<init>(android.content.Context):void");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.j
    public GetTopicsRequest c(b request) {
        n.f(request, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.a()).setShouldRecordObservation(request.b()).build();
        n.e(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}

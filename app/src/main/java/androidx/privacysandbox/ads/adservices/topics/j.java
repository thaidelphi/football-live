package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.core.os.m;
import androidx.recyclerview.widget.RecyclerView;
import d9.o;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
/* compiled from: TopicsManagerImplCommon.kt */
@SuppressLint({"NewApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j extends f {

    /* renamed from: b  reason: collision with root package name */
    private final TopicsManager f3729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopicsManagerImplCommon.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f3730a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f3731b;

        /* renamed from: d  reason: collision with root package name */
        int f3733d;

        a(m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3731b = obj;
            this.f3733d |= RecyclerView.UNDEFINED_DURATION;
            return j.e(j.this, null, this);
        }
    }

    public j(TopicsManager mTopicsManager) {
        n.f(mTopicsManager, "mTopicsManager");
        this.f3729b = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.j r4, androidx.privacysandbox.ads.adservices.topics.b r5, m8.d<? super androidx.privacysandbox.ads.adservices.topics.c> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.j.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.j$a r0 = (androidx.privacysandbox.ads.adservices.topics.j.a) r0
            int r1 = r0.f3733d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3733d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.j$a r0 = new androidx.privacysandbox.ads.adservices.topics.j$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3731b
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.f3733d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f3730a
            androidx.privacysandbox.ads.adservices.topics.j r4 = (androidx.privacysandbox.ads.adservices.topics.j) r4
            i8.p.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            i8.p.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f3730a = r4
            r0.f3733d = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            androidx.privacysandbox.ads.adservices.topics.c r4 = r4.d(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.j.e(androidx.privacysandbox.ads.adservices.topics.j, androidx.privacysandbox.ads.adservices.topics.b, m8.d):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, m8.d<? super GetTopicsResponse> dVar) {
        m8.d b10;
        Object c10;
        b10 = n8.c.b(dVar);
        o oVar = new o(b10, 1);
        oVar.C();
        this.f3729b.getTopics(getTopicsRequest, i.f3728a, m.a(oVar));
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.f
    public Object a(b bVar, m8.d<? super c> dVar) {
        return e(this, bVar, dVar);
    }

    public GetTopicsRequest c(b request) {
        n.f(request, "request");
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.a()).build();
        n.e(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public final c d(GetTopicsResponse response) {
        n.f(response, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : response.getTopics()) {
            arrayList.add(new e(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new c(arrayList);
    }
}

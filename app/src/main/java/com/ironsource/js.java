package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.ls;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class js {
    private final mr a(String str) {
        return str != null ? new mr(2110, str) : new mr(mr.f19301d, "noServerResponse");
    }

    private final wr a(Context context, bs bsVar, rr rrVar) {
        try {
            String a10 = bsVar.a(context);
            if (TextUtils.isEmpty(a10)) {
                a10 = bsVar.b(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = a10;
            IronSourceSegment d10 = bsVar.d();
            ArrayList<Pair<String, String>> segmentData = d10 != null ? d10.getSegmentData() : null;
            final kotlin.jvm.internal.a0 a0Var = new kotlin.jvm.internal.a0();
            String sendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, rrVar.d(), rrVar.f(), str, null, true, segmentData, false), qi.a().toString(), new p.c() { // from class: com.ironsource.mz
                @Override // com.ironsource.mediationsdk.p.c
                public final void a(String str2) {
                    js.a(kotlin.jvm.internal.a0.this, str2);
                }
            });
            if (sendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return new wr(a((String) a0Var.f27364a));
            }
            if (bsVar.e()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(sendPostRequest);
                String encryptedResponse = jSONObject.optString(ls.f18303n);
                if (TextUtils.isEmpty(encryptedResponse)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return new wr(new mr(2100, pr.f19784h));
                }
                boolean optBoolean = jSONObject.optBoolean("compression", false);
                kotlin.jvm.internal.n.e(encryptedResponse, "encryptedResponse");
                sendPostRequest = a(encryptedResponse, optBoolean);
                if (TextUtils.isEmpty(sendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    bsVar.f();
                    return new wr(new mr(mr.f19303f, pr.f19783g));
                }
            }
            ls lsVar = new ls(context, rrVar.d(), rrVar.f(), sendPostRequest);
            lsVar.a(ls.a.SERVER);
            if (lsVar.p()) {
                return new wr(new sr(lsVar));
            }
            IronLog.INTERNAL.warning("response invalid - return null");
            return new wr(new mr(mr.f19302e, "serverResponseIsNotValid"));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("exception = " + e8);
            return new wr(e8 instanceof JSONException ? new mr(mr.f19302e, "serverResponseIsNotValid") : new mr(510, "internal error"));
        }
    }

    private final String a(String str, boolean z10) {
        String decryptAndDecompress = z10 ? IronSourceAES.decryptAndDecompress(mb.b().c(), str) : IronSourceAES.decode(mb.b().c(), str);
        kotlin.jvm.internal.n.e(decryptAndDecompress, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return decryptAndDecompress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(kotlin.jvm.internal.a0 reason, String errorMessage) {
        kotlin.jvm.internal.n.f(reason, "$reason");
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        reason.f27364a = errorMessage;
    }

    private final wr b(Context context, bs bsVar, rr rrVar) {
        wr a10 = a(context, bsVar, rrVar);
        if (a10.c()) {
            return a10;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        ls a11 = bsVar.a(context, rrVar.d());
        if (a11 != null) {
            wr wrVar = new wr(new sr(a11));
            IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(rrVar.d(), rrVar.f());
            IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
            logger2.log(ironSourceTag, buildUsingCachedConfigurationError + ": " + wrVar.b(), 1);
            bsVar.g();
            return wrVar;
        }
        return a10;
    }

    public final void a(Context context, rr request, bs tools, qr listener) {
        mr a10;
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(request, "request");
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(listener, "listener");
        String f10 = request.f();
        if (f10 == null) {
            f10 = "";
        }
        tools.a("userId", f10);
        tools.a("appKey", request.d());
        tools.c().i(request.f());
        tools.a();
        wr b10 = b(context, tools, request);
        if (b10.b() != null) {
            kr krVar = new kr(b10.b());
            if (b10.c()) {
                listener.a(krVar);
                return;
            }
            a10 = new mr(mr.f19302e, "serverResponseIsNotValid");
        } else {
            a10 = b10.a();
            if (a10 == null) {
                a10 = new mr(510, "unknown error");
            }
        }
        listener.a(a10);
    }
}

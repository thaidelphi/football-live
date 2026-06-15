package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import d9.i;
import d9.j0;
import i8.l;
import j8.m;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
/* compiled from: AndroidExecuteAdViewerRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClient httpClient;
    private final j0 ioDispatcher;

    /* compiled from: AndroidExecuteAdViewerRequest.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidExecuteAdViewerRequest(j0 ioDispatcher, HttpClient httpClient, GetCachedAsset getCachedAsset) {
        n.f(ioDispatcher, "ioDispatcher");
        n.f(httpClient, "httpClient");
        n.f(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClient = httpClient;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Object o10;
        Object o11;
        Object o12;
        Object o13;
        Map<String, List<String>> f10;
        Object o14;
        Object o15;
        Object o16;
        Object o17;
        Map<String, List<String>> f11;
        o10 = m.o(objArr, 1);
        String str = (String) o10;
        if (!(str == null || str.length() == 0)) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
            if (i10 == 1 || i10 == 2) {
                o11 = m.o(objArr, 2);
                JSONArray jSONArray = (JSONArray) o11;
                o12 = m.o(objArr, 3);
                Integer num = (Integer) o12;
                o13 = m.o(objArr, 4);
                Integer num2 = (Integer) o13;
                if (jSONArray == null || (f10 = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                    f10 = j8.j0.f();
                }
                return new HttpRequest(str, null, requestType, null, f10, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
            } else if (i10 == 3) {
                o14 = m.o(objArr, 2);
                String str2 = (String) o14;
                o15 = m.o(objArr, 3);
                JSONArray jSONArray2 = (JSONArray) o15;
                o16 = m.o(objArr, 4);
                Integer num3 = (Integer) o16;
                o17 = m.o(objArr, 5);
                Integer num4 = (Integer) o17;
                if (jSONArray2 == null || (f11 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
                    f11 = j8.j0.f();
                }
                return new HttpRequest(str, null, requestType, str2, f11, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
            } else {
                throw new l();
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, m8.d<? super HttpResponse> dVar) {
        return i.g(this.ioDispatcher, new AndroidExecuteAdViewerRequest$invoke$2(objArr, this, requestType, null), dVar);
    }
}

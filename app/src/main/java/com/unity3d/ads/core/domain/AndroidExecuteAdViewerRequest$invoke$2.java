package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import d9.o0;
import i8.o;
import i8.w;
import j8.m;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import t8.p;
/* compiled from: AndroidExecuteAdViewerRequest.kt */
@f(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {29}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidExecuteAdViewerRequest$invoke$2 extends l implements p<o0, m8.d<? super HttpResponse>, Object> {
    final /* synthetic */ Object[] $parameters;
    final /* synthetic */ RequestType $type;
    int label;
    final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExecuteAdViewerRequest$invoke$2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, m8.d<? super AndroidExecuteAdViewerRequest$invoke$2> dVar) {
        super(2, dVar);
        this.$parameters = objArr;
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new AndroidExecuteAdViewerRequest$invoke$2(this.$parameters, this.this$0, this.$type, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super HttpResponse> dVar) {
        return ((AndroidExecuteAdViewerRequest$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        Object o10;
        Object b10;
        HttpClient httpClient;
        HttpRequest createRequest;
        GetCachedAsset getCachedAsset;
        InputStream data;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                i8.p.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i8.p.b(obj);
        o10 = m.o(this.$parameters, 1);
        byte[] bArr = null;
        String str = o10 instanceof String ? (String) o10 : null;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            try {
                o.a aVar = o.f26626b;
                Uri parse = Uri.parse(str);
                n.e(parse, "parse(this)");
                b10 = o.b(parse);
            } catch (Throwable th) {
                o.a aVar2 = o.f26626b;
                b10 = o.b(i8.p.a(th));
            }
            if (o.f(b10)) {
                b10 = null;
            }
            Uri uri = (Uri) b10;
            if (uri != null) {
                if (!(this.$type == RequestType.GET)) {
                    uri = null;
                }
                if (uri != null) {
                    getCachedAsset = this.this$0.getCachedAsset;
                    WebResourceResponse invoke = getCachedAsset.invoke(uri);
                    if (invoke != null && (data = invoke.getData()) != null) {
                        n.e(data, "data");
                        bArr = r8.b.c(data);
                    }
                }
            }
            byte[] bArr2 = bArr;
            if (bArr2 == null) {
                httpClient = this.this$0.httpClient;
                createRequest = this.this$0.createRequest(this.$type, this.$parameters);
                this.label = 1;
                Object execute = httpClient.execute(createRequest, this);
                return execute == c10 ? c10 : execute;
            }
            return new HttpResponse(bArr2, 0, null, null, null, null, 0L, 126, null);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}

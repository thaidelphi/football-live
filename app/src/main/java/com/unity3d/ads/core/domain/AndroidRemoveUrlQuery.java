package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.jvm.internal.n;
/* compiled from: AndroidRemoveUrlQuery.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String url) {
        n.f(url, "url");
        String uri = Uri.parse(url).buildUpon().clearQuery().build().toString();
        n.e(uri, "parse(url).buildUpon().c…uery().build().toString()");
        return uri;
    }
}

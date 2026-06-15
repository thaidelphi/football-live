package com.unity3d.ads.core.domain;

import b9.p;
import kotlin.jvm.internal.n;
/* compiled from: CommonGetFileExtensionFromUrl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        n.f(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String url) {
        String o02;
        boolean v10;
        String o03;
        n.f(url, "url");
        String invoke = this.removeUrlQuery.invoke(url);
        if (invoke == null) {
            return null;
        }
        o02 = p.o0(invoke, '/', null, 2, null);
        v10 = p.v(o02, '.', false, 2, null);
        if (v10) {
            o03 = p.o0(o02, '.', null, 2, null);
            if (o03.length() == 0) {
                return null;
            }
            return o03;
        }
        return null;
    }
}

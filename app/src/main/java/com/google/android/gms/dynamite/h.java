package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f12813a = iVersions.b(context, str);
        int i10 = 1;
        int a10 = iVersions.a(context, str, true);
        selectionResult.f12814b = a10;
        int i11 = selectionResult.f12813a;
        if (i11 == 0) {
            if (a10 == 0) {
                i10 = 0;
                selectionResult.f12815c = i10;
                return selectionResult;
            }
            i11 = 0;
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        selectionResult.f12815c = i10;
        return selectionResult;
    }
}

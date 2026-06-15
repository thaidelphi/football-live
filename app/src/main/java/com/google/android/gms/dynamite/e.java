package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int a10 = iVersions.a(context, str, true);
        selectionResult.f12814b = a10;
        if (a10 != 0) {
            selectionResult.f12815c = 1;
        } else {
            int b10 = iVersions.b(context, str);
            selectionResult.f12813a = b10;
            if (b10 != 0) {
                selectionResult.f12815c = -1;
            }
        }
        return selectionResult;
    }
}

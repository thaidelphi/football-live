package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import java.io.File;
import kotlin.jvm.internal.o;
import t8.a;
/* compiled from: UnityAdsModule.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class UnityAdsModule$universalRequestDataStore$1 extends o implements a<File> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$universalRequestDataStore$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final File invoke() {
        return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
    }
}

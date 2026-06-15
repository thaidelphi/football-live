package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.n;
/* compiled from: AndroidGenerateByteStringId.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    @Override // com.unity3d.ads.core.domain.GetByteStringId
    public ByteString invoke() {
        UUID randomUUID = UUID.randomUUID();
        n.e(randomUUID, "randomUUID()");
        return ProtobufExtensionsKt.toByteString(randomUUID);
    }
}

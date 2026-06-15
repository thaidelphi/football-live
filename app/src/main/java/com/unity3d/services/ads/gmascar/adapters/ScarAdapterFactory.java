package com.unity3d.services.ads.gmascar.adapters;

import a8.a;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class ScarAdapterFactory {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion;

        static {
            int[] iArr = new int[ScarAdapterVersion.values().length];
            $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion = iArr;
            try {
                iArr[ScarAdapterVersion.V21.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.V23.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.NA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion, d<m> dVar) {
        String format = String.format("SCAR version %s is not supported.", scarAdapterVersion.name());
        dVar.handleError(b.b(format));
        DeviceLog.debug(format);
    }

    public f createScarAdapter(ScarAdapterVersion scarAdapterVersion, d<m> dVar) {
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[scarAdapterVersion.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                reportAdapterFailure(scarAdapterVersion, dVar);
                return null;
            }
            return new a(dVar, SdkProperties.getVersionName());
        }
        return new w7.a(dVar, SdkProperties.getVersionName());
    }
}

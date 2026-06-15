package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.n;
/* compiled from: AndroidGetInitializationRequestPayload.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository) {
        n.f(getClientInfo, "getClientInfo");
        n.f(sessionRepository, "sessionRepository");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(legacyUserConsentRepository, "legacyUserConsentRepository");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0297 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ef  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(m8.d<? super gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest> r24) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(m8.d):java.lang.Object");
    }
}

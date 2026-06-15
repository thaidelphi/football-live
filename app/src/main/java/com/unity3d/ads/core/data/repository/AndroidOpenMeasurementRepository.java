package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.services.UnityAdsConstants;
import d9.i;
import d9.j0;
import g9.l0;
import g9.w;
import i8.s;
import j8.o0;
import j8.p0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AndroidOpenMeasurementRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final w<Boolean> _isOMActive;
    private final w<Map<String, AdSession>> activeSessions;
    private final w<Set<String>> finishedSessions;
    private final j0 mainDispatcher;
    private final OmidManager omidManager;
    private final Partner partner;

    public AndroidOpenMeasurementRepository(j0 mainDispatcher, OmidManager omidManager) {
        Map f10;
        Set b10;
        n.f(mainDispatcher, "mainDispatcher");
        n.f(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        this.partner = Partner.createPartner(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.13.2");
        f10 = j8.j0.f();
        this.activeSessions = l0.a(f10);
        b10 = o0.b();
        this.finishedSessions = l0.a(b10);
        this._isOMActive = l0.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, AdSession adSession) {
        Map<String, AdSession> value;
        Map<String, AdSession> k10;
        w<Map<String, AdSession>> wVar = this.activeSessions;
        do {
            value = wVar.getValue();
            k10 = j8.j0.k(value, s.a(byteString.toStringUtf8(), adSession));
        } while (!wVar.i(value, k10));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSession getSession(ByteString byteString) {
        return this.activeSessions.getValue().get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        Map<String, AdSession> value;
        Map<String, AdSession> h10;
        w<Map<String, AdSession>> wVar = this.activeSessions;
        do {
            value = wVar.getValue();
            String stringUtf8 = byteString.toStringUtf8();
            n.e(stringUtf8, "opportunityId.toStringUtf8()");
            h10 = j8.j0.h(value, stringUtf8);
        } while (!wVar.i(value, h10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        Set<String> value;
        Set<String> f10;
        w<Set<String>> wVar = this.finishedSessions;
        do {
            value = wVar.getValue();
            String stringUtf8 = byteString.toStringUtf8();
            n.e(stringUtf8, "opportunityId.toStringUtf8()");
            f10 = p0.f(value, stringUtf8);
        } while (!wVar.i(value, f10));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, d<? super OMResult> dVar) {
        return i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$activateOM$2(this, context, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, d<? super OMResult> dVar) {
        return i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$finishSession$2(this, byteString, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString opportunityId) {
        n.f(opportunityId, "opportunityId");
        return this.finishedSessions.getValue().contains(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z10, d<? super OMResult> dVar) {
        return i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$impressionOccurred$2(this, byteString, z10, null), dVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z10) {
        Boolean value;
        w<Boolean> wVar = this._isOMActive;
        do {
            value = wVar.getValue();
            value.booleanValue();
        } while (!wVar.i(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, d<? super OMResult> dVar) {
        return i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$startSession$2(this, byteString, omidOptions, webView, null), dVar);
    }
}

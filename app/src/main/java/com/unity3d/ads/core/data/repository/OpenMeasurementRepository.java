package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import m8.d;
/* compiled from: OpenMeasurementRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, d<? super OMResult> dVar);

    Object finishSession(ByteString byteString, d<? super OMResult> dVar);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z10, d<? super OMResult> dVar);

    boolean isOMActive();

    void setOMActive(boolean z10);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, d<? super OMResult> dVar);
}

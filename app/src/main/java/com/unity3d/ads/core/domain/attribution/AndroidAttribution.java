package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import d9.r1;
import g9.j0;
import i8.g;
import i8.i;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import n8.c;
/* compiled from: AndroidAttribution.kt */
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final g measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers dispatchers, SessionRepository sessionRepository) {
        g b10;
        n.f(context, "context");
        n.f(dispatchers, "dispatchers");
        n.f(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        b10 = i.b(new AndroidAttribution$measurementManager$2(this, context));
        this.measurementManager$delegate = b10;
    }

    private final MeasurementManager getMeasurementManager() {
        return (MeasurementManager) this.measurementManager$delegate.getValue();
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri parse = Uri.parse(str);
        n.e(parse, "parse(this)");
        Uri build = parse.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        n.e(build, "baseUrl.toUri()\n        …4())\n            .build()");
        return build;
    }

    public final Object isAvailable(d<? super Boolean> dVar) {
        d b10;
        w wVar;
        Object c10;
        if (Device.getApiLevel() < 33) {
            return b.a(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return b.a(false);
        }
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return b.a(false);
        }
        b10 = c.b(dVar);
        final m8.i iVar = new m8.i(b10);
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(r1.a(this.dispatchers.getDefault()), new OutcomeReceiver<Integer, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                @Override // android.os.OutcomeReceiver
                public /* bridge */ /* synthetic */ void onResult(Integer num) {
                    onResult(num.intValue());
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception error) {
                    n.f(error, "error");
                    d<Boolean> dVar2 = iVar;
                    o.a aVar = o.f26626b;
                    dVar2.resumeWith(o.b(Boolean.FALSE));
                }

                public void onResult(int i10) {
                    d<Boolean> dVar2 = iVar;
                    o.a aVar = o.f26626b;
                    dVar2.resumeWith(o.b(Boolean.valueOf(i10 == 1)));
                }
            });
            wVar = w.f26638a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            o.a aVar = o.f26626b;
            iVar.resumeWith(o.b(b.a(false)));
        }
        Object a10 = iVar.a();
        c10 = n8.d.c();
        if (a10 == c10) {
            h.c(dVar);
        }
        return a10;
    }

    public final Object registerClick(String str, AdObject adObject, d<? super Boolean> dVar) {
        WebViewContainer webViewContainer;
        j0<InputEvent> lastInputEvent;
        InputEvent value;
        d b10;
        w wVar;
        Object c10;
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (webViewContainer = adPlayer.getWebViewContainer()) != null && (lastInputEvent = webViewContainer.getLastInputEvent()) != null && (value = lastInputEvent.getValue()) != null) {
            b10 = c.b(dVar);
            final m8.i iVar = new m8.i(b10);
            MeasurementManager measurementManager = getMeasurementManager();
            if (measurementManager != null) {
                measurementManager.registerSource(getUri(str, adObject), value, r1.a(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                    @Override // android.os.OutcomeReceiver
                    public void onResult(Object p02) {
                        n.f(p02, "p0");
                        d<Boolean> dVar2 = iVar;
                        o.a aVar = o.f26626b;
                        dVar2.resumeWith(o.b(Boolean.TRUE));
                    }

                    @Override // android.os.OutcomeReceiver
                    public void onError(Exception error) {
                        n.f(error, "error");
                        d<Boolean> dVar2 = iVar;
                        o.a aVar = o.f26626b;
                        dVar2.resumeWith(o.b(Boolean.FALSE));
                    }
                });
                wVar = w.f26638a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                o.a aVar = o.f26626b;
                iVar.resumeWith(o.b(b.a(false)));
            }
            Object a10 = iVar.a();
            c10 = n8.d.c();
            if (a10 == c10) {
                h.c(dVar);
            }
            return a10;
        }
        return b.a(false);
    }

    public final Object registerView(String str, AdObject adObject, d<? super Boolean> dVar) {
        d b10;
        Object c10;
        if (getMeasurementManager() == null) {
            return b.a(false);
        }
        b10 = c.b(dVar);
        final m8.i iVar = new m8.i(b10);
        MeasurementManager measurementManager = getMeasurementManager();
        w wVar = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), (InputEvent) null, r1.a(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(Object p02) {
                    n.f(p02, "p0");
                    d<Boolean> dVar2 = iVar;
                    o.a aVar = o.f26626b;
                    dVar2.resumeWith(o.b(Boolean.TRUE));
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception error) {
                    n.f(error, "error");
                    d<Boolean> dVar2 = iVar;
                    o.a aVar = o.f26626b;
                    dVar2.resumeWith(o.b(Boolean.FALSE));
                }
            });
            wVar = w.f26638a;
        }
        if (wVar == null) {
            o.a aVar = o.f26626b;
            iVar.resumeWith(o.b(b.a(false)));
        }
        Object a10 = iVar.a();
        c10 = n8.d.c();
        if (a10 == c10) {
            h.c(dVar);
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }
}

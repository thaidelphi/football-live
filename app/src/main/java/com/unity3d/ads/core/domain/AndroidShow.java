package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import g9.e;
import g9.g;
import i8.w;
import kotlin.jvm.internal.n;
/* compiled from: AndroidShow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(adRepository, "adRepository");
        n.f(gameServerIdReader, "gameServerIdReader");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public e<ShowEvent> invoke(Activity activity, AdObject adObject, UnityAdsShowOptions showOptions) {
        n.f(activity, "activity");
        n.f(adObject, "adObject");
        n.f(showOptions, "showOptions");
        return g.t(new AndroidShow$invoke$1(adObject, this, activity, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, m8.d<? super w> dVar) {
        Object c10;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null) {
            Object destroy = adPlayer.destroy(dVar);
            c10 = n8.d.c();
            return destroy == c10 ? destroy : w.f26638a;
        }
        return w.f26638a;
    }
}

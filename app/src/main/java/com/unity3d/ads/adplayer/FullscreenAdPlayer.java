package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import i8.w;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: FullscreenAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* compiled from: FullscreenAdPlayer.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class DefaultImpls {
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, d<? super w> dVar) {
            Object c10;
            Object destroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, dVar);
            c10 = n8.d.c();
            return destroy == c10 ? destroy : w.f26638a;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            n.f(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}

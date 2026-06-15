package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: GameServerIdReader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class GameServerIdReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion(null);
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    /* compiled from: GameServerIdReader.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
        n.f(jsonStorage, "jsonStorage");
    }
}

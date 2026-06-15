package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: UniversalRequestStoreKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class UniversalRequestStoreKt {
    public static final UniversalRequestStoreKt INSTANCE = new UniversalRequestStoreKt();

    /* compiled from: UniversalRequestStoreKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestStoreOuterClass.UniversalRequestStore.Builder _builder;

        /* compiled from: UniversalRequestStoreKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: UniversalRequestStoreKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class UniversalRequestMapProxy extends DslProxy {
            private UniversalRequestMapProxy() {
            }
        }

        private Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore _build() {
            UniversalRequestStoreOuterClass.UniversalRequestStore build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void clearUniversalRequestMap(DslMap dslMap) {
            n.f(dslMap, "<this>");
            this._builder.clearUniversalRequestMap();
        }

        public final /* synthetic */ DslMap getUniversalRequestMapMap() {
            Map<String, ByteString> universalRequestMapMap = this._builder.getUniversalRequestMapMap();
            n.e(universalRequestMapMap, "_builder.getUniversalRequestMapMap()");
            return new DslMap(universalRequestMapMap);
        }

        public final /* synthetic */ void putAllUniversalRequestMap(DslMap dslMap, Map map) {
            n.f(dslMap, "<this>");
            n.f(map, "map");
            this._builder.putAllUniversalRequestMap(map);
        }

        public final void putUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String key, ByteString value) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            n.f(value, "value");
            this._builder.putUniversalRequestMap(key, value);
        }

        public final /* synthetic */ void removeUniversalRequestMap(DslMap dslMap, String key) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            this._builder.removeUniversalRequestMap(key);
        }

        public final /* synthetic */ void setUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String key, ByteString value) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            n.f(value, "value");
            putUniversalRequestMap(dslMap, key, value);
        }
    }

    private UniversalRequestStoreKt() {
    }
}

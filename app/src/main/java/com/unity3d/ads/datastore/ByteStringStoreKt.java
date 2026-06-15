package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: ByteStringStoreKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ByteStringStoreKt {
    public static final ByteStringStoreKt INSTANCE = new ByteStringStoreKt();

    /* compiled from: ByteStringStoreKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ByteStringStoreOuterClass.ByteStringStore.Builder _builder;

        /* compiled from: ByteStringStoreKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ ByteStringStoreOuterClass.ByteStringStore _build() {
            ByteStringStoreOuterClass.ByteStringStore build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            n.e(data, "_builder.getData()");
            return data;
        }

        public final void setData(ByteString value) {
            n.f(value, "value");
            this._builder.setData(value);
        }
    }

    private ByteStringStoreKt() {
    }
}
